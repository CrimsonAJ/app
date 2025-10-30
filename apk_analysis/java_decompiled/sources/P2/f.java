package P2;

/* loaded from: classes.dex */
public final class f extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5770r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f5771s;

    /* renamed from: t, reason: collision with root package name */
    public int f5772t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, G7.c cVar) {
        super(cVar);
        this.f5771s = gVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5770r = obj;
        this.f5772t |= Integer.MIN_VALUE;
        Object a5 = this.f5771s.a(0L, 0L, 0, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
