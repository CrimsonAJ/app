package co.notix;

/* loaded from: classes.dex */
public final class xj extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public sk f13538a;

    /* renamed from: b, reason: collision with root package name */
    public long f13539b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13540c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk f13541d;

    /* renamed from: e, reason: collision with root package name */
    public int f13542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(sk skVar, E7.d dVar) {
        super(dVar);
        this.f13541d = skVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13540c = obj;
        this.f13542e |= Integer.MIN_VALUE;
        return this.f13541d.a(0L, (E7.d) this);
    }
}
