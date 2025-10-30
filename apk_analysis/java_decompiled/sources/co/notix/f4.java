package co.notix;

/* loaded from: classes.dex */
public final class f4 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f12220a;

    /* renamed from: b, reason: collision with root package name */
    public o4 f12221b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12222c;

    /* renamed from: d, reason: collision with root package name */
    public String f12223d;

    /* renamed from: e, reason: collision with root package name */
    public String f12224e;

    /* renamed from: f, reason: collision with root package name */
    public o4 f12225f;

    /* renamed from: g, reason: collision with root package name */
    public long f12226g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12227h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l4 f12228i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(l4 l4Var, E7.d dVar) {
        super(dVar);
        this.f12228i = l4Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12227h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f12228i.b(null, this);
    }
}
