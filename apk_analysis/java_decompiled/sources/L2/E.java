package L2;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class E extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Y7.F f4583r;

    /* renamed from: s, reason: collision with root package name */
    public int f4584s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0484z f4585t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(InterfaceC0484z interfaceC0484z, E7.d dVar) {
        super(2, dVar);
        this.f4585t = interfaceC0484z;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new E(this.f4585t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [G7.j, O7.p] */
    /* JADX WARN: Type inference failed for: r8v1, types: [G7.j, O7.p] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r7.f4584s
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L19
            if (r1 != r4) goto L11
            a.AbstractC0485a.A(r8)
            goto L55
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            Y7.F r1 = r7.f4583r
            a.AbstractC0485a.A(r8)
            goto L42
        L1f:
            a.AbstractC0485a.A(r8)
            L2.D r8 = new L2.D
            r8.<init>(r4, r2)
            Y7.z r1 = r7.f4585t
            r5 = 3
            Y7.F r8 = Y7.B.c(r1, r2, r8, r5)
            L2.C r6 = new L2.C
            r6.<init>(r4, r2)
            Y7.F r1 = Y7.B.c(r1, r2, r6, r5)
            r7.f4583r = r1
            r7.f4584s = r3
            java.lang.Object r8 = r8.o(r7)
            if (r8 != r0) goto L42
            goto L54
        L42:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L62
            r7.f4583r = r2
            r7.f4584s = r4
            java.lang.Object r8 = r1.a0(r7)
            if (r8 != r0) goto L55
        L54:
            return r0
        L55:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L62
            java.util.concurrent.atomic.AtomicBoolean r8 = E2.d.f1936b
            r8.set(r3)
        L62:
            A7.n r8 = A7.n.f558a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
