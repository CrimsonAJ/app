package e2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.myList.MyListFragment;

/* loaded from: classes.dex */
public final class t extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17128r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MyListFragment f17129s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(E7.d dVar, MyListFragment myListFragment) {
        super(2, dVar);
        this.f17129s = myListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        t tVar = new t(dVar, this.f17129s);
        tVar.f17128r = obj;
        return tVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        t tVar = (t) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        tVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f17128r;
        MyListFragment myListFragment = this.f17129s;
        Y7.B.r(interfaceC0484z, null, new n(null, myListFragment), 3);
        Y7.B.r(interfaceC0484z, null, new o(null, myListFragment), 3);
        Y7.B.r(interfaceC0484z, null, new q(null, myListFragment), 3);
        Y7.B.r(interfaceC0484z, null, new s(null, myListFragment), 3);
        return A7.n.f558a;
    }
}
