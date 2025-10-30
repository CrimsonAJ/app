package d2;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class J extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f16740r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f16741s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ K f16742t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f16743u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(boolean z9, K k5, long j, E7.d dVar) {
        super(2, dVar);
        this.f16741s = z9;
        this.f16742t = k5;
        this.f16743u = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new J(this.f16741s, this.f16742t, this.f16743u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r2.f16751k.a(r6, r8) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r2.j.a(r6, r8) == r0) goto L20;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r8.f16740r
            d2.K r2 = r8.f16742t
            r3 = 2
            r4 = 1
            b8.Q r5 = r2.f16757q
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            a.AbstractC0485a.A(r9)
            A7.j r9 = (A7.j) r9
            r9.getClass()
            goto L54
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            a.AbstractC0485a.A(r9)
            A7.j r9 = (A7.j) r9
            r9.getClass()
            goto L3e
        L2a:
            a.AbstractC0485a.A(r9)
            boolean r9 = r8.f16741s
            long r6 = r8.f16743u
            if (r9 == 0) goto L49
            r8.f16740r = r4
            O2.f r9 = r2.f16751k
            java.lang.Object r9 = r9.a(r6, r8)
            if (r9 != r0) goto L3e
            goto L53
        L3e:
            java.lang.Object r9 = r5.h()
            com.anilab.domain.model.Movie r9 = (com.anilab.domain.model.Movie) r9
            if (r9 == 0) goto L5f
            r9.f14428p = r4
            goto L5f
        L49:
            r8.f16740r = r3
            O2.a0 r9 = r2.j
            java.lang.Object r9 = r9.a(r6, r8)
            if (r9 != r0) goto L54
        L53:
            return r0
        L54:
            java.lang.Object r9 = r5.h()
            com.anilab.domain.model.Movie r9 = (com.anilab.domain.model.Movie) r9
            if (r9 == 0) goto L5f
            r0 = 0
            r9.f14428p = r0
        L5f:
            A7.n r9 = A7.n.f558a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.J.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
