package co.notix;

/* loaded from: classes.dex */
public final class f2 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public l2 f12212a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l2 f12214c;

    /* renamed from: d, reason: collision with root package name */
    public int f12215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(l2 l2Var, E7.d dVar) {
        super(dVar);
        this.f12214c = l2Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12213b = obj;
        this.f12215d |= Integer.MIN_VALUE;
        return this.f12214c.b(this);
    }
}
