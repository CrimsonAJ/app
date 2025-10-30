package O2;

import java.io.Serializable;

/* renamed from: O2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289o extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0290p f5406r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5407s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0290p f5408t;

    /* renamed from: u, reason: collision with root package name */
    public int f5409u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0289o(C0290p c0290p, G7.c cVar) {
        super(cVar);
        this.f5408t = c0290p;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5407s = obj;
        this.f5409u |= Integer.MIN_VALUE;
        Serializable a5 = this.f5408t.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
