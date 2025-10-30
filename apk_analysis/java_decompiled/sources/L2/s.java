package L2;

/* loaded from: classes.dex */
public final class s extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public t f4628r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4629s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f4630t;

    /* renamed from: u, reason: collision with root package name */
    public int f4631u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, G7.c cVar) {
        super(cVar);
        this.f4630t = tVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4629s = obj;
        this.f4631u |= Integer.MIN_VALUE;
        Object a5 = this.f4630t.a(false, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
