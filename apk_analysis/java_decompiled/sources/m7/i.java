package m7;

/* loaded from: classes.dex */
public final class i extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public j f20895r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f20896s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f20897t;

    /* renamed from: u, reason: collision with root package name */
    public int f20898u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, G7.c cVar) {
        super(cVar);
        this.f20897t = jVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f20896s = obj;
        this.f20898u |= Integer.MIN_VALUE;
        return this.f20897t.b(this);
    }
}
