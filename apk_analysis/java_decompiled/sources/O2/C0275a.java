package O2;

/* renamed from: O2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275a extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0276b f5358r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5359s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0276b f5360t;

    /* renamed from: u, reason: collision with root package name */
    public int f5361u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0275a(C0276b c0276b, G7.c cVar) {
        super(cVar);
        this.f5360t = c0276b;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5359s = obj;
        this.f5361u |= Integer.MIN_VALUE;
        Object a5 = this.f5360t.a(0L, null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
