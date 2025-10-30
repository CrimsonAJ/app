package co.notix;

/* loaded from: classes.dex */
public final class qi extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej f13054b;

    /* renamed from: c, reason: collision with root package name */
    public int f13055c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(ej ejVar, E7.d dVar) {
        super(dVar);
        this.f13054b = ejVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13053a = obj;
        this.f13055c |= Integer.MIN_VALUE;
        return this.f13054b.a(this);
    }
}
