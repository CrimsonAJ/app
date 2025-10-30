package e2;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class y extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f17137r;

    /* renamed from: s, reason: collision with root package name */
    public int f17138s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1136B f17139t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17140u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C1136B c1136b, int i9, E7.d dVar) {
        super(2, dVar);
        this.f17139t = c1136b;
        this.f17140u = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new y(this.f17139t, this.f17140u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r10 == r0) goto L30;
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
            int r1 = r9.f17138s
            A7.n r2 = A7.n.f558a
            int r3 = r9.f17140u
            r4 = 2
            r5 = 0
            r6 = 1
            e2.B r7 = r9.f17139t
            if (r1 == 0) goto L27
            if (r1 == r6) goto L1f
            if (r1 != r4) goto L17
            a.AbstractC0485a.A(r10)
            return r2
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            a.AbstractC0485a.A(r10)
            A7.j r10 = (A7.j) r10
            java.lang.Object r10 = r10.f550a
            goto L4a
        L27:
            a.AbstractC0485a.A(r10)
            P2.e r10 = r7.f17084g
            C2.g0 r10 = r10.f5769a
            boolean r10 = r10.b()
            if (r10 != 0) goto L3f
            B7.t r10 = B7.t.f1135a
            b8.Q r0 = r7.j
            r0.getClass()
            r0.j(r5, r10)
            return r2
        L3f:
            r9.f17138s = r6
            O2.S r10 = r7.f17083f
            java.io.Serializable r10 = r10.a(r3, r9)
            if (r10 != r0) goto L4a
            goto L99
        L4a:
            boolean r1 = r10 instanceof A7.i
            if (r1 != 0) goto L7a
            r1 = r10
            java.util.List r1 = (java.util.List) r1
            if (r3 <= r6) goto L75
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L7a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            b8.Q r6 = r7.j
            java.lang.Object r6 = r6.h()
            java.util.Collection r6 = (java.util.Collection) r6
            r3.addAll(r6)
            r3.addAll(r1)
            b8.Q r1 = r7.j
            r1.getClass()
            r1.j(r5, r3)
            goto L7a
        L75:
            b8.Q r3 = r7.j
            r3.i(r1)
        L7a:
            java.lang.Throwable r1 = A7.j.a(r10)
            if (r1 == 0) goto L9a
            b8.Q r3 = r7.f17089m
            M1.t r6 = new M1.t
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r6.<init>(r8)
            r3.getClass()
            r3.j(r5, r6)
            r9.f17137r = r10
            r9.f17138s = r4
            java.lang.Object r10 = r7.f(r1, r9)
            if (r10 != r0) goto L9a
        L99:
            return r0
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
