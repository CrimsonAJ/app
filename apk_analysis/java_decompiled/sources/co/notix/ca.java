package co.notix;

/* loaded from: classes.dex */
public final class ca extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public ia f11996a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11997b;

    /* renamed from: c, reason: collision with root package name */
    public ej f11998c;

    /* renamed from: d, reason: collision with root package name */
    public rb f11999d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f12000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ia f12001f;

    /* renamed from: g, reason: collision with root package name */
    public int f12002g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(ia iaVar, E7.d dVar) {
        super(dVar);
        this.f12001f = iaVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12000e = obj;
        this.f12002g |= Integer.MIN_VALUE;
        return ia.a(this.f12001f, null, null, this);
    }
}
