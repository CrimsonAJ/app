package R1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.download.DownloadFragment;

/* loaded from: classes.dex */
public final class n extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6542r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DownloadFragment f6543s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(E7.d dVar, DownloadFragment downloadFragment) {
        super(2, dVar);
        this.f6543s = downloadFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        n nVar = new n(dVar, this.f6543s);
        nVar.f6542r = obj;
        return nVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar2 = A7.n.f558a;
        nVar.invokeSuspend(nVar2);
        return nVar2;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f6542r;
        DownloadFragment downloadFragment = this.f6543s;
        Y7.B.r(interfaceC0484z, null, new C0385d(null, downloadFragment), 3);
        Y7.B.r(interfaceC0484z, null, new f(null, downloadFragment), 3);
        Y7.B.r(interfaceC0484z, null, new i(null, downloadFragment), 3);
        Y7.B.r(interfaceC0484z, null, new k(null, downloadFragment), 3);
        Y7.B.r(interfaceC0484z, null, new m(null, downloadFragment), 3);
        return A7.n.f558a;
    }
}
