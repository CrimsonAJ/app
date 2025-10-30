package L2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class k extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public l f4608r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4609s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f4610t;

    /* renamed from: u, reason: collision with root package name */
    public int f4611u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, G7.c cVar) {
        super(cVar);
        this.f4610t = lVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4609s = obj;
        this.f4611u |= Integer.MIN_VALUE;
        Serializable a5 = this.f4610t.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
