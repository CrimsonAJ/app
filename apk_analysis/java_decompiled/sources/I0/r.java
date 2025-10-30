package I0;

/* loaded from: classes.dex */
public final class r extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public s f3256r;

    /* renamed from: s, reason: collision with root package name */
    public String f3257s;

    /* renamed from: t, reason: collision with root package name */
    public O7.l f3258t;

    /* renamed from: u, reason: collision with root package name */
    public i f3259u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3260v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f3261w;

    /* renamed from: x, reason: collision with root package name */
    public int f3262x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, G7.c cVar) {
        super(cVar);
        this.f3261w = sVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f3260v = obj;
        this.f3262x |= Integer.MIN_VALUE;
        return this.f3261w.c(null, null, this);
    }
}
