package x1;

/* renamed from: x1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2166j extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C2167k f24546r;

    /* renamed from: s, reason: collision with root package name */
    public C2165i f24547s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f24548t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2167k f24549u;

    /* renamed from: v, reason: collision with root package name */
    public int f24550v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2166j(C2167k c2167k, G7.c cVar) {
        super(cVar);
        this.f24549u = c2167k;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f24548t = obj;
        this.f24550v |= Integer.MIN_VALUE;
        return this.f24549u.b(null, this);
    }
}
