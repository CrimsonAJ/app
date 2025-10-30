package co.notix;

/* loaded from: classes.dex */
public final class ak extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sk f11855b;

    /* renamed from: c, reason: collision with root package name */
    public int f11856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(sk skVar, E7.d dVar) {
        super(dVar);
        this.f11855b = skVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11854a = obj;
        this.f11856c |= Integer.MIN_VALUE;
        return this.f11855b.b(this);
    }
}
