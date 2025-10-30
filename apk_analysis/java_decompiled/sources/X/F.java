package X;

/* loaded from: classes.dex */
public final class F extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f7973r;

    /* renamed from: s, reason: collision with root package name */
    public int f7974s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ boolean f7975t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O f7976u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7977v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(O o9, int i9, E7.d dVar) {
        super(2, dVar);
        this.f7976u = o9;
        this.f7977v = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        F f9 = new F(this.f7976u, this.f7977v, dVar);
        f9.f7975t = ((Boolean) obj).booleanValue();
        return f9;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((F) create(bool, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r6.f7974s
            X.O r2 = r6.f7976u
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r6.f7973r
            a.AbstractC0485a.A(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            boolean r1 = r6.f7975t
            a.AbstractC0485a.A(r7)
            goto L32
        L22:
            a.AbstractC0485a.A(r7)
            boolean r1 = r6.f7975t
            r6.f7975t = r1
            r6.f7974s = r4
            java.lang.Object r7 = r2.j(r6)
            if (r7 != r0) goto L32
            goto L42
        L32:
            if (r1 == 0) goto L4c
            X.Y r1 = r2.h()
            r6.f7973r = r7
            r6.f7974s = r3
            java.lang.Integer r1 = r1.a()
            if (r1 != r0) goto L43
        L42:
            return r0
        L43:
            r0 = r7
            r7 = r1
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L51
        L4c:
            int r0 = r6.f7977v
            r5 = r0
            r0 = r7
            r7 = r5
        L51:
            X.c r1 = new X.c
            if (r0 == 0) goto L5a
            int r2 = r0.hashCode()
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r1.<init>(r2, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
