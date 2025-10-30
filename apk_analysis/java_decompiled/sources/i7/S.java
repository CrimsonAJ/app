package i7;

/* loaded from: classes.dex */
public final class S extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public T f18786r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f18787s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T f18788t;

    /* renamed from: u, reason: collision with root package name */
    public int f18789u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t7, G7.c cVar) {
        super(cVar);
        this.f18788t = t7;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f18787s = obj;
        this.f18789u |= Integer.MIN_VALUE;
        return T.a(this.f18788t, this);
    }
}
