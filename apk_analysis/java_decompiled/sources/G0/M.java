package G0;

/* loaded from: classes.dex */
public final class M extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Object f2675r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2676s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X f2677t;

    /* renamed from: u, reason: collision with root package name */
    public int f2678u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(X x5, G7.c cVar) {
        super(cVar);
        this.f2677t = x5;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f2676s = obj;
        this.f2678u |= Integer.MIN_VALUE;
        return X.a(this.f2677t, null, this);
    }
}
