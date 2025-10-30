package P1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class D extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f5674r;

    /* renamed from: s, reason: collision with root package name */
    public int f5675s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G f5676t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H2.c f5677u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(G g9, H2.c cVar, E7.d dVar) {
        super(2, dVar);
        this.f5676t = g9;
        this.f5677u = cVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new D(this.f5676t, this.f5677u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r3.f(r1, r11) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0032, code lost:
    
        if (r12 == r0) goto L30;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r11.f5675s
            H2.c r2 = r11.f5677u
            P1.G r3 = r11.f5676t
            r4 = 1
            java.lang.String r2 = r2.f2986a
            r5 = 2
            if (r1 == 0) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r5) goto L17
            a.AbstractC0485a.A(r12)
            goto L94
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            a.AbstractC0485a.A(r12)
            A7.j r12 = (A7.j) r12
            java.lang.Object r12 = r12.f550a
            goto L35
        L27:
            a.AbstractC0485a.A(r12)
            r11.f5675s = r4
            O2.d r12 = r3.f5694l
            java.lang.Object r12 = r12.a(r2, r11)
            if (r12 != r0) goto L35
            goto L93
        L35:
            boolean r1 = r12 instanceof A7.i
            if (r1 != 0) goto L83
            r1 = r12
            A7.n r1 = (A7.n) r1
            b8.Q r1 = r3.f5698p
            java.lang.Object r1 = r1.h()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r6 = 0
        L49:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L83
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            r9 = 0
            if (r6 < 0) goto L7f
            H2.c r7 = (H2.c) r7
            java.lang.String r10 = r7.f2986a
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L7d
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r7.j = r10
            int r10 = r7.f2990e
            int r10 = r10 + r4
            r7.f2990e = r10
            M1.t r7 = new M1.t
            P1.v r10 = new P1.v
            r10.<init>(r6)
            r7.<init>(r10)
            b8.Q r6 = r3.f5699q
            r6.getClass()
            r6.j(r9, r7)
        L7d:
            r6 = r8
            goto L49
        L7f:
            B7.l.e0()
            throw r9
        L83:
            java.lang.Throwable r1 = A7.j.a(r12)
            if (r1 == 0) goto L94
            r11.f5674r = r12
            r11.f5675s = r5
            java.lang.Object r12 = r3.f(r1, r11)
            if (r12 != r0) goto L94
        L93:
            return r0
        L94:
            A7.n r12 = A7.n.f558a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.D.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
