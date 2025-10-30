package b8;

/* renamed from: b8.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734n extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f11497r;

    /* renamed from: s, reason: collision with root package name */
    public int f11498s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0733m f11499t;

    /* renamed from: u, reason: collision with root package name */
    public C0733m f11500u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0726f f11501v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0734n(C0733m c0733m, E7.d dVar) {
        super(dVar);
        this.f11499t = c0733m;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11497r = obj;
        this.f11498s |= Integer.MIN_VALUE;
        return this.f11499t.collect(null, this);
    }
}
