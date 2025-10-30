package O2;

/* renamed from: O2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287m extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0288n f5400r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5401s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0288n f5402t;

    /* renamed from: u, reason: collision with root package name */
    public int f5403u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0287m(C0288n c0288n, G7.c cVar) {
        super(cVar);
        this.f5402t = c0288n;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5401s = obj;
        this.f5403u |= Integer.MIN_VALUE;
        Object a5 = this.f5402t.a(0L, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
