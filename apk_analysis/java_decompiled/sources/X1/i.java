package X1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.home.HomeFragment;

/* loaded from: classes.dex */
public final class i extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f8269r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f8270s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(E7.d dVar, HomeFragment homeFragment) {
        super(2, dVar);
        this.f8270s = homeFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new i(dVar, this.f8270s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f8269r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            HomeFragment homeFragment = this.f8270s;
            C0709H c0709h = new C0709H(homeFragment.r0().f4503q);
            C0439h c0439h = new C0439h(null, homeFragment);
            this.f8269r = 1;
            if (AbstractC0714M.i(c0709h, c0439h, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
