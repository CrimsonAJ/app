package co.notix;

/* loaded from: classes.dex */
public final class m7 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f12764a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12765b;

    /* renamed from: c, reason: collision with root package name */
    public i9 f12766c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r7 f12768e;

    /* renamed from: f, reason: collision with root package name */
    public int f12769f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(r7 r7Var, E7.d dVar) {
        super(dVar);
        this.f12768e = r7Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12767d = obj;
        this.f12769f |= Integer.MIN_VALUE;
        Object b9 = this.f12768e.b(this);
        if (b9 == F7.a.f2587a) {
            return b9;
        }
        return new A7.j(b9);
    }
}
