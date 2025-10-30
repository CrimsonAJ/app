package b8;

/* renamed from: b8.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738r extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f11512r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0737q f11513s;

    /* renamed from: t, reason: collision with root package name */
    public int f11514t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0738r(C0737q c0737q, E7.d dVar) {
        super(dVar);
        this.f11513s = c0737q;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11512r = obj;
        this.f11514t |= Integer.MIN_VALUE;
        return this.f11513s.emit(null, this);
    }
}
