package b2;

import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.main.HostFragment;

/* renamed from: b2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593f extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f10485r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HostFragment f10486s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0593f(E7.d dVar, HostFragment hostFragment) {
        super(2, dVar);
        this.f10486s = hostFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0593f c0593f = new C0593f(dVar, this.f10486s);
        c0593f.f10485r = obj;
        return c0593f;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0593f c0593f = (C0593f) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0593f.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f10485r;
        HostFragment hostFragment = this.f10486s;
        B.r(interfaceC0484z, null, new C0590c(null, hostFragment), 3);
        B.r(interfaceC0484z, null, new C0592e(null, hostFragment), 3);
        return A7.n.f558a;
    }
}
