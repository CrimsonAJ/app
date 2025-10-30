package J0;

/* loaded from: classes.dex */
public final class c extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public d f3585r;

    /* renamed from: s, reason: collision with root package name */
    public Q0.a f3586s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f3587t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f3588u;

    /* renamed from: v, reason: collision with root package name */
    public int f3589v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, G7.c cVar) {
        super(cVar);
        this.f3588u = dVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f3587t = obj;
        this.f3589v |= Integer.MIN_VALUE;
        return this.f3588u.d(null, null, this);
    }
}
