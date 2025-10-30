package co.notix;

/* loaded from: classes.dex */
public final class sh extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public vh f13177a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13178b;

    /* renamed from: c, reason: collision with root package name */
    public g8.a f13179c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh f13181e;

    /* renamed from: f, reason: collision with root package name */
    public int f13182f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(vh vhVar, E7.d dVar) {
        super(dVar);
        this.f13181e = vhVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13180d = obj;
        this.f13182f |= Integer.MIN_VALUE;
        return this.f13181e.a((Number) null, this);
    }
}
