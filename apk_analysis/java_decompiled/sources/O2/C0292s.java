package O2;

/* renamed from: O2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292s extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0293t f5418r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5419s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0293t f5420t;

    /* renamed from: u, reason: collision with root package name */
    public int f5421u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0292s(C0293t c0293t, G7.c cVar) {
        super(cVar);
        this.f5420t = c0293t;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5419s = obj;
        this.f5421u |= Integer.MIN_VALUE;
        Object a5 = this.f5420t.a(0, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
