package co.notix;

/* loaded from: classes.dex */
public final class v1 extends G7.j implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public int f13325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er f13326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(er erVar, String str, E7.d dVar) {
        super(1, dVar);
        this.f13326b = erVar;
        this.f13327c = str;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new v1(this.f13326b, this.f13327c, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((v1) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r6 == r0) goto L16;
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
            int r1 = r5.f13325a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            a.AbstractC0485a.A(r6)
            return r6
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            a.AbstractC0485a.A(r6)
            goto L2a
        L1c:
            a.AbstractC0485a.A(r6)
            co.notix.er r6 = r5.f13326b
            r5.f13325a = r3
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L2a
            goto L40
        L2a:
            co.notix.yh r6 = (co.notix.yh) r6
            java.lang.String r1 = r5.f13327c
            co.notix.t1 r3 = new co.notix.t1
            r3.<init>(r6)
            co.notix.u1 r4 = new co.notix.u1
            r4.<init>(r6)
            r5.f13325a = r2
            java.lang.Object r6 = r6.a(r1, r3, r4, r5)
            if (r6 != r0) goto L41
        L40:
            return r0
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.v1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
