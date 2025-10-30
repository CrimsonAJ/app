package co.notix;

/* loaded from: classes.dex */
public final class oa extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public ra f12871a;

    /* renamed from: b, reason: collision with root package name */
    public ra f12872b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12873c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ra f12874d;

    /* renamed from: e, reason: collision with root package name */
    public int f12875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(ra raVar, E7.d dVar) {
        super(dVar);
        this.f12874d = raVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12873c = obj;
        this.f12875e |= Integer.MIN_VALUE;
        return this.f12874d.a(this);
    }
}
