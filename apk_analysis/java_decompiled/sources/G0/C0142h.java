package G0;

import H2.C0158a;
import J1.AbstractC0200s0;
import Y7.InterfaceC0457d0;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.anilab.android.ui.categoryDetail.MovieListFragment;
import com.anilab.android.ui.editProfile.EditProfileFragment;
import com.anilab.android.ui.filterResult.FilterResultFragment;
import com.anilab.android.ui.main.HostFragment;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;
import com.anilab.android.ui.releaseCalendar.ReleaseCalendarFragment;
import com.anilab.android.ui.search.SearchFragment;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import i0.AbstractComponentCallbacksC1366v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import t1.C1992a;
import t1.C2004m;

/* renamed from: G0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0142h extends kotlin.jvm.internal.g implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2766a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0142h(int i9, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i9, obj, cls, str, str2, i10);
        this.f2766a = i11;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v;
        LinearLayoutManager linearLayoutManager = null;
        HostFragment hostFragment = null;
        A7.n nVar = A7.n.f558a;
        switch (this.f2766a) {
            case 0:
                Set p02 = (Set) obj;
                kotlin.jvm.internal.h.e(p02, "p0");
                C0145k c0145k = (C0145k) this.receiver;
                ReentrantLock reentrantLock = c0145k.f2775e;
                reentrantLock.lock();
                try {
                    List<C0153t> H02 = B7.k.H0(c0145k.f2774d.values());
                    reentrantLock.unlock();
                    for (C0153t c0153t : H02) {
                        c0153t.getClass();
                        int[] iArr = c0153t.f2806b;
                        int length = iArr.length;
                        Collection collection = B7.v.f1137a;
                        if (length != 0) {
                            if (length != 1) {
                                C7.j jVar = new C7.j();
                                int length2 = iArr.length;
                                int i9 = 0;
                                int i10 = 0;
                                while (i9 < length2) {
                                    int i11 = i10 + 1;
                                    if (p02.contains(Integer.valueOf(iArr[i9]))) {
                                        jVar.add(c0153t.f2807c[i10]);
                                    }
                                    i9++;
                                    i10 = i11;
                                }
                                collection = O4.h.e(jVar);
                            } else if (p02.contains(Integer.valueOf(iArr[0]))) {
                                collection = c0153t.f2808d;
                            }
                        }
                        if (!collection.isEmpty()) {
                            A1.g gVar = c0153t.f2805a;
                            gVar.getClass();
                            C0149o c0149o = (C0149o) gVar.f19c;
                            if (!c0149o.f2791e.get()) {
                                try {
                                    InterfaceC0140f interfaceC0140f = c0149o.f2793g;
                                    if (interfaceC0140f != null) {
                                        interfaceC0140f.M0(c0149o.f2792f, (String[]) collection.toArray(new String[0]));
                                    }
                                } catch (RemoteException e8) {
                                    Log.w("ROOM", "Cannot broadcast invalidation", e8);
                                }
                            }
                        }
                    }
                    return nVar;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 1:
                Movie p03 = (Movie) obj;
                kotlin.jvm.internal.h.e(p03, "p0");
                MovieListFragment movieListFragment = (MovieListFragment) this.receiver;
                movieListFragment.getClass();
                movieListFragment.j0(new I1.n(p03, null, null));
                return nVar;
            case 2:
                C0158a p04 = (C0158a) obj;
                kotlin.jvm.internal.h.e(p04, "p0");
                EditProfileFragment editProfileFragment = (EditProfileFragment) this.receiver;
                Group groupSelectAvatar = ((J1.H) editProfileFragment.e0()).f3686y;
                kotlin.jvm.internal.h.d(groupSelectAvatar, "groupSelectAvatar");
                groupSelectAvatar.setVisibility(8);
                AppCompatImageView imageAvatar = ((J1.H) editProfileFragment.e0()).f3687z;
                kotlin.jvm.internal.h.d(imageAvatar, "imageAvatar");
                C2004m a5 = C1992a.a(imageAvatar.getContext());
                C1.h hVar = new C1.h(imageAvatar.getContext());
                hVar.f1179c = p04.f2979b;
                hVar.b(imageAvatar);
                hVar.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.a()}));
                a5.b(hVar.a());
                editProfileFragment.h0().f6733m = Long.valueOf(p04.f2978a);
                return nVar;
            case 3:
                Movie p05 = (Movie) obj;
                kotlin.jvm.internal.h.e(p05, "p0");
                FilterResultFragment filterResultFragment = (FilterResultFragment) this.receiver;
                filterResultFragment.getClass();
                filterResultFragment.j0(new I1.n(p05, null, null));
                return nVar;
            case 4:
                ((InterfaceC0457d0) this.receiver).d((Throwable) obj);
                return nVar;
            case 5:
                Movie p06 = (Movie) obj;
                kotlin.jvm.internal.h.e(p06, "p0");
                MovieDetailFragment movieDetailFragment = (MovieDetailFragment) this.receiver;
                movieDetailFragment.getClass();
                movieDetailFragment.j0(new I1.n(p06, null, null));
                return nVar;
            case 6:
                H2.b p07 = (H2.b) obj;
                kotlin.jvm.internal.h.e(p07, "p0");
                ReleaseCalendarFragment releaseCalendarFragment = (ReleaseCalendarFragment) this.receiver;
                k2.f fVar = (k2.f) releaseCalendarFragment.f13827F0.getValue();
                ArrayList g9 = releaseCalendarFragment.h0().g(p07);
                ArrayList arrayList = fVar.f19893g;
                arrayList.clear();
                arrayList.addAll(g9);
                fVar.d();
                androidx.recyclerview.widget.a layoutManager = ((AbstractC0200s0) releaseCalendarFragment.e0()).f4076x.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                }
                if (linearLayoutManager != null) {
                    linearLayoutManager.x0(releaseCalendarFragment.s0().f19881f);
                }
                return nVar;
            case 7:
                Movie p08 = (Movie) obj;
                kotlin.jvm.internal.h.e(p08, "p0");
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = ((ReleaseCalendarFragment) this.receiver).f18419v;
                if (abstractComponentCallbacksC1366v2 != null) {
                    abstractComponentCallbacksC1366v = abstractComponentCallbacksC1366v2.f18419v;
                } else {
                    abstractComponentCallbacksC1366v = null;
                }
                if (abstractComponentCallbacksC1366v instanceof HostFragment) {
                    hostFragment = (HostFragment) abstractComponentCallbacksC1366v;
                }
                if (hostFragment != null) {
                    HostFragment.y0(hostFragment, p08);
                }
                return nVar;
            case 8:
                Movie p09 = (Movie) obj;
                kotlin.jvm.internal.h.e(p09, "p0");
                SearchFragment searchFragment = (SearchFragment) this.receiver;
                searchFragment.getClass();
                searchFragment.j0(new I1.n(p09, null, null));
                return nVar;
            default:
                Movie p010 = (Movie) obj;
                kotlin.jvm.internal.h.e(p010, "p0");
                SearchFragment searchFragment2 = (SearchFragment) this.receiver;
                searchFragment2.getClass();
                searchFragment2.j0(new I1.n(p010, null, null));
                return nVar;
        }
    }
}
