package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class a4 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f11821a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c4 f11823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(c4 c4Var, E7.d dVar) {
        super(2, dVar);
        this.f11823c = c4Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        a4 a4Var = new a4(this.f11823c, dVar);
        a4Var.f11822b = obj;
        return a4Var;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a4) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (((Y7.C0473n) r6).o(r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (b8.AbstractC0714M.m(new co.notix.wb(r6.f13216a), r5) == r0) goto L20;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r5.f11821a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r5.f11822b
            Y7.z r0 = (Y7.InterfaceC0484z) r0
            a.AbstractC0485a.A(r6)
            goto L74
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1f:
            java.lang.Object r1 = r5.f11822b
            Y7.z r1 = (Y7.InterfaceC0484z) r1
            a.AbstractC0485a.A(r6)
            goto L60
        L27:
            java.lang.Object r1 = r5.f11822b
            Y7.z r1 = (Y7.InterfaceC0484z) r1
            a.AbstractC0485a.A(r6)
            goto L4d
        L2f:
            a.AbstractC0485a.A(r6)
            java.lang.Object r6 = r5.f11822b
            r1 = r6
            Y7.z r1 = (Y7.InterfaceC0484z) r1
            co.notix.c4 r6 = r5.f11823c
            co.notix.tb r6 = r6.f11977d
            r5.f11822b = r1
            r5.f11821a = r4
            b8.F r6 = r6.f13216a
            co.notix.wb r4 = new co.notix.wb
            r4.<init>(r6)
            java.lang.Object r6 = b8.AbstractC0714M.m(r4, r5)
            if (r6 != r0) goto L4d
            goto L72
        L4d:
            co.notix.c4 r6 = r5.f11823c
            co.notix.b r6 = r6.f11979f
            Y7.m r6 = r6.f11901c
            r5.f11822b = r1
            r5.f11821a = r3
            Y7.n r6 = (Y7.C0473n) r6
            java.lang.Object r6 = r6.o(r5)
            if (r6 != r0) goto L60
            goto L72
        L60:
            co.notix.c4 r6 = r5.f11823c
            r5.f11822b = r1
            r5.f11821a = r2
            co.notix.d4 r3 = r6.f11975b
            co.notix.o4 r6 = r6.f11974a
            co.notix.l4 r3 = (co.notix.l4) r3
            java.lang.Object r6 = r3.c(r6, r5)
            if (r6 != r0) goto L73
        L72:
            return r0
        L73:
            r0 = r1
        L74:
            b8.e r6 = (b8.InterfaceC0725e) r6
            co.notix.v3 r1 = new co.notix.v3
            co.notix.c4 r3 = r5.f11823c
            r4 = 0
            r1.<init>(r6, r3, r4)
            Y7.B.r(r0, r4, r1, r2)
            co.notix.x3 r1 = new co.notix.x3
            co.notix.c4 r3 = r5.f11823c
            r1.<init>(r3, r4)
            Y7.B.r(r0, r4, r1, r2)
            co.notix.z3 r1 = new co.notix.z3
            co.notix.c4 r3 = r5.f11823c
            r1.<init>(r6, r3, r4)
            Y7.B.r(r0, r4, r1, r2)
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.a4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
