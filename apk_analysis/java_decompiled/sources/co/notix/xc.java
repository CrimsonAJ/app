package co.notix;

/* loaded from: classes.dex */
public final class xc extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public long f13514a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ed f13516c;

    /* renamed from: d, reason: collision with root package name */
    public int f13517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(ed edVar, E7.d dVar) {
        super(dVar);
        this.f13516c = edVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13515b = obj;
        this.f13517d |= Integer.MIN_VALUE;
        return this.f13516c.b(0L, this);
    }
}
