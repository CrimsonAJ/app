package O2;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final C2.E f5300a;

    /* renamed from: b, reason: collision with root package name */
    public final G2.s f5301b;

    public D(C2.E movieRepository, G2.s movieMapper) {
        kotlin.jvm.internal.h.e(movieRepository, "movieRepository");
        kotlin.jvm.internal.h.e(movieMapper, "movieMapper");
        this.f5300a = movieRepository;
        this.f5301b = movieMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(int r5, G7.c r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof O2.C
            if (r0 == 0) goto L13
            r0 = r6
            O2.C r0 = (O2.C) r0
            int r1 = r0.f5299u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5299u = r1
            goto L18
        L13:
            O2.C r0 = new O2.C
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f5297s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f5299u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O2.D r5 = r0.f5296r
            a.AbstractC0485a.A(r6)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            a.AbstractC0485a.A(r6)
            r0.f5296r = r4
            r0.f5299u = r3
            C2.E r6 = r4.f5300a
            r6.getClass()
            o7.y r2 = E2.d.f1935a
            C2.s r2 = new C2.s
            r3 = 0
            r2.<init>(r5, r6, r3, r7)
            java.lang.Object r6 = E2.d.a(r2, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r5 = r4
        L4d:
            v2.c r6 = (v2.AbstractC2103c) r6
            boolean r7 = r6 instanceof v2.C2101a
            if (r7 == 0) goto L5c
            v2.a r6 = (v2.C2101a) r6
            java.lang.Throwable r5 = r6.f23761a
            A7.i r5 = a.AbstractC0485a.h(r5)
            return r5
        L5c:
            boolean r7 = r6 instanceof v2.C2102b
            if (r7 == 0) goto L72
            G2.s r5 = r5.f5301b
            v2.b r6 = (v2.C2102b) r6
            java.lang.Object r6 = r6.f23762a
            java.util.List r6 = (java.util.List) r6
            r5.getClass()
            java.util.List r5 = l6.AbstractC1570b.q(r5, r6)
            java.io.Serializable r5 = (java.io.Serializable) r5
            return r5
        L72:
            A7.b r5 = new A7.b
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.D.a(int, G7.c, java.lang.String):java.io.Serializable");
    }
}
