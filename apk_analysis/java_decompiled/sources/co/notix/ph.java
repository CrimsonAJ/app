package co.notix;

/* loaded from: classes.dex */
public final class ph extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh f12971b;

    /* renamed from: c, reason: collision with root package name */
    public int f12972c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(vh vhVar, E7.d dVar) {
        super(dVar);
        this.f12971b = vhVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12970a = obj;
        this.f12972c |= Integer.MIN_VALUE;
        return this.f12971b.collect(null, this);
    }
}
