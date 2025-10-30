package M1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class p extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4730r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4731s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f4732t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f4733u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G7.j f4734v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(boolean z9, r rVar, O7.p pVar, E7.d dVar) {
        super(2, dVar);
        this.f4732t = z9;
        this.f4733u = rVar;
        this.f4734v = (G7.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        p pVar = new p(this.f4732t, this.f4733u, this.f4734v, dVar);
        pVar.f4731s = obj;
        return pVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r7.e(r10, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        if (r1.invoke(r10, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
    
        if (r10 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0080  */
    /* JADX WARN: Type inference failed for: r1v4, types: [G7.j, O7.p] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r9.f4730r
            boolean r2 = r9.f4732t
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            M1.r r7 = r9.f4733u
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            a.AbstractC0485a.A(r10)
            goto L7e
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r1 = r9.f4731s
            java.lang.Exception r1 = (java.lang.Exception) r1
            a.AbstractC0485a.A(r10)
            goto L5c
        L28:
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Exception -> L2c
            goto L7e
        L2c:
            r10 = move-exception
            r1 = r10
            goto L4d
        L2f:
            a.AbstractC0485a.A(r10)
            java.lang.Object r10 = r9.f4731s
            Y7.z r10 = (Y7.InterfaceC0484z) r10
            if (r2 == 0) goto L42
            b8.Q r1 = r7.f4741e
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r1.getClass()
            r1.j(r6, r8)
        L42:
            G7.j r1 = r9.f4734v     // Catch: java.lang.Exception -> L2c
            r9.f4730r = r5     // Catch: java.lang.Exception -> L2c
            java.lang.Object r10 = r1.invoke(r10, r9)     // Catch: java.lang.Exception -> L2c
            if (r10 != r0) goto L7e
            goto L7d
        L4d:
            boolean r10 = r1 instanceof java.util.concurrent.CancellationException
            if (r10 != 0) goto L8d
            r9.f4731s = r1
            r9.f4730r = r4
            java.lang.Object r10 = l6.AbstractC1570b.m(r9)
            if (r10 != r0) goto L5c
            goto L7d
        L5c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L6b
            u6.b r10 = u6.C2083b.a()
            r10.b(r1)
        L6b:
            M1.D r10 = new M1.D
            r1 = 2132017536(0x7f140180, float:1.9673353E38)
            r10.<init>(r1)
            r9.f4731s = r6
            r9.f4730r = r3
            java.lang.Object r10 = r7.e(r10, r9)
            if (r10 != r0) goto L7e
        L7d:
            return r0
        L7e:
            if (r2 == 0) goto L8a
            b8.Q r10 = r7.f4741e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.getClass()
            r10.j(r6, r0)
        L8a:
            A7.n r10 = A7.n.f558a
            return r10
        L8d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
