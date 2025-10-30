package l2;

import O7.p;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.search.SearchFragment;

/* renamed from: l2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543h extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f20200r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SearchFragment f20201s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1543h(E7.d dVar, SearchFragment searchFragment) {
        super(2, dVar);
        this.f20201s = searchFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1543h c1543h = new C1543h(dVar, this.f20201s);
        c1543h.f20200r = obj;
        return c1543h;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1543h c1543h = (C1543h) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1543h.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f20200r;
        SearchFragment searchFragment = this.f20201s;
        B.r(interfaceC0484z, null, new C1540e(null, searchFragment), 3);
        B.r(interfaceC0484z, null, new C1542g(null, searchFragment), 3);
        return A7.n.f558a;
    }
}
