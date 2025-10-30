package a2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.logout.BottomSheetConfirmLogout;

/* loaded from: classes.dex */
public final class e extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f9089r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BottomSheetConfirmLogout f9090s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BottomSheetConfirmLogout bottomSheetConfirmLogout, E7.d dVar) {
        super(2, dVar);
        this.f9090s = bottomSheetConfirmLogout;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new e(this.f9090s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f9089r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            BottomSheetConfirmLogout bottomSheetConfirmLogout = this.f9090s;
            C0709H c0709h = new C0709H(((k) bottomSheetConfirmLogout.f13781S0.getValue()).f4741e);
            d dVar = new d(bottomSheetConfirmLogout, null);
            this.f9089r = 1;
            if (AbstractC0714M.i(c0709h, dVar, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
