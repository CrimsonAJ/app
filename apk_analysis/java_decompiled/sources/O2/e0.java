package O2;

/* loaded from: classes.dex */
public final class e0 extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5379r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f0 f5380s;

    /* renamed from: t, reason: collision with root package name */
    public int f5381t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, G7.c cVar) {
        super(cVar);
        this.f5380s = f0Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5379r = obj;
        this.f5381t |= Integer.MIN_VALUE;
        Object a5 = this.f5380s.a(0L, 0, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
