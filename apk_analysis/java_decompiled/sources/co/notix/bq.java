package co.notix;

/* loaded from: classes.dex */
public final class bq extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mq f11961b;

    /* renamed from: c, reason: collision with root package name */
    public int f11962c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(mq mqVar, E7.d dVar) {
        super(dVar);
        this.f11961b = mqVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11960a = obj;
        this.f11962c |= Integer.MIN_VALUE;
        return this.f11961b.a(this);
    }
}
