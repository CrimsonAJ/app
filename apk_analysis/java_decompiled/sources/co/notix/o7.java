package co.notix;

/* loaded from: classes.dex */
public final class o7 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12862a;

    /* renamed from: b, reason: collision with root package name */
    public int f12863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p7 f12864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(p7 p7Var, E7.d dVar) {
        super(dVar);
        this.f12864c = p7Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12862a = obj;
        this.f12863b |= Integer.MIN_VALUE;
        return this.f12864c.emit(null, this);
    }
}
