package O1;

import A7.n;
import G7.j;
import M1.D;
import M1.t;
import O7.p;
import a.AbstractC0485a;
import co.notix.R;
import com.anilab.android.ui.changePassword.ChangePasswordFragment;

/* loaded from: classes.dex */
public final class a extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5266r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ChangePasswordFragment f5267s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(E7.d dVar, ChangePasswordFragment changePasswordFragment) {
        super(2, dVar);
        this.f5267s = changePasswordFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        a aVar = new a(dVar, this.f5267s);
        aVar.f5266r = obj;
        return aVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) create((t) obj, (E7.d) obj2);
        n nVar = n.f558a;
        aVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int ordinal;
        AbstractC0485a.A(obj);
        Object a5 = ((t) this.f5266r).a();
        if (a5 != null && (ordinal = ((e) a5).ordinal()) != 0) {
            ChangePasswordFragment changePasswordFragment = this.f5267s;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    changePasswordFragment.o0(new D(R.string.message_change_password_successful));
                    M1.n.q0(changePasswordFragment);
                } else {
                    throw new RuntimeException();
                }
            } else {
                changePasswordFragment.o0(new D(R.string.message_password_not_match));
            }
        }
        return n.f558a;
    }
}
