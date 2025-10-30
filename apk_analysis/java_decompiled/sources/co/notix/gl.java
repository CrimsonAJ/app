package co.notix;

/* loaded from: classes.dex */
public final class gl extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kl f12338b;

    /* renamed from: c, reason: collision with root package name */
    public int f12339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(kl klVar, E7.d dVar) {
        super(dVar);
        this.f12338b = klVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12337a = obj;
        this.f12339c |= Integer.MIN_VALUE;
        Object a5 = this.f12338b.a(null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
