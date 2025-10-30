package X;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class H extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f7983r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O f7984s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(O o9, E7.d dVar) {
        super(2, dVar);
        this.f7984s = o9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new H(this.f7984s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r4.i(r5) == r0) goto L22;
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
            int r1 = r5.f7983r
            r2 = 2
            r3 = 1
            X.O r4 = r5.f7984s
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            a.AbstractC0485a.A(r6)
            goto L47
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            a.AbstractC0485a.A(r6)     // Catch: java.lang.Throwable -> L1e
            goto L3d
        L1e:
            r6 = move-exception
            goto L4a
        L20:
            a.AbstractC0485a.A(r6)
            G0.s r6 = r4.f8018h
            X.Z r6 = r6.a()
            boolean r6 = r6 instanceof X.P
            if (r6 == 0) goto L34
            G0.s r6 = r4.f8018h
            X.Z r6 = r6.a()
            return r6
        L34:
            r5.f7983r = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r6 = r4.i(r5)     // Catch: java.lang.Throwable -> L1e
            if (r6 != r0) goto L3d
            goto L46
        L3d:
            r5.f7983r = r2
            r6 = 0
            java.lang.Object r6 = X.O.f(r4, r6, r5)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            X.Z r6 = (X.Z) r6
            return r6
        L4a:
            X.S r0 = new X.S
            r1 = -1
            r0.<init>(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
