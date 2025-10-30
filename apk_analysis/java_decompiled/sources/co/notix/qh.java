package co.notix;

/* loaded from: classes.dex */
public final class qh extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public vh f13048a;

    /* renamed from: b, reason: collision with root package name */
    public g8.a f13049b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh f13051d;

    /* renamed from: e, reason: collision with root package name */
    public int f13052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(vh vhVar, E7.d dVar) {
        super(dVar);
        this.f13051d = vhVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13050c = obj;
        this.f13052e |= Integer.MIN_VALUE;
        return this.f13051d.b(this);
    }
}
