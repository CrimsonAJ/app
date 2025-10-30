package X1;

import L1.P;
import L1.S;
import com.anilab.android.ui.home.HomeFragment;
import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements O7.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f8233a;

    @Override // O7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        H2.g continueWatch = (H2.g) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.h.e(continueWatch, "continueWatch");
        F f9 = this.f8233a;
        Movie movie = continueWatch.f3022i;
        if (booleanValue) {
            Long l9 = continueWatch.f3016c;
            if (l9 == null) {
                if (movie != null) {
                    l9 = Long.valueOf(movie.f14414a);
                } else {
                    l9 = null;
                }
            }
            if (l9 != null) {
                HomeFragment homeFragment = f9.f8241d;
                long longValue = l9.longValue();
                y h02 = homeFragment.h0();
                h02.getClass();
                h02.d(false, new w(h02, longValue, null));
            }
            if (booleanValue2) {
                S r0 = f9.f8241d.r0();
                b2.m mVar = b2.m.f10497b;
                r0.getClass();
                r0.d(false, new P(mVar, false, r0, null));
            }
        } else {
            HomeFragment homeFragment2 = f9.f8241d;
            homeFragment2.getClass();
            if (movie != null) {
                Long l10 = continueWatch.f3017d;
                if (l10 != null) {
                    j = l10.longValue();
                } else {
                    j = -1;
                }
                long j4 = j;
                homeFragment2.t0(new H2.s(movie.f14420g, movie.f14414a, j4, movie.f14416c, movie.f14415b, movie.f14417d));
            }
        }
        return A7.n.f558a;
    }
}
