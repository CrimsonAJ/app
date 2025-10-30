package co.notix;

/* loaded from: classes.dex */
public final class am extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm f11866b;

    /* renamed from: c, reason: collision with root package name */
    public int f11867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(lm lmVar, E7.d dVar) {
        super(dVar);
        this.f11866b = lmVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11865a = obj;
        this.f11867c |= Integer.MIN_VALUE;
        return this.f11866b.b(this);
    }
}
