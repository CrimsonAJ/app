package L1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class z extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4575r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ S f4576s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(S s9, E7.d dVar) {
        super(2, dVar);
        this.f4576s = s9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new z(this.f4576s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((z) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002d -> B:5:0x0030). Please report as a decompilation issue!!! */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r6.f4575r
            L1.S r2 = r6.f4576s
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            a.AbstractC0485a.A(r7)
            goto L30
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            a.AbstractC0485a.A(r7)
            L2.v r7 = r2.f4499m
            r7.a(r3)
        L1f:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r4 = 15
            long r4 = r7.toMillis(r4)
            r6.f4575r = r3
            java.lang.Object r7 = Y7.B.g(r4, r6)
            if (r7 != r0) goto L30
            return r0
        L30:
            L2.v r7 = r2.f4499m
            r1 = 0
            boolean r7 = r7.a(r1)
            if (r7 == 0) goto L1f
            M1.t r7 = new M1.t
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.<init>(r1)
            b8.Q r1 = r2.f4508v
            r1.getClass()
            r4 = 0
            r1.j(r4, r7)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
