package L2;

/* loaded from: classes.dex */
public final class o extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public A1.g f4620r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4621s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A1.g f4622t;

    /* renamed from: u, reason: collision with root package name */
    public int f4623u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(A1.g gVar, G7.c cVar) {
        super(cVar);
        this.f4622t = gVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4621s = obj;
        this.f4623u |= Integer.MIN_VALUE;
        Object x5 = this.f4622t.x(this);
        if (x5 == F7.a.f2587a) {
            return x5;
        }
        return new A7.j(x5);
    }
}
