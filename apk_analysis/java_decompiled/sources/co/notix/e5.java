package co.notix;

/* loaded from: classes.dex */
public final class e5 extends G7.j implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public int f12139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m5 f12140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(m5 m5Var, E7.d dVar) {
        super(1, dVar);
        this.f12140b = m5Var;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new e5(this.f12140b, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((e5) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r5 == r0) goto L16;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r4.f12139a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            a.AbstractC0485a.A(r5)
            return r5
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            a.AbstractC0485a.A(r5)
            goto L2c
        L1c:
            a.AbstractC0485a.A(r5)
            co.notix.m5 r5 = r4.f12140b
            co.notix.er r5 = r5.f12761b
            r4.f12139a = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L2c
            goto L42
        L2c:
            co.notix.yh r5 = (co.notix.yh) r5
            co.notix.a5 r1 = new co.notix.a5
            r1.<init>(r5)
            co.notix.d5 r3 = new co.notix.d5
            r3.<init>(r5)
            r4.f12139a = r2
            java.lang.String r2 = "entries"
            java.lang.Object r5 = r5.a(r2, r1, r3, r4)
            if (r5 != r0) goto L43
        L42:
            return r0
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.e5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
