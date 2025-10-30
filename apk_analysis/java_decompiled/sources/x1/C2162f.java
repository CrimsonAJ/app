package x1;

/* renamed from: x1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2162f extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C2165i f24517r;

    /* renamed from: s, reason: collision with root package name */
    public C2167k f24518s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f24519t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2165i f24520u;

    /* renamed from: v, reason: collision with root package name */
    public int f24521v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2162f(C2165i c2165i, G7.c cVar) {
        super(cVar);
        this.f24520u = c2165i;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f24519t = obj;
        this.f24521v |= Integer.MIN_VALUE;
        return this.f24520u.d(null, this);
    }
}
