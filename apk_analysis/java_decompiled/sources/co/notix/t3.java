package co.notix;

/* loaded from: classes.dex */
public final class t3 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u3 f13206b;

    /* renamed from: c, reason: collision with root package name */
    public int f13207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(u3 u3Var, E7.d dVar) {
        super(dVar);
        this.f13206b = u3Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13205a = obj;
        this.f13207c |= Integer.MIN_VALUE;
        return this.f13206b.emit(null, this);
    }
}
