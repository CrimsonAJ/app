package P2;

/* loaded from: classes.dex */
public final class a extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5761r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f5762s;

    /* renamed from: t, reason: collision with root package name */
    public int f5763t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, G7.c cVar) {
        super(cVar);
        this.f5762s = bVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5761r = obj;
        this.f5763t |= Integer.MIN_VALUE;
        Object a5 = this.f5762s.a(null, null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
