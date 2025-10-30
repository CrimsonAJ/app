package co.notix;

/* loaded from: classes.dex */
public final class z8 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13640a;

    /* renamed from: b, reason: collision with root package name */
    public int f13641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a9 f13642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(a9 a9Var, E7.d dVar) {
        super(dVar);
        this.f13642c = a9Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13640a = obj;
        this.f13641b |= Integer.MIN_VALUE;
        return this.f13642c.emit(null, this);
    }
}
