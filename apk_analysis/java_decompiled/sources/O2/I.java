package O2;

/* loaded from: classes.dex */
public final class I extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public J f5313r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5314s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J f5315t;

    /* renamed from: u, reason: collision with root package name */
    public int f5316u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j, G7.c cVar) {
        super(cVar);
        this.f5315t = j;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5314s = obj;
        this.f5316u |= Integer.MIN_VALUE;
        Object a5 = this.f5315t.a(null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
