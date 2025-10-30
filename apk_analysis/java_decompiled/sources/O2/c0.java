package O2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c0 extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public d0 f5369r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5370s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d0 f5371t;

    /* renamed from: u, reason: collision with root package name */
    public int f5372u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, G7.c cVar) {
        super(cVar);
        this.f5371t = d0Var;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5370s = obj;
        this.f5372u |= Integer.MIN_VALUE;
        Serializable a5 = this.f5371t.a(0, this, null);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
