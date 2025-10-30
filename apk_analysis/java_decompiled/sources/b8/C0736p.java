package b8;

/* renamed from: b8.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736p extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0737q f11505r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f11506s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0737q f11507t;

    /* renamed from: u, reason: collision with root package name */
    public int f11508u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0736p(C0737q c0737q, E7.d dVar) {
        super(dVar);
        this.f11507t = c0737q;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11506s = obj;
        this.f11508u |= Integer.MIN_VALUE;
        return this.f11507t.emit(null, this);
    }
}
