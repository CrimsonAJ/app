package co.notix;

/* loaded from: classes.dex */
public final class ck extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public sk f12045a;

    /* renamed from: b, reason: collision with root package name */
    public long f12046b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12047c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk f12048d;

    /* renamed from: e, reason: collision with root package name */
    public int f12049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(sk skVar, E7.d dVar) {
        super(dVar);
        this.f12048d = skVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12047c = obj;
        this.f12049e |= Integer.MIN_VALUE;
        return this.f12048d.b(0L, this);
    }
}
