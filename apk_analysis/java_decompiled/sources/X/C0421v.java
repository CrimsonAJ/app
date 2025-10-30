package X;

/* renamed from: X.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421v extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public O f8116r;

    /* renamed from: s, reason: collision with root package name */
    public g8.d f8117s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8118t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O f8119u;

    /* renamed from: v, reason: collision with root package name */
    public int f8120v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0421v(O o9, G7.c cVar) {
        super(cVar);
        this.f8119u = o9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8118t = obj;
        this.f8120v |= Integer.MIN_VALUE;
        return O.c(this.f8119u, this);
    }
}
