package T1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class E extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f6983r;

    /* renamed from: s, reason: collision with root package name */
    public int f6984s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G f6985t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f6986u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(G g9, long j, E7.d dVar) {
        super(2, dVar);
        this.f6985t = g9;
        this.f6986u = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new E(this.f6985t, this.f6986u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
    
        if (r2.f(r9, r8) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r2.g(r6, false, r8) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        if (r2.e(r9, r8) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003e, code lost:
    
        if (r9 == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r8.f6984s
            T1.G r2 = r8.f6985t
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 == r6) goto L28
            if (r1 == r5) goto L21
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            a.AbstractC0485a.A(r9)
            goto La7
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f6983r
            a.AbstractC0485a.A(r9)
            goto L96
        L28:
            a.AbstractC0485a.A(r9)
            A7.j r9 = (A7.j) r9
            java.lang.Object r9 = r9.f550a
        L2f:
            r1 = r9
            goto L41
        L31:
            a.AbstractC0485a.A(r9)
            r8.f6984s = r6
            long r6 = r8.f6986u
            O2.x r9 = r2.f6990f
            java.lang.Object r9 = r9.a(r6, r8)
            if (r9 != r0) goto L2f
            goto La6
        L41:
            boolean r9 = r1 instanceof A7.i
            if (r9 != 0) goto L96
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            b8.Q r6 = r2.f6993i
            r6.i(r9)
            boolean r6 = r9.isEmpty()
            if (r6 != 0) goto L83
            java.util.Iterator r4 = r9.iterator()
        L57:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L69
            java.lang.Object r6 = r4.next()
            r7 = r6
            I2.a r7 = (I2.a) r7
            boolean r7 = r7.j
            if (r7 == 0) goto L57
            goto L6a
        L69:
            r6 = 0
        L6a:
            I2.a r6 = (I2.a) r6
            if (r6 != 0) goto L75
            java.lang.Object r9 = B7.k.p0(r9)
            r6 = r9
            I2.a r6 = (I2.a) r6
        L75:
            long r6 = r6.f3444a
            r8.f6983r = r1
            r8.f6984s = r5
            r9 = 0
            java.lang.Object r9 = r2.g(r6, r9, r8)
            if (r9 != r0) goto L96
            goto La6
        L83:
            M1.D r9 = new M1.D
            r5 = 2132017602(0x7f1401c2, float:1.9673487E38)
            r9.<init>(r5)
            r8.f6983r = r1
            r8.f6984s = r4
            java.lang.Object r9 = r2.e(r9, r8)
            if (r9 != r0) goto L96
            goto La6
        L96:
            java.lang.Throwable r9 = A7.j.a(r1)
            if (r9 == 0) goto La7
            r8.f6983r = r1
            r8.f6984s = r3
            java.lang.Object r9 = r2.f(r9, r8)
            if (r9 != r0) goto La7
        La6:
            return r0
        La7:
            A7.n r9 = A7.n.f558a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
