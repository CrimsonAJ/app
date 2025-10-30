package Z;

/* loaded from: classes.dex */
public final class g extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public i f8881r;

    /* renamed from: s, reason: collision with root package name */
    public c f8882s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8883t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8884u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f8885v;

    /* renamed from: w, reason: collision with root package name */
    public int f8886w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, G7.c cVar) {
        super(cVar);
        this.f8885v = iVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8884u = obj;
        this.f8886w |= Integer.MIN_VALUE;
        return this.f8885v.a(null, this);
    }
}
