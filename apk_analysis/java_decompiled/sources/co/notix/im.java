package co.notix;

/* loaded from: classes.dex */
public final class im extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f12479a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12480b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12481c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm f12482d;

    /* renamed from: e, reason: collision with root package name */
    public int f12483e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(lm lmVar, E7.d dVar) {
        super(dVar);
        this.f12482d = lmVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12481c = obj;
        this.f12483e |= Integer.MIN_VALUE;
        return this.f12482d.b(null, this);
    }
}
