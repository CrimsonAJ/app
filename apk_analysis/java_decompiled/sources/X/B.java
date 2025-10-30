package X;

/* loaded from: classes.dex */
public final class B extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public O f7950r;

    /* renamed from: s, reason: collision with root package name */
    public Z f7951s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7952t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f7953u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ O f7954v;

    /* renamed from: w, reason: collision with root package name */
    public int f7955w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(O o9, E7.d dVar) {
        super(dVar);
        this.f7954v = o9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f7953u = obj;
        this.f7955w |= Integer.MIN_VALUE;
        return O.f(this.f7954v, false, this);
    }
}
