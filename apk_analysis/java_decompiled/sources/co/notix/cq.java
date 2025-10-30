package co.notix;

/* loaded from: classes.dex */
public final class cq extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mq f12062b;

    /* renamed from: c, reason: collision with root package name */
    public int f12063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(mq mqVar, E7.d dVar) {
        super(dVar);
        this.f12062b = mqVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12061a = obj;
        this.f12063c |= Integer.MIN_VALUE;
        return this.f12062b.b(this);
    }
}
