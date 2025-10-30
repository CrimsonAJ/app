package O2;

/* loaded from: classes.dex */
public final class Z extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5355r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f5356s;

    /* renamed from: t, reason: collision with root package name */
    public int f5357t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var, G7.c cVar) {
        super(cVar);
        this.f5356s = a0Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5355r = obj;
        this.f5357t |= Integer.MIN_VALUE;
        Object a5 = this.f5356s.a(0L, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
