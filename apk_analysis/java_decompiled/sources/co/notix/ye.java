package co.notix;

/* loaded from: classes.dex */
public final class ye extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public df f13597a;

    /* renamed from: b, reason: collision with root package name */
    public we f13598b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df f13600d;

    /* renamed from: e, reason: collision with root package name */
    public int f13601e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(df dfVar, E7.d dVar) {
        super(dVar);
        this.f13600d = dfVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13599c = obj;
        this.f13601e |= Integer.MIN_VALUE;
        return this.f13600d.a(this);
    }
}
