package b8;

/* renamed from: b8.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740t extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0723c f11518r;

    /* renamed from: s, reason: collision with root package name */
    public Object f11519s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f11520t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0723c f11521u;

    /* renamed from: v, reason: collision with root package name */
    public int f11522v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0740t(C0723c c0723c, E7.d dVar) {
        super(dVar);
        this.f11521u = c0723c;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11520t = obj;
        this.f11522v |= Integer.MIN_VALUE;
        return this.f11521u.emit(null, this);
    }
}
