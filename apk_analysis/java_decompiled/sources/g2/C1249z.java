package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.player.PlayerActivity;

/* renamed from: g2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249z extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17705r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17706s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1249z(E7.d dVar, PlayerActivity playerActivity) {
        super(2, dVar);
        this.f17706s = playerActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1249z c1249z = new C1249z(dVar, this.f17706s);
        c1249z.f17705r = obj;
        return c1249z;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1249z c1249z = (C1249z) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1249z.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f17705r;
        PlayerActivity playerActivity = this.f17706s;
        Y7.B.r(interfaceC0484z, null, new C1239p(null, playerActivity), 3);
        Y7.B.r(interfaceC0484z, null, new C1241r(null, playerActivity), 3);
        Y7.B.r(interfaceC0484z, null, new C1243t(null, playerActivity), 3);
        Y7.B.r(interfaceC0484z, null, new C1245v(null, playerActivity), 3);
        Y7.B.r(interfaceC0484z, null, new C1247x(null, playerActivity), 3);
        Y7.B.r(interfaceC0484z, null, new C1248y(null, playerActivity), 3);
        return A7.n.f558a;
    }
}
