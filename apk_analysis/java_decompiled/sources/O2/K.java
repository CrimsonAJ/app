package O2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class K extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public L f5319r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5320s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ L f5321t;

    /* renamed from: u, reason: collision with root package name */
    public int f5322u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l9, G7.c cVar) {
        super(cVar);
        this.f5321t = l9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5320s = obj;
        this.f5322u |= Integer.MIN_VALUE;
        Serializable a5 = this.f5321t.a(0L, 0L, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
