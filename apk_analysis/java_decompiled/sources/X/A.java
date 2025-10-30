package X;

/* loaded from: classes.dex */
public final class A extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public O f7945r;

    /* renamed from: s, reason: collision with root package name */
    public int f7946s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7947t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O f7948u;

    /* renamed from: v, reason: collision with root package name */
    public int f7949v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(O o9, G7.c cVar) {
        super(cVar);
        this.f7948u = o9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f7947t = obj;
        this.f7949v |= Integer.MIN_VALUE;
        return this.f7948u.i(this);
    }
}
