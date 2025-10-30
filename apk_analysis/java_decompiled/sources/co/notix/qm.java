package co.notix;

/* loaded from: classes.dex */
public final class qm extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vn f13065b;

    /* renamed from: c, reason: collision with root package name */
    public int f13066c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(vn vnVar, E7.d dVar) {
        super(dVar);
        this.f13065b = vnVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13064a = obj;
        this.f13066c |= Integer.MIN_VALUE;
        return this.f13065b.b(this);
    }
}
