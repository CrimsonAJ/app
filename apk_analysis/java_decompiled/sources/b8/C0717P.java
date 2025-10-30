package b8;

import Y7.InterfaceC0465h0;

/* renamed from: b8.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717P extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0718Q f11446r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0726f f11447s;

    /* renamed from: t, reason: collision with root package name */
    public C0719S f11448t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0465h0 f11449u;

    /* renamed from: v, reason: collision with root package name */
    public Object f11450v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11451w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0718Q f11452x;

    /* renamed from: y, reason: collision with root package name */
    public int f11453y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0717P(C0718Q c0718q, E7.d dVar) {
        super(dVar);
        this.f11452x = c0718q;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11451w = obj;
        this.f11453y |= Integer.MIN_VALUE;
        this.f11452x.collect(null, this);
        return F7.a.f2587a;
    }
}
