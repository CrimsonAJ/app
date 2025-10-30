package co.notix;

/* loaded from: classes.dex */
public final class h2 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public l2 f12347a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l2 f12349c;

    /* renamed from: d, reason: collision with root package name */
    public int f12350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(l2 l2Var, E7.d dVar) {
        super(dVar);
        this.f12349c = l2Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12348b = obj;
        this.f12350d |= Integer.MIN_VALUE;
        return this.f12349c.d(this);
    }
}
