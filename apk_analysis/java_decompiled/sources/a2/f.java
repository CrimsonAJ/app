package a2;

import A7.n;
import O7.p;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.logout.BottomSheetConfirmLogout;

/* loaded from: classes.dex */
public final class f extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9091r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BottomSheetConfirmLogout f9092s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BottomSheetConfirmLogout bottomSheetConfirmLogout, E7.d dVar) {
        super(2, dVar);
        this.f9092s = bottomSheetConfirmLogout;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        f fVar = new f(this.f9092s, dVar);
        fVar.f9091r = obj;
        return fVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        f fVar = (f) create((InterfaceC0484z) obj, (E7.d) obj2);
        n nVar = n.f558a;
        fVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f9091r;
        BottomSheetConfirmLogout bottomSheetConfirmLogout = this.f9092s;
        B.r(interfaceC0484z, null, new a(bottomSheetConfirmLogout, null), 3);
        B.r(interfaceC0484z, null, new c(bottomSheetConfirmLogout, null), 3);
        B.r(interfaceC0484z, null, new e(bottomSheetConfirmLogout, null), 3);
        return n.f558a;
    }
}
