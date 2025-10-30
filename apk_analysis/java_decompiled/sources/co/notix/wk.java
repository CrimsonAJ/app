package co.notix;

/* loaded from: classes.dex */
public final class wk extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public zk f13447a;

    /* renamed from: b, reason: collision with root package name */
    public int f13448b;

    /* renamed from: c, reason: collision with root package name */
    public long f13449c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk f13451e;

    /* renamed from: f, reason: collision with root package name */
    public int f13452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(zk zkVar, E7.d dVar) {
        super(dVar);
        this.f13451e = zkVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13450d = obj;
        this.f13452f |= Integer.MIN_VALUE;
        return zk.a(this.f13451e, 0, 0L, this);
    }
}
