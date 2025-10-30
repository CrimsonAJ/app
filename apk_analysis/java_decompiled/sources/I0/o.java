package I0;

import G0.J;

/* loaded from: classes.dex */
public final class o extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public s f3238r;

    /* renamed from: s, reason: collision with root package name */
    public J f3239s;

    /* renamed from: t, reason: collision with root package name */
    public i f3240t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3241u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s f3242v;

    /* renamed from: w, reason: collision with root package name */
    public int f3243w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, G7.c cVar) {
        super(cVar);
        this.f3242v = sVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f3241u = obj;
        this.f3243w |= Integer.MIN_VALUE;
        return this.f3242v.d(null, this);
    }
}
