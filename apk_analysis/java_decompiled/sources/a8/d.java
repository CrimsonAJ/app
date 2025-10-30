package a8;

/* loaded from: classes.dex */
public final class d extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9194r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f9195s;

    /* renamed from: t, reason: collision with root package name */
    public int f9196t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, G7.c cVar) {
        super(cVar);
        this.f9195s = eVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f9194r = obj;
        this.f9196t |= Integer.MIN_VALUE;
        Object B9 = this.f9195s.B(null, 0, 0L, this);
        if (B9 == F7.a.f2587a) {
            return B9;
        }
        return new l(B9);
    }
}
