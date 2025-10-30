package co.notix;

/* loaded from: classes.dex */
public final class e4 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public l4 f12134a;

    /* renamed from: b, reason: collision with root package name */
    public o4 f12135b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l4 f12137d;

    /* renamed from: e, reason: collision with root package name */
    public int f12138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(l4 l4Var, E7.d dVar) {
        super(dVar);
        this.f12137d = l4Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12136c = obj;
        this.f12138e |= Integer.MIN_VALUE;
        return this.f12137d.a(null, this);
    }
}
