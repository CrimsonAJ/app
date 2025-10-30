package co.notix;

/* loaded from: classes.dex */
public final class w4 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m5 f13401b;

    /* renamed from: c, reason: collision with root package name */
    public int f13402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(m5 m5Var, E7.d dVar) {
        super(dVar);
        this.f13401b = m5Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13400a = obj;
        this.f13402c |= Integer.MIN_VALUE;
        return this.f13401b.a(this);
    }
}
