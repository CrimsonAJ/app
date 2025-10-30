package L2;

/* loaded from: classes.dex */
public final class m extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public n f4614r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4615s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f4616t;

    /* renamed from: u, reason: collision with root package name */
    public int f4617u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, G7.c cVar) {
        super(cVar);
        this.f4616t = nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4615s = obj;
        this.f4617u |= Integer.MIN_VALUE;
        Object a5 = this.f4616t.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
