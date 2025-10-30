package u1;

/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2055c extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Object f23568r;

    /* renamed from: s, reason: collision with root package name */
    public g8.i f23569s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f23570t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2056d f23571u;

    /* renamed from: v, reason: collision with root package name */
    public int f23572v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2055c(C2056d c2056d, G7.c cVar) {
        super(cVar);
        this.f23571u = c2056d;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f23570t = obj;
        this.f23572v |= Integer.MIN_VALUE;
        return this.f23571u.a(this);
    }
}
