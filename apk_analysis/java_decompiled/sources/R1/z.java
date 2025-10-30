package R1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class z extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f6571r;

    /* renamed from: s, reason: collision with root package name */
    public int f6572s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A f6573t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f6574u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a5, long j, E7.d dVar) {
        super(2, dVar);
        this.f6573t = a5;
        this.f6574u = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new z(this.f6573t, this.f6574u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r3.f(r1, r10) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r11 == r0) goto L22;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r10.f6572s
            R1.A r3 = r10.f6573t
            r8 = 1
            r9 = 2
            if (r1 == 0) goto L22
            if (r1 == r8) goto L1a
            if (r1 != r9) goto L12
            a.AbstractC0485a.A(r11)
            goto L67
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            a.AbstractC0485a.A(r11)
            A7.j r11 = (A7.j) r11
            java.lang.Object r11 = r11.f550a
            goto L32
        L22:
            a.AbstractC0485a.A(r11)
            r10.f6572s = r8
            long r1 = r10.f6574u
            O2.B r11 = r3.f6495f
            java.lang.Object r11 = r11.a(r1, r10)
            if (r11 != r0) goto L32
            goto L66
        L32:
            boolean r1 = r11 instanceof A7.i
            if (r1 != 0) goto L56
            r1 = r11
            java.util.List r1 = (java.util.List) r1
            b8.Q r2 = r3.f6498i
            r2.i(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L56
            java.lang.Object r1 = B7.k.p0(r1)
            H2.i r1 = (H2.i) r1
            long r4 = r1.f3026a
            R1.y r2 = new R1.y
            r7 = 0
            r6 = 0
            r2.<init>(r3, r4, r6, r7)
            r3.d(r8, r2)
        L56:
            java.lang.Throwable r1 = A7.j.a(r11)
            if (r1 == 0) goto L67
            r10.f6571r = r11
            r10.f6572s = r9
            java.lang.Object r11 = r3.f(r1, r10)
            if (r11 != r0) goto L67
        L66:
            return r0
        L67:
            A7.n r11 = A7.n.f558a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
