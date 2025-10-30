package co.notix;

/* loaded from: classes.dex */
public final class un extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public O7.l f13315a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vn f13317c;

    /* renamed from: d, reason: collision with root package name */
    public int f13318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(vn vnVar, E7.d dVar) {
        super(dVar);
        this.f13317c = vnVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13316b = obj;
        this.f13318d |= Integer.MIN_VALUE;
        return this.f13317c.a((gm) null, this);
    }
}
