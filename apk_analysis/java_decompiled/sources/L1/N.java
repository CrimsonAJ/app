package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;

/* loaded from: classes.dex */
public final class N extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ S f4478r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f4479s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f4480t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f4481u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f4482v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(S s9, long j, String str, String str2, long j4, E7.d dVar) {
        super(2, dVar);
        this.f4478r = s9;
        this.f4479s = j;
        this.f4480t = str;
        this.f4481u = str2;
        this.f4482v = j4;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new N(this.f4478r, this.f4479s, this.f4480t, this.f4481u, this.f4482v, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        N n7 = (N) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        n7.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        S s9 = this.f4478r;
        String str = this.f4481u;
        M1.t tVar = new M1.t(new b2.q(this.f4479s, this.f4482v, this.f4480t, str));
        C0718Q c0718q = s9.f4503q;
        c0718q.getClass();
        c0718q.j(null, tVar);
        return A7.n.f558a;
    }
}
