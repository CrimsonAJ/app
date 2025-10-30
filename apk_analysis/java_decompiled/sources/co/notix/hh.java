package co.notix;

/* loaded from: classes.dex */
public final class hh extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public g8.a f12383a;

    /* renamed from: b, reason: collision with root package name */
    public yh f12384b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh f12386d;

    /* renamed from: e, reason: collision with root package name */
    public int f12387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh(kh khVar, E7.d dVar) {
        super(dVar);
        this.f12386d = khVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12385c = obj;
        this.f12387e |= Integer.MIN_VALUE;
        return this.f12386d.a(this);
    }
}
