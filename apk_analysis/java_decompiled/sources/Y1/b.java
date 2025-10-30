package Y1;

import A7.n;
import G7.j;
import L1.P;
import L1.S;
import M1.t;
import O7.p;
import a.AbstractC0485a;
import b2.m;
import co.notix.R;
import com.anilab.android.ui.activity.MainActivity;
import com.anilab.android.ui.login.LoginFragment;
import i0.AbstractActivityC1369y;

/* loaded from: classes.dex */
public final class b extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8575r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f8576s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(E7.d dVar, LoginFragment loginFragment) {
        super(2, dVar);
        this.f8576s = loginFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        b bVar = new b(dVar, this.f8576s);
        bVar.f8575r = obj;
        return bVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) create((t) obj, (E7.d) obj2);
        n nVar = n.f558a;
        bVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        MainActivity mainActivity;
        AbstractC0485a.A(obj);
        Object a5 = ((t) this.f8575r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            LoginFragment loginFragment = this.f8576s;
            S s9 = (S) loginFragment.f13777E0.getValue();
            s9.d(false, new P(m.f10498c, false, s9, null));
            AbstractActivityC1369y k5 = loginFragment.k();
            if (k5 instanceof MainActivity) {
                mainActivity = (MainActivity) k5;
            } else {
                mainActivity = null;
            }
            if (mainActivity != null) {
                mainActivity.T();
            }
            loginFragment.i0(R.id.goToHost, null);
        }
        return n.f558a;
    }
}
