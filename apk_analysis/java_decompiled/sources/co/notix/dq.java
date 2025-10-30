package co.notix;

/* loaded from: classes.dex */
public final class dq extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mq f12123b;

    /* renamed from: c, reason: collision with root package name */
    public int f12124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(mq mqVar, E7.d dVar) {
        super(dVar);
        this.f12123b = mqVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12122a = obj;
        this.f12124c |= Integer.MIN_VALUE;
        return this.f12123b.c(this);
    }
}
