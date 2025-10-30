package P2;

/* loaded from: classes.dex */
public final class c extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5765r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f5766s;

    /* renamed from: t, reason: collision with root package name */
    public int f5767t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, G7.c cVar) {
        super(cVar);
        this.f5766s = dVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5765r = obj;
        this.f5767t |= Integer.MIN_VALUE;
        Object a5 = this.f5766s.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
