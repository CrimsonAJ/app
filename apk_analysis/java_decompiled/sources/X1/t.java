package X1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class t extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f8291r;

    /* renamed from: s, reason: collision with root package name */
    public int f8292s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f8293t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, E7.d dVar) {
        super(2, dVar);
        this.f8293t = yVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new t(this.f8293t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        if (r6 == r0) goto L21;
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
            int r1 = r5.f8292s
            X1.y r2 = r5.f8293t
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            a.AbstractC0485a.A(r6)
            goto L48
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            a.AbstractC0485a.A(r6)
            A7.j r6 = (A7.j) r6
            java.lang.Object r6 = r6.f550a
            goto L30
        L22:
            a.AbstractC0485a.A(r6)
            O2.t r6 = r2.f8316m
            r5.f8292s = r4
            java.lang.Object r6 = r6.a(r4, r5)
            if (r6 != r0) goto L30
            goto L47
        L30:
            boolean r1 = r6 instanceof A7.i
            if (r1 != 0) goto L37
            H2.k r6 = (H2.k) r6
            return r6
        L37:
            java.lang.Throwable r1 = A7.j.a(r6)
            if (r1 == 0) goto L48
            r5.f8291r = r6
            r5.f8292s = r3
            java.lang.Object r6 = r2.f(r1, r5)
            if (r6 != r0) goto L48
        L47:
            return r0
        L48:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
