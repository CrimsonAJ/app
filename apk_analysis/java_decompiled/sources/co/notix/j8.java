package co.notix;

/* loaded from: classes.dex */
public final class j8 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8 f12539b;

    /* renamed from: c, reason: collision with root package name */
    public int f12540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(k8 k8Var, E7.d dVar) {
        super(dVar);
        this.f12539b = k8Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12538a = obj;
        this.f12540c |= Integer.MIN_VALUE;
        return this.f12539b.a((l8) null, this);
    }
}
