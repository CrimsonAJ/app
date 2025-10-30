package V1;

import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.filterResult.FilterResultFragment;

/* loaded from: classes.dex */
public final class h extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7626r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FilterResultFragment f7627s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(E7.d dVar, FilterResultFragment filterResultFragment) {
        super(2, dVar);
        this.f7627s = filterResultFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        h hVar = new h(dVar, this.f7627s);
        hVar.f7626r = obj;
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
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f7626r;
        FilterResultFragment filterResultFragment = this.f7627s;
        B.r(interfaceC0484z, null, new e(null, filterResultFragment), 3);
        B.r(interfaceC0484z, null, new g(null, filterResultFragment), 3);
        return A7.n.f558a;
    }
}
