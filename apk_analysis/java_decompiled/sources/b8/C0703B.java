package b8;

/* renamed from: b8.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703B extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f11408r;

    /* renamed from: s, reason: collision with root package name */
    public int f11409s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0737q f11410t;

    /* renamed from: u, reason: collision with root package name */
    public Object f11411u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0726f f11412v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0703B(C0737q c0737q, E7.d dVar) {
        super(dVar);
        this.f11410t = c0737q;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11408r = obj;
        this.f11409s |= Integer.MIN_VALUE;
        return this.f11410t.emit(null, this);
    }
}
