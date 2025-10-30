package co.notix;

/* loaded from: classes.dex */
public final class to extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ap f13247b;

    /* renamed from: c, reason: collision with root package name */
    public int f13248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(ap apVar, E7.d dVar) {
        super(dVar);
        this.f13247b = apVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13246a = obj;
        this.f13248c |= Integer.MIN_VALUE;
        return this.f13247b.a(this);
    }
}
