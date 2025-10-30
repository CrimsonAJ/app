package b8;

/* renamed from: b8.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741u extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f11523r;

    /* renamed from: s, reason: collision with root package name */
    public int f11524s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0739s f11525t;

    /* renamed from: u, reason: collision with root package name */
    public C0737q f11526u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0741u(C0739s c0739s, E7.d dVar) {
        super(dVar);
        this.f11525t = c0739s;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11523r = obj;
        this.f11524s |= Integer.MIN_VALUE;
        return this.f11525t.collect(null, this);
    }
}
