package Q6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import l6.C1574f;
import s6.C1962b;
import s6.p;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements S6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6450c;

    public /* synthetic */ c(Object obj, int i9, Object obj2) {
        this.f6448a = i9;
        this.f6449b = obj;
        this.f6450c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X6.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [Y2.r, java.lang.Object] */
    @Override // S6.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z9;
        switch (this.f6448a) {
            case 0:
                return new i((Context) this.f6449b, (String) this.f6450c);
            case 1:
                C1574f c1574f = (C1574f) this.f6450c;
                String d9 = c1574f.d();
                Context context = (Context) this.f6449b;
                ?? obj = new Object();
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 24) {
                    if (i9 >= 24) {
                        context = E.a.a(context);
                    } else {
                        context = null;
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + d9, 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.f8471a = z10;
                return obj;
            default:
                s6.e eVar = (s6.e) this.f6449b;
                eVar.getClass();
                C1962b c1962b = (C1962b) this.f6450c;
                s6.d dVar = c1962b.f22752f;
                ?? obj2 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (s6.h hVar : c1962b.f22749c) {
                    int i10 = hVar.f22769c;
                    if (i10 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int i11 = hVar.f22768b;
                    p pVar = hVar.f22767a;
                    if (z9) {
                        if (i11 == 2) {
                            hashSet4.add(pVar);
                        } else {
                            hashSet.add(pVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(pVar);
                    } else if (i11 == 2) {
                        hashSet5.add(pVar);
                    } else {
                        hashSet2.add(pVar);
                    }
                }
                if (!c1962b.f22753g.isEmpty()) {
                    hashSet.add(p.a(P6.b.class));
                }
                obj2.f8647a = Collections.unmodifiableSet(hashSet);
                obj2.f8648b = Collections.unmodifiableSet(hashSet2);
                obj2.f8649c = Collections.unmodifiableSet(hashSet3);
                obj2.f8650d = Collections.unmodifiableSet(hashSet4);
                Collections.unmodifiableSet(hashSet5);
                obj2.f8651e = eVar;
                return dVar.e(obj2);
        }
    }

    public /* synthetic */ c(C1574f c1574f, Context context) {
        this.f6448a = 1;
        this.f6450c = c1574f;
        this.f6449b = context;
    }
}
