package co.notix;

/* loaded from: classes.dex */
public final class ya extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab f13592b;

    /* renamed from: c, reason: collision with root package name */
    public int f13593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(ab abVar, E7.d dVar) {
        super(dVar);
        this.f13592b = abVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13591a = obj;
        this.f13593c |= Integer.MIN_VALUE;
        return this.f13592b.a(0L, this);
    }
}
