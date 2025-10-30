package co.notix;

/* loaded from: classes.dex */
public final class s extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2 f13141b;

    /* renamed from: c, reason: collision with root package name */
    public int f13142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(l2 l2Var, E7.d dVar) {
        super(dVar);
        this.f13141b = l2Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13140a = obj;
        this.f13142c |= Integer.MIN_VALUE;
        return this.f13141b.b(null, this);
    }
}
