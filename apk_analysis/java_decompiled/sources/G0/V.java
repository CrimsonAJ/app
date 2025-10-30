package G0;

/* loaded from: classes.dex */
public final class V extends G7.j implements O7.p {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ K f2715A;

    /* renamed from: r, reason: collision with root package name */
    public r[] f2716r;

    /* renamed from: s, reason: collision with root package name */
    public X f2717s;

    /* renamed from: t, reason: collision with root package name */
    public K f2718t;

    /* renamed from: u, reason: collision with root package name */
    public int f2719u;

    /* renamed from: v, reason: collision with root package name */
    public int f2720v;

    /* renamed from: w, reason: collision with root package name */
    public int f2721w;

    /* renamed from: x, reason: collision with root package name */
    public int f2722x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r[] f2723y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ X f2724z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(r[] rVarArr, X x5, K k5, E7.d dVar) {
        super(2, dVar);
        this.f2723y = rVarArr;
        this.f2724z = x5;
        this.f2715A = k5;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new V(this.f2723y, this.f2724z, this.f2715A, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((I0.m) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (G0.X.c(r7, r6, r11, r10) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0075 -> B:10:0x0076). Please report as a decompilation issue!!! */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r10.f2722x
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L24
            if (r1 == r2) goto Lc
            if (r1 != r3) goto L1c
        Lc:
            int r1 = r10.f2721w
            int r4 = r10.f2720v
            int r5 = r10.f2719u
            G0.K r6 = r10.f2718t
            G0.X r7 = r10.f2717s
            G0.r[] r8 = r10.f2716r
            a.AbstractC0485a.A(r11)
            goto L58
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            a.AbstractC0485a.A(r11)
            G0.r[] r11 = r10.f2723y
            int r1 = r11.length
            r4 = 0
            G0.X r5 = r10.f2724z
            G0.K r6 = r10.f2715A
            r8 = r11
            r11 = r4
            r7 = r5
        L32:
            if (r4 >= r1) goto L78
            r5 = r8[r4]
            int r9 = r11 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L75
            if (r5 == r2) goto L60
            if (r5 != r3) goto L5a
            r10.f2716r = r8
            r10.f2717s = r7
            r10.f2718t = r6
            r10.f2719u = r9
            r10.f2720v = r4
            r10.f2721w = r1
            r10.f2722x = r3
            java.lang.Object r11 = G0.X.d(r7, r6, r11, r10)
            if (r11 != r0) goto L57
            goto L74
        L57:
            r5 = r9
        L58:
            r11 = r5
            goto L76
        L5a:
            A7.b r11 = new A7.b
            r11.<init>()
            throw r11
        L60:
            r10.f2716r = r8
            r10.f2717s = r7
            r10.f2718t = r6
            r10.f2719u = r9
            r10.f2720v = r4
            r10.f2721w = r1
            r10.f2722x = r2
            java.lang.Object r11 = G0.X.c(r7, r6, r11, r10)
            if (r11 != r0) goto L57
        L74:
            return r0
        L75:
            r11 = r9
        L76:
            int r4 = r4 + r2
            goto L32
        L78:
            A7.n r11 = A7.n.f558a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.V.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
