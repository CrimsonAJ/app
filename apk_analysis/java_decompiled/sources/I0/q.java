package I0;

/* loaded from: classes.dex */
public final class q extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Object f3250r;

    /* renamed from: s, reason: collision with root package name */
    public Object f3251s;

    /* renamed from: t, reason: collision with root package name */
    public int f3252t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3253u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s f3254v;

    /* renamed from: w, reason: collision with root package name */
    public int f3255w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, G7.c cVar) {
        super(cVar);
        this.f3254v = sVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f3253u = obj;
        this.f3255w |= Integer.MIN_VALUE;
        return this.f3254v.f(null, null, this);
    }
}
