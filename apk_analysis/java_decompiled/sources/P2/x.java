package P2;

/* loaded from: classes.dex */
public final class x extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5812r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f5813s;

    /* renamed from: t, reason: collision with root package name */
    public int f5814t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, G7.c cVar) {
        super(cVar);
        this.f5813s = yVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5812r = obj;
        this.f5814t |= Integer.MIN_VALUE;
        Object a5 = this.f5813s.a(null, null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
