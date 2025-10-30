package co.notix;

/* loaded from: classes.dex */
public final class ub extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13287a;

    /* renamed from: b, reason: collision with root package name */
    public int f13288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vb f13289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(vb vbVar, E7.d dVar) {
        super(dVar);
        this.f13289c = vbVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13287a = obj;
        this.f13288b |= Integer.MIN_VALUE;
        return this.f13289c.emit(null, this);
    }
}
