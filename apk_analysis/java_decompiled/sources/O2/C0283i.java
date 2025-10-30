package O2;

/* renamed from: O2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283i extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5390r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0284j f5391s;

    /* renamed from: t, reason: collision with root package name */
    public int f5392t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0283i(C0284j c0284j, G7.c cVar) {
        super(cVar);
        this.f5391s = c0284j;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5390r = obj;
        this.f5392t |= Integer.MIN_VALUE;
        Object a5 = this.f5391s.a(null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
