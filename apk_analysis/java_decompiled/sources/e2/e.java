package e2;

import B7.C0051b;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.T;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.navigation.fragment.NavHostFragment;
import co.notix.R;
import com.anilab.android.ui.notification.NotificationFragment;
import com.anilab.android.ui.register.RegisterFragment;
import com.anilab.android.ui.releaseCalendar.ReleaseCalendarFragment;
import com.anilab.android.ui.search.SearchFragment;
import com.anilab.android.ui.security.SecurityFragment;
import com.anilab.android.ui.settings.PlayerSettingsFragment;
import com.anilab.android.ui.settings.SubtitleSettingsFragment;
import com.anilab.android.ui.splash.SplashFragment;
import com.anilab.android.ui.update.CommonErrorDialogFragment;
import com.anilab.android.ui.welcome.WelcomeFragment;
import h2.C1273e;
import i0.AbstractC1336M;
import i0.C1339P;
import i2.C1378f;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import n2.C1616b;
import q2.C1885n;
import u0.C2043n;
import u0.C2049u;
import u0.H;
import u0.I;
import u0.W;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i9, Object obj) {
        super(0);
        this.f17105d = i9;
        this.f17106e = obj;
    }

    @Override // O7.a
    public final Object invoke() {
        D.n x5;
        switch (this.f17105d) {
            case 0:
                return (k0) ((C1140d) this.f17106e).invoke();
            case 1:
                return (k0) ((v) this.f17106e).invoke();
            case 2:
                return (NotificationFragment) this.f17106e;
            case 3:
                return (k0) ((e) this.f17106e).invoke();
            case 4:
                return (k0) ((C1273e) this.f17106e).invoke();
            case 5:
                return (k0) ((C1378f) this.f17106e).invoke();
            case 6:
                return (RegisterFragment) this.f17106e;
            case 7:
                return (k0) ((e) this.f17106e).invoke();
            case 8:
                return (ReleaseCalendarFragment) this.f17106e;
            case 9:
                return (k0) ((e) this.f17106e).invoke();
            case R.styleable.GradientColor_android_endX /* 10 */:
                return (SearchFragment) this.f17106e;
            case R.styleable.GradientColor_android_endY /* 11 */:
                return (k0) ((e) this.f17106e).invoke();
            case 12:
                return (SecurityFragment) this.f17106e;
            case 13:
                return (k0) ((e) this.f17106e).invoke();
            case 14:
                return (k0) ((C1616b) this.f17106e).invoke();
            case 15:
                i8.v vVar = ((n8.i) this.f17106e).f21280e;
                kotlin.jvm.internal.h.b(vVar);
                List<Certificate> a5 = vVar.a();
                ArrayList arrayList = new ArrayList(B7.m.f0(a5, 10));
                for (Certificate certificate : a5) {
                    kotlin.jvm.internal.h.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 16:
                return (PlayerSettingsFragment) this.f17106e;
            case 17:
                return (k0) ((e) this.f17106e).invoke();
            case 18:
                return (SubtitleSettingsFragment) this.f17106e;
            case 19:
                return (k0) ((e) this.f17106e).invoke();
            case 20:
                return (SplashFragment) this.f17106e;
            case 21:
                return (k0) ((e) this.f17106e).invoke();
            case 22:
                return (CommonErrorDialogFragment) this.f17106e;
            case 23:
                return (k0) ((e) this.f17106e).invoke();
            case 24:
                return (k0) ((C1885n) this.f17106e).invoke();
            case 25:
                return (WelcomeFragment) this.f17106e;
            case 26:
                return (k0) ((e) this.f17106e).invoke();
            case 27:
                H h7 = (H) this.f17106e;
                h7.getClass();
                return new I(h7.f23394a, h7.f23413u);
            case 28:
                String uriPattern = (String) this.f17106e;
                kotlin.jvm.internal.h.e(uriPattern, "uriPattern");
                return new u0.y(uriPattern, null, null);
            default:
                NavHostFragment navHostFragment = (NavHostFragment) this.f17106e;
                Context m9 = navHostFragment.m();
                if (m9 != null) {
                    H h9 = new H(m9);
                    if (!navHostFragment.equals(h9.f23406n)) {
                        InterfaceC0561w interfaceC0561w = h9.f23406n;
                        N0.c cVar = h9.f23410r;
                        if (interfaceC0561w != null && (x5 = interfaceC0561w.x()) != null) {
                            x5.g0(cVar);
                        }
                        h9.f23406n = navHostFragment;
                        navHostFragment.f18404m0.V(cVar);
                    }
                    j0 u9 = navHostFragment.u();
                    C2049u c2049u = h9.f23407o;
                    C1339P c1339p = C2049u.f23537e;
                    int i9 = 0;
                    if (!kotlin.jvm.internal.h.a(c2049u, (C2049u) new android.support.v4.media.session.y(u9, c1339p, i9).J(C2049u.class))) {
                        if (h9.f23400g.isEmpty()) {
                            h9.f23407o = (C2049u) new android.support.v4.media.session.y(u9, c1339p, i9).J(C2049u.class);
                        } else {
                            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                        }
                    }
                    Context X8 = navHostFragment.X();
                    AbstractC1336M childFragmentManager = navHostFragment.l();
                    kotlin.jvm.internal.h.d(childFragmentManager, "childFragmentManager");
                    w0.d dVar = new w0.d(X8, childFragmentManager);
                    W w7 = h9.f23413u;
                    w7.a(dVar);
                    Context X9 = navHostFragment.X();
                    AbstractC1336M childFragmentManager2 = navHostFragment.l();
                    kotlin.jvm.internal.h.d(childFragmentManager2, "childFragmentManager");
                    int i10 = navHostFragment.f18420w;
                    if (i10 == 0 || i10 == -1) {
                        i10 = R.id.nav_host_fragment_container;
                    }
                    w7.a(new w0.f(X9, childFragmentManager2, i10));
                    Bundle c3 = ((N0.f) navHostFragment.f18412q0.f15188c).c("android-support-nav:fragment:navControllerState");
                    if (c3 != null) {
                        c3.setClassLoader(m9.getClassLoader());
                        h9.f23397d = c3.getBundle("android-support-nav:controller:navigatorState");
                        h9.f23398e = c3.getParcelableArray("android-support-nav:controller:backStack");
                        LinkedHashMap linkedHashMap = h9.f23405m;
                        linkedHashMap.clear();
                        int[] intArray = c3.getIntArray("android-support-nav:controller:backStackDestIds");
                        ArrayList<String> stringArrayList = c3.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (intArray != null && stringArrayList != null) {
                            int length = intArray.length;
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < length) {
                                h9.f23404l.put(Integer.valueOf(intArray[i11]), stringArrayList.get(i12));
                                i11++;
                                i12++;
                            }
                        }
                        ArrayList<String> stringArrayList2 = c3.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 != null) {
                            int size = stringArrayList2.size();
                            int i13 = 0;
                            while (i13 < size) {
                                String str = stringArrayList2.get(i13);
                                i13++;
                                String id = str;
                                Parcelable[] parcelableArray = c3.getParcelableArray("android-support-nav:controller:backStackStates:" + id);
                                if (parcelableArray != null) {
                                    kotlin.jvm.internal.h.d(id, "id");
                                    B7.i iVar = new B7.i(parcelableArray.length);
                                    C0051b e8 = kotlin.jvm.internal.r.e(parcelableArray);
                                    while (e8.hasNext()) {
                                        Parcelable parcelable = (Parcelable) e8.next();
                                        kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                        iVar.addLast((C2043n) parcelable);
                                    }
                                    linkedHashMap.put(id, iVar);
                                }
                            }
                        }
                        h9.f23399f = c3.getBoolean("android-support-nav:controller:deepLinkHandled");
                    }
                    ((N0.f) navHostFragment.f18412q0.f15188c).f("android-support-nav:fragment:navControllerState", new T(2, h9));
                    Bundle c9 = ((N0.f) navHostFragment.f18412q0.f15188c).c("android-support-nav:fragment:graphId");
                    if (c9 != null) {
                        navHostFragment.f10204x0 = c9.getInt("android-support-nav:fragment:graphId");
                    }
                    ((N0.f) navHostFragment.f18412q0.f15188c).f("android-support-nav:fragment:graphId", new T(3, navHostFragment));
                    int i14 = navHostFragment.f10204x0;
                    A7.l lVar = h9.f23392B;
                    Bundle bundle = null;
                    if (i14 != 0) {
                        h9.t(((I) lVar.getValue()).b(i14), null);
                    } else {
                        Bundle bundle2 = navHostFragment.f18390f;
                        if (bundle2 != null) {
                            i9 = bundle2.getInt("android-support-nav:fragment:graphId");
                        }
                        if (bundle2 != null) {
                            bundle = bundle2.getBundle("android-support-nav:fragment:startDestinationArgs");
                        }
                        if (i9 != 0) {
                            h9.t(((I) lVar.getValue()).b(i9), bundle);
                        }
                    }
                    return h9;
                }
                throw new IllegalStateException("NavController cannot be created before the fragment is attached");
        }
    }
}
