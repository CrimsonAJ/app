package X;

/* loaded from: classes.dex */
public final class W extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public g8.d f8041r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8042s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8043t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y f8044u;

    /* renamed from: v, reason: collision with root package name */
    public int f8045v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y9, G7.c cVar) {
        super(cVar);
        this.f8044u = y9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8043t = obj;
        this.f8045v |= Integer.MIN_VALUE;
        return this.f8044u.c(null, this);
    }
}
