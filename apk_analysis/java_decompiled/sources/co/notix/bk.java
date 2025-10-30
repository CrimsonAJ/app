package co.notix;

/* loaded from: classes.dex */
public final class bk extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sk f11943b;

    /* renamed from: c, reason: collision with root package name */
    public int f11944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(sk skVar, E7.d dVar) {
        super(dVar);
        this.f11943b = skVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11942a = obj;
        this.f11944c |= Integer.MIN_VALUE;
        return this.f11943b.c(this);
    }
}
