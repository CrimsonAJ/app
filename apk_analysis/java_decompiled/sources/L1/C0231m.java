package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: L1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231m extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4533r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4534s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0231m(E7.d dVar, MainActivity mainActivity) {
        super(2, dVar);
        this.f4534s = mainActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0231m c0231m = new C0231m(dVar, this.f4534s);
        c0231m.f4533r = obj;
        return c0231m;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0231m c0231m = (C0231m) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0231m.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f4533r;
        MainActivity mainActivity = this.f4534s;
        Y7.B.r(interfaceC0484z, null, new C0226h(null, mainActivity), 3);
        Y7.B.r(interfaceC0484z, null, new C0230l(null, mainActivity), 3);
        return A7.n.f558a;
    }
}
