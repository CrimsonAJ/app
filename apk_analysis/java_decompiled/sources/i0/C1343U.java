package i0;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.EnumC0555p;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j0.AbstractC1430d;
import j0.C1427a;
import j0.C1429c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import k4.C1499E;
import l1.C1535g;
import n0.C1601a;
import n0.C1603c;
import s.C1940j;
import w.AbstractC2128h;

/* renamed from: i0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1343U {

    /* renamed from: a, reason: collision with root package name */
    public final O0.c f18249a;

    /* renamed from: b, reason: collision with root package name */
    public final C1535g f18250b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC1366v f18251c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18252d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f18253e = -1;

    public C1343U(O0.c cVar, C1535g c1535g, AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        this.f18249a = cVar;
        this.f18250b = c1535g;
        this.f18251c = abstractComponentCallbacksC1366v;
    }

    public final void a() {
        Bundle bundle;
        boolean H8 = AbstractC1336M.H(3);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (H8) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC1366v);
        }
        Bundle bundle2 = abstractComponentCallbacksC1366v.f18386b;
        if (bundle2 != null) {
            bundle2.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC1366v.f18418u.O();
        abstractComponentCallbacksC1366v.f18385a = 3;
        abstractComponentCallbacksC1366v.f18382D = false;
        abstractComponentCallbacksC1366v.B();
        if (abstractComponentCallbacksC1366v.f18382D) {
            if (AbstractC1336M.H(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC1366v);
            }
            if (abstractComponentCallbacksC1366v.Y != null) {
                Bundle bundle3 = abstractComponentCallbacksC1366v.f18386b;
                if (bundle3 != null) {
                    bundle = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle = null;
                }
                SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC1366v.f18387c;
                if (sparseArray != null) {
                    abstractComponentCallbacksC1366v.Y.restoreHierarchyState(sparseArray);
                    abstractComponentCallbacksC1366v.f18387c = null;
                }
                abstractComponentCallbacksC1366v.f18382D = false;
                abstractComponentCallbacksC1366v.T(bundle);
                if (abstractComponentCallbacksC1366v.f18382D) {
                    if (abstractComponentCallbacksC1366v.Y != null) {
                        abstractComponentCallbacksC1366v.f18406n0.a(EnumC0554o.ON_CREATE);
                    }
                } else {
                    throw new AndroidRuntimeException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " did not call through to super.onViewStateRestored()"));
                }
            }
            abstractComponentCallbacksC1366v.f18386b = null;
            C1337N c1337n = abstractComponentCallbacksC1366v.f18418u;
            c1337n.f18188F = false;
            c1337n.f18189G = false;
            c1337n.f18194M.f18235i = false;
            c1337n.t(4);
            this.f18249a.k(false);
            return;
        }
        throw new AndroidRuntimeException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v;
        View view;
        View view2;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2;
        int i9 = -1;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v3 = this.f18251c;
        View view3 = abstractComponentCallbacksC1366v3.f18383X;
        while (true) {
            abstractComponentCallbacksC1366v = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof AbstractComponentCallbacksC1366v) {
                abstractComponentCallbacksC1366v2 = (AbstractComponentCallbacksC1366v) tag;
            } else {
                abstractComponentCallbacksC1366v2 = null;
            }
            if (abstractComponentCallbacksC1366v2 != null) {
                abstractComponentCallbacksC1366v = abstractComponentCallbacksC1366v2;
                break;
            }
            Object parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v4 = abstractComponentCallbacksC1366v3.f18419v;
        if (abstractComponentCallbacksC1366v != null && !abstractComponentCallbacksC1366v.equals(abstractComponentCallbacksC1366v4)) {
            int i10 = abstractComponentCallbacksC1366v3.f18421x;
            C1429c c1429c = AbstractC1430d.f19185a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC1366v3);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC1366v);
            sb.append(" via container with ID ");
            AbstractC1430d.b(new C1427a(abstractComponentCallbacksC1366v3, u0.z.g(sb, i10, " without using parent's childFragmentManager")));
            AbstractC1430d.a(abstractComponentCallbacksC1366v3).getClass();
        }
        C1535g c1535g = this.f18250b;
        c1535g.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC1366v3.f18383X;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c1535g.f20182a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC1366v3);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v5 = (AbstractComponentCallbacksC1366v) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC1366v5.f18383X == viewGroup && (view = abstractComponentCallbacksC1366v5.Y) != null) {
                            i9 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v6 = (AbstractComponentCallbacksC1366v) arrayList.get(i11);
                    if (abstractComponentCallbacksC1366v6.f18383X == viewGroup && (view2 = abstractComponentCallbacksC1366v6.Y) != null) {
                        i9 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        abstractComponentCallbacksC1366v3.f18383X.addView(abstractComponentCallbacksC1366v3.Y, i9);
    }

    public final void c() {
        boolean H8 = AbstractC1336M.H(3);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (H8) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC1366v);
        }
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = abstractComponentCallbacksC1366v.f18392g;
        C1343U c1343u = null;
        C1535g c1535g = this.f18250b;
        if (abstractComponentCallbacksC1366v2 != null) {
            C1343U c1343u2 = (C1343U) ((HashMap) c1535g.f20183b).get(abstractComponentCallbacksC1366v2.f18389e);
            if (c1343u2 != null) {
                abstractComponentCallbacksC1366v.f18394h = abstractComponentCallbacksC1366v.f18392g.f18389e;
                abstractComponentCallbacksC1366v.f18392g = null;
                c1343u = c1343u2;
            } else {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC1366v + " declared target fragment " + abstractComponentCallbacksC1366v.f18392g + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = abstractComponentCallbacksC1366v.f18394h;
            if (str != null && (c1343u = (C1343U) ((HashMap) c1535g.f20183b).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC1366v);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC0953k1.q(sb, abstractComponentCallbacksC1366v.f18394h, " that does not belong to this FragmentManager!"));
            }
        }
        if (c1343u != null) {
            c1343u.k();
        }
        AbstractC1336M abstractC1336M = abstractComponentCallbacksC1366v.f18414s;
        abstractComponentCallbacksC1366v.f18416t = abstractC1336M.f18215u;
        abstractComponentCallbacksC1366v.f18419v = abstractC1336M.f18217w;
        O0.c cVar = this.f18249a;
        cVar.r(false);
        ArrayList arrayList = abstractComponentCallbacksC1366v.f18415s0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((AbstractC1364t) obj).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC1366v.f18418u.b(abstractComponentCallbacksC1366v.f18416t, abstractComponentCallbacksC1366v.g(), abstractComponentCallbacksC1366v);
        abstractComponentCallbacksC1366v.f18385a = 0;
        abstractComponentCallbacksC1366v.f18382D = false;
        abstractComponentCallbacksC1366v.E(abstractComponentCallbacksC1366v.f18416t.f18427o);
        if (abstractComponentCallbacksC1366v.f18382D) {
            AbstractC1336M abstractC1336M2 = abstractComponentCallbacksC1366v.f18414s;
            Iterator it = abstractC1336M2.f18208n.iterator();
            while (it.hasNext()) {
                ((InterfaceC1341S) it.next()).a(abstractC1336M2, abstractComponentCallbacksC1366v);
            }
            C1337N c1337n = abstractComponentCallbacksC1366v.f18418u;
            c1337n.f18188F = false;
            c1337n.f18189G = false;
            c1337n.f18194M.f18235i = false;
            c1337n.t(0);
            cVar.l(false);
            return;
        }
        throw new AndroidRuntimeException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " did not call through to super.onAttach()"));
    }

    public final int d() {
        int i9;
        int i10;
        Object obj;
        int i11;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (abstractComponentCallbacksC1366v.f18414s == null) {
            return abstractComponentCallbacksC1366v.f18385a;
        }
        int i12 = this.f18253e;
        int ordinal = abstractComponentCallbacksC1366v.f18402l0.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i12 = Math.min(i12, -1);
                    }
                } else {
                    i12 = Math.min(i12, 5);
                }
            } else {
                i12 = Math.min(i12, 1);
            }
        } else {
            i12 = Math.min(i12, 0);
        }
        if (abstractComponentCallbacksC1366v.f18405n) {
            if (abstractComponentCallbacksC1366v.f18407o) {
                i12 = Math.max(this.f18253e, 2);
                View view = abstractComponentCallbacksC1366v.Y;
                if (view != null && view.getParent() == null) {
                    i12 = Math.min(i12, 2);
                }
            } else {
                i12 = this.f18253e < 4 ? Math.min(i12, abstractComponentCallbacksC1366v.f18385a) : Math.min(i12, 1);
            }
        }
        if (!abstractComponentCallbacksC1366v.f18399k) {
            i12 = Math.min(i12, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC1366v.f18383X;
        if (viewGroup != null) {
            C1353i f9 = C1353i.f(viewGroup, abstractComponentCallbacksC1366v.o());
            f9.getClass();
            Z d9 = f9.d(abstractComponentCallbacksC1366v);
            if (d9 != null) {
                i10 = d9.f18275b;
            } else {
                i10 = 0;
            }
            ArrayList arrayList = f9.f18335c;
            int size = arrayList.size();
            int i13 = 0;
            while (true) {
                if (i13 < size) {
                    obj = arrayList.get(i13);
                    i13++;
                    Z z9 = (Z) obj;
                    if (kotlin.jvm.internal.h.a(z9.f18276c, abstractComponentCallbacksC1366v) && !z9.f18279f) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Z z10 = (Z) obj;
            if (z10 != null) {
                i9 = z10.f18275b;
            } else {
                i9 = 0;
            }
            if (i10 == 0) {
                i11 = -1;
            } else {
                i11 = a0.f18301a[AbstractC2128h.b(i10)];
            }
            if (i11 != -1 && i11 != 1) {
                i9 = i10;
            }
        } else {
            i9 = 0;
        }
        if (i9 == 2) {
            i12 = Math.min(i12, 6);
        } else if (i9 == 3) {
            i12 = Math.max(i12, 3);
        } else if (abstractComponentCallbacksC1366v.f18401l) {
            if (abstractComponentCallbacksC1366v.A()) {
                i12 = Math.min(i12, 1);
            } else {
                i12 = Math.min(i12, -1);
            }
        }
        if (abstractComponentCallbacksC1366v.f18384Z && abstractComponentCallbacksC1366v.f18385a < 5) {
            i12 = Math.min(i12, 4);
        }
        if (AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i12 + " for " + abstractComponentCallbacksC1366v);
        }
        return i12;
    }

    public final void e() {
        Bundle bundle;
        boolean H8 = AbstractC1336M.H(3);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (H8) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC1366v);
        }
        Bundle bundle2 = abstractComponentCallbacksC1366v.f18386b;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!abstractComponentCallbacksC1366v.f18398j0) {
            O0.c cVar = this.f18249a;
            cVar.s(false);
            abstractComponentCallbacksC1366v.f18418u.O();
            abstractComponentCallbacksC1366v.f18385a = 1;
            abstractComponentCallbacksC1366v.f18382D = false;
            abstractComponentCallbacksC1366v.f18404m0.V(new N0.b(4, abstractComponentCallbacksC1366v));
            abstractComponentCallbacksC1366v.F(bundle);
            abstractComponentCallbacksC1366v.f18398j0 = true;
            if (abstractComponentCallbacksC1366v.f18382D) {
                abstractComponentCallbacksC1366v.f18404m0.o0(EnumC0554o.ON_CREATE);
                cVar.n(false);
                return;
            }
            throw new AndroidRuntimeException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " did not call through to super.onCreate()"));
        }
        abstractComponentCallbacksC1366v.f18385a = 1;
        abstractComponentCallbacksC1366v.a0();
    }

    public final void f() {
        Bundle bundle;
        String str;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (abstractComponentCallbacksC1366v.f18405n) {
            return;
        }
        if (AbstractC1336M.H(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC1366v);
        }
        Bundle bundle2 = abstractComponentCallbacksC1366v.f18386b;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater K = abstractComponentCallbacksC1366v.K(bundle);
        abstractComponentCallbacksC1366v.f18397i0 = K;
        ViewGroup viewGroup2 = abstractComponentCallbacksC1366v.f18383X;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i9 = abstractComponentCallbacksC1366v.f18421x;
            if (i9 != 0) {
                if (i9 != -1) {
                    viewGroup = (ViewGroup) abstractComponentCallbacksC1366v.f18414s.f18216v.G(i9);
                    if (viewGroup == null) {
                        if (!abstractComponentCallbacksC1366v.f18409p) {
                            try {
                                str = abstractComponentCallbacksC1366v.q().getResourceName(abstractComponentCallbacksC1366v.f18421x);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC1366v.f18421x) + " (" + str + ") for fragment " + abstractComponentCallbacksC1366v);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        C1429c c1429c = AbstractC1430d.f19185a;
                        AbstractC1430d.b(new C1427a(abstractComponentCallbacksC1366v, "Attempting to add fragment " + abstractComponentCallbacksC1366v + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        AbstractC1430d.a(abstractComponentCallbacksC1366v).getClass();
                    }
                } else {
                    throw new IllegalArgumentException(AbstractC0953k1.m("Cannot create fragment ", abstractComponentCallbacksC1366v, " for a container view with no id"));
                }
            }
        }
        abstractComponentCallbacksC1366v.f18383X = viewGroup;
        abstractComponentCallbacksC1366v.U(K, viewGroup, bundle);
        if (abstractComponentCallbacksC1366v.Y != null) {
            if (AbstractC1336M.H(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC1366v);
            }
            abstractComponentCallbacksC1366v.Y.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC1366v.Y.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC1366v);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC1366v.f18423z) {
                abstractComponentCallbacksC1366v.Y.setVisibility(8);
            }
            View view = abstractComponentCallbacksC1366v.Y;
            WeakHashMap weakHashMap = P.Q.f5546a;
            if (view.isAttachedToWindow()) {
                P.F.c(abstractComponentCallbacksC1366v.Y);
            } else {
                View view2 = abstractComponentCallbacksC1366v.Y;
                view2.addOnAttachStateChangeListener(new K5.o(1, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC1366v.f18386b;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC1366v.S(abstractComponentCallbacksC1366v.Y);
            abstractComponentCallbacksC1366v.f18418u.t(2);
            this.f18249a.y(abstractComponentCallbacksC1366v, abstractComponentCallbacksC1366v.Y, false);
            int visibility = abstractComponentCallbacksC1366v.Y.getVisibility();
            abstractComponentCallbacksC1366v.i().j = abstractComponentCallbacksC1366v.Y.getAlpha();
            if (abstractComponentCallbacksC1366v.f18383X != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC1366v.Y.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC1366v.i().f18376k = findFocus;
                    if (AbstractC1336M.H(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC1366v);
                    }
                }
                abstractComponentCallbacksC1366v.Y.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC1366v.f18385a = 2;
    }

    public final void g() {
        boolean z9;
        boolean z10;
        boolean z11;
        AbstractComponentCallbacksC1366v j;
        boolean H8 = AbstractC1336M.H(3);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (H8) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC1366v);
        }
        int i9 = 0;
        boolean z12 = true;
        if (abstractComponentCallbacksC1366v.f18401l && !abstractComponentCallbacksC1366v.A()) {
            z9 = true;
        } else {
            z9 = false;
        }
        C1535g c1535g = this.f18250b;
        if (z9 && !abstractComponentCallbacksC1366v.f18403m) {
            c1535g.H(abstractComponentCallbacksC1366v.f18389e, null);
        }
        if (!z9) {
            C1340Q c1340q = (C1340Q) c1535g.f20185d;
            if (c1340q.f18230d.containsKey(abstractComponentCallbacksC1366v.f18389e) && c1340q.f18233g) {
                z11 = c1340q.f18234h;
            } else {
                z11 = true;
            }
            if (!z11) {
                String str = abstractComponentCallbacksC1366v.f18394h;
                if (str != null && (j = c1535g.j(str)) != null && j.f18380B) {
                    abstractComponentCallbacksC1366v.f18392g = j;
                }
                abstractComponentCallbacksC1366v.f18385a = 0;
                return;
            }
        }
        C1368x c1368x = abstractComponentCallbacksC1366v.f18416t;
        if (c1368x != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            z12 = ((C1340Q) c1535g.f20185d).f18234h;
        } else {
            AbstractActivityC1369y abstractActivityC1369y = c1368x.f18427o;
            if (u0.z.i(abstractActivityC1369y)) {
                z12 = true ^ abstractActivityC1369y.isChangingConfigurations();
            }
        }
        if ((z9 && !abstractComponentCallbacksC1366v.f18403m) || z12) {
            ((C1340Q) c1535g.f20185d).d(abstractComponentCallbacksC1366v, false);
        }
        abstractComponentCallbacksC1366v.f18418u.k();
        abstractComponentCallbacksC1366v.f18404m0.o0(EnumC0554o.ON_DESTROY);
        abstractComponentCallbacksC1366v.f18385a = 0;
        abstractComponentCallbacksC1366v.f18382D = false;
        abstractComponentCallbacksC1366v.f18398j0 = false;
        abstractComponentCallbacksC1366v.H();
        if (abstractComponentCallbacksC1366v.f18382D) {
            this.f18249a.o(false);
            ArrayList o9 = c1535g.o();
            int size = o9.size();
            while (i9 < size) {
                Object obj = o9.get(i9);
                i9++;
                C1343U c1343u = (C1343U) obj;
                if (c1343u != null) {
                    String str2 = abstractComponentCallbacksC1366v.f18389e;
                    AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = c1343u.f18251c;
                    if (str2.equals(abstractComponentCallbacksC1366v2.f18394h)) {
                        abstractComponentCallbacksC1366v2.f18392g = abstractComponentCallbacksC1366v;
                        abstractComponentCallbacksC1366v2.f18394h = null;
                    }
                }
            }
            String str3 = abstractComponentCallbacksC1366v.f18394h;
            if (str3 != null) {
                abstractComponentCallbacksC1366v.f18392g = c1535g.j(str3);
            }
            c1535g.v(this);
            return;
        }
        throw new AndroidRuntimeException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " did not call through to super.onDestroy()"));
    }

    public final void h() {
        View view;
        boolean H8 = AbstractC1336M.H(3);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (H8) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC1366v);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC1366v.f18383X;
        if (viewGroup != null && (view = abstractComponentCallbacksC1366v.Y) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC1366v.f18418u.t(1);
        if (abstractComponentCallbacksC1366v.Y != null) {
            W w7 = abstractComponentCallbacksC1366v.f18406n0;
            w7.b();
            if (w7.f18267e.f9908d.compareTo(EnumC0555p.f9895c) >= 0) {
                abstractComponentCallbacksC1366v.f18406n0.a(EnumC0554o.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC1366v.f18385a = 1;
        abstractComponentCallbacksC1366v.f18382D = false;
        abstractComponentCallbacksC1366v.I();
        if (abstractComponentCallbacksC1366v.f18382D) {
            C1940j c1940j = ((C1603c) C1499E.i(abstractComponentCallbacksC1366v).f19986c).f21007d;
            int i9 = c1940j.i();
            for (int i10 = 0; i10 < i9; i10++) {
                ((C1601a) c1940j.j(i10)).j();
            }
            abstractComponentCallbacksC1366v.f18411q = false;
            this.f18249a.z(false);
            abstractComponentCallbacksC1366v.f18383X = null;
            abstractComponentCallbacksC1366v.Y = null;
            abstractComponentCallbacksC1366v.f18406n0 = null;
            abstractComponentCallbacksC1366v.f18408o0.i(null);
            abstractComponentCallbacksC1366v.f18407o = false;
            return;
        }
        throw new AndroidRuntimeException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " did not call through to super.onDestroyView()"));
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [i0.M, i0.N] */
    public final void i() {
        boolean z9;
        boolean H8 = AbstractC1336M.H(3);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (H8) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC1366v);
        }
        abstractComponentCallbacksC1366v.f18385a = -1;
        abstractComponentCallbacksC1366v.f18382D = false;
        abstractComponentCallbacksC1366v.J();
        abstractComponentCallbacksC1366v.f18397i0 = null;
        if (abstractComponentCallbacksC1366v.f18382D) {
            C1337N c1337n = abstractComponentCallbacksC1366v.f18418u;
            if (!c1337n.f18190H) {
                c1337n.k();
                abstractComponentCallbacksC1366v.f18418u = new AbstractC1336M();
            }
            this.f18249a.p(false);
            abstractComponentCallbacksC1366v.f18385a = -1;
            abstractComponentCallbacksC1366v.f18416t = null;
            abstractComponentCallbacksC1366v.f18419v = null;
            abstractComponentCallbacksC1366v.f18414s = null;
            if (!abstractComponentCallbacksC1366v.f18401l || abstractComponentCallbacksC1366v.A()) {
                C1340Q c1340q = (C1340Q) this.f18250b.f20185d;
                if (c1340q.f18230d.containsKey(abstractComponentCallbacksC1366v.f18389e) && c1340q.f18233g) {
                    z9 = c1340q.f18234h;
                } else {
                    z9 = true;
                }
                if (!z9) {
                    return;
                }
            }
            if (AbstractC1336M.H(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC1366v);
            }
            abstractComponentCallbacksC1366v.w();
            return;
        }
        throw new AndroidRuntimeException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " did not call through to super.onDetach()"));
    }

    public final void j() {
        Bundle bundle;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (abstractComponentCallbacksC1366v.f18405n && abstractComponentCallbacksC1366v.f18407o && !abstractComponentCallbacksC1366v.f18411q) {
            if (AbstractC1336M.H(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC1366v);
            }
            Bundle bundle2 = abstractComponentCallbacksC1366v.f18386b;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            LayoutInflater K = abstractComponentCallbacksC1366v.K(bundle);
            abstractComponentCallbacksC1366v.f18397i0 = K;
            abstractComponentCallbacksC1366v.U(K, null, bundle);
            View view = abstractComponentCallbacksC1366v.Y;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC1366v.Y.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC1366v);
                if (abstractComponentCallbacksC1366v.f18423z) {
                    abstractComponentCallbacksC1366v.Y.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC1366v.f18386b;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC1366v.S(abstractComponentCallbacksC1366v.Y);
                abstractComponentCallbacksC1366v.f18418u.t(2);
                this.f18249a.y(abstractComponentCallbacksC1366v, abstractComponentCallbacksC1366v.Y, false);
                abstractComponentCallbacksC1366v.f18385a = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0166, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C1343U.k():void");
    }

    public final void l() {
        boolean H8 = AbstractC1336M.H(3);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (H8) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC1366v);
        }
        abstractComponentCallbacksC1366v.f18418u.t(5);
        if (abstractComponentCallbacksC1366v.Y != null) {
            abstractComponentCallbacksC1366v.f18406n0.a(EnumC0554o.ON_PAUSE);
        }
        abstractComponentCallbacksC1366v.f18404m0.o0(EnumC0554o.ON_PAUSE);
        abstractComponentCallbacksC1366v.f18385a = 6;
        abstractComponentCallbacksC1366v.f18382D = false;
        abstractComponentCallbacksC1366v.N();
        if (abstractComponentCallbacksC1366v.f18382D) {
            this.f18249a.q(false);
            return;
        }
        throw new AndroidRuntimeException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        Bundle bundle = abstractComponentCallbacksC1366v.f18386b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (abstractComponentCallbacksC1366v.f18386b.getBundle("savedInstanceState") == null) {
                abstractComponentCallbacksC1366v.f18386b.putBundle("savedInstanceState", new Bundle());
            }
            abstractComponentCallbacksC1366v.f18387c = abstractComponentCallbacksC1366v.f18386b.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC1366v.f18388d = abstractComponentCallbacksC1366v.f18386b.getBundle("viewRegistryState");
            C1342T c1342t = (C1342T) abstractComponentCallbacksC1366v.f18386b.getParcelable("state");
            if (c1342t != null) {
                abstractComponentCallbacksC1366v.f18394h = c1342t.f18246l;
                abstractComponentCallbacksC1366v.f18396i = c1342t.f18247m;
                abstractComponentCallbacksC1366v.f18391f0 = c1342t.f18248n;
            }
            if (!abstractComponentCallbacksC1366v.f18391f0) {
                abstractComponentCallbacksC1366v.f18384Z = true;
            }
        }
    }

    public final void n() {
        View view;
        String str;
        boolean H8 = AbstractC1336M.H(3);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (H8) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC1366v);
        }
        C1363s c1363s = abstractComponentCallbacksC1366v.f18393g0;
        if (c1363s == null) {
            view = null;
        } else {
            view = c1363s.f18376k;
        }
        if (view != null) {
            if (view != abstractComponentCallbacksC1366v.Y) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC1366v.Y) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (AbstractC1336M.H(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC1366v);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC1366v.Y.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC1366v.i().f18376k = null;
        abstractComponentCallbacksC1366v.f18418u.O();
        abstractComponentCallbacksC1366v.f18418u.x(true);
        abstractComponentCallbacksC1366v.f18385a = 7;
        abstractComponentCallbacksC1366v.f18382D = false;
        abstractComponentCallbacksC1366v.O();
        if (abstractComponentCallbacksC1366v.f18382D) {
            C0563y c0563y = abstractComponentCallbacksC1366v.f18404m0;
            EnumC0554o enumC0554o = EnumC0554o.ON_RESUME;
            c0563y.o0(enumC0554o);
            if (abstractComponentCallbacksC1366v.Y != null) {
                abstractComponentCallbacksC1366v.f18406n0.f18267e.o0(enumC0554o);
            }
            C1337N c1337n = abstractComponentCallbacksC1366v.f18418u;
            c1337n.f18188F = false;
            c1337n.f18189G = false;
            c1337n.f18194M.f18235i = false;
            c1337n.t(7);
            this.f18249a.t(false);
            this.f18250b.H(abstractComponentCallbacksC1366v.f18389e, null);
            abstractComponentCallbacksC1366v.f18386b = null;
            abstractComponentCallbacksC1366v.f18387c = null;
            abstractComponentCallbacksC1366v.f18388d = null;
            return;
        }
        throw new AndroidRuntimeException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " did not call through to super.onResume()"));
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (abstractComponentCallbacksC1366v.f18385a == -1 && (bundle = abstractComponentCallbacksC1366v.f18386b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C1342T(abstractComponentCallbacksC1366v));
        if (abstractComponentCallbacksC1366v.f18385a > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC1366v.P(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f18249a.u(false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC1366v.f18412q0.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle V8 = abstractComponentCallbacksC1366v.f18418u.V();
            if (!V8.isEmpty()) {
                bundle2.putBundle("childFragmentManager", V8);
            }
            if (abstractComponentCallbacksC1366v.Y != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC1366v.f18387c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC1366v.f18388d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC1366v.f18390f;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (abstractComponentCallbacksC1366v.Y != null) {
            if (AbstractC1336M.H(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC1366v + " with view " + abstractComponentCallbacksC1366v.Y);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            abstractComponentCallbacksC1366v.Y.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                abstractComponentCallbacksC1366v.f18387c = sparseArray;
            }
            Bundle bundle = new Bundle();
            abstractComponentCallbacksC1366v.f18406n0.f18268f.c(bundle);
            if (!bundle.isEmpty()) {
                abstractComponentCallbacksC1366v.f18388d = bundle;
            }
        }
    }

    public final void q() {
        boolean H8 = AbstractC1336M.H(3);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (H8) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC1366v);
        }
        abstractComponentCallbacksC1366v.f18418u.O();
        abstractComponentCallbacksC1366v.f18418u.x(true);
        abstractComponentCallbacksC1366v.f18385a = 5;
        abstractComponentCallbacksC1366v.f18382D = false;
        abstractComponentCallbacksC1366v.Q();
        if (abstractComponentCallbacksC1366v.f18382D) {
            C0563y c0563y = abstractComponentCallbacksC1366v.f18404m0;
            EnumC0554o enumC0554o = EnumC0554o.ON_START;
            c0563y.o0(enumC0554o);
            if (abstractComponentCallbacksC1366v.Y != null) {
                abstractComponentCallbacksC1366v.f18406n0.f18267e.o0(enumC0554o);
            }
            C1337N c1337n = abstractComponentCallbacksC1366v.f18418u;
            c1337n.f18188F = false;
            c1337n.f18189G = false;
            c1337n.f18194M.f18235i = false;
            c1337n.t(5);
            this.f18249a.v(false);
            return;
        }
        throw new AndroidRuntimeException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " did not call through to super.onStart()"));
    }

    public final void r() {
        boolean H8 = AbstractC1336M.H(3);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18251c;
        if (H8) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC1366v);
        }
        C1337N c1337n = abstractComponentCallbacksC1366v.f18418u;
        c1337n.f18189G = true;
        c1337n.f18194M.f18235i = true;
        c1337n.t(4);
        if (abstractComponentCallbacksC1366v.Y != null) {
            abstractComponentCallbacksC1366v.f18406n0.a(EnumC0554o.ON_STOP);
        }
        abstractComponentCallbacksC1366v.f18404m0.o0(EnumC0554o.ON_STOP);
        abstractComponentCallbacksC1366v.f18385a = 4;
        abstractComponentCallbacksC1366v.f18382D = false;
        abstractComponentCallbacksC1366v.R();
        if (abstractComponentCallbacksC1366v.f18382D) {
            this.f18249a.x(false);
            return;
        }
        throw new AndroidRuntimeException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " did not call through to super.onStop()"));
    }

    public C1343U(O0.c cVar, C1535g c1535g, ClassLoader classLoader, C1329F c1329f, Bundle bundle) {
        this.f18249a = cVar;
        this.f18250b = c1535g;
        AbstractComponentCallbacksC1366v a5 = ((C1342T) bundle.getParcelable("state")).a(c1329f);
        this.f18251c = a5;
        a5.f18386b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a5.c0(bundle2);
        if (AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a5);
        }
    }

    public C1343U(O0.c cVar, C1535g c1535g, AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, Bundle bundle) {
        this.f18249a = cVar;
        this.f18250b = c1535g;
        this.f18251c = abstractComponentCallbacksC1366v;
        abstractComponentCallbacksC1366v.f18387c = null;
        abstractComponentCallbacksC1366v.f18388d = null;
        abstractComponentCallbacksC1366v.f18413r = 0;
        abstractComponentCallbacksC1366v.f18407o = false;
        abstractComponentCallbacksC1366v.f18399k = false;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = abstractComponentCallbacksC1366v.f18392g;
        abstractComponentCallbacksC1366v.f18394h = abstractComponentCallbacksC1366v2 != null ? abstractComponentCallbacksC1366v2.f18389e : null;
        abstractComponentCallbacksC1366v.f18392g = null;
        abstractComponentCallbacksC1366v.f18386b = bundle;
        abstractComponentCallbacksC1366v.f18390f = bundle.getBundle("arguments");
    }
}
