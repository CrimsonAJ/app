package L1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class r extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public String f4542r;

    /* renamed from: s, reason: collision with root package name */
    public int f4543s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ L2.r f4544t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(L2.r rVar, E7.d dVar) {
        super(2, dVar);
        this.f4544t = rVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new r(this.f4544t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r9.f4543s
            r2 = 0
            L2.r r3 = r9.f4544t
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            java.lang.String r0 = r9.f4542r
            a.AbstractC0485a.A(r10)
            goto L6d
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            a.AbstractC0485a.A(r10)
            goto L37
        L21:
            a.AbstractC0485a.A(r10)
            r9.f4543s = r5
            r3.getClass()
            f8.d r10 = Y7.K.f8774b
            L2.q r1 = new L2.q
            r1.<init>(r5, r2)
            java.lang.Object r10 = Y7.B.C(r10, r1, r9)
            if (r10 != r0) goto L37
            goto L6a
        L37:
            java.lang.String r10 = (java.lang.String) r10
            u6.b r1 = u6.C2083b.a()
            java.util.TimeZone r5 = java.util.TimeZone.getDefault()
            java.lang.String r5 = r5.getID()
            y6.p r1 = r1.f23708a
            z6.d r6 = r1.f25099o
            z6.b r6 = r6.f25505a
            N3.E r7 = new N3.E
            r8 = 10
            r7.<init>(r1, r10, r5, r8)
            r6.a(r7)
            r9.f4542r = r10
            r9.f4543s = r4
            r3.getClass()
            f8.d r1 = Y7.K.f8774b
            L2.q r3 = new L2.q
            r4 = 0
            r3.<init>(r4, r2)
            java.lang.Object r1 = Y7.B.C(r1, r3, r9)
            if (r1 != r0) goto L6b
        L6a:
            return r0
        L6b:
            r0 = r10
            r10 = r1
        L6d:
            java.lang.String r10 = (java.lang.String) r10
            u6.b r1 = u6.C2083b.a()
            y6.p r1 = r1.f23708a
            z6.d r2 = r1.f25099o
            z6.b r2 = r2.f25505a
            N3.E r3 = new N3.E
            r4 = 10
            r3.<init>(r1, r0, r10, r4)
            r2.a(r3)
            A7.n r10 = A7.n.f558a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
