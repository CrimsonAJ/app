package T1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.external_player.SelectPlayerFragment;

/* loaded from: classes.dex */
public final class h extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7019r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectPlayerFragment f7020s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(E7.d dVar, SelectPlayerFragment selectPlayerFragment) {
        super(2, dVar);
        this.f7020s = selectPlayerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        h hVar = new h(dVar, this.f7020s);
        hVar.f7019r = obj;
        return hVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        hVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f7019r;
        SelectPlayerFragment selectPlayerFragment = this.f7020s;
        Y7.B.r(interfaceC0484z, null, new C0391e(null, selectPlayerFragment), 3);
        Y7.B.r(interfaceC0484z, null, new C0393g(null, selectPlayerFragment), 3);
        return A7.n.f558a;
    }
}
