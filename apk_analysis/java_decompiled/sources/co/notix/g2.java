package co.notix;

/* loaded from: classes.dex */
public final class g2 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public l2 f12286a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l2 f12288c;

    /* renamed from: d, reason: collision with root package name */
    public int f12289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(l2 l2Var, E7.d dVar) {
        super(dVar);
        this.f12288c = l2Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12287b = obj;
        this.f12289d |= Integer.MIN_VALUE;
        return this.f12288c.c(this);
    }
}
