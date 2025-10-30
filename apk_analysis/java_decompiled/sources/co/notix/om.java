package co.notix;

/* loaded from: classes.dex */
public final class om extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public O7.l f12903a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vn f12905c;

    /* renamed from: d, reason: collision with root package name */
    public int f12906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(vn vnVar, E7.d dVar) {
        super(dVar);
        this.f12905c = vnVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12904b = obj;
        this.f12906d |= Integer.MIN_VALUE;
        return this.f12905c.a((fm) null, this);
    }
}
