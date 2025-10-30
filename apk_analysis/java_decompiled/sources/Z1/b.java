package Z1;

import A7.n;
import G7.j;
import M1.t;
import O7.p;
import a.AbstractC0485a;
import co.notix.R;
import com.anilab.android.ui.loginWithEmail.LoginWithEmailFragment;

/* loaded from: classes.dex */
public final class b extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8929r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LoginWithEmailFragment f8930s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(E7.d dVar, LoginWithEmailFragment loginWithEmailFragment) {
        super(2, dVar);
        this.f8930s = loginWithEmailFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        b bVar = new b(dVar, this.f8930s);
        bVar.f8929r = obj;
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
        AbstractC0485a.A(obj);
        Object a5 = ((t) this.f8929r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            this.f8930s.i0(R.id.goToHost, null);
        }
        return n.f558a;
    }
}
