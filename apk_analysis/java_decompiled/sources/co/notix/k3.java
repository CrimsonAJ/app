package co.notix;

/* loaded from: classes.dex */
public final class k3 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12589a;

    /* renamed from: b, reason: collision with root package name */
    public int f12590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f12591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(l3 l3Var, E7.d dVar) {
        super(dVar);
        this.f12591c = l3Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12589a = obj;
        this.f12590b |= Integer.MIN_VALUE;
        return this.f12591c.emit(null, this);
    }
}
