package co.notix;

import Y7.InterfaceC0484z;
import co.notix.lsi.LsiInterval;

/* loaded from: classes.dex */
public final class fd extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public long f12242a;

    /* renamed from: b, reason: collision with root package name */
    public int f12243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LsiInterval f12244c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd f12245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f12246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(LsiInterval lsiInterval, gd gdVar, long j, E7.d dVar) {
        super(2, dVar);
        this.f12244c = lsiInterval;
        this.f12245d = gdVar;
        this.f12246e = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new fd(this.f12244c, this.f12245d, this.f12246e, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((fd) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
    
        if (r11 == r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r10.f12243b
            A7.n r2 = A7.n.f558a
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L3b
            if (r1 == r7) goto L35
            if (r1 == r6) goto L31
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            a.AbstractC0485a.A(r11)
            goto Lc3
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            long r4 = r10.f12242a
            a.AbstractC0485a.A(r11)
            goto La1
        L2b:
            long r5 = r10.f12242a
            a.AbstractC0485a.A(r11)
            goto L93
        L31:
            a.AbstractC0485a.A(r11)
            goto L71
        L35:
            long r6 = r10.f12242a
            a.AbstractC0485a.A(r11)
            goto L81
        L3b:
            a.AbstractC0485a.A(r11)
            co.notix.lsi.LsiInterval r11 = r10.f12244c
            boolean r1 = r11 instanceof co.notix.lsi.LsiInterval.Fixed
            if (r1 == 0) goto L5c
            co.notix.lsi.LsiInterval$Fixed r11 = (co.notix.lsi.LsiInterval.Fixed) r11
            long r8 = r11.getIntervalMillis()
            co.notix.gd r11 = r10.f12245d
            co.notix.ed r11 = r11.f12312c
            r10.f12242a = r8
            r10.f12243b = r7
            java.lang.Object r11 = r11.a(r8, r10)
            if (r11 != r0) goto L5a
            goto Lc2
        L5a:
            r6 = r8
            goto L81
        L5c:
            co.notix.lsi.LsiInterval$Optimized r1 = co.notix.lsi.LsiInterval.Optimized.INSTANCE
            boolean r11 = kotlin.jvm.internal.h.a(r11, r1)
            if (r11 == 0) goto Lc4
            co.notix.gd r11 = r10.f12245d
            co.notix.mq r11 = r11.f12313d
            r10.f12243b = r6
            java.lang.Object r11 = r11.d(r10)
            if (r11 != r0) goto L71
            goto Lc2
        L71:
            co.notix.mp r11 = (co.notix.mp) r11
            if (r11 == 0) goto L7e
            java.lang.Long r11 = r11.f12796a
            if (r11 == 0) goto L7e
            long r6 = r11.longValue()
            goto L81
        L7e:
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
        L81:
            co.notix.gd r11 = r10.f12245d
            co.notix.ed r11 = r11.f12312c
            long r8 = r10.f12246e
            r10.f12242a = r6
            r10.f12243b = r5
            java.lang.Object r11 = r11.b(r8, r10)
            if (r11 != r0) goto L92
            goto Lc2
        L92:
            r5 = r6
        L93:
            co.notix.gd r11 = r10.f12245d
            r10.f12242a = r5
            r10.f12243b = r4
            java.lang.Object r11 = r11.b(r10)
            if (r11 != r0) goto La0
            goto Lc2
        La0:
            r4 = r5
        La1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto Lc3
            co.notix.gd r11 = r10.f12245d
            r10.f12243b = r3
            r11.getClass()
            Y7.u0 r1 = Y7.u0.f8857a
            co.notix.wo r3 = new co.notix.wo
            r6 = 0
            r3.<init>(r11, r4, r6)
            java.lang.Object r11 = Y7.B.C(r1, r3, r10)
            if (r11 != r0) goto Lbf
            goto Lc0
        Lbf:
            r11 = r2
        Lc0:
            if (r11 != r0) goto Lc3
        Lc2:
            return r0
        Lc3:
            return r2
        Lc4:
            A7.b r11 = new A7.b
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.fd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
