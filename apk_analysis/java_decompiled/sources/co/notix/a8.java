package co.notix;

/* loaded from: classes.dex */
public final class a8 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c8 f11828b;

    /* renamed from: c, reason: collision with root package name */
    public int f11829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(c8 c8Var, E7.d dVar) {
        super(dVar);
        this.f11828b = c8Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11827a = obj;
        this.f11829c |= Integer.MIN_VALUE;
        return c8.a(this.f11828b, (String) null, this);
    }
}
