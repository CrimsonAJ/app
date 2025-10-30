package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class r3 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c4 f13080b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(c4 c4Var, E7.d dVar) {
        super(2, dVar);
        this.f13080b = c4Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new r3(this.f13080b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r3) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r5 == r0) goto L15;
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
            int r1 = r4.f13079a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            a.AbstractC0485a.A(r5)
            goto L3b
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            a.AbstractC0485a.A(r5)
            goto L30
        L1c:
            a.AbstractC0485a.A(r5)
            co.notix.c4 r5 = r4.f13080b
            r4.f13079a = r3
            co.notix.d4 r1 = r5.f11975b
            co.notix.o4 r5 = r5.f11974a
            co.notix.l4 r1 = (co.notix.l4) r1
            java.lang.Object r5 = r1.c(r5, r4)
            if (r5 != r0) goto L30
            goto L3a
        L30:
            b8.e r5 = (b8.InterfaceC0725e) r5
            r4.f13079a = r2
            java.lang.Object r5 = b8.AbstractC0714M.m(r5, r4)
            if (r5 != r0) goto L3b
        L3a:
            return r0
        L3b:
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.r3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
