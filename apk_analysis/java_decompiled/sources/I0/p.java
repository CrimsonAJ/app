package I0;

/* loaded from: classes.dex */
public final class p extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public s f3244r;

    /* renamed from: s, reason: collision with root package name */
    public i f3245s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3246t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3247u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s f3248v;

    /* renamed from: w, reason: collision with root package name */
    public int f3249w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, G7.c cVar) {
        super(cVar);
        this.f3248v = sVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f3247u = obj;
        this.f3249w |= Integer.MIN_VALUE;
        return this.f3248v.e(false, this);
    }
}
