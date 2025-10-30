package b8;

/* renamed from: b8.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742v extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0737q f11527r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f11528s;

    /* renamed from: t, reason: collision with root package name */
    public int f11529t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0737q f11530u;

    /* renamed from: v, reason: collision with root package name */
    public Object f11531v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0742v(C0737q c0737q, E7.d dVar) {
        super(dVar);
        this.f11530u = c0737q;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11528s = obj;
        this.f11529t |= Integer.MIN_VALUE;
        return this.f11530u.emit(null, this);
    }
}
