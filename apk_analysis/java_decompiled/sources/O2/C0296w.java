package O2;

/* renamed from: O2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296w extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0297x f5430r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5431s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0297x f5432t;

    /* renamed from: u, reason: collision with root package name */
    public int f5433u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0296w(C0297x c0297x, G7.c cVar) {
        super(cVar);
        this.f5432t = c0297x;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5431s = obj;
        this.f5433u |= Integer.MIN_VALUE;
        Object a5 = this.f5432t.a(0L, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
