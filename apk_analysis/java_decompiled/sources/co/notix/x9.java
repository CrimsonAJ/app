package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class x9 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f13507a;

    /* renamed from: b, reason: collision with root package name */
    public i8 f13508b;

    /* renamed from: c, reason: collision with root package name */
    public int f13509c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ia f13510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f13511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(ia iaVar, String str, E7.d dVar) {
        super(2, dVar);
        this.f13510d = iaVar;
        this.f13511e = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new x9(this.f13510d, this.f13511e, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x9) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (r6.a(r10, r17) == r1) goto L24;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13509c
            A7.n r3 = A7.n.f558a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L36
            if (r2 == r6) goto L29
            if (r2 == r5) goto L21
            if (r2 != r4) goto L19
            a.AbstractC0485a.A(r18)
            goto La7
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            java.lang.Object r2 = r0.f13507a
            co.notix.ni r2 = (co.notix.ni) r2
            a.AbstractC0485a.A(r18)
            goto L88
        L29:
            co.notix.i8 r2 = r0.f13508b
            java.lang.Object r6 = r0.f13507a
            co.notix.ej r6 = (co.notix.ej) r6
            a.AbstractC0485a.A(r18)
            r9 = r2
            r2 = r18
            goto L4f
        L36:
            a.AbstractC0485a.A(r18)
            co.notix.ia r2 = r0.f13510d
            co.notix.ej r8 = r2.f12444a
            co.notix.i8 r9 = co.notix.i8.f12438c
            java.lang.String r10 = r0.f13511e
            r0.f13507a = r8
            r0.f13508b = r9
            r0.f13509c = r6
            java.lang.Object r2 = r2.a(r10, r0)
            if (r2 != r1) goto L4e
            goto La6
        L4e:
            r6 = r8
        L4f:
            java.lang.String r2 = (java.lang.String) r2
            co.notix.f8 r8 = new co.notix.f8
            r8.<init>(r2)
            co.notix.ni r10 = new co.notix.ni
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r11 = r2.toString()
            java.lang.String r2 = "randomUUID().toString()"
            kotlin.jvm.internal.h.d(r11, r2)
            java.lang.String r12 = r9.f13153a
            long r14 = java.lang.System.currentTimeMillis()
            co.notix.td r2 = r9.b()
            java.lang.Object r2 = r2.a(r8)
            r16 = r2
            org.json.JSONObject r16 = (org.json.JSONObject) r16
            r13 = 0
            r10.<init>(r11, r12, r13, r14, r16)
            r0.f13507a = r10
            r0.f13508b = r7
            r0.f13509c = r5
            java.lang.Object r2 = r6.a(r10, r0)
            if (r2 != r1) goto L88
            goto La6
        L88:
            co.notix.ia r2 = r0.f13510d
            co.notix.fj r2 = r2.f12445b
            r0.f13507a = r7
            r0.f13509c = r4
            r2.getClass()
            Y7.u0 r4 = Y7.u0.f8857a
            co.notix.wo r5 = new co.notix.wo
            r8 = 0
            r5.<init>(r2, r8, r7)
            java.lang.Object r2 = Y7.B.C(r4, r5, r0)
            if (r2 != r1) goto La3
            goto La4
        La3:
            r2 = r3
        La4:
            if (r2 != r1) goto La7
        La6:
            return r1
        La7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.x9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
