package O2;

/* renamed from: O2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279e extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5376r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0280f f5377s;

    /* renamed from: t, reason: collision with root package name */
    public int f5378t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0279e(C0280f c0280f, G7.c cVar) {
        super(cVar);
        this.f5377s = c0280f;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5376r = obj;
        this.f5378t |= Integer.MIN_VALUE;
        Object a5 = this.f5377s.a(0L, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
