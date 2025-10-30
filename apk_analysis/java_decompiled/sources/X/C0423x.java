package X;

import Y7.C0473n;

/* renamed from: X.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423x extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Object f8123r;

    /* renamed from: s, reason: collision with root package name */
    public O f8124s;

    /* renamed from: t, reason: collision with root package name */
    public C0473n f8125t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8126u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ O f8127v;

    /* renamed from: w, reason: collision with root package name */
    public int f8128w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0423x(O o9, G7.c cVar) {
        super(cVar);
        this.f8127v = o9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8126u = obj;
        this.f8128w |= Integer.MIN_VALUE;
        return O.d(this.f8127v, null, this);
    }
}
