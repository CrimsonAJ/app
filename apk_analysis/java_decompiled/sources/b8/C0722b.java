package b8;

/* renamed from: b8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722b extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f11462r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0723c f11463s;

    /* renamed from: t, reason: collision with root package name */
    public int f11464t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0722b(C0723c c0723c, E7.d dVar) {
        super(dVar);
        this.f11463s = c0723c;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11462r = obj;
        this.f11464t |= Integer.MIN_VALUE;
        return this.f11463s.emit(null, this);
    }
}
