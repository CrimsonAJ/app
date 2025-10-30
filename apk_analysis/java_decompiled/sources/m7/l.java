package m7;

/* loaded from: classes.dex */
public final class l extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f20904r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f20905s;

    /* renamed from: t, reason: collision with root package name */
    public int f20906t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, G7.c cVar) {
        super(cVar);
        this.f20905s = nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f20904r = obj;
        this.f20906t |= Integer.MIN_VALUE;
        return this.f20905s.c(null, null, this);
    }
}
