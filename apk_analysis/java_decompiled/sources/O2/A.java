package O2;

/* loaded from: classes.dex */
public final class A extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public B f5290r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5291s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B f5292t;

    /* renamed from: u, reason: collision with root package name */
    public int f5293u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b9, G7.c cVar) {
        super(cVar);
        this.f5292t = b9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5291s = obj;
        this.f5293u |= Integer.MIN_VALUE;
        Object a5 = this.f5292t.a(0L, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
