package co.notix;

/* loaded from: classes.dex */
public final class d8 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e8 f12075b;

    /* renamed from: c, reason: collision with root package name */
    public int f12076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(e8 e8Var, E7.d dVar) {
        super(dVar);
        this.f12075b = e8Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12074a = obj;
        this.f12076c |= Integer.MIN_VALUE;
        return this.f12075b.a((f8) null, this);
    }
}
