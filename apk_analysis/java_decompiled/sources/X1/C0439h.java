package X1;

import a.AbstractC0485a;
import androidx.lifecycle.InterfaceC0561w;
import com.anilab.android.ui.home.HomeFragment;
import com.anilab.android.ui.main.HostFragment;
import i0.AbstractComponentCallbacksC1366v;

/* renamed from: X1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439h extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8267r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f8268s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439h(E7.d dVar, HomeFragment homeFragment) {
        super(2, dVar);
        this.f8268s = homeFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0439h c0439h = new C0439h(dVar, this.f8268s);
        c0439h.f8267r = obj;
        return c0439h;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0439h c0439h = (C0439h) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0439h.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0561w interfaceC0561w;
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f8267r).a();
        if (a5 != null) {
            b2.r rVar = (b2.r) a5;
            boolean z9 = rVar instanceof b2.p;
            HomeFragment homeFragment = this.f8268s;
            if (z9) {
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = homeFragment.f18419v;
                HostFragment hostFragment = null;
                if (abstractComponentCallbacksC1366v != null) {
                    interfaceC0561w = abstractComponentCallbacksC1366v.f18419v;
                } else {
                    interfaceC0561w = null;
                }
                if (interfaceC0561w instanceof HostFragment) {
                    hostFragment = (HostFragment) interfaceC0561w;
                }
                if (hostFragment != null) {
                    b2.p pVar = (b2.p) rVar;
                    hostFragment.j0(new I1.n(pVar.f10501a, pVar.f10502b, pVar.f10503c));
                }
            } else if (rVar instanceof b2.q) {
                b2.q qVar = (b2.q) rVar;
                homeFragment.t0(new H2.s(qVar.f10504a, qVar.f10505b, qVar.f10506c, qVar.f10507d, 0, null, 48));
            } else if (!rVar.equals(b2.o.f10500a)) {
                throw new RuntimeException();
            }
        }
        return A7.n.f558a;
    }
}
