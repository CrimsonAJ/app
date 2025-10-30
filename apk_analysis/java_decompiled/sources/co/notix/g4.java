package co.notix;

/* loaded from: classes.dex */
public final class g4 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12292a;

    /* renamed from: b, reason: collision with root package name */
    public int f12293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4 f12294c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(h4 h4Var, E7.d dVar) {
        super(dVar);
        this.f12294c = h4Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12292a = obj;
        this.f12293b |= Integer.MIN_VALUE;
        return this.f12294c.emit(null, this);
    }
}
