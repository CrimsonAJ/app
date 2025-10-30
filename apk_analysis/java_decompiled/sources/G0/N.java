package G0;

/* loaded from: classes.dex */
public final class N extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public X f2679r;

    /* renamed from: s, reason: collision with root package name */
    public A1.g f2680s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f2681t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X f2682u;

    /* renamed from: v, reason: collision with root package name */
    public int f2683v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(X x5, G7.c cVar) {
        super(cVar);
        this.f2682u = x5;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f2681t = obj;
        this.f2683v |= Integer.MIN_VALUE;
        return X.b(this.f2682u, this);
    }
}
