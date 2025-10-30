package O2;

import java.io.Serializable;

/* renamed from: O2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294u extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public C0295v f5424r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5425s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0295v f5426t;

    /* renamed from: u, reason: collision with root package name */
    public int f5427u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0294u(C0295v c0295v, G7.c cVar) {
        super(cVar);
        this.f5426t = c0295v;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5425s = obj;
        this.f5427u |= Integer.MIN_VALUE;
        Serializable a5 = this.f5426t.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
