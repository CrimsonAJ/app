package co.notix;

/* loaded from: classes.dex */
public final class aq extends G7.j implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public long f11893a;

    /* renamed from: b, reason: collision with root package name */
    public long f11894b;

    /* renamed from: c, reason: collision with root package name */
    public xp f11895c;

    /* renamed from: d, reason: collision with root package name */
    public int f11896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mq f11897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(mq mqVar, E7.d dVar) {
        super(1, dVar);
        this.f11897e = mqVar;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new aq(this.f11897e, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((aq) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r9.f11896d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            long r0 = r9.f11894b
            long r2 = r9.f11893a
            co.notix.xp r4 = r9.f11895c
            a.AbstractC0485a.A(r10)
            r6 = r4
            r4 = r0
            goto L6a
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            a.AbstractC0485a.A(r10)
            goto L34
        L24:
            a.AbstractC0485a.A(r10)
            co.notix.mq r10 = r9.f11897e
            co.notix.er r10 = r10.f12801d
            r9.f11896d = r3
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L34
            goto L66
        L34:
            co.notix.yh r10 = (co.notix.yh) r10
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            r3 = 60
            long r3 = r1.toMillis(r3)
            r5 = 3
            long r5 = r1.toMillis(r5)
            co.notix.xp r1 = new co.notix.xp
            co.notix.mq r7 = r9.f11897e
            r8 = 0
            r1.<init>(r7, r8)
            co.notix.yp r7 = new co.notix.yp
            r7.<init>(r10)
            co.notix.zp r8 = new co.notix.zp
            r8.<init>(r10)
            r9.f11895c = r1
            r9.f11893a = r3
            r9.f11894b = r5
            r9.f11896d = r2
            java.lang.String r2 = "c"
            java.lang.Object r10 = r10.a(r2, r7, r8, r9)
            if (r10 != r0) goto L67
        L66:
            return r0
        L67:
            r2 = r3
            r4 = r5
            r6 = r1
        L6a:
            r1 = r10
            co.notix.vh r1 = (co.notix.vh) r1
            co.notix.r7 r0 = new co.notix.r7
            r0.<init>(r1, r2, r4, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.aq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
