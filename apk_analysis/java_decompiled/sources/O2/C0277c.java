package O2;

/* renamed from: O2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277c extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5366r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0278d f5367s;

    /* renamed from: t, reason: collision with root package name */
    public int f5368t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0277c(C0278d c0278d, G7.c cVar) {
        super(cVar);
        this.f5367s = c0278d;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5366r = obj;
        this.f5368t |= Integer.MIN_VALUE;
        Object a5 = this.f5367s.a(null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
