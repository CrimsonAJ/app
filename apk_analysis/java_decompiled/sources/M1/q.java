package M1;

/* loaded from: classes.dex */
public final class q extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public r f4735r;

    /* renamed from: s, reason: collision with root package name */
    public Throwable f4736s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f4737t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f4738u;

    /* renamed from: v, reason: collision with root package name */
    public int f4739v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, E7.d dVar) {
        super(dVar);
        this.f4738u = rVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4737t = obj;
        this.f4739v |= Integer.MIN_VALUE;
        return this.f4738u.f(null, this);
    }
}
