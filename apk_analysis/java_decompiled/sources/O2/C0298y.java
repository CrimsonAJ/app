package O2;

/* renamed from: O2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298y extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0299z f5436r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5437s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0299z f5438t;

    /* renamed from: u, reason: collision with root package name */
    public int f5439u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0298y(C0299z c0299z, G7.c cVar) {
        super(cVar);
        this.f5438t = c0299z;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5437s = obj;
        this.f5439u |= Integer.MIN_VALUE;
        Object a5 = this.f5438t.a(0L, 0, 0, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
