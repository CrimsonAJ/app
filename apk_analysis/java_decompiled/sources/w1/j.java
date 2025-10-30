package w1;

/* loaded from: classes.dex */
public final class j extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f24015r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f24016s;

    /* renamed from: t, reason: collision with root package name */
    public int f24017t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, G7.c cVar) {
        super(cVar);
        this.f24016s = lVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f24015r = obj;
        this.f24017t |= Integer.MIN_VALUE;
        return this.f24016s.b(null, this);
    }
}
