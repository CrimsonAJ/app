package i0;

import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public int f18274a;

    /* renamed from: b, reason: collision with root package name */
    public int f18275b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC1366v f18276c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18277d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f18278e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18279f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18280g;

    /* renamed from: h, reason: collision with root package name */
    public final C1343U f18281h;

    public Z(int i9, int i10, C1343U c1343u, L.c cVar) {
        AbstractC0953k1.t(i9, "finalState");
        AbstractC0953k1.t(i10, "lifecycleImpact");
        AbstractComponentCallbacksC1366v fragment = c1343u.f18251c;
        kotlin.jvm.internal.h.d(fragment, "fragmentStateManager.fragment");
        AbstractC0953k1.t(i9, "finalState");
        AbstractC0953k1.t(i10, "lifecycleImpact");
        kotlin.jvm.internal.h.e(fragment, "fragment");
        this.f18274a = i9;
        this.f18275b = i10;
        this.f18276c = fragment;
        this.f18277d = new ArrayList();
        this.f18278e = new LinkedHashSet();
        cVar.a(new C3.v(28, this));
        this.f18281h = c1343u;
    }

    public final void a() {
        if (!this.f18279f) {
            this.f18279f = true;
            LinkedHashSet linkedHashSet = this.f18278e;
            if (linkedHashSet.isEmpty()) {
                b();
                return;
            }
            for (L.c cVar : new LinkedHashSet(linkedHashSet)) {
                synchronized (cVar) {
                    try {
                        if (!cVar.f4441a) {
                            cVar.f4441a = true;
                            cVar.f4443c = true;
                            L.b bVar = cVar.f4442b;
                            if (bVar != null) {
                                try {
                                    bVar.g();
                                } catch (Throwable th) {
                                    synchronized (cVar) {
                                        cVar.f4443c = false;
                                        cVar.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (cVar) {
                                cVar.f4443c = false;
                                cVar.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.f18280g) {
            if (AbstractC1336M.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f18280g = true;
            ArrayList arrayList = this.f18277d;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((Runnable) obj).run();
            }
        }
        this.f18281h.k();
    }

    public final void c(int i9, int i10) {
        AbstractC0953k1.t(i9, "finalState");
        AbstractC0953k1.t(i10, "lifecycleImpact");
        int b9 = AbstractC2128h.b(i10);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18276c;
        if (b9 != 0) {
            if (b9 != 1) {
                if (b9 == 2) {
                    if (AbstractC1336M.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC1366v + " mFinalState = " + AbstractC0953k1.C(this.f18274a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0953k1.B(this.f18275b) + " to REMOVING.");
                    }
                    this.f18274a = 1;
                    this.f18275b = 3;
                    return;
                }
                return;
            }
            if (this.f18274a == 1) {
                if (AbstractC1336M.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC1366v + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0953k1.B(this.f18275b) + " to ADDING.");
                }
                this.f18274a = 2;
                this.f18275b = 2;
                return;
            }
            return;
        }
        if (this.f18274a != 1) {
            if (AbstractC1336M.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC1366v + " mFinalState = " + AbstractC0953k1.C(this.f18274a) + " -> " + AbstractC0953k1.C(i9) + '.');
            }
            this.f18274a = i9;
        }
    }

    public final void d() {
        float f9;
        int i9 = this.f18275b;
        C1343U c1343u = this.f18281h;
        if (i9 == 2) {
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1343u.f18251c;
            kotlin.jvm.internal.h.d(abstractComponentCallbacksC1366v, "fragmentStateManager.fragment");
            View findFocus = abstractComponentCallbacksC1366v.Y.findFocus();
            if (findFocus != null) {
                abstractComponentCallbacksC1366v.i().f18376k = findFocus;
                if (AbstractC1336M.H(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC1366v);
                }
            }
            View Z6 = this.f18276c.Z();
            if (Z6.getParent() == null) {
                c1343u.b();
                Z6.setAlpha(0.0f);
            }
            if (Z6.getAlpha() == 0.0f && Z6.getVisibility() == 0) {
                Z6.setVisibility(4);
            }
            C1363s c1363s = abstractComponentCallbacksC1366v.f18393g0;
            if (c1363s == null) {
                f9 = 1.0f;
            } else {
                f9 = c1363s.j;
            }
            Z6.setAlpha(f9);
            return;
        }
        if (i9 == 3) {
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = c1343u.f18251c;
            kotlin.jvm.internal.h.d(abstractComponentCallbacksC1366v2, "fragmentStateManager.fragment");
            View Z8 = abstractComponentCallbacksC1366v2.Z();
            if (AbstractC1336M.H(2)) {
                Log.v("FragmentManager", "Clearing focus " + Z8.findFocus() + " on view " + Z8 + " for Fragment " + abstractComponentCallbacksC1366v2);
            }
            Z8.clearFocus();
        }
    }

    public final String toString() {
        StringBuilder r5 = AbstractC0953k1.r("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        r5.append(AbstractC0953k1.C(this.f18274a));
        r5.append(" lifecycleImpact = ");
        r5.append(AbstractC0953k1.B(this.f18275b));
        r5.append(" fragment = ");
        r5.append(this.f18276c);
        r5.append('}');
        return r5.toString();
    }
}
