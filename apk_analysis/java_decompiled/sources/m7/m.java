package m7;

import O7.p;
import a.AbstractC0485a;
import b0.C0584b;

/* loaded from: classes.dex */
public final class m extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f20907r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f20908s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b0.g f20909t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f20910u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object obj, b0.g gVar, n nVar, E7.d dVar) {
        super(2, dVar);
        this.f20908s = obj;
        this.f20909t = gVar;
        this.f20910u = nVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        m mVar = new m(this.f20908s, this.f20909t, this.f20910u, dVar);
        mVar.f20907r = obj;
        return mVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) create((C0584b) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        mVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        C0584b c0584b = (C0584b) this.f20907r;
        Object obj2 = this.f20908s;
        b0.g key = this.f20909t;
        if (obj2 != null) {
            c0584b.getClass();
            kotlin.jvm.internal.h.e(key, "key");
            c0584b.d(key, obj2);
        } else {
            c0584b.getClass();
            kotlin.jvm.internal.h.e(key, "key");
            c0584b.b();
            c0584b.f10457a.remove(key);
        }
        n.a(this.f20910u, c0584b);
        return A7.n.f558a;
    }
}
