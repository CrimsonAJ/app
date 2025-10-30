package O2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class T extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public U f5343r;

    /* renamed from: s, reason: collision with root package name */
    public String f5344s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f5345t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ U f5346u;

    /* renamed from: v, reason: collision with root package name */
    public int f5347v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u9, G7.c cVar) {
        super(cVar);
        this.f5346u = u9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f5345t = obj;
        this.f5347v |= Integer.MIN_VALUE;
        Serializable a5 = this.f5346u.a(null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
