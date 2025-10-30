package co.notix;

/* loaded from: classes.dex */
public final class cp extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dp f12059b;

    /* renamed from: c, reason: collision with root package name */
    public int f12060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(dp dpVar, E7.d dVar) {
        super(dVar);
        this.f12059b = dpVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12058a = obj;
        this.f12060c |= Integer.MIN_VALUE;
        return this.f12059b.a(this);
    }
}
