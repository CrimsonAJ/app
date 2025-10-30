package O2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class O extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public P f5331r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5332s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f5333t;

    /* renamed from: u, reason: collision with root package name */
    public int f5334u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p9, G7.c cVar) {
        super(cVar);
        this.f5333t = p9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5332s = obj;
        this.f5334u |= Integer.MIN_VALUE;
        Serializable a5 = this.f5333t.a(0L, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
