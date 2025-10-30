package co.notix;

/* loaded from: classes.dex */
public final class eq extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mq f12198b;

    /* renamed from: c, reason: collision with root package name */
    public int f12199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(mq mqVar, E7.d dVar) {
        super(dVar);
        this.f12198b = mqVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12197a = obj;
        this.f12199c |= Integer.MIN_VALUE;
        return this.f12198b.d(this);
    }
}
