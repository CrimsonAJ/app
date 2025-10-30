package D4;

import F4.InterfaceC0125d;
import android.util.Log;
import l6.C1574f;

/* loaded from: classes.dex */
public final class v implements InterfaceC0125d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1895a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1896b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1897c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1898d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1899e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1900f;

    public v(C0088g c0088g, C4.c cVar, C0083b c0083b) {
        this.f1900f = c0088g;
        this.f1898d = null;
        this.f1899e = null;
        this.f1895a = false;
        this.f1896b = cVar;
        this.f1897c = c0083b;
    }

    @Override // F4.InterfaceC0125d
    public void a(B4.b bVar) {
        ((C0088g) this.f1900f).f1855n.post(new S5.o(this, bVar, 6, false));
    }

    public synchronized boolean b() {
        boolean z9;
        Boolean bool = (Boolean) this.f1899e;
        if (bool != null) {
            z9 = bool.booleanValue();
        } else {
            try {
                z9 = ((C1574f) this.f1896b).h();
            } catch (IllegalStateException unused) {
                z9 = false;
            }
        }
        c(z9);
        return z9;
    }

    public void c(boolean z9) {
        String str;
        String str2;
        if (z9) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (((Boolean) this.f1899e) == null) {
            str2 = "global Firebase setting";
        } else if (this.f1895a) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String str3 = "Crashlytics automatic data collection " + str + " by " + str2 + ".";
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str3, null);
        }
    }

    public void d(B4.b bVar) {
        t tVar = (t) ((C0088g) this.f1900f).j.get((C0083b) this.f1897c);
        if (tVar != null) {
            tVar.p(bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(l6.C1574f r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f1897c = r0
            f5.i r0 = new f5.i
            r0.<init>()
            r6.f1898d = r0
            r0 = 0
            r6.f1895a = r0
            f5.i r1 = new f5.i
            r1.<init>()
            r6.f1900f = r1
            r7.a()
            android.content.Context r1 = r7.f20587a
            r6.f1896b = r7
            java.lang.String r7 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r7 = r1.getSharedPreferences(r7, r0)
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3d
            r6.f1895a = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L3e
        L3d:
            r7 = r5
        L3e:
            if (r7 != 0) goto L84
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r1 == 0) goto L71
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            boolean r2 = r2.containsKey(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            boolean r7 = r1.getBoolean(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            goto L72
        L69:
            r7 = move-exception
            java.lang.String r1 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r1, r2, r7)
        L71:
            r7 = r5
        L72:
            if (r7 != 0) goto L78
            r6.f1895a = r0
            r7 = r5
            goto L84
        L78:
            r6.f1895a = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L84:
            r6.f1899e = r7
            java.lang.Object r7 = r6.f1897c
            monitor-enter(r7)
            boolean r0 = r6.b()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L99
            java.lang.Object r0 = r6.f1898d     // Catch: java.lang.Throwable -> L97
            f5.i r0 = (f5.C1177i) r0     // Catch: java.lang.Throwable -> L97
            r0.d(r5)     // Catch: java.lang.Throwable -> L97
            goto L99
        L97:
            r0 = move-exception
            goto L9b
        L99:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L97
            return
        L9b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L97
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.v.<init>(l6.f):void");
    }
}
