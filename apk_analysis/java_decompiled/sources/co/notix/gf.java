package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class gf extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cif f12320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ we f12321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(Cif cif, we weVar, E7.d dVar) {
        super(2, dVar);
        this.f12320b = cif;
        this.f12321c = weVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new gf(this.f12320b, this.f12321c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((gf) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r14.a(r6, r13) == r0) goto L18;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r13.f12319a
            A7.n r2 = A7.n.f558a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            a.AbstractC0485a.A(r14)
            goto L77
        L12:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1a:
            a.AbstractC0485a.A(r14)
            goto L59
        L1e:
            a.AbstractC0485a.A(r14)
            co.notix.if r14 = r13.f12320b
            co.notix.ej r14 = r14.f12462b
            co.notix.tq r1 = co.notix.tq.f13249c
            co.notix.qq r1 = new co.notix.qq
            co.notix.we r5 = r13.f12321c
            r1.<init>(r5)
            co.notix.ni r6 = new co.notix.ni
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r7 = r5.toString()
            java.lang.String r5 = "randomUUID().toString()"
            kotlin.jvm.internal.h.d(r7, r5)
            long r10 = java.lang.System.currentTimeMillis()
            co.notix.sq r5 = co.notix.tq.f13251e
            java.lang.Object r1 = r5.a(r1)
            r12 = r1
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            java.lang.String r8 = "showNotification"
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r12)
            r13.f12319a = r4
            java.lang.Object r14 = r14.a(r6, r13)
            if (r14 != r0) goto L59
            goto L76
        L59:
            co.notix.if r14 = r13.f12320b
            co.notix.fj r14 = r14.f12463c
            r13.f12319a = r3
            r14.getClass()
            Y7.u0 r1 = Y7.u0.f8857a
            co.notix.wo r3 = new co.notix.wo
            r4 = 0
            r6 = 0
            r3.<init>(r14, r4, r6)
            java.lang.Object r14 = Y7.B.C(r1, r3, r13)
            if (r14 != r0) goto L73
            goto L74
        L73:
            r14 = r2
        L74:
            if (r14 != r0) goto L77
        L76:
            return r0
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.gf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
