package co.notix;

/* loaded from: classes.dex */
public final class j5 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public String f12515a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f12517c;

    /* renamed from: d, reason: collision with root package name */
    public int f12518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(m5 m5Var, E7.d dVar) {
        super(dVar);
        this.f12517c = m5Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12516b = obj;
        this.f12518d |= Integer.MIN_VALUE;
        return this.f12517c.a((String) null, this);
    }
}
