package co.notix;

import Y7.InterfaceC0484z;

/* renamed from: co.notix.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif {

    /* renamed from: a, reason: collision with root package name */
    public final y8 f12461a;

    /* renamed from: b, reason: collision with root package name */
    public final ej f12462b;

    /* renamed from: c, reason: collision with root package name */
    public final fj f12463c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0484z f12464d;

    /* renamed from: e, reason: collision with root package name */
    public final l2 f12465e;

    public Cif(d9 contextProvider, ej perseveranceStorage, fj perseveranceWorkManager, InterfaceC0484z csIo, l2 adCounter) {
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(perseveranceStorage, "perseveranceStorage");
        kotlin.jvm.internal.h.e(perseveranceWorkManager, "perseveranceWorkManager");
        kotlin.jvm.internal.h.e(csIo, "csIo");
        kotlin.jvm.internal.h.e(adCounter, "adCounter");
        this.f12461a = contextProvider;
        this.f12462b = perseveranceStorage;
        this.f12463c = perseveranceWorkManager;
        this.f12464d = csIo;
        this.f12465e = adCounter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.we r11, E7.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof co.notix.ff
            if (r0 == 0) goto L13
            r0 = r12
            co.notix.ff r0 = (co.notix.ff) r0
            int r1 = r0.f12255e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12255e = r1
            goto L18
        L13:
            co.notix.ff r0 = new co.notix.ff
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f12253c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12255e
            A7.n r3 = A7.n.f558a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L32
            co.notix.we r11 = r0.f12252b
            co.notix.if r0 = r0.f12251a
            a.AbstractC0485a.A(r12)
            goto Lc7
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            co.notix.we r11 = r0.f12252b
            co.notix.if r2 = r0.f12251a
            a.AbstractC0485a.A(r12)
            goto L56
        L42:
            a.AbstractC0485a.A(r12)
            co.notix.l2 r12 = r10.f12465e
            r0.f12251a = r10
            r0.f12252b = r11
            r0.f12255e = r6
            java.lang.Object r12 = r12.g(r0)
            if (r12 != r1) goto L55
            goto Lc5
        L55:
            r2 = r10
        L56:
            co.notix.y8 r12 = r2.f12461a
            co.notix.d9 r12 = (co.notix.d9) r12
            android.content.Context r12 = r12.a()
            java.lang.String r6 = "activity"
            java.lang.Object r6 = r12.getSystemService(r6)
            java.lang.String r7 = "null cannot be cast to non-null type android.app.ActivityManager"
            kotlin.jvm.internal.h.c(r6, r7)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 != 0) goto L72
            goto Lc6
        L72:
            java.lang.String r12 = r12.getPackageName()
            java.util.Iterator r6 = r6.iterator()
        L7a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc6
            java.lang.Object r7 = r6.next()
            android.app.ActivityManager$RunningAppProcessInfo r7 = (android.app.ActivityManager.RunningAppProcessInfo) r7
            int r8 = r7.importance
            r9 = 100
            if (r8 != r9) goto L7a
            java.lang.String r7 = r7.processName
            boolean r7 = kotlin.jvm.internal.h.a(r7, r12)
            if (r7 == 0) goto L7a
            java.lang.Boolean r12 = r11.f13429h
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r12 = kotlin.jvm.internal.h.a(r12, r6)
            if (r12 == 0) goto Lc6
            java.lang.String r12 = r11.j
            if (r12 == 0) goto Lc6
            co.notix.y8 r12 = r2.f12461a
            co.notix.d9 r12 = (co.notix.d9) r12
            android.content.Context r12 = r12.a()
            java.lang.String r6 = r11.j
            r0.f12251a = r2
            r0.f12252b = r11
            r0.f12255e = r5
            f8.e r5 = Y7.K.f8773a
            Z7.d r5 = d8.o.f17003a
            co.notix.hf r7 = new co.notix.hf
            r7.<init>(r12, r6, r4)
            java.lang.Object r12 = Y7.B.C(r5, r7, r0)
            if (r12 != r1) goto Lc2
            goto Lc3
        Lc2:
            r12 = r3
        Lc3:
            if (r12 != r1) goto Lc6
        Lc5:
            return r1
        Lc6:
            r0 = r2
        Lc7:
            Y7.z r12 = r0.f12464d
            co.notix.gf r1 = new co.notix.gf
            r1.<init>(r0, r11, r4)
            r11 = 3
            Y7.B.r(r12, r4, r1, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.Cif.a(co.notix.we, E7.d):java.lang.Object");
    }
}
