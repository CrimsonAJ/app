package P2;

/* loaded from: classes.dex */
public final class p extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5794r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f5795s;

    /* renamed from: t, reason: collision with root package name */
    public int f5796t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, G7.c cVar) {
        super(cVar);
        this.f5795s = qVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5794r = obj;
        this.f5796t |= Integer.MIN_VALUE;
        Object a5 = this.f5795s.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
