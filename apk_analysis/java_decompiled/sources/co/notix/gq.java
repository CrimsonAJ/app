package co.notix;

/* loaded from: classes.dex */
public final class gq extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12343a;

    /* renamed from: b, reason: collision with root package name */
    public int f12344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hq f12345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(hq hqVar, E7.d dVar) {
        super(dVar);
        this.f12345c = hqVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12343a = obj;
        this.f12344b |= Integer.MIN_VALUE;
        return this.f12345c.emit(null, this);
    }
}
