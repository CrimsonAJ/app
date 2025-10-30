package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class g7 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i7 f12299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(i7 i7Var, String str, E7.d dVar) {
        super(2, dVar);
        this.f12299b = i7Var;
        this.f12300c = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new g7(this.f12299b, this.f12300c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g7) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (Y7.B.g(1500, r7) == r0) goto L19;
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
            int r1 = r7.f12298a
            A7.n r2 = A7.n.f558a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            a.AbstractC0485a.A(r8)
            return r2
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            a.AbstractC0485a.A(r8)
            goto L2c
        L1e:
            a.AbstractC0485a.A(r8)
            r7.f12298a = r4
            r4 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r8 = Y7.B.g(r4, r7)
            if (r8 != r0) goto L2c
            goto L4c
        L2c:
            co.notix.i7 r8 = r7.f12299b
            co.notix.sd r8 = r8.f12436a
            java.lang.String r1 = r7.f12300c
            r7.f12298a = r3
            Y7.z r3 = r8.f13166d
            E7.i r3 = r3.g()
            co.notix.rd r4 = new co.notix.rd
            r5 = 0
            java.lang.String r6 = "add"
            r4.<init>(r1, r8, r6, r5)
            java.lang.Object r8 = Y7.B.C(r3, r4, r7)
            if (r8 != r0) goto L49
            goto L4a
        L49:
            r8 = r2
        L4a:
            if (r8 != r0) goto L4d
        L4c:
            return r0
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.g7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
