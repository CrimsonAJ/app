package co.notix;

/* loaded from: classes.dex */
public final class j4 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l4 f12513b;

    /* renamed from: c, reason: collision with root package name */
    public int f12514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(l4 l4Var, E7.d dVar) {
        super(dVar);
        this.f12513b = l4Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12512a = obj;
        this.f12514c |= Integer.MIN_VALUE;
        return this.f12513b.c(null, this);
    }
}
