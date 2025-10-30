package co.notix;

/* loaded from: classes.dex */
public final class i5 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public o4 f12431a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f12433c;

    /* renamed from: d, reason: collision with root package name */
    public int f12434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(m5 m5Var, E7.d dVar) {
        super(dVar);
        this.f12433c = m5Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12432b = obj;
        this.f12434d |= Integer.MIN_VALUE;
        return this.f12433c.a((o4) null, this);
    }
}
