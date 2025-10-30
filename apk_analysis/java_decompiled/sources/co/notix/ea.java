package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class ea extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia f12148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(ia iaVar, String str, E7.d dVar) {
        super(2, dVar);
        this.f12148b = iaVar;
        this.f12149c = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new ea(this.f12148b, this.f12149c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ea) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r6.b(r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (co.notix.ia.a(r6, r1, r4, r5) == r0) goto L15;
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
            int r1 = r5.f12147a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            a.AbstractC0485a.A(r6)
            goto L3b
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            a.AbstractC0485a.A(r6)
            goto L2e
        L1c:
            a.AbstractC0485a.A(r6)
            co.notix.ia r6 = r5.f12148b
            java.lang.String r1 = r5.f12149c
            co.notix.z2 r4 = co.notix.z2.f13625a
            r5.f12147a = r3
            java.lang.Object r6 = co.notix.ia.a(r6, r1, r4, r5)
            if (r6 != r0) goto L2e
            goto L3a
        L2e:
            co.notix.ia r6 = r5.f12148b
            co.notix.l2 r6 = r6.f12447d
            r5.f12147a = r2
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r0) goto L3b
        L3a:
            return r0
        L3b:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ea.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
