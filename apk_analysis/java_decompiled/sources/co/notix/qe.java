package co.notix;

/* loaded from: classes.dex */
public final class qe extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13036a;

    /* renamed from: b, reason: collision with root package name */
    public int f13037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ re f13038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(re reVar, E7.d dVar) {
        super(dVar);
        this.f13038c = reVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13036a = obj;
        this.f13037b |= Integer.MIN_VALUE;
        return this.f13038c.emit(null, this);
    }
}
