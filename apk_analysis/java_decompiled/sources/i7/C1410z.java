package i7;

/* renamed from: i7.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1410z extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Object f18921r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f18922s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1385A f18923t;

    /* renamed from: u, reason: collision with root package name */
    public int f18924u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410z(C1385A c1385a, G7.c cVar) {
        super(cVar);
        this.f18923t = c1385a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f18922s = obj;
        this.f18924u |= Integer.MIN_VALUE;
        return this.f18923t.a(null, this);
    }
}
