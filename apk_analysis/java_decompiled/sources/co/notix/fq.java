package co.notix;

/* loaded from: classes.dex */
public final class fq extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mq f12281b;

    /* renamed from: c, reason: collision with root package name */
    public int f12282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq(mq mqVar, E7.d dVar) {
        super(dVar);
        this.f12281b = mqVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12280a = obj;
        this.f12282c |= Integer.MIN_VALUE;
        return this.f12281b.e(this);
    }
}
