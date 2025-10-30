package Z;

import x8.y;

/* loaded from: classes.dex */
public final class h extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public i f8887r;

    /* renamed from: s, reason: collision with root package name */
    public Object f8888s;

    /* renamed from: t, reason: collision with root package name */
    public y f8889t;

    /* renamed from: u, reason: collision with root package name */
    public Object f8890u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8891v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f8892w;

    /* renamed from: x, reason: collision with root package name */
    public int f8893x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, G7.c cVar) {
        super(cVar);
        this.f8892w = iVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8891v = obj;
        this.f8893x |= Integer.MIN_VALUE;
        return this.f8892w.b(null, this);
    }
}
