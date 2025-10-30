package co.notix;

/* loaded from: classes.dex */
public final class k2 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public l2 f12585a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l2 f12587c;

    /* renamed from: d, reason: collision with root package name */
    public int f12588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, E7.d dVar) {
        super(dVar);
        this.f12587c = l2Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12586b = obj;
        this.f12588d |= Integer.MIN_VALUE;
        return this.f12587c.g(this);
    }
}
