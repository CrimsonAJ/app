package I0;

import Y7.A;
import Y7.AbstractC0450a;
import Y7.B;
import Y7.C0473n;
import Y7.InterfaceC0451a0;
import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class v extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3273r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G7.j f3274s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(O7.p pVar, E7.d dVar) {
        super(2, dVar);
        this.f3274s = (G7.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        v vVar = new v(this.f3274s, dVar);
        vVar.f3273r = obj;
        return vVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        E7.i g9 = ((InterfaceC0484z) this.f3273r).g();
        E7.e eVar = E7.e.f1977a;
        E7.g gVar = g9.get(eVar);
        kotlin.jvm.internal.h.b(gVar);
        E7.f fVar = (E7.f) gVar;
        C0473n c0473n = new C0473n();
        A a5 = A.f8743d;
        t tVar = new t(c0473n, this.f3274s, null);
        E7.i i9 = B.i(E7.j.f1978a, fVar, true);
        f8.e eVar2 = K.f8773a;
        if (i9 != eVar2 && i9.get(eVar) == null) {
            i9 = i9.plus(eVar2);
        }
        AbstractC0450a abstractC0450a = new AbstractC0450a(i9, true);
        abstractC0450a.c0(a5, abstractC0450a, tVar);
        while (c0473n.D() instanceof InterfaceC0451a0) {
            try {
                return B.v(fVar, new u(c0473n, null));
            } catch (InterruptedException unused) {
            }
        }
        return c0473n.y();
    }
}
