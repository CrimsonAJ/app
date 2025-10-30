package Y1;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.login.LoginFragment;

/* loaded from: classes.dex */
public final class d extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f8579r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f8580s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(E7.d dVar, LoginFragment loginFragment) {
        super(2, dVar);
        this.f8580s = loginFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new d(dVar, this.f8580s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f8579r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            LoginFragment loginFragment = this.f8580s;
            c cVar = new c(null, loginFragment);
            this.f8579r = 1;
            if (Y.h(loginFragment, enumC0555p, cVar, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
