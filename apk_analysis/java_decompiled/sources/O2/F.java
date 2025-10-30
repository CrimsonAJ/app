package O2;

/* loaded from: classes.dex */
public final class F extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public O0.c f5303r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5304s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O0.c f5305t;

    /* renamed from: u, reason: collision with root package name */
    public int f5306u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(O0.c cVar, G7.c cVar2) {
        super(cVar2);
        this.f5305t = cVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5304s = obj;
        this.f5306u |= Integer.MIN_VALUE;
        Object F2 = this.f5305t.F(0L, this);
        if (F2 == F7.a.f2587a) {
            return F2;
        }
        return new A7.j(F2);
    }
}
