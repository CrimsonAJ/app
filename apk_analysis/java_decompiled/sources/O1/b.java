package O1;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.changePassword.ChangePasswordFragment;

/* loaded from: classes.dex */
public final class b extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f5268r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ChangePasswordFragment f5269s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(E7.d dVar, ChangePasswordFragment changePasswordFragment) {
        super(2, dVar);
        this.f5269s = changePasswordFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new b(dVar, this.f5269s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f5268r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            ChangePasswordFragment changePasswordFragment = this.f5269s;
            C0709H c0709h = new C0709H(((g) changePasswordFragment.f13740D0.getValue()).f5284h);
            a aVar2 = new a(null, changePasswordFragment);
            this.f5268r = 1;
            if (AbstractC0714M.i(c0709h, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
