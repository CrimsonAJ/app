package X;

/* loaded from: classes.dex */
public final class N extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.m f8004r;

    /* renamed from: s, reason: collision with root package name */
    public int f8005s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8006t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f8007u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ O f8008v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8009w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f8010x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(kotlin.jvm.internal.m mVar, O o9, Object obj, boolean z9, E7.d dVar) {
        super(2, dVar);
        this.f8007u = mVar;
        this.f8008v = o9;
        this.f8009w = obj;
        this.f8010x = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        N n7 = new N(this.f8007u, this.f8008v, this.f8009w, this.f8010x, dVar);
        n7.f8006t = obj;
        return n7;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((Z.k) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r6.b(r3, r7) == r0) goto L16;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r7.f8005s
            kotlin.jvm.internal.m r2 = r7.f8007u
            java.lang.Object r3 = r7.f8009w
            X.O r4 = r7.f8008v
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            a.AbstractC0485a.A(r8)
            goto L65
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.jvm.internal.m r1 = r7.f8004r
            java.lang.Object r6 = r7.f8006t
            Z.k r6 = (Z.k) r6
            a.AbstractC0485a.A(r8)
            goto L4f
        L28:
            a.AbstractC0485a.A(r8)
            java.lang.Object r8 = r7.f8006t
            Z.k r8 = (Z.k) r8
            X.Y r1 = r4.h()
            r7.f8006t = r8
            r7.f8004r = r2
            r7.f8005s = r6
            b7.c r1 = r1.f8047b
            java.lang.Object r1 = r1.f11404b
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L4b
            goto L64
        L4b:
            r1 = r6
            r6 = r8
            r8 = r1
            r1 = r2
        L4f:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.f20157a = r8
            r8 = 0
            r7.f8006t = r8
            r7.f8004r = r8
            r7.f8005s = r5
            java.lang.Object r8 = r6.b(r3, r7)
            if (r8 != r0) goto L65
        L64:
            return r0
        L65:
            boolean r8 = r7.f8010x
            if (r8 == 0) goto L7d
            G0.s r8 = r4.f8018h
            X.c r0 = new X.c
            if (r3 == 0) goto L74
            int r1 = r3.hashCode()
            goto L75
        L74:
            r1 = 0
        L75:
            int r2 = r2.f20157a
            r0.<init>(r1, r2, r3)
            r8.c(r0)
        L7d:
            A7.n r8 = A7.n.f558a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
