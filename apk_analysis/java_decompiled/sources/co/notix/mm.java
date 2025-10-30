package co.notix;

/* loaded from: classes.dex */
public final class mm extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public pl f12789a;

    /* renamed from: b, reason: collision with root package name */
    public long f12790b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12791c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vn f12792d;

    /* renamed from: e, reason: collision with root package name */
    public int f12793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm(vn vnVar, E7.d dVar) {
        super(dVar);
        this.f12792d = vnVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12791c = obj;
        this.f12793e |= Integer.MIN_VALUE;
        return this.f12792d.a(null, 0L, this);
    }
}
