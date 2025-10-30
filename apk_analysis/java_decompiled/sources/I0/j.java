package I0;

/* loaded from: classes.dex */
public final class j extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public k f3220r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f3221s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f3222t;

    /* renamed from: u, reason: collision with root package name */
    public int f3223u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, G7.c cVar) {
        super(cVar);
        this.f3222t = kVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f3221s = obj;
        this.f3223u |= Integer.MIN_VALUE;
        return this.f3222t.a(this);
    }
}
