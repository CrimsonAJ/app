package P1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class z extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H2.d f5759r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G f5760s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(H2.d dVar, G g9, E7.d dVar2) {
        super(2, dVar2);
        this.f5759r = dVar;
        this.f5760s = g9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new z(this.f5759r, this.f5760s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        zVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        String str;
        AbstractC0485a.A(obj);
        H2.d dVar = this.f5759r;
        if (dVar != null) {
            H2.c cVar = dVar.f3002a;
            if (cVar != null) {
                str = cVar.f2986a;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            G g9 = this.f5760s;
            g9.d(true, new C(g9, str, g9.f5708z, null));
        }
        return A7.n.f558a;
    }
}
