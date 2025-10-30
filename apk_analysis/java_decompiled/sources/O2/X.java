package O2;

/* loaded from: classes.dex */
public final class X extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5351r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y f5352s;

    /* renamed from: t, reason: collision with root package name */
    public int f5353t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y9, G7.c cVar) {
        super(cVar);
        this.f5352s = y9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5351r = obj;
        this.f5353t |= Integer.MIN_VALUE;
        Object a5 = this.f5352s.a(null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
