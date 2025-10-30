package co.notix;

/* loaded from: classes.dex */
public final class dr extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public er f12125a;

    /* renamed from: b, reason: collision with root package name */
    public g8.a f12126b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er f12128d;

    /* renamed from: e, reason: collision with root package name */
    public int f12129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr(er erVar, E7.d dVar) {
        super(dVar);
        this.f12128d = erVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12127c = obj;
        this.f12129e |= Integer.MIN_VALUE;
        return this.f12128d.a(this);
    }
}
