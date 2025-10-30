package P2;

/* loaded from: classes.dex */
public final class t extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public u f5802r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5803s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f5804t;

    /* renamed from: u, reason: collision with root package name */
    public int f5805u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, G7.c cVar) {
        super(cVar);
        this.f5804t = uVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5803s = obj;
        this.f5805u |= Integer.MIN_VALUE;
        Object a5 = this.f5804t.a(null, null, null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
