package co.notix;

/* loaded from: classes.dex */
public final class za extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public ab f13647a;

    /* renamed from: b, reason: collision with root package name */
    public g8.a f13648b;

    /* renamed from: c, reason: collision with root package name */
    public long f13649c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ab f13651e;

    /* renamed from: f, reason: collision with root package name */
    public int f13652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(ab abVar, E7.d dVar) {
        super(dVar);
        this.f13651e = abVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13650d = obj;
        this.f13652f |= Integer.MIN_VALUE;
        return this.f13651e.b(0L, this);
    }
}
