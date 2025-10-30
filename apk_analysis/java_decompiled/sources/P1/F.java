package P1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class F extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f5685r;

    /* renamed from: s, reason: collision with root package name */
    public int f5686s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G f5687t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H2.c f5688u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(G g9, H2.c cVar, E7.d dVar) {
        super(2, dVar);
        this.f5687t = g9;
        this.f5688u = cVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new F(this.f5687t, this.f5688u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r3.f(r1, r10) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0032, code lost:
    
        if (r11 == r0) goto L30;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r10.f5686s
            H2.c r2 = r10.f5688u
            P1.G r3 = r10.f5687t
            r4 = 1
            java.lang.String r2 = r2.f2986a
            r5 = 2
            if (r1 == 0) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r5) goto L17
            a.AbstractC0485a.A(r11)
            goto L95
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            a.AbstractC0485a.A(r11)
            A7.j r11 = (A7.j) r11
            java.lang.Object r11 = r11.f550a
            goto L35
        L27:
            a.AbstractC0485a.A(r11)
            r10.f5686s = r4
            O2.j r11 = r3.f5695m
            java.lang.Object r11 = r11.a(r2, r10)
            if (r11 != r0) goto L35
            goto L94
        L35:
            boolean r1 = r11 instanceof A7.i
            if (r1 != 0) goto L84
            r1 = r11
            A7.n r1 = (A7.n) r1
            b8.Q r1 = r3.f5698p
            java.lang.Object r1 = r1.h()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L49:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L84
            java.lang.Object r6 = r1.next()
            int r7 = r4 + 1
            r8 = 0
            if (r4 < 0) goto L80
            H2.c r6 = (H2.c) r6
            java.lang.String r9 = r6.f2986a
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L6c
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r6.j = r9
            int r9 = r6.f2990e
            int r9 = r9 + (-1)
            r6.f2990e = r9
        L6c:
            M1.t r6 = new M1.t
            P1.t r9 = new P1.t
            r9.<init>(r4)
            r6.<init>(r9)
            b8.Q r4 = r3.f5699q
            r4.getClass()
            r4.j(r8, r6)
            r4 = r7
            goto L49
        L80:
            B7.l.e0()
            throw r8
        L84:
            java.lang.Throwable r1 = A7.j.a(r11)
            if (r1 == 0) goto L95
            r10.f5685r = r11
            r10.f5686s = r5
            java.lang.Object r11 = r3.f(r1, r10)
            if (r11 != r0) goto L95
        L94:
            return r0
        L95:
            A7.n r11 = A7.n.f558a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
