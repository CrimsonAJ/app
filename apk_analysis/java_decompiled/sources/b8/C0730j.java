package b8;

/* renamed from: b8.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730j extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f11481r;

    /* renamed from: s, reason: collision with root package name */
    public int f11482s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0731k f11483t;

    /* renamed from: u, reason: collision with root package name */
    public Object f11484u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0726f f11485v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0730j(C0731k c0731k, E7.d dVar) {
        super(dVar);
        this.f11483t = c0731k;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11481r = obj;
        this.f11482s |= Integer.MIN_VALUE;
        return this.f11483t.collect(null, this);
    }
}
