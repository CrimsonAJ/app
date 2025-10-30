package co.notix;

/* loaded from: classes.dex */
public final class p extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public l2 f12912a;

    /* renamed from: b, reason: collision with root package name */
    public long f12913b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l2 f12915d;

    /* renamed from: e, reason: collision with root package name */
    public int f12916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l2 l2Var, E7.d dVar) {
        super(dVar);
        this.f12915d = l2Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12914c = obj;
        this.f12916e |= Integer.MIN_VALUE;
        return this.f12915d.a((er) null, this);
    }
}
