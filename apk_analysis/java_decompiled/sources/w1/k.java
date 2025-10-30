package w1;

import v1.C2099g;

/* loaded from: classes.dex */
public final class k extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public l f24018r;

    /* renamed from: s, reason: collision with root package name */
    public C2099g f24019s;

    /* renamed from: t, reason: collision with root package name */
    public Object f24020t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f24021u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f24022v;

    /* renamed from: w, reason: collision with root package name */
    public int f24023w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, G7.c cVar) {
        super(cVar);
        this.f24022v = lVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f24021u = obj;
        this.f24023w |= Integer.MIN_VALUE;
        return this.f24022v.a(this);
    }
}
