package co.notix;

/* loaded from: classes.dex */
public final class lh extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public mh f12709a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12710b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12711c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh f12712d;

    /* renamed from: e, reason: collision with root package name */
    public int f12713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(mh mhVar, E7.d dVar) {
        super(dVar);
        this.f12712d = mhVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12711c = obj;
        this.f12713e |= Integer.MIN_VALUE;
        return this.f12712d.emit(null, this);
    }
}
