package co.notix;

/* loaded from: classes.dex */
public final class wc extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public long f13418a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ed f13420c;

    /* renamed from: d, reason: collision with root package name */
    public int f13421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(ed edVar, E7.d dVar) {
        super(dVar);
        this.f13420c = edVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13419b = obj;
        this.f13421d |= Integer.MIN_VALUE;
        return this.f13420c.a(0L, this);
    }
}
