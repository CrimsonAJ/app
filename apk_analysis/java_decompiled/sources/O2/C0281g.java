package O2;

/* renamed from: O2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281g extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0282h f5384r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5385s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0282h f5386t;

    /* renamed from: u, reason: collision with root package name */
    public int f5387u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0281g(C0282h c0282h, G7.c cVar) {
        super(cVar);
        this.f5386t = c0282h;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5385s = obj;
        this.f5387u |= Integer.MIN_VALUE;
        Object a5 = this.f5386t.a(null, null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
