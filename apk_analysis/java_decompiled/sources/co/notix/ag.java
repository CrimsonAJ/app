package co.notix;

/* loaded from: classes.dex */
public final class ag extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11846a;

    /* renamed from: b, reason: collision with root package name */
    public int f11847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bg f11848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(bg bgVar, E7.d dVar) {
        super(dVar);
        this.f11848c = bgVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11846a = obj;
        this.f11847b |= Integer.MIN_VALUE;
        return this.f11848c.emit(null, this);
    }
}
