package co.notix;

/* loaded from: classes.dex */
public final class n3 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c4 f12807b;

    /* renamed from: c, reason: collision with root package name */
    public int f12808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(c4 c4Var, E7.d dVar) {
        super(dVar);
        this.f12807b = c4Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12806a = obj;
        this.f12808c |= Integer.MIN_VALUE;
        return c4.a(this.f12807b, this);
    }
}
