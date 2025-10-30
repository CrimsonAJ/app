package co.notix;

/* loaded from: classes.dex */
public final class bf extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public df f11927a;

    /* renamed from: b, reason: collision with root package name */
    public we f11928b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11929c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df f11930d;

    /* renamed from: e, reason: collision with root package name */
    public int f11931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(df dfVar, E7.d dVar) {
        super(dVar);
        this.f11930d = dfVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11929c = obj;
        this.f11931e |= Integer.MIN_VALUE;
        return this.f11930d.a(null, this);
    }
}
