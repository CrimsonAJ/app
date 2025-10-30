package co.notix;

/* loaded from: classes.dex */
public final class xh extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public yh f13529a;

    /* renamed from: b, reason: collision with root package name */
    public String f13530b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13531c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13532d;

    /* renamed from: e, reason: collision with root package name */
    public Object f13533e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f13534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yh f13535g;

    /* renamed from: h, reason: collision with root package name */
    public int f13536h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(yh yhVar, E7.d dVar) {
        super(dVar);
        this.f13535g = yhVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13534f = obj;
        this.f13536h |= Integer.MIN_VALUE;
        return this.f13535g.a(null, null, null, this);
    }
}
