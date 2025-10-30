package g2;

import Y7.InterfaceC0484z;

/* renamed from: g2.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1218U extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f17603r;

    /* renamed from: s, reason: collision with root package name */
    public a0 f17604s;

    /* renamed from: t, reason: collision with root package name */
    public H2.e f17605t;

    /* renamed from: u, reason: collision with root package name */
    public int f17606u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a0 f17607v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f17608w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218U(a0 a0Var, long j, E7.d dVar) {
        super(2, dVar);
        this.f17607v = a0Var;
        this.f17608w = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1218U(this.f17607v, this.f17608w, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1218U) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x003d, code lost:
    
        if (r13 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005d  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Iterable] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r12.f17606u
            g2.a0 r2 = r12.f17607v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            H2.e r0 = r12.f17605t
            g2.a0 r2 = r12.f17604s
            a.AbstractC0485a.A(r13)
            A7.j r13 = (A7.j) r13
            java.lang.Object r13 = r13.f550a
            r9 = r12
            goto L59
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            a.AbstractC0485a.A(r13)
            A7.j r13 = (A7.j) r13
            java.lang.Object r13 = r13.f550a
            r9 = r12
            goto L40
        L2c:
            a.AbstractC0485a.A(r13)
            r13 = r4
            O2.z r4 = r2.f17632h
            r12.f17606u = r13
            r7 = 1
            r8 = 1
            long r5 = r12.f17608w
            r9 = r12
            java.lang.Object r13 = r4.a(r5, r7, r8, r9)
            if (r13 != r0) goto L40
            goto L57
        L40:
            boolean r1 = r13 instanceof A7.i
            if (r1 != 0) goto Lcb
            r1 = r13
            H2.e r1 = (H2.e) r1
            L2.l r4 = r2.f17633i
            r9.f17603r = r13
            r9.f17604s = r2
            r9.f17605t = r1
            r9.f17606u = r3
            java.io.Serializable r13 = r4.a(r12)
            if (r13 != r0) goto L58
        L57:
            return r0
        L58:
            r0 = r1
        L59:
            boolean r1 = r13 instanceof A7.i
            if (r1 != 0) goto Lc6
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r1 = r0.f3008e
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc6
            java.lang.Object r3 = r1.next()
            H2.c r3 = (H2.c) r3
            java.lang.Object r4 = r0.f3009f
            java.util.Iterator r4 = r4.iterator()
        L77:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto L92
            java.lang.Object r5 = r4.next()
            r7 = r5
            H2.y r7 = (H2.y) r7
            java.lang.Long r7 = r7.f3087a
            long r10 = r3.f2987b
            long r7 = r7.longValue()
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L77
            goto L93
        L92:
            r5 = r6
        L93:
            H2.y r5 = (H2.y) r5
            r3.f2994i = r5
            java.util.Iterator r4 = r13.iterator()
        L9b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbc
            java.lang.Object r5 = r4.next()
            r7 = r5
            H2.a r7 = (H2.C0158a) r7
            H2.y r8 = r3.f2994i
            if (r8 == 0) goto L9b
            long r10 = r7.f2978a
            java.lang.Long r7 = r8.f3092f
            if (r7 != 0) goto Lb3
            goto L9b
        Lb3:
            long r7 = r7.longValue()
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 != 0) goto L9b
            goto Lbd
        Lbc:
            r5 = r6
        Lbd:
            H2.a r5 = (H2.C0158a) r5
            if (r5 == 0) goto Lc3
            java.lang.String r6 = r5.f2979b
        Lc3:
            r3.f2995k = r6
            goto L65
        Lc6:
            b8.Q r13 = r2.f17643t
            r13.i(r0)
        Lcb:
            A7.n r13 = A7.n.f558a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C1218U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
