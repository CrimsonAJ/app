package co.notix;

/* loaded from: classes.dex */
public final class zg extends G7.j implements O7.q {

    /* renamed from: a, reason: collision with root package name */
    public int f13678a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f13679b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ xa f13680c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch f13681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(ch chVar, E7.d dVar) {
        super(3, dVar);
        this.f13681d = chVar;
    }

    @Override // O7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zg zgVar = new zg(this.f13681d, (E7.d) obj3);
        zgVar.f13679b = booleanValue;
        zgVar.f13680c = (xa) obj2;
        return zgVar.invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[RETURN] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r8.f13678a
            A7.n r2 = A7.n.f558a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            a.AbstractC0485a.A(r9)
            return r2
        L1b:
            a.AbstractC0485a.A(r9)
            boolean r9 = r8.f13679b
            co.notix.xa r1 = r8.f13680c
            co.notix.ch r5 = r8.f13681d
            co.notix.xq r5 = r5.f12024b
            r5.getClass()
            co.notix.d9 r5 = co.notix.wq.f13475b
            android.content.Context r5 = r5.a()
            java.lang.String r6 = "NOTIX_DEVICE_TOKEN"
            java.lang.String r5 = co.notix.xq.a(r5, r6)
            boolean r6 = r1 instanceof co.notix.va
            r7 = 0
            if (r6 == 0) goto L70
            co.notix.va r1 = (co.notix.va) r1
            java.lang.String r6 = r1.f13349b
            boolean r6 = kotlin.jvm.internal.h.a(r6, r5)
            if (r6 != 0) goto L70
            if (r9 == 0) goto L70
            co.notix.kd r9 = co.notix.md.f12779a
            r9.getClass()
            co.notix.x8 r9 = r9.f12607b
            java.lang.String r3 = "updating push subscription state. subscribing!"
            r9.b(r3)
            co.notix.ch r9 = r8.f13681d
            co.notix.kl r9 = r9.j
            java.lang.String r1 = r1.f13349b
            r8.f13678a = r4
            Y7.z r3 = r9.f12623e
            E7.i r3 = r3.g()
            co.notix.il r4 = new co.notix.il
            r4.<init>(r9, r1, r7)
            java.lang.Object r9 = Y7.B.C(r3, r4, r8)
            if (r9 != r0) goto L6c
            goto L6d
        L6c:
            r9 = r2
        L6d:
            if (r9 != r0) goto L9c
            goto L9b
        L70:
            if (r5 == 0) goto L9c
            if (r9 != 0) goto L9c
            co.notix.kd r9 = co.notix.md.f12779a
            r9.getClass()
            co.notix.x8 r9 = r9.f12607b
            java.lang.String r1 = "updating push subscription state. unsubscribing!"
            r9.b(r1)
            co.notix.ch r9 = r8.f13681d
            co.notix.kl r9 = r9.j
            r8.f13678a = r3
            Y7.z r1 = r9.f12623e
            E7.i r1 = r1.g()
            co.notix.jl r3 = new co.notix.jl
            r3.<init>(r9, r7)
            java.lang.Object r9 = Y7.B.C(r1, r3, r8)
            if (r9 != r0) goto L98
            goto L99
        L98:
            r9 = r2
        L99:
            if (r9 != r0) goto L9c
        L9b:
            return r0
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.zg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
