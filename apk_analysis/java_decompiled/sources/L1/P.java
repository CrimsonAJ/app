package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;

/* loaded from: classes.dex */
public final class P extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b2.n f4485r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f4486s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S f4487t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(b2.n nVar, boolean z9, S s9, E7.d dVar) {
        super(2, dVar);
        this.f4485r = nVar;
        this.f4486s = z9;
        this.f4487t = s9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new P(this.f4485r, this.f4486s, this.f4487t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        P p9 = (P) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        p9.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        b2.m mVar = b2.m.f10496a;
        b2.n nVar = this.f4485r;
        if (!nVar.equals(mVar)) {
            boolean equals = nVar.equals(b2.m.f10498c);
            S s9 = this.f4487t;
            if (equals) {
                if (this.f4486s) {
                    if (s9.f4493f.f5769a.b()) {
                        M1.t tVar = new M1.t(Boolean.TRUE);
                        C0718Q c0718q = s9.f4500n;
                        c0718q.getClass();
                        c0718q.j(null, tVar);
                    }
                } else {
                    C0718Q c0718q2 = s9.f4500n;
                    M1.t tVar2 = new M1.t(Boolean.TRUE);
                    c0718q2.getClass();
                    c0718q2.j(null, tVar2);
                }
            } else if (nVar.equals(b2.m.f10499d)) {
                C0718Q c0718q3 = s9.f4501o;
                M1.t tVar3 = new M1.t(Boolean.TRUE);
                c0718q3.getClass();
                c0718q3.j(null, tVar3);
            } else if (nVar.equals(b2.m.f10497b)) {
                C0718Q c0718q4 = s9.f4502p;
                M1.t tVar4 = new M1.t(Boolean.TRUE);
                c0718q4.getClass();
                c0718q4.j(null, tVar4);
            } else {
                throw new RuntimeException();
            }
        }
        return A7.n.f558a;
    }
}
