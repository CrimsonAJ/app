package co.notix;

/* loaded from: classes.dex */
public final class aj extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej f11852b;

    /* renamed from: c, reason: collision with root package name */
    public int f11853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ej ejVar, E7.d dVar) {
        super(dVar);
        this.f11852b = ejVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11851a = obj;
        this.f11853c |= Integer.MIN_VALUE;
        return this.f11852b.b(this);
    }
}
