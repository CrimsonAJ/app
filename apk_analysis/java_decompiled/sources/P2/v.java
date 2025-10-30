package P2;

/* loaded from: classes.dex */
public final class v extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5808r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f5809s;

    /* renamed from: t, reason: collision with root package name */
    public int f5810t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, G7.c cVar) {
        super(cVar);
        this.f5809s = wVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5808r = obj;
        this.f5810t |= Integer.MIN_VALUE;
        Object a5 = this.f5809s.a(0L, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
