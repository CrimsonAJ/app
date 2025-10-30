package p2;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import com.anilab.android.ui.splash.SplashFragment;

/* renamed from: p2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1850c extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f22143r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SplashFragment f22144s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1850c(E7.d dVar, SplashFragment splashFragment) {
        super(2, dVar);
        this.f22144s = splashFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1850c(dVar, this.f22144s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1850c) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f22143r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            SplashFragment splashFragment = this.f22144s;
            C1855h c1855h = (C1855h) splashFragment.f13838D0.getValue();
            C1849b c1849b = new C1849b(null, splashFragment);
            this.f22143r = 1;
            if (AbstractC0714M.i(c1855h.f22161k, c1849b, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
