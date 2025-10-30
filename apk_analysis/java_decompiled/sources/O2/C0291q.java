package O2;

/* renamed from: O2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291q extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public r f5412r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5413s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f5414t;

    /* renamed from: u, reason: collision with root package name */
    public int f5415u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0291q(r rVar, G7.c cVar) {
        super(cVar);
        this.f5414t = rVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5413s = obj;
        this.f5415u |= Integer.MIN_VALUE;
        Object a5 = this.f5414t.a(null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
