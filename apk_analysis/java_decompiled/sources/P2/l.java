package P2;

/* loaded from: classes.dex */
public final class l extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public m f5782r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5783s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f5784t;

    /* renamed from: u, reason: collision with root package name */
    public int f5785u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, G7.c cVar) {
        super(cVar);
        this.f5784t = mVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5783s = obj;
        this.f5785u |= Integer.MIN_VALUE;
        Object a5 = this.f5784t.a(null, null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
