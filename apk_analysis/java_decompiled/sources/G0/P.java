package G0;

/* loaded from: classes.dex */
public final class P extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f2687r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2688s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X f2689t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(X x5, E7.d dVar) {
        super(2, dVar);
        this.f2689t = x5;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        P p9 = new P(this.f2689t, dVar);
        p9.f2688s = obj;
        return p9;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((K) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r7 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r6.f2687r
            B7.v r2 = B7.v.f1137a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            a.AbstractC0485a.A(r7)     // Catch: android.database.SQLException -> L54
            goto L51
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f2688s
            G0.K r1 = (G0.K) r1
            a.AbstractC0485a.A(r7)
            goto L35
        L22:
            a.AbstractC0485a.A(r7)
            java.lang.Object r7 = r6.f2688s
            r1 = r7
            G0.K r1 = (G0.K) r1
            r6.f2688s = r1
            r6.f2687r = r4
            java.lang.Object r7 = r1.b(r6)
            if (r7 != r0) goto L35
            goto L50
        L35:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L3e
            goto L54
        L3e:
            G0.O r7 = new G0.O     // Catch: android.database.SQLException -> L54
            G0.X r4 = r6.f2689t     // Catch: android.database.SQLException -> L54
            r5 = 0
            r7.<init>(r4, r5)     // Catch: android.database.SQLException -> L54
            r6.f2688s = r5     // Catch: android.database.SQLException -> L54
            r6.f2687r = r3     // Catch: android.database.SQLException -> L54
            java.lang.Object r7 = r1.a(r7, r6)     // Catch: android.database.SQLException -> L54
            if (r7 != r0) goto L51
        L50:
            return r0
        L51:
            java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L54
            return r7
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.P.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
