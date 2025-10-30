package O2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class G extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public H f5307r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5308s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H f5309t;

    /* renamed from: u, reason: collision with root package name */
    public int f5310u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h7, G7.c cVar) {
        super(cVar);
        this.f5309t = h7;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5308s = obj;
        this.f5310u |= Integer.MIN_VALUE;
        Serializable a5 = this.f5309t.a(0L, null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
