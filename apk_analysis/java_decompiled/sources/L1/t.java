package L1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class t extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f4546r;

    /* renamed from: s, reason: collision with root package name */
    public S f4547s;

    /* renamed from: t, reason: collision with root package name */
    public Throwable f4548t;

    /* renamed from: u, reason: collision with root package name */
    public int f4549u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ L2.t f4550v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ S f4551w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(L2.t tVar, S s9, E7.d dVar) {
        super(2, dVar);
        this.f4550v = tVar;
        this.f4551w = s9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new t(this.f4550v, this.f4551w, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0078  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r8.f4549u
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            java.lang.Throwable r0 = r8.f4548t
            L1.S r1 = r8.f4547s
            a.AbstractC0485a.A(r9)
            goto L70
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            a.AbstractC0485a.A(r9)
            A7.j r9 = (A7.j) r9
            java.lang.Object r9 = r9.f550a
            goto L34
        L25:
            a.AbstractC0485a.A(r9)
            r8.f4549u = r4
            r9 = 0
            L2.t r1 = r8.f4550v
            java.lang.Object r9 = r1.a(r9, r8)
            if (r9 != r0) goto L34
            goto L6d
        L34:
            boolean r1 = r9 instanceof A7.i
            L1.S r4 = r8.f4551w
            if (r1 != 0) goto L59
            r1 = r9
            com.anilab.domain.model.LatestVersion r1 = (com.anilab.domain.model.LatestVersion) r1
            int r5 = r1.f14410b
            r6 = 13
            if (r5 <= r6) goto L59
            boolean r5 = r1.f14413e
            if (r5 == 0) goto L59
            b8.Q r5 = r4.f4506t
            M1.t r6 = new M1.t
            L1.G r7 = new L1.G
            r7.<init>(r1)
            r6.<init>(r7)
            r5.getClass()
            r5.j(r2, r6)
        L59:
            java.lang.Throwable r1 = A7.j.a(r9)
            if (r1 == 0) goto L95
            r8.f4546r = r9
            r8.f4547s = r4
            r8.f4548t = r1
            r8.f4549u = r3
            java.lang.Object r9 = l6.AbstractC1570b.m(r8)
            if (r9 != r0) goto L6e
        L6d:
            return r0
        L6e:
            r0 = r1
            r1 = r4
        L70:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L95
            b8.Q r9 = r1.f4506t
            M1.t r1 = new M1.t
            L1.F r3 = L1.F.f4461a
            r1.<init>(r3)
            r9.getClass()
            r9.j(r2, r1)
            u6.b r9 = u6.C2083b.a()
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = "common_error"
            r1.<init>(r2, r0)
            r9.b(r1)
        L95:
            A7.n r9 = A7.n.f558a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
