package Z1;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import com.anilab.android.ui.loginWithEmail.LoginWithEmailFragment;

/* loaded from: classes.dex */
public final class c extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f8931r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LoginWithEmailFragment f8932s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(E7.d dVar, LoginWithEmailFragment loginWithEmailFragment) {
        super(2, dVar);
        this.f8932s = loginWithEmailFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new c(dVar, this.f8932s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f8931r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            LoginWithEmailFragment loginWithEmailFragment = this.f8932s;
            h hVar = (h) loginWithEmailFragment.f13779D0.getValue();
            b bVar = new b(null, loginWithEmailFragment);
            this.f8931r = 1;
            if (AbstractC0714M.i(hVar.j, bVar, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
