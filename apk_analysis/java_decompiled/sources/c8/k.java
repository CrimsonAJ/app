package c8;

/* loaded from: classes.dex */
public final class k extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public l f11772r;

    /* renamed from: s, reason: collision with root package name */
    public Object f11773s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f11774t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f11775u;

    /* renamed from: v, reason: collision with root package name */
    public int f11776v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, E7.d dVar) {
        super(dVar);
        this.f11775u = lVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11774t = obj;
        this.f11776v |= Integer.MIN_VALUE;
        return this.f11775u.emit(null, this);
    }
}
