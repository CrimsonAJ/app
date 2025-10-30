package a2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import com.anilab.android.ui.logout.BottomSheetConfirmLogout;

/* loaded from: classes.dex */
public final class a extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f9081r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BottomSheetConfirmLogout f9082s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BottomSheetConfirmLogout bottomSheetConfirmLogout, E7.d dVar) {
        super(2, dVar);
        this.f9082s = bottomSheetConfirmLogout;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new a(this.f9082s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((a) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f9081r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        BottomSheetConfirmLogout bottomSheetConfirmLogout = this.f9082s;
        k kVar = (k) bottomSheetConfirmLogout.f13781S0.getValue();
        N1.k kVar2 = new N1.k(4, bottomSheetConfirmLogout);
        this.f9081r = 1;
        ((C0718Q) kVar.f9102h.f11422a).collect(kVar2, this);
        return aVar;
    }
}
