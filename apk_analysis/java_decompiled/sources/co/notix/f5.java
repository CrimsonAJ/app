package co.notix;

/* loaded from: classes.dex */
public final class f5 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12229a;

    /* renamed from: b, reason: collision with root package name */
    public int f12230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g5 f12231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(g5 g5Var, E7.d dVar) {
        super(dVar);
        this.f12231c = g5Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12229a = obj;
        this.f12230b |= Integer.MIN_VALUE;
        return this.f12231c.emit(null, this);
    }
}
