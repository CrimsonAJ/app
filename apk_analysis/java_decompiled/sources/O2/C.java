package O2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class C extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public D f5296r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5297s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f5298t;

    /* renamed from: u, reason: collision with root package name */
    public int f5299u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d9, G7.c cVar) {
        super(cVar);
        this.f5298t = d9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5297s = obj;
        this.f5299u |= Integer.MIN_VALUE;
        Serializable a5 = this.f5298t.a(0, this, null);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
