package co.notix;

/* loaded from: classes.dex */
public final class pm extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vn f12991b;

    /* renamed from: c, reason: collision with root package name */
    public int f12992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(vn vnVar, E7.d dVar) {
        super(dVar);
        this.f12991b = vnVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12990a = obj;
        this.f12992c |= Integer.MIN_VALUE;
        return this.f12991b.a(this);
    }
}
