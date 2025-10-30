package P2;

/* loaded from: classes.dex */
public final class j extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public k f5776r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5777s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f5778t;

    /* renamed from: u, reason: collision with root package name */
    public int f5779u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, G7.c cVar) {
        super(cVar);
        this.f5778t = kVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5777s = obj;
        this.f5779u |= Integer.MIN_VALUE;
        Object a5 = this.f5778t.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
