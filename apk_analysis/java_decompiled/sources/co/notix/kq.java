package co.notix;

/* loaded from: classes.dex */
public final class kq extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mq f12640b;

    /* renamed from: c, reason: collision with root package name */
    public int f12641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(mq mqVar, E7.d dVar) {
        super(dVar);
        this.f12640b = mqVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12639a = obj;
        this.f12641c |= Integer.MIN_VALUE;
        return this.f12640b.g(this);
    }
}
