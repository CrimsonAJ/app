package co.notix;

/* loaded from: classes.dex */
public final class zo extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ap f13703b;

    /* renamed from: c, reason: collision with root package name */
    public int f13704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(ap apVar, E7.d dVar) {
        super(dVar);
        this.f13703b = apVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13702a = obj;
        this.f13704c |= Integer.MIN_VALUE;
        return this.f13703b.b(this);
    }
}
