package co.notix;

/* loaded from: classes.dex */
public final class l7 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f12684a;

    /* renamed from: b, reason: collision with root package name */
    public g8.a f12685b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r7 f12687d;

    /* renamed from: e, reason: collision with root package name */
    public int f12688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(r7 r7Var, E7.d dVar) {
        super(dVar);
        this.f12687d = r7Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12686c = obj;
        this.f12688e |= Integer.MIN_VALUE;
        return this.f12687d.a(this);
    }
}
