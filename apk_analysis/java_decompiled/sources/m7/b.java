package m7;

/* loaded from: classes.dex */
public final class b extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Object f20867r;

    /* renamed from: s, reason: collision with root package name */
    public g8.a f20868s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f20869t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f20870u;

    /* renamed from: v, reason: collision with root package name */
    public int f20871v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, G7.c cVar) {
        super(cVar);
        this.f20870u = eVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f20869t = obj;
        this.f20871v |= Integer.MIN_VALUE;
        return this.f20870u.c(this);
    }
}
