package co.notix;

/* loaded from: classes.dex */
public final class dk extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public int f12107a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sk f12109c;

    /* renamed from: d, reason: collision with root package name */
    public int f12110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(sk skVar, E7.d dVar) {
        super(dVar);
        this.f12109c = skVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12108b = obj;
        this.f12110d |= Integer.MIN_VALUE;
        return this.f12109c.a(0, (E7.d) this);
    }
}
