package e2;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class z extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f17141r;

    /* renamed from: s, reason: collision with root package name */
    public int f17142s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1136B f17143t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C1136B c1136b, E7.d dVar) {
        super(2, dVar);
        this.f17143t = c1136b;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new z(this.f17143t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        if (r8 == r0) goto L24;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r7.f17142s
            A7.n r2 = A7.n.f558a
            e2.B r3 = r7.f17143t
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            a.AbstractC0485a.A(r8)
            return r2
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            a.AbstractC0485a.A(r8)
            A7.j r8 = (A7.j) r8
            java.lang.Object r8 = r8.f550a
            goto L3c
        L24:
            a.AbstractC0485a.A(r8)
            com.anilab.domain.model.Movie r8 = r3.f17090n
            if (r8 != 0) goto L2c
            goto L64
        L2c:
            boolean r1 = r8.f14433u
            r1 = r1 ^ r5
            r7.f17142s = r5
            long r5 = r8.f14414a
            P2.s r8 = r3.f17085h
            java.lang.Object r8 = r8.a(r5, r1, r7)
            if (r8 != r0) goto L3c
            goto L63
        L3c:
            boolean r1 = r8 instanceof A7.i
            if (r1 != 0) goto L53
            r1 = r8
            A7.n r1 = (A7.n) r1
            M1.t r1 = new M1.t
            e2.x r5 = e2.x.f17135b
            r1.<init>(r5)
            b8.Q r5 = r3.f17088l
            r5.getClass()
            r6 = 0
            r5.j(r6, r1)
        L53:
            java.lang.Throwable r1 = A7.j.a(r8)
            if (r1 == 0) goto L64
            r7.f17141r = r8
            r7.f17142s = r4
            java.lang.Object r8 = r3.f(r1, r7)
            if (r8 != r0) goto L64
        L63:
            return r0
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
