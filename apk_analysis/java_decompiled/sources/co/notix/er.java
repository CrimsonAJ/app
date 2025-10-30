package co.notix;

/* loaded from: classes.dex */
public final class er {

    /* renamed from: a, reason: collision with root package name */
    public O7.l f12200a;

    /* renamed from: b, reason: collision with root package name */
    public g8.a f12201b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12202c;

    public er(O7.l initializer) {
        kotlin.jvm.internal.h.e(initializer, "initializer");
        this.f12200a = initializer;
        this.f12201b = g8.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #0 {all -> 0x0064, blocks: (B:25:0x005a, B:27:0x005e, B:30:0x0068), top: B:24:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[Catch: all -> 0x0064, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0064, blocks: (B:25:0x005a, B:27:0x005e, B:30:0x0068), top: B:24:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof co.notix.dr
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.dr r0 = (co.notix.dr) r0
            int r1 = r0.f12129e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12129e = r1
            goto L18
        L13:
            co.notix.dr r0 = new co.notix.dr
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f12127c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12129e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            g8.a r1 = r0.f12126b
            co.notix.er r0 = r0.f12125a
            a.AbstractC0485a.A(r7)     // Catch: java.lang.Throwable -> L2f
            goto L78
        L2f:
            r7 = move-exception
            goto L82
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            g8.a r2 = r0.f12126b
            co.notix.er r4 = r0.f12125a
            a.AbstractC0485a.A(r7)
            r7 = r2
            goto L5a
        L42:
            a.AbstractC0485a.A(r7)
            g8.a r7 = r6.f12201b
            if (r7 != 0) goto L4c
            java.lang.Object r7 = r6.f12202c
            return r7
        L4c:
            r0.f12125a = r6
            r0.f12126b = r7
            r0.f12129e = r4
            java.lang.Object r2 = r7.d(r0)
            if (r2 != r1) goto L59
            goto L74
        L59:
            r4 = r6
        L5a:
            O7.l r2 = r4.f12200a     // Catch: java.lang.Throwable -> L64
            if (r2 != 0) goto L68
            java.lang.Object r0 = r4.f12202c     // Catch: java.lang.Throwable -> L64
            r7.a(r5)
            return r0
        L64:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L82
        L68:
            r0.f12125a = r4     // Catch: java.lang.Throwable -> L64
            r0.f12126b = r7     // Catch: java.lang.Throwable -> L64
            r0.f12129e = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L64
            if (r0 != r1) goto L75
        L74:
            return r1
        L75:
            r1 = r7
            r7 = r0
            r0 = r4
        L78:
            r0.f12202c = r7     // Catch: java.lang.Throwable -> L2f
            r0.f12200a = r5     // Catch: java.lang.Throwable -> L2f
            r0.f12201b = r5     // Catch: java.lang.Throwable -> L2f
            r1.a(r5)
            return r7
        L82:
            r1.a(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.er.a(E7.d):java.lang.Object");
    }
}
