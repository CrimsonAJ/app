package O2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class M extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public N f5325r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5326s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N f5327t;

    /* renamed from: u, reason: collision with root package name */
    public int f5328u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n7, G7.c cVar) {
        super(cVar);
        this.f5327t = n7;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5326s = obj;
        this.f5328u |= Integer.MIN_VALUE;
        Serializable a5 = this.f5327t.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
