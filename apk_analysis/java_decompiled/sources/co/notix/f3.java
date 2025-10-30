package co.notix;

/* loaded from: classes.dex */
public final class f3 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public h3 f12216a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3 f12218c;

    /* renamed from: d, reason: collision with root package name */
    public int f12219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(h3 h3Var, E7.d dVar) {
        super(dVar);
        this.f12218c = h3Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12217b = obj;
        this.f12219d |= Integer.MIN_VALUE;
        return this.f12218c.awaitNext(0L, this);
    }
}
