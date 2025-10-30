package E6;

import B6.K0;
import android.util.Log;
import e1.q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import y6.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f1957e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final int f1958f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final C6.b f1959g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final a f1960h = new a(0);

    /* renamed from: i, reason: collision with root package name */
    public static final b f1961i = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f1962a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final e f1963b;

    /* renamed from: c, reason: collision with root package name */
    public final G6.e f1964c;

    /* renamed from: d, reason: collision with root package name */
    public final i f1965d;

    public c(e eVar, G6.e eVar2, i iVar) {
        this.f1963b = eVar;
        this.f1964c = eVar2;
        this.f1965d = iVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f1957e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f1957e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        e eVar = this.f1963b;
        arrayList.addAll(e.e(((File) eVar.f1972f).listFiles()));
        arrayList.addAll(e.e(((File) eVar.f1973g).listFiles()));
        a aVar = f1960h;
        Collections.sort(arrayList, aVar);
        List e8 = e.e(((File) eVar.f1971e).listFiles());
        Collections.sort(e8, aVar);
        arrayList.addAll(e8);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(e.e(((File) this.f1963b.f1970d).list())).descendingSet();
    }

    public final void d(K0 k02, String str, boolean z9) {
        String str2;
        e eVar = this.f1963b;
        q qVar = this.f1964c.i().f2879a;
        f1959g.getClass();
        String u9 = C6.b.f1615a.u(k02);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f1962a.getAndIncrement()));
        if (z9) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(eVar.b(str, A0.a.n("event", format, str2)), u9);
        } catch (IOException e8) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e8);
        }
        b bVar = new b(1);
        eVar.getClass();
        File file = new File((File) eVar.f1970d, str);
        file.mkdirs();
        List<File> e9 = e.e(file.listFiles(bVar));
        Collections.sort(e9, new a(1));
        int size = e9.size();
        for (File file2 : e9) {
            if (size > qVar.f17061a) {
                e.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
