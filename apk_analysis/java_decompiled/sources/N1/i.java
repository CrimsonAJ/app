package N1;

import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;
import com.anilab.android.ui.categoryDetail.MovieListFragment;
import com.anilab.android.ui.main.HostFragment;
import com.anilab.android.ui.releaseCalendar.ReleaseCalendarFragment;
import com.anilab.domain.model.Movie;
import i0.AbstractComponentCallbacksC1366v;
import u0.C2030a;

/* loaded from: classes.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.g implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4852a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i9, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i9, obj, cls, str, str2, i10);
        this.f4852a = i11;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0561w interfaceC0561w;
        switch (this.f4852a) {
            case 0:
                Movie p02 = (Movie) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                kotlin.jvm.internal.h.e(p02, "p0");
                MovieListFragment movieListFragment = (MovieListFragment) this.receiver;
                if (!movieListFragment.h0().j.f5769a.b()) {
                    movieListFragment.j0(new C2030a(R.id.goToLogin));
                } else {
                    y h02 = movieListFragment.h0();
                    h02.getClass();
                    h02.d(false, new x(!booleanValue, h02, p02.f14414a, null));
                }
                return A7.n.f558a;
            default:
                Movie p03 = (Movie) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                kotlin.jvm.internal.h.e(p03, "p0");
                ReleaseCalendarFragment releaseCalendarFragment = (ReleaseCalendarFragment) this.receiver;
                if (!releaseCalendarFragment.h0().f19908g.f5769a.b()) {
                    AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = releaseCalendarFragment.f18419v;
                    HostFragment hostFragment = null;
                    if (abstractComponentCallbacksC1366v != null) {
                        interfaceC0561w = abstractComponentCallbacksC1366v.f18419v;
                    } else {
                        interfaceC0561w = null;
                    }
                    if (interfaceC0561w instanceof HostFragment) {
                        hostFragment = (HostFragment) interfaceC0561w;
                    }
                    if (hostFragment != null) {
                        hostFragment.j0(new C2030a(R.id.goToLogin));
                    }
                } else {
                    k2.m h03 = releaseCalendarFragment.h0();
                    h03.getClass();
                    h03.d(false, new k2.l(!booleanValue2, h03, p03.f14414a, null));
                }
                return A7.n.f558a;
        }
    }
}
