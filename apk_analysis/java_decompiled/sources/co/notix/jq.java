package co.notix;

/* loaded from: classes.dex */
public final class jq extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mq f12578b;

    /* renamed from: c, reason: collision with root package name */
    public int f12579c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(mq mqVar, E7.d dVar) {
        super(dVar);
        this.f12578b = mqVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12577a = obj;
        this.f12579c |= Integer.MIN_VALUE;
        return this.f12578b.f(this);
    }
}
