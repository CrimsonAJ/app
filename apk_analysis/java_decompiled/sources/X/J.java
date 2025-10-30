package X;

/* loaded from: classes.dex */
public final class J extends G7.j implements O7.l {

    /* renamed from: r, reason: collision with root package name */
    public Object f7988r;

    /* renamed from: s, reason: collision with root package name */
    public int f7989s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O f7990t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ E7.i f7991u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G7.j f7992v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(O o9, E7.i iVar, O7.p pVar, E7.d dVar) {
        super(1, dVar);
        this.f7990t = o9;
        this.f7991u = iVar;
        this.f7992v = (G7.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new J(this.f7990t, this.f7991u, this.f7992v, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((J) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [G7.j, O7.p] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r8.f7989s
            X.O r2 = r8.f7990t
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r0 = r8.f7988r
            a.AbstractC0485a.A(r9)
            return r0
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f7988r
            X.c r1 = (X.C0403c) r1
            a.AbstractC0485a.A(r9)
            goto L4f
        L27:
            a.AbstractC0485a.A(r9)
            goto L37
        L2b:
            a.AbstractC0485a.A(r9)
            r8.f7989s = r5
            java.lang.Object r9 = X.O.g(r2, r5, r8)
            if (r9 != r0) goto L37
            goto L6f
        L37:
            r1 = r9
            X.c r1 = (X.C0403c) r1
            X.I r9 = new X.I
            G7.j r6 = r8.f7992v
            r7 = 0
            r9.<init>(r6, r1, r7)
            r8.f7988r = r1
            r8.f7989s = r4
            E7.i r4 = r8.f7991u
            java.lang.Object r9 = Y7.B.C(r4, r9, r8)
            if (r9 != r0) goto L4f
            goto L6f
        L4f:
            java.lang.Object r4 = r1.f8052b
            if (r4 == 0) goto L58
            int r4 = r4.hashCode()
            goto L59
        L58:
            r4 = 0
        L59:
            int r6 = r1.f8053c
            if (r4 != r6) goto L71
            java.lang.Object r1 = r1.f8052b
            boolean r1 = kotlin.jvm.internal.h.a(r1, r9)
            if (r1 != 0) goto L70
            r8.f7988r = r9
            r8.f7989s = r3
            java.lang.Object r1 = r2.k(r9, r5, r8)
            if (r1 != r0) goto L70
        L6f:
            return r0
        L70:
            return r9
        L71:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
