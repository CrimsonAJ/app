package X;

/* renamed from: X.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424y extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public O f8129r;

    /* renamed from: s, reason: collision with root package name */
    public g8.d f8130s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8131t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O f8132u;

    /* renamed from: v, reason: collision with root package name */
    public int f8133v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0424y(O o9, G7.c cVar) {
        super(cVar);
        this.f8132u = o9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8131t = obj;
        this.f8133v |= Integer.MIN_VALUE;
        return O.e(this.f8132u, this);
    }
}
