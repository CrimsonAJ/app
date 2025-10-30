package P2;

/* loaded from: classes.dex */
public final class r extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5798r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f5799s;

    /* renamed from: t, reason: collision with root package name */
    public int f5800t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, G7.c cVar) {
        super(cVar);
        this.f5799s = sVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5798r = obj;
        this.f5800t |= Integer.MIN_VALUE;
        Object a5 = this.f5799s.a(0L, false, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
