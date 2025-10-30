package co.notix;

/* loaded from: classes.dex */
public final class rh extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public vh f13117a;

    /* renamed from: b, reason: collision with root package name */
    public O7.l f13118b;

    /* renamed from: c, reason: collision with root package name */
    public g8.a f13119c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh f13121e;

    /* renamed from: f, reason: collision with root package name */
    public int f13122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(vh vhVar, E7.d dVar) {
        super(dVar);
        this.f13121e = vhVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13120d = obj;
        this.f13122f |= Integer.MIN_VALUE;
        return this.f13121e.a((O7.l) null, this);
    }
}
