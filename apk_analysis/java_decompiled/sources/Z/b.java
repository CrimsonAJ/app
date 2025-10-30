package Z;

import x8.C;

/* loaded from: classes.dex */
public final class b extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Object f8864r;

    /* renamed from: s, reason: collision with root package name */
    public C f8865s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8866t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f8867u;

    /* renamed from: v, reason: collision with root package name */
    public int f8868v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, G7.c cVar2) {
        super(cVar2);
        this.f8867u = cVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8866t = obj;
        this.f8868v |= Integer.MIN_VALUE;
        return c.a(this.f8867u, this);
    }
}
