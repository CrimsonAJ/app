package i7;

import o1.C1671f;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public static final O f18775a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C1671f f18776b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i7.O] */
    static {
        N6.d dVar = new N6.d();
        dVar.a(N.class, C1392g.f18862a);
        dVar.a(X.class, C1393h.f18866a);
        dVar.a(C1396k.class, C1390e.f18851a);
        dVar.a(C1387b.class, C1389d.f18841a);
        dVar.a(C1386a.class, C1388c.f18833a);
        dVar.a(D.class, C1391f.f18856a);
        dVar.f5241d = true;
        f18776b = new C1671f(12, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        r5 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i7.C1387b a(l6.C1574f r15) {
        /*
            r15.a()
            java.lang.String r0 = "firebaseApp.applicationContext"
            android.content.Context r1 = r15.f20587a
            kotlin.jvm.internal.h.d(r1, r0)
            java.lang.String r3 = r1.getPackageName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 < r5) goto L26
            long r6 = p0.AbstractC1836b.b(r0)
            java.lang.String r4 = java.lang.String.valueOf(r6)
            goto L2c
        L26:
            int r4 = r0.versionCode
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L2c:
            i7.b r8 = new i7.b
            r15.a()
            l6.i r6 = r15.f20589c
            java.lang.String r9 = r6.f20602b
            java.lang.String r6 = "firebaseApp.options.applicationId"
            kotlin.jvm.internal.h.d(r9, r6)
            java.lang.String r6 = android.os.Build.MODEL
            java.lang.String r7 = "MODEL"
            kotlin.jvm.internal.h.d(r6, r7)
            java.lang.String r6 = android.os.Build.VERSION.RELEASE
            java.lang.String r7 = "RELEASE"
            kotlin.jvm.internal.h.d(r6, r7)
            r6 = r2
            i7.a r2 = new i7.a
            java.lang.String r7 = "packageName"
            kotlin.jvm.internal.h.d(r3, r7)
            java.lang.String r0 = r0.versionName
            if (r0 != 0) goto L55
            r0 = r4
        L55:
            java.lang.String r7 = android.os.Build.MANUFACTURER
            java.lang.String r10 = "MANUFACTURER"
            kotlin.jvm.internal.h.d(r7, r10)
            r15.a()
            int r7 = android.os.Process.myPid()
            java.util.ArrayList r10 = i7.AbstractC1404t.a(r1)
            int r11 = r10.size()
            r12 = r6
        L6c:
            if (r12 >= r11) goto L7c
            java.lang.Object r13 = r10.get(r12)
            int r12 = r12 + 1
            r14 = r13
            i7.D r14 = (i7.D) r14
            int r14 = r14.f18744b
            if (r14 != r7) goto L6c
            goto L7d
        L7c:
            r13 = 0
        L7d:
            i7.D r13 = (i7.D) r13
            if (r13 != 0) goto La8
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 33
            if (r10 <= r11) goto L91
            java.lang.String r5 = Q.d.k()
            java.lang.String r10 = "myProcessName()"
            kotlin.jvm.internal.h.d(r5, r10)
            goto La3
        L91:
            if (r10 < r5) goto L9a
            java.lang.String r5 = C5.f.r()
            if (r5 == 0) goto L9a
            goto La3
        L9a:
            java.lang.String r5 = K4.b.b()
            if (r5 == 0) goto La1
            goto La3
        La1:
            java.lang.String r5 = ""
        La3:
            i7.D r13 = new i7.D
            r13.<init>(r7, r6, r5, r6)
        La8:
            r6 = r13
            r15.a()
            java.util.ArrayList r7 = i7.AbstractC1404t.a(r1)
            r5 = r4
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r8.<init>(r9, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.O.a(l6.f):i7.b");
    }
}
