package co.notix;

/* loaded from: classes.dex */
public final class hn extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public long f12407a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vn f12409c;

    /* renamed from: d, reason: collision with root package name */
    public int f12410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(vn vnVar, E7.d dVar) {
        super(dVar);
        this.f12409c = vnVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12408b = obj;
        this.f12410d |= Integer.MIN_VALUE;
        return this.f12409c.a(0L, this);
    }
}
