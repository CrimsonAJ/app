package T1;

/* loaded from: classes.dex */
public final class C extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Object f6974r;

    /* renamed from: s, reason: collision with root package name */
    public Object f6975s;

    /* renamed from: t, reason: collision with root package name */
    public String f6976t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f6977u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G f6978v;

    /* renamed from: w, reason: collision with root package name */
    public int f6979w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(G g9, G7.c cVar) {
        super(cVar);
        this.f6978v = g9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f6977u = obj;
        this.f6979w |= Integer.MIN_VALUE;
        return this.f6978v.g(0L, false, this);
    }
}
