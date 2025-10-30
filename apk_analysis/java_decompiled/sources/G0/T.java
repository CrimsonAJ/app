package G0;

/* loaded from: classes.dex */
public final class T extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0154u f2703r;

    /* renamed from: s, reason: collision with root package name */
    public String f2704s;

    /* renamed from: t, reason: collision with root package name */
    public String[] f2705t;

    /* renamed from: u, reason: collision with root package name */
    public int f2706u;

    /* renamed from: v, reason: collision with root package name */
    public int f2707v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f2708w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ X f2709x;

    /* renamed from: y, reason: collision with root package name */
    public int f2710y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(X x5, G7.c cVar) {
        super(cVar);
        this.f2709x = x5;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f2708w = obj;
        this.f2710y |= Integer.MIN_VALUE;
        return X.d(this.f2709x, null, 0, this);
    }
}
