package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class K extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4468r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ S f4469s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H2.u f4470t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(S s9, H2.u uVar, E7.d dVar) {
        super(2, dVar);
        this.f4469s = s9;
        this.f4470t = uVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new K(this.f4469s, this.f4470t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4468r;
        S s9 = this.f4469s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                ((A7.j) obj).getClass();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            P2.g gVar = s9.f4497k;
            H2.u uVar = this.f4470t;
            this.f4468r = 1;
            if (gVar.a(uVar.f3066b, uVar.f3067c, uVar.f3070f, this) == aVar) {
                return aVar;
            }
        }
        b2.m mVar = b2.m.f10497b;
        s9.getClass();
        s9.d(false, new P(mVar, true, s9, null));
        return A7.n.f558a;
    }
}
