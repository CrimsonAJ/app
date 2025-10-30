package X;

/* loaded from: classes.dex */
public final class r extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8105r;

    /* renamed from: s, reason: collision with root package name */
    public int f8106s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0418s f8107t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0418s c0418s, E7.d dVar) {
        super(dVar);
        this.f8107t = c0418s;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8105r = obj;
        this.f8106s |= Integer.MIN_VALUE;
        return this.f8107t.emit(null, this);
    }
}
