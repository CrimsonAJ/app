package O2;

import java.io.Serializable;

/* renamed from: O2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285k extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0286l f5394r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5395s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0286l f5396t;

    /* renamed from: u, reason: collision with root package name */
    public int f5397u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0285k(C0286l c0286l, G7.c cVar) {
        super(cVar);
        this.f5396t = c0286l;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5395s = obj;
        this.f5397u |= Integer.MIN_VALUE;
        Serializable a5 = this.f5396t.a(0, null, null, null, null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
