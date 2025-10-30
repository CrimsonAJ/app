package L2;

/* loaded from: classes.dex */
public final class i extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public j f4602r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4603s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f4604t;

    /* renamed from: u, reason: collision with root package name */
    public int f4605u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, G7.c cVar) {
        super(cVar);
        this.f4604t = jVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4603s = obj;
        this.f4605u |= Integer.MIN_VALUE;
        Object a5 = this.f4604t.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
