package co.notix;

/* loaded from: classes.dex */
public final class ao extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ co f11870b;

    /* renamed from: c, reason: collision with root package name */
    public int f11871c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(co coVar, E7.d dVar) {
        super(dVar);
        this.f11870b = coVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11869a = obj;
        this.f11871c |= Integer.MIN_VALUE;
        return this.f11870b.a(null, this);
    }
}
