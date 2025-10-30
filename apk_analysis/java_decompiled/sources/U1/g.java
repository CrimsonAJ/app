package U1;

import O7.p;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.filter.FilterFragment;

/* loaded from: classes.dex */
public final class g extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7260r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FilterFragment f7261s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FilterFragment filterFragment, E7.d dVar) {
        super(2, dVar);
        this.f7261s = filterFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        g gVar = new g(this.f7261s, dVar);
        gVar.f7260r = obj;
        return gVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        gVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f7260r;
        FilterFragment filterFragment = this.f7261s;
        B.r(interfaceC0484z, null, new c(filterFragment, null), 3);
        B.r(interfaceC0484z, null, new d(filterFragment, null), 3);
        B.r(interfaceC0484z, null, new e(filterFragment, null), 3);
        B.r(interfaceC0484z, null, new f(filterFragment, null), 3);
        return A7.n.f558a;
    }
}
