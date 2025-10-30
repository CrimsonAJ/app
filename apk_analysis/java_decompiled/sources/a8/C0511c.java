package a8;

/* renamed from: a8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511c extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9191r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f9192s;

    /* renamed from: t, reason: collision with root package name */
    public int f9193t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0511c(e eVar, G7.c cVar) {
        super(cVar);
        this.f9192s = eVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f9191r = obj;
        this.f9193t |= Integer.MIN_VALUE;
        Object A2 = e.A(this.f9192s, this);
        if (A2 == F7.a.f2587a) {
            return A2;
        }
        return new l(A2);
    }
}
