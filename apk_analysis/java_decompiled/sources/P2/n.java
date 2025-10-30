package P2;

/* loaded from: classes.dex */
public final class n extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public o f5788r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5789s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f5790t;

    /* renamed from: u, reason: collision with root package name */
    public int f5791u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, G7.c cVar) {
        super(cVar);
        this.f5790t = oVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5789s = obj;
        this.f5791u |= Integer.MIN_VALUE;
        Object a5 = this.f5790t.a(null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
