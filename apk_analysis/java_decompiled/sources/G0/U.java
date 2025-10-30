package G0;

/* loaded from: classes.dex */
public final class U extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public A1.g f2711r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2712s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X f2713t;

    /* renamed from: u, reason: collision with root package name */
    public int f2714u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(X x5, G7.c cVar) {
        super(cVar);
        this.f2713t = x5;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f2712s = obj;
        this.f2714u |= Integer.MIN_VALUE;
        return this.f2713t.e(this);
    }
}
