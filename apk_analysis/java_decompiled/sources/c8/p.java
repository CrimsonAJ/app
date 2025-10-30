package c8;

/* loaded from: classes.dex */
public final class p extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f11786r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f11787s;

    /* renamed from: t, reason: collision with root package name */
    public int f11788t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, E7.d dVar) {
        super(dVar);
        this.f11787s = qVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11786r = obj;
        this.f11788t |= Integer.MIN_VALUE;
        return this.f11787s.emit(null, this);
    }
}
