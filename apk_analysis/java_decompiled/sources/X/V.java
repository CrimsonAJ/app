package X;

/* loaded from: classes.dex */
public final class V extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Object f8036r;

    /* renamed from: s, reason: collision with root package name */
    public g8.d f8037s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8038t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y f8039u;

    /* renamed from: v, reason: collision with root package name */
    public int f8040v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Y y9, G7.c cVar) {
        super(cVar);
        this.f8039u = y9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8038t = obj;
        this.f8040v |= Integer.MIN_VALUE;
        return this.f8039u.b(null, this);
    }
}
