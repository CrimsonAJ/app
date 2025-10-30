package co.notix;

/* loaded from: classes.dex */
public final class mb extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nb f12774b;

    /* renamed from: c, reason: collision with root package name */
    public int f12775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(nb nbVar, E7.d dVar) {
        super(dVar);
        this.f12774b = nbVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12773a = obj;
        this.f12775c |= Integer.MIN_VALUE;
        return this.f12774b.a((ob) null, this);
    }
}
