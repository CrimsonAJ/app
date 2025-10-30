package co.notix;

/* loaded from: classes.dex */
public final class ci extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public di f12034a;

    /* renamed from: b, reason: collision with root package name */
    public String f12035b;

    /* renamed from: c, reason: collision with root package name */
    public g8.a f12036c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ di f12038e;

    /* renamed from: f, reason: collision with root package name */
    public int f12039f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(di diVar, E7.d dVar) {
        super(dVar);
        this.f12038e = diVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12037d = obj;
        this.f12039f |= Integer.MIN_VALUE;
        return this.f12038e.a(null, this);
    }
}
