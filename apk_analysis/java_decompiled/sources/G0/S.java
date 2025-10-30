package G0;

/* loaded from: classes.dex */
public final class S extends G7.c {

    /* renamed from: A, reason: collision with root package name */
    public int f2693A;

    /* renamed from: r, reason: collision with root package name */
    public X f2694r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0154u f2695s;

    /* renamed from: t, reason: collision with root package name */
    public String f2696t;

    /* renamed from: u, reason: collision with root package name */
    public String[] f2697u;

    /* renamed from: v, reason: collision with root package name */
    public int f2698v;

    /* renamed from: w, reason: collision with root package name */
    public int f2699w;

    /* renamed from: x, reason: collision with root package name */
    public int f2700x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f2701y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ X f2702z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(X x5, G7.c cVar) {
        super(cVar);
        this.f2702z = x5;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f2701y = obj;
        this.f2693A |= Integer.MIN_VALUE;
        return X.c(this.f2702z, null, 0, this);
    }
}
