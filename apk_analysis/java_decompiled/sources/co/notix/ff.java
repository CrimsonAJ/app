package co.notix;

/* loaded from: classes.dex */
public final class ff extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public Cif f12251a;

    /* renamed from: b, reason: collision with root package name */
    public we f12252b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12253c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Cif f12254d;

    /* renamed from: e, reason: collision with root package name */
    public int f12255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(Cif cif, E7.d dVar) {
        super(dVar);
        this.f12254d = cif;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12253c = obj;
        this.f12255e |= Integer.MIN_VALUE;
        return this.f12254d.a(null, this);
    }
}
