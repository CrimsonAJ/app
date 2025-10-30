package p2;

import A7.n;
import G7.j;
import I1.o;
import M1.t;
import O7.p;
import a.AbstractC0485a;
import co.notix.R;
import com.anilab.android.ui.splash.SplashFragment;
import com.anilab.domain.model.LatestVersion;

/* renamed from: p2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1849b extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22141r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SplashFragment f22142s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1849b(E7.d dVar, SplashFragment splashFragment) {
        super(2, dVar);
        this.f22142s = splashFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1849b c1849b = new C1849b(dVar, this.f22142s);
        c1849b.f22141r = obj;
        return c1849b;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1849b c1849b = (C1849b) create((t) obj, (E7.d) obj2);
        n nVar = n.f558a;
        c1849b.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int ordinal;
        AbstractC0485a.A(obj);
        Object a5 = ((t) this.f22141r).a();
        if (a5 != null && (ordinal = ((EnumC1853f) a5).ordinal()) != 0) {
            SplashFragment splashFragment = this.f22142s;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            splashFragment.i0(R.id.showCommonError, null);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        LatestVersion version = ((C1855h) splashFragment.f13838D0.getValue()).f22162l;
                        kotlin.jvm.internal.h.e(version, "version");
                        splashFragment.j0(new o(version));
                    }
                } else {
                    splashFragment.i0(R.id.goToHost, null);
                }
            } else {
                splashFragment.i0(R.id.splashToWelcome, null);
            }
        }
        return n.f558a;
    }
}
