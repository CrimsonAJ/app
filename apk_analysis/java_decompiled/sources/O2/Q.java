package O2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class Q extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public S f5337r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5338s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S f5339t;

    /* renamed from: u, reason: collision with root package name */
    public int f5340u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s9, G7.c cVar) {
        super(cVar);
        this.f5339t = s9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5338s = obj;
        this.f5340u |= Integer.MIN_VALUE;
        Serializable a5 = this.f5339t.a(0, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
