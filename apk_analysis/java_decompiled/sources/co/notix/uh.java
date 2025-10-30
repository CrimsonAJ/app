package co.notix;

/* loaded from: classes.dex */
public final class uh extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public vh f13296a;

    /* renamed from: b, reason: collision with root package name */
    public O7.l f13297b;

    /* renamed from: c, reason: collision with root package name */
    public g8.a f13298c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh f13300e;

    /* renamed from: f, reason: collision with root package name */
    public int f13301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(vh vhVar, E7.d dVar) {
        super(dVar);
        this.f13300e = vhVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13299d = obj;
        this.f13301f |= Integer.MIN_VALUE;
        return this.f13300e.b(null, this);
    }
}
