package E6;

import A6.h;
import A6.p;
import A6.t;
import B6.C0011a0;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import v6.C2112c;
import y6.g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f1967a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1968b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1969c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1970d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1971e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1972f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1973g;

    public e() {
        this.f1967a = new AtomicBoolean();
        this.f1968b = null;
        this.f1969c = new HashMap(16, 1.0f);
        this.f1970d = new HashMap(16, 1.0f);
        this.f1971e = new HashMap(16, 1.0f);
        this.f1972f = new HashMap(16, 1.0f);
        this.f1973g = null;
    }

    public static synchronized void c(File file) {
        synchronized (e.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        if (objArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.f1968b, str);
        if (file.exists() && d(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f1970d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public e(Context context) {
        String str;
        String replaceAll;
        String str2 = ((C0011a0) C2112c.f23901b.e(context)).f895a;
        this.f1967a = str2;
        File filesDir = context.getFilesDir();
        this.f1968b = filesDir;
        if (!str2.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str2.length() > 40) {
                replaceAll = g.h(str2);
            } else {
                replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(replaceAll);
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        c(file);
        this.f1969c = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f1970d = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f1971e = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f1972f = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f1973g = file5;
    }

    public e(String str, e eVar, z6.d dVar) {
        this.f1970d = new t(this, false);
        this.f1971e = new t(this, true);
        this.f1972f = new p();
        this.f1973g = new AtomicMarkableReference(null, false);
        this.f1967a = str;
        this.f1968b = new h(eVar);
        this.f1969c = dVar;
    }
}
