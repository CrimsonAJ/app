package co.notix;

/* loaded from: classes.dex */
public final class j2 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public l2 f12501a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l2 f12503c;

    /* renamed from: d, reason: collision with root package name */
    public int f12504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(l2 l2Var, E7.d dVar) {
        super(dVar);
        this.f12503c = l2Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12502b = obj;
        this.f12504d |= Integer.MIN_VALUE;
        return this.f12503c.f(this);
    }
}
