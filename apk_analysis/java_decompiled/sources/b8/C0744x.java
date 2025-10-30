package b8;

/* renamed from: b8.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744x extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0737q f11533r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f11534s;

    /* renamed from: t, reason: collision with root package name */
    public int f11535t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0737q f11536u;

    /* renamed from: v, reason: collision with root package name */
    public Object f11537v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0744x(C0737q c0737q, E7.d dVar) {
        super(dVar);
        this.f11536u = c0737q;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11534s = obj;
        this.f11535t |= Integer.MIN_VALUE;
        return this.f11536u.emit(null, this);
    }
}
