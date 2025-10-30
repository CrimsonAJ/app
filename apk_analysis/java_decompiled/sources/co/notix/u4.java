package co.notix;

/* loaded from: classes.dex */
public final class u4 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public t4 f13272a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f13274c;

    /* renamed from: d, reason: collision with root package name */
    public int f13275d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(m5 m5Var, E7.d dVar) {
        super(dVar);
        this.f13274c = m5Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13273b = obj;
        this.f13275d |= Integer.MIN_VALUE;
        return this.f13274c.a((t4) null, this);
    }
}
