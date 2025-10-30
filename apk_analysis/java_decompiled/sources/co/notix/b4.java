package co.notix;

/* loaded from: classes.dex */
public final class b4 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f11908a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11909b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11910c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4 f11911d;

    /* renamed from: e, reason: collision with root package name */
    public int f11912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(c4 c4Var, E7.d dVar) {
        super(dVar);
        this.f11911d = c4Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11910c = obj;
        this.f11912e |= Integer.MIN_VALUE;
        return this.f11911d.a((l) null, this);
    }
}
