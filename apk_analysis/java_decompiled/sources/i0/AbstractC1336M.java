package i0;

import B6.u0;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0555p;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import d.C1065f;
import d.C1082w;
import d.InterfaceC1062c;
import f5.C1183o;
import g.C1188a;
import g2.C1201C;
import j0.AbstractC1430d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l1.C1535g;

/* renamed from: i0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1336M {

    /* renamed from: A, reason: collision with root package name */
    public f.e f18183A;

    /* renamed from: B, reason: collision with root package name */
    public f.e f18184B;

    /* renamed from: C, reason: collision with root package name */
    public f.e f18185C;

    /* renamed from: D, reason: collision with root package name */
    public ArrayDeque f18186D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f18187E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f18188F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f18189G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f18190H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f18191I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f18192J;
    public ArrayList K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f18193L;

    /* renamed from: M, reason: collision with root package name */
    public C1340Q f18194M;

    /* renamed from: N, reason: collision with root package name */
    public final A4.e f18195N;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18197b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f18199d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f18200e;

    /* renamed from: g, reason: collision with root package name */
    public C1082w f18202g;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f18206l;

    /* renamed from: m, reason: collision with root package name */
    public final O0.c f18207m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f18208n;

    /* renamed from: o, reason: collision with root package name */
    public final C1327D f18209o;

    /* renamed from: p, reason: collision with root package name */
    public final C1327D f18210p;

    /* renamed from: q, reason: collision with root package name */
    public final C1327D f18211q;

    /* renamed from: r, reason: collision with root package name */
    public final C1327D f18212r;

    /* renamed from: s, reason: collision with root package name */
    public final C1328E f18213s;

    /* renamed from: t, reason: collision with root package name */
    public int f18214t;

    /* renamed from: u, reason: collision with root package name */
    public C1368x f18215u;

    /* renamed from: v, reason: collision with root package name */
    public u0 f18216v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC1366v f18217w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractComponentCallbacksC1366v f18218x;

    /* renamed from: y, reason: collision with root package name */
    public final C1329F f18219y;

    /* renamed from: z, reason: collision with root package name */
    public final d0.w f18220z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18196a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C1535g f18198c = new C1535g(11);

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflaterFactory2C1325B f18201f = new LayoutInflaterFactory2C1325B(this);

    /* renamed from: h, reason: collision with root package name */
    public final C1201C f18203h = new C1201C(1, this);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f18204i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f18205k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [i0.D] */
    /* JADX WARN: Type inference failed for: r0v13, types: [i0.D] */
    /* JADX WARN: Type inference failed for: r0v14, types: [i0.D] */
    /* JADX WARN: Type inference failed for: r0v15, types: [i0.D] */
    public AbstractC1336M() {
        Collections.synchronizedMap(new HashMap());
        this.f18207m = new O0.c(this);
        this.f18208n = new CopyOnWriteArrayList();
        final int i9 = 0;
        this.f18209o = new O.a(this) { // from class: i0.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC1336M f18169b;

            {
                this.f18169b = this;
            }

            @Override // O.a
            public final void a(Object obj) {
                switch (i9) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1336M abstractC1336M = this.f18169b;
                        if (abstractC1336M.J()) {
                            abstractC1336M.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1336M abstractC1336M2 = this.f18169b;
                        if (abstractC1336M2.J() && num.intValue() == 80) {
                            abstractC1336M2.l(false);
                            return;
                        }
                        return;
                    case 2:
                        D.f fVar = (D.f) obj;
                        AbstractC1336M abstractC1336M3 = this.f18169b;
                        if (abstractC1336M3.J()) {
                            boolean z9 = fVar.f1671a;
                            abstractC1336M3.m(false);
                            return;
                        }
                        return;
                    default:
                        D.x xVar = (D.x) obj;
                        AbstractC1336M abstractC1336M4 = this.f18169b;
                        if (abstractC1336M4.J()) {
                            boolean z10 = xVar.f1730a;
                            abstractC1336M4.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i10 = 1;
        this.f18210p = new O.a(this) { // from class: i0.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC1336M f18169b;

            {
                this.f18169b = this;
            }

            @Override // O.a
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1336M abstractC1336M = this.f18169b;
                        if (abstractC1336M.J()) {
                            abstractC1336M.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1336M abstractC1336M2 = this.f18169b;
                        if (abstractC1336M2.J() && num.intValue() == 80) {
                            abstractC1336M2.l(false);
                            return;
                        }
                        return;
                    case 2:
                        D.f fVar = (D.f) obj;
                        AbstractC1336M abstractC1336M3 = this.f18169b;
                        if (abstractC1336M3.J()) {
                            boolean z9 = fVar.f1671a;
                            abstractC1336M3.m(false);
                            return;
                        }
                        return;
                    default:
                        D.x xVar = (D.x) obj;
                        AbstractC1336M abstractC1336M4 = this.f18169b;
                        if (abstractC1336M4.J()) {
                            boolean z10 = xVar.f1730a;
                            abstractC1336M4.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i11 = 2;
        this.f18211q = new O.a(this) { // from class: i0.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC1336M f18169b;

            {
                this.f18169b = this;
            }

            @Override // O.a
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1336M abstractC1336M = this.f18169b;
                        if (abstractC1336M.J()) {
                            abstractC1336M.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1336M abstractC1336M2 = this.f18169b;
                        if (abstractC1336M2.J() && num.intValue() == 80) {
                            abstractC1336M2.l(false);
                            return;
                        }
                        return;
                    case 2:
                        D.f fVar = (D.f) obj;
                        AbstractC1336M abstractC1336M3 = this.f18169b;
                        if (abstractC1336M3.J()) {
                            boolean z9 = fVar.f1671a;
                            abstractC1336M3.m(false);
                            return;
                        }
                        return;
                    default:
                        D.x xVar = (D.x) obj;
                        AbstractC1336M abstractC1336M4 = this.f18169b;
                        if (abstractC1336M4.J()) {
                            boolean z10 = xVar.f1730a;
                            abstractC1336M4.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i12 = 3;
        this.f18212r = new O.a(this) { // from class: i0.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC1336M f18169b;

            {
                this.f18169b = this;
            }

            @Override // O.a
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1336M abstractC1336M = this.f18169b;
                        if (abstractC1336M.J()) {
                            abstractC1336M.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1336M abstractC1336M2 = this.f18169b;
                        if (abstractC1336M2.J() && num.intValue() == 80) {
                            abstractC1336M2.l(false);
                            return;
                        }
                        return;
                    case 2:
                        D.f fVar = (D.f) obj;
                        AbstractC1336M abstractC1336M3 = this.f18169b;
                        if (abstractC1336M3.J()) {
                            boolean z9 = fVar.f1671a;
                            abstractC1336M3.m(false);
                            return;
                        }
                        return;
                    default:
                        D.x xVar = (D.x) obj;
                        AbstractC1336M abstractC1336M4 = this.f18169b;
                        if (abstractC1336M4.J()) {
                            boolean z10 = xVar.f1730a;
                            abstractC1336M4.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f18213s = new C1328E(this);
        this.f18214t = -1;
        this.f18219y = new C1329F(this);
        this.f18220z = new d0.w(3);
        this.f18186D = new ArrayDeque();
        this.f18195N = new A4.e(27, this);
    }

    public static boolean H(int i9) {
        if (Log.isLoggable("FragmentManager", i9)) {
            return true;
        }
        return false;
    }

    public static boolean I(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        abstractComponentCallbacksC1366v.getClass();
        ArrayList p9 = abstractComponentCallbacksC1366v.f18418u.f18198c.p();
        int size = p9.size();
        boolean z9 = false;
        int i9 = 0;
        while (i9 < size) {
            Object obj = p9.get(i9);
            i9++;
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = (AbstractComponentCallbacksC1366v) obj;
            if (abstractComponentCallbacksC1366v2 != null) {
                z9 = I(abstractComponentCallbacksC1366v2);
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        if (abstractComponentCallbacksC1366v != null) {
            if (abstractComponentCallbacksC1366v.f18381C) {
                if (abstractComponentCallbacksC1366v.f18414s == null || K(abstractComponentCallbacksC1366v.f18419v)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean L(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        if (abstractComponentCallbacksC1366v != null) {
            AbstractC1336M abstractC1336M = abstractComponentCallbacksC1366v.f18414s;
            if (abstractComponentCallbacksC1366v.equals(abstractC1336M.f18218x) && L(abstractC1336M.f18217w)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void b0(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        if (H(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC1366v);
        }
        if (abstractComponentCallbacksC1366v.f18423z) {
            abstractComponentCallbacksC1366v.f18423z = false;
            abstractComponentCallbacksC1366v.f18395h0 = !abstractComponentCallbacksC1366v.f18395h0;
        }
    }

    public final int A(String str, boolean z9, int i9) {
        ArrayList arrayList = this.f18199d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i9 < 0) {
            if (z9) {
                return 0;
            }
            return this.f18199d.size() - 1;
        }
        int size = this.f18199d.size() - 1;
        while (size >= 0) {
            C1345a c1345a = (C1345a) this.f18199d.get(size);
            if ((str != null && str.equals(c1345a.f18290i)) || (i9 >= 0 && i9 == c1345a.f18299s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z9) {
            while (size > 0) {
                C1345a c1345a2 = (C1345a) this.f18199d.get(size - 1);
                if ((str == null || !str.equals(c1345a2.f18290i)) && (i9 < 0 || i9 != c1345a2.f18299s)) {
                    break;
                }
                size--;
            }
            return size;
        }
        if (size == this.f18199d.size() - 1) {
            return -1;
        }
        return size + 1;
    }

    public final AbstractComponentCallbacksC1366v B(int i9) {
        C1535g c1535g = this.f18198c;
        ArrayList arrayList = (ArrayList) c1535g.f20182a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) arrayList.get(size);
            if (abstractComponentCallbacksC1366v != null && abstractComponentCallbacksC1366v.f18420w == i9) {
                return abstractComponentCallbacksC1366v;
            }
        }
        for (C1343U c1343u : ((HashMap) c1535g.f20183b).values()) {
            if (c1343u != null) {
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = c1343u.f18251c;
                if (abstractComponentCallbacksC1366v2.f18420w == i9) {
                    return abstractComponentCallbacksC1366v2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC1366v C(String str) {
        C1535g c1535g = this.f18198c;
        if (str != null) {
            ArrayList arrayList = (ArrayList) c1535g.f20182a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) arrayList.get(size);
                if (abstractComponentCallbacksC1366v != null && str.equals(abstractComponentCallbacksC1366v.f18422y)) {
                    return abstractComponentCallbacksC1366v;
                }
            }
        }
        if (str != null) {
            for (C1343U c1343u : ((HashMap) c1535g.f20183b).values()) {
                if (c1343u != null) {
                    AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = c1343u.f18251c;
                    if (str.equals(abstractComponentCallbacksC1366v2.f18422y)) {
                        return abstractComponentCallbacksC1366v2;
                    }
                }
            }
            return null;
        }
        c1535g.getClass();
        return null;
    }

    public final ViewGroup D(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        ViewGroup viewGroup = abstractComponentCallbacksC1366v.f18383X;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC1366v.f18421x > 0 && this.f18216v.H()) {
            View G8 = this.f18216v.G(abstractComponentCallbacksC1366v.f18421x);
            if (G8 instanceof ViewGroup) {
                return (ViewGroup) G8;
            }
            return null;
        }
        return null;
    }

    public final C1329F E() {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            return abstractComponentCallbacksC1366v.f18414s.E();
        }
        return this.f18219y;
    }

    public final d0.w F() {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            return abstractComponentCallbacksC1366v.f18414s.F();
        }
        return this.f18220z;
    }

    public final void G(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        if (H(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC1366v);
        }
        if (!abstractComponentCallbacksC1366v.f18423z) {
            abstractComponentCallbacksC1366v.f18423z = true;
            abstractComponentCallbacksC1366v.f18395h0 = true ^ abstractComponentCallbacksC1366v.f18395h0;
            a0(abstractComponentCallbacksC1366v);
        }
    }

    public final boolean J() {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18217w;
        if (abstractComponentCallbacksC1366v == null) {
            return true;
        }
        if (abstractComponentCallbacksC1366v.y() && this.f18217w.o().J()) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        if (!this.f18188F && !this.f18189G) {
            return false;
        }
        return true;
    }

    public final void N(int i9, boolean z9) {
        HashMap hashMap;
        C1368x c1368x;
        if (this.f18215u == null && i9 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z9 || i9 != this.f18214t) {
            this.f18214t = i9;
            C1535g c1535g = this.f18198c;
            ArrayList arrayList = (ArrayList) c1535g.f20182a;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                hashMap = (HashMap) c1535g.f20183b;
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                C1343U c1343u = (C1343U) hashMap.get(((AbstractComponentCallbacksC1366v) obj).f18389e);
                if (c1343u != null) {
                    c1343u.k();
                }
            }
            for (C1343U c1343u2 : hashMap.values()) {
                if (c1343u2 != null) {
                    c1343u2.k();
                    AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1343u2.f18251c;
                    if (abstractComponentCallbacksC1366v.f18401l && !abstractComponentCallbacksC1366v.A()) {
                        if (abstractComponentCallbacksC1366v.f18403m && !((HashMap) c1535g.f20184c).containsKey(abstractComponentCallbacksC1366v.f18389e)) {
                            c1535g.H(abstractComponentCallbacksC1366v.f18389e, c1343u2.o());
                        }
                        c1535g.v(c1343u2);
                    }
                }
            }
            c0();
            if (this.f18187E && (c1368x = this.f18215u) != null && this.f18214t == 7) {
                c1368x.f18430r.invalidateOptionsMenu();
                this.f18187E = false;
            }
        }
    }

    public final void O() {
        if (this.f18215u != null) {
            this.f18188F = false;
            this.f18189G = false;
            this.f18194M.f18235i = false;
            for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v : this.f18198c.q()) {
                if (abstractComponentCallbacksC1366v != null) {
                    abstractComponentCallbacksC1366v.f18418u.O();
                }
            }
        }
    }

    public final boolean P() {
        return Q(-1, 0);
    }

    public final boolean Q(int i9, int i10) {
        x(false);
        w(true);
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18218x;
        if (abstractComponentCallbacksC1366v != null && i9 < 0 && abstractComponentCallbacksC1366v.l().P()) {
            return true;
        }
        boolean R2 = R(this.f18192J, this.K, null, i9, i10);
        if (R2) {
            this.f18197b = true;
            try {
                T(this.f18192J, this.K);
            } finally {
                d();
            }
        }
        e0();
        if (this.f18191I) {
            this.f18191I = false;
            c0();
        }
        ((HashMap) this.f18198c.f20183b).values().removeAll(Collections.singleton(null));
        return R2;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, String str, int i9, int i10) {
        boolean z9;
        if ((i10 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        int A2 = A(str, z9, i9);
        if (A2 < 0) {
            return false;
        }
        for (int size = this.f18199d.size() - 1; size >= A2; size--) {
            arrayList.add((C1345a) this.f18199d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        if (H(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC1366v + " nesting=" + abstractComponentCallbacksC1366v.f18413r);
        }
        boolean A2 = abstractComponentCallbacksC1366v.A();
        if (abstractComponentCallbacksC1366v.f18379A && A2) {
            return;
        }
        C1535g c1535g = this.f18198c;
        synchronized (((ArrayList) c1535g.f20182a)) {
            ((ArrayList) c1535g.f20182a).remove(abstractComponentCallbacksC1366v);
        }
        abstractComponentCallbacksC1366v.f18399k = false;
        if (I(abstractComponentCallbacksC1366v)) {
            this.f18187E = true;
        }
        abstractComponentCallbacksC1366v.f18401l = true;
        a0(abstractComponentCallbacksC1366v);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i9 = 0;
                int i10 = 0;
                while (i9 < size) {
                    if (!((C1345a) arrayList.get(i9)).f18296p) {
                        if (i10 != i9) {
                            z(arrayList, arrayList2, i10, i9);
                        }
                        i10 = i9 + 1;
                        if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                            while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((C1345a) arrayList.get(i10)).f18296p) {
                                i10++;
                            }
                        }
                        z(arrayList, arrayList2, i9, i10);
                        i9 = i10 - 1;
                    }
                    i9++;
                }
                if (i10 != size) {
                    z(arrayList, arrayList2, i10, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void U(Bundle bundle) {
        O0.c cVar;
        int i9;
        Bundle bundle2;
        C1343U c1343u;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f18215u.f18427o.getClassLoader());
                this.f18205k.put(str.substring(7), bundle4);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f18215u.f18427o.getClassLoader());
                hashMap.put(str2.substring(9), bundle3);
            }
        }
        C1535g c1535g = this.f18198c;
        HashMap hashMap2 = (HashMap) c1535g.f20184c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        C1338O c1338o = (C1338O) bundle.getParcelable("state");
        if (c1338o == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) c1535g.f20183b;
        hashMap3.clear();
        ArrayList arrayList = c1338o.f18221a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            cVar = this.f18207m;
            if (i10 >= size) {
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            Bundle H8 = c1535g.H((String) obj, null);
            if (H8 != null) {
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) this.f18194M.f18230d.get(((C1342T) H8.getParcelable("state")).f18237b);
                if (abstractComponentCallbacksC1366v != null) {
                    if (H(2)) {
                        i9 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC1366v);
                    } else {
                        i9 = 2;
                    }
                    c1343u = new C1343U(cVar, c1535g, abstractComponentCallbacksC1366v, H8);
                    bundle2 = H8;
                } else {
                    i9 = 2;
                    bundle2 = H8;
                    c1343u = new C1343U(this.f18207m, this.f18198c, this.f18215u.f18427o.getClassLoader(), E(), H8);
                }
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = c1343u.f18251c;
                abstractComponentCallbacksC1366v2.f18386b = bundle2;
                abstractComponentCallbacksC1366v2.f18414s = this;
                if (H(i9)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC1366v2.f18389e + "): " + abstractComponentCallbacksC1366v2);
                }
                c1343u.m(this.f18215u.f18427o.getClassLoader());
                c1535g.u(c1343u);
                c1343u.f18253e = this.f18214t;
            }
        }
        C1340Q c1340q = this.f18194M;
        c1340q.getClass();
        ArrayList arrayList2 = new ArrayList(c1340q.f18230d.values());
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v3 = (AbstractComponentCallbacksC1366v) obj2;
            if (hashMap3.get(abstractComponentCallbacksC1366v3.f18389e) == null) {
                if (H(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC1366v3 + " that was not found in the set of active Fragments " + c1338o.f18221a);
                }
                this.f18194M.g(abstractComponentCallbacksC1366v3);
                abstractComponentCallbacksC1366v3.f18414s = this;
                C1343U c1343u2 = new C1343U(cVar, c1535g, abstractComponentCallbacksC1366v3);
                c1343u2.f18253e = 1;
                c1343u2.k();
                abstractComponentCallbacksC1366v3.f18401l = true;
                c1343u2.k();
            }
        }
        ArrayList arrayList3 = c1338o.f18222b;
        ((ArrayList) c1535g.f20182a).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList3.get(i12);
                i12++;
                String str3 = (String) obj3;
                AbstractComponentCallbacksC1366v j = c1535g.j(str3);
                if (j != null) {
                    if (H(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + j);
                    }
                    c1535g.c(j);
                } else {
                    throw new IllegalStateException(A0.a.n("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (c1338o.f18223c != null) {
            this.f18199d = new ArrayList(c1338o.f18223c.length);
            int i13 = 0;
            while (true) {
                C1346b[] c1346bArr = c1338o.f18223c;
                if (i13 >= c1346bArr.length) {
                    break;
                }
                C1346b c1346b = c1346bArr[i13];
                c1346b.getClass();
                C1345a c1345a = new C1345a(this);
                c1346b.a(c1345a);
                c1345a.f18299s = c1346b.f18308g;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList4 = c1346b.f18303b;
                    if (i14 >= arrayList4.size()) {
                        break;
                    }
                    String str4 = (String) arrayList4.get(i14);
                    if (str4 != null) {
                        ((C1344V) c1345a.f18282a.get(i14)).f18255b = c1535g.j(str4);
                    }
                    i14++;
                }
                c1345a.d(1);
                if (H(2)) {
                    StringBuilder p9 = A0.a.p("restoreAllState: back stack #", i13, " (index ");
                    p9.append(c1345a.f18299s);
                    p9.append("): ");
                    p9.append(c1345a);
                    Log.v("FragmentManager", p9.toString());
                    PrintWriter printWriter = new PrintWriter(new X());
                    c1345a.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f18199d.add(c1345a);
                i13++;
            }
        } else {
            this.f18199d = null;
        }
        this.f18204i.set(c1338o.f18224d);
        String str5 = c1338o.f18225e;
        if (str5 != null) {
            AbstractComponentCallbacksC1366v j4 = c1535g.j(str5);
            this.f18218x = j4;
            q(j4);
        }
        ArrayList arrayList5 = c1338o.f18226f;
        if (arrayList5 != null) {
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                this.j.put((String) arrayList5.get(i15), (C1347c) c1338o.f18227g.get(i15));
            }
        }
        this.f18186D = new ArrayDeque(c1338o.f18228h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.os.Parcelable, i0.O, java.lang.Object] */
    public final Bundle V() {
        int i9;
        ArrayList arrayList;
        C1346b[] c1346bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1353i c1353i = (C1353i) it.next();
            if (c1353i.f18337e) {
                if (H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c1353i.f18337e = false;
                c1353i.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C1353i) it2.next()).e();
        }
        x(true);
        this.f18188F = true;
        this.f18194M.f18235i = true;
        C1535g c1535g = this.f18198c;
        c1535g.getClass();
        HashMap hashMap = (HashMap) c1535g.f20183b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (C1343U c1343u : hashMap.values()) {
            if (c1343u != null) {
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1343u.f18251c;
                c1535g.H(abstractComponentCallbacksC1366v.f18389e, c1343u.o());
                arrayList2.add(abstractComponentCallbacksC1366v.f18389e);
                if (H(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC1366v + ": " + abstractComponentCallbacksC1366v.f18386b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f18198c.f20184c;
        if (hashMap2.isEmpty()) {
            if (H(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle;
            }
        } else {
            C1535g c1535g2 = this.f18198c;
            synchronized (((ArrayList) c1535g2.f20182a)) {
                try {
                    if (((ArrayList) c1535g2.f20182a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c1535g2.f20182a).size());
                        ArrayList arrayList3 = (ArrayList) c1535g2.f20182a;
                        int size2 = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = (AbstractComponentCallbacksC1366v) obj;
                            arrayList.add(abstractComponentCallbacksC1366v2.f18389e);
                            if (H(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC1366v2.f18389e + "): " + abstractComponentCallbacksC1366v2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.f18199d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                c1346bArr = new C1346b[size];
                for (i9 = 0; i9 < size; i9++) {
                    c1346bArr[i9] = new C1346b((C1345a) this.f18199d.get(i9));
                    if (H(2)) {
                        StringBuilder p9 = A0.a.p("saveAllState: adding back stack #", i9, ": ");
                        p9.append(this.f18199d.get(i9));
                        Log.v("FragmentManager", p9.toString());
                    }
                }
            } else {
                c1346bArr = null;
            }
            ?? obj2 = new Object();
            obj2.f18225e = null;
            ArrayList arrayList5 = new ArrayList();
            obj2.f18226f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            obj2.f18227g = arrayList6;
            obj2.f18221a = arrayList2;
            obj2.f18222b = arrayList;
            obj2.f18223c = c1346bArr;
            obj2.f18224d = this.f18204i.get();
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v3 = this.f18218x;
            if (abstractComponentCallbacksC1366v3 != null) {
                obj2.f18225e = abstractComponentCallbacksC1366v3.f18389e;
            }
            arrayList5.addAll(this.j.keySet());
            arrayList6.addAll(this.j.values());
            obj2.f18228h = new ArrayList(this.f18186D);
            bundle.putParcelable("state", obj2);
            for (String str : this.f18205k.keySet()) {
                bundle.putBundle(u0.z.e("result_", str), (Bundle) this.f18205k.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(u0.z.e("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final void W() {
        synchronized (this.f18196a) {
            try {
                if (this.f18196a.size() == 1) {
                    this.f18215u.f18428p.removeCallbacks(this.f18195N);
                    this.f18215u.f18428p.post(this.f18195N);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, boolean z9) {
        ViewGroup D8 = D(abstractComponentCallbacksC1366v);
        if (D8 != null && (D8 instanceof FragmentContainerView)) {
            ((FragmentContainerView) D8).setDrawDisappearingViewsLast(!z9);
        }
    }

    public final void Y(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, EnumC0555p enumC0555p) {
        if (abstractComponentCallbacksC1366v.equals(this.f18198c.j(abstractComponentCallbacksC1366v.f18389e)) && (abstractComponentCallbacksC1366v.f18416t == null || abstractComponentCallbacksC1366v.f18414s == this)) {
            abstractComponentCallbacksC1366v.f18402l0 = enumC0555p;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1366v + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        if (abstractComponentCallbacksC1366v != null) {
            if (!abstractComponentCallbacksC1366v.equals(this.f18198c.j(abstractComponentCallbacksC1366v.f18389e)) || (abstractComponentCallbacksC1366v.f18416t != null && abstractComponentCallbacksC1366v.f18414s != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1366v + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = this.f18218x;
        this.f18218x = abstractComponentCallbacksC1366v;
        q(abstractComponentCallbacksC1366v2);
        q(this.f18218x);
    }

    public final C1343U a(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        String str = abstractComponentCallbacksC1366v.f18400k0;
        if (str != null) {
            AbstractC1430d.c(abstractComponentCallbacksC1366v, str);
        }
        if (H(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC1366v);
        }
        C1343U f9 = f(abstractComponentCallbacksC1366v);
        abstractComponentCallbacksC1366v.f18414s = this;
        C1535g c1535g = this.f18198c;
        c1535g.u(f9);
        if (!abstractComponentCallbacksC1366v.f18379A) {
            c1535g.c(abstractComponentCallbacksC1366v);
            abstractComponentCallbacksC1366v.f18401l = false;
            if (abstractComponentCallbacksC1366v.Y == null) {
                abstractComponentCallbacksC1366v.f18395h0 = false;
            }
            if (I(abstractComponentCallbacksC1366v)) {
                this.f18187E = true;
            }
        }
        return f9;
    }

    public final void a0(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        int i9;
        int i10;
        int i11;
        int i12;
        ViewGroup D8 = D(abstractComponentCallbacksC1366v);
        if (D8 != null) {
            C1363s c1363s = abstractComponentCallbacksC1366v.f18393g0;
            boolean z9 = false;
            if (c1363s == null) {
                i9 = 0;
            } else {
                i9 = c1363s.f18368b;
            }
            if (c1363s == null) {
                i10 = 0;
            } else {
                i10 = c1363s.f18369c;
            }
            int i13 = i10 + i9;
            if (c1363s == null) {
                i11 = 0;
            } else {
                i11 = c1363s.f18370d;
            }
            int i14 = i11 + i13;
            if (c1363s == null) {
                i12 = 0;
            } else {
                i12 = c1363s.f18371e;
            }
            if (i12 + i14 > 0) {
                if (D8.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    D8.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC1366v);
                }
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = (AbstractComponentCallbacksC1366v) D8.getTag(R.id.visible_removing_fragment_view_tag);
                C1363s c1363s2 = abstractComponentCallbacksC1366v.f18393g0;
                if (c1363s2 != null) {
                    z9 = c1363s2.f18367a;
                }
                if (abstractComponentCallbacksC1366v2.f18393g0 != null) {
                    abstractComponentCallbacksC1366v2.i().f18367a = z9;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C1368x c1368x, u0 u0Var, AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        String str;
        C1368x c1368x2;
        if (this.f18215u == null) {
            this.f18215u = c1368x;
            this.f18216v = u0Var;
            this.f18217w = abstractComponentCallbacksC1366v;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f18208n;
            if (abstractComponentCallbacksC1366v != 0) {
                copyOnWriteArrayList.add(new C1330G(abstractComponentCallbacksC1366v));
            } else if (c1368x != null) {
                copyOnWriteArrayList.add(c1368x);
            }
            if (this.f18217w != null) {
                e0();
            }
            if (c1368x != null) {
                C1082w L8 = c1368x.f18430r.L();
                this.f18202g = L8;
                if (abstractComponentCallbacksC1366v != 0) {
                    c1368x2 = abstractComponentCallbacksC1366v;
                } else {
                    c1368x2 = c1368x;
                }
                L8.a(c1368x2, this.f18203h);
            }
            if (abstractComponentCallbacksC1366v != 0) {
                C1340Q c1340q = abstractComponentCallbacksC1366v.f18414s.f18194M;
                HashMap hashMap = c1340q.f18231e;
                C1340Q c1340q2 = (C1340Q) hashMap.get(abstractComponentCallbacksC1366v.f18389e);
                if (c1340q2 == null) {
                    c1340q2 = new C1340Q(c1340q.f18233g);
                    hashMap.put(abstractComponentCallbacksC1366v.f18389e, c1340q2);
                }
                this.f18194M = c1340q2;
            } else if (c1368x != null) {
                this.f18194M = (C1340Q) new android.support.v4.media.session.y(c1368x.f18430r.u(), C1340Q.j).J(C1340Q.class);
            } else {
                this.f18194M = new C1340Q(false);
            }
            this.f18194M.f18235i = M();
            this.f18198c.f20185d = this.f18194M;
            C1368x c1368x3 = this.f18215u;
            if (c1368x3 != null && abstractComponentCallbacksC1366v == 0) {
                N0.f c3 = c1368x3.c();
                c3.f("android:support:fragments", new androidx.lifecycle.T(1, this));
                Bundle c9 = c3.c("android:support:fragments");
                if (c9 != null) {
                    U(c9);
                }
            }
            C1368x c1368x4 = this.f18215u;
            if (c1368x4 != null) {
                AbstractActivityC1369y abstractActivityC1369y = c1368x4.f18430r;
                if (abstractComponentCallbacksC1366v != 0) {
                    str = AbstractC0953k1.q(new StringBuilder(), abstractComponentCallbacksC1366v.f18389e, ":");
                } else {
                    str = "";
                }
                String e8 = u0.z.e("FragmentManager:", str);
                String n7 = AbstractC0953k1.n(e8, "StartActivityForResult");
                C1188a c1188a = new C1188a(2);
                C1183o c1183o = new C1183o(3, this);
                C1065f c1065f = abstractActivityC1369y.f16595l;
                this.f18183A = c1065f.d(n7, c1188a, c1183o);
                this.f18184B = c1065f.d(AbstractC0953k1.n(e8, "StartIntentSenderForResult"), new C1188a(3), new com.google.firebase.messaging.u(this));
                this.f18185C = c1065f.d(AbstractC0953k1.n(e8, "RequestPermissions"), new C1188a(0), new i.G(1, this));
            }
            C1368x c1368x5 = this.f18215u;
            if (c1368x5 != null) {
                c1368x5.f18430r.H(this.f18209o);
            }
            C1368x c1368x6 = this.f18215u;
            if (c1368x6 != null) {
                AbstractActivityC1369y abstractActivityC1369y2 = c1368x6.f18430r;
                abstractActivityC1369y2.f16597n.add(this.f18210p);
            }
            C1368x c1368x7 = this.f18215u;
            if (c1368x7 != null) {
                AbstractActivityC1369y abstractActivityC1369y3 = c1368x7.f18430r;
                abstractActivityC1369y3.f16599p.add(this.f18211q);
            }
            C1368x c1368x8 = this.f18215u;
            if (c1368x8 != null) {
                AbstractActivityC1369y abstractActivityC1369y4 = c1368x8.f18430r;
                abstractActivityC1369y4.f16600q.add(this.f18212r);
            }
            C1368x c1368x9 = this.f18215u;
            if (c1368x9 != null && abstractComponentCallbacksC1366v == 0) {
                AbstractActivityC1369y abstractActivityC1369y5 = c1368x9.f18430r;
                C1328E c1328e = this.f18213s;
                android.support.v4.media.session.y yVar = abstractActivityC1369y5.f16587c;
                ((CopyOnWriteArrayList) yVar.f9332c).add(c1328e);
                ((Runnable) yVar.f9331b).run();
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void c(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        if (H(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC1366v);
        }
        if (abstractComponentCallbacksC1366v.f18379A) {
            abstractComponentCallbacksC1366v.f18379A = false;
            if (!abstractComponentCallbacksC1366v.f18399k) {
                this.f18198c.c(abstractComponentCallbacksC1366v);
                if (H(2)) {
                    Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC1366v);
                }
                if (I(abstractComponentCallbacksC1366v)) {
                    this.f18187E = true;
                }
            }
        }
    }

    public final void c0() {
        ArrayList o9 = this.f18198c.o();
        int size = o9.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = o9.get(i9);
            i9++;
            C1343U c1343u = (C1343U) obj;
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1343u.f18251c;
            if (abstractComponentCallbacksC1366v.f18384Z) {
                if (this.f18197b) {
                    this.f18191I = true;
                } else {
                    abstractComponentCallbacksC1366v.f18384Z = false;
                    c1343u.k();
                }
            }
        }
    }

    public final void d() {
        this.f18197b = false;
        this.K.clear();
        this.f18192J.clear();
    }

    public final void d0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new X());
        C1368x c1368x = this.f18215u;
        if (c1368x != null) {
            try {
                c1368x.f18430r.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e8) {
                Log.e("FragmentManager", "Failed dumping state", e8);
                throw runtimeException;
            }
        }
        try {
            u("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e9) {
            Log.e("FragmentManager", "Failed dumping state", e9);
            throw runtimeException;
        }
    }

    public final HashSet e() {
        C1353i c1353i;
        HashSet hashSet = new HashSet();
        ArrayList o9 = this.f18198c.o();
        int size = o9.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = o9.get(i9);
            i9++;
            ViewGroup viewGroup = ((C1343U) obj).f18251c.f18383X;
            if (viewGroup != null) {
                d0.w factory = F();
                kotlin.jvm.internal.h.e(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C1353i) {
                    c1353i = (C1353i) tag;
                } else {
                    c1353i = new C1353i(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c1353i);
                }
                hashSet.add(c1353i);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.g, O7.a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.internal.g, O7.a] */
    public final void e0() {
        int i9;
        synchronized (this.f18196a) {
            try {
                boolean z9 = true;
                if (!this.f18196a.isEmpty()) {
                    C1201C c1201c = this.f18203h;
                    c1201c.f16606a = true;
                    ?? r1 = c1201c.f16608c;
                    if (r1 != 0) {
                        r1.invoke();
                    }
                    return;
                }
                C1201C c1201c2 = this.f18203h;
                ArrayList arrayList = this.f18199d;
                if (arrayList != null) {
                    i9 = arrayList.size();
                } else {
                    i9 = 0;
                }
                if (i9 <= 0 || !L(this.f18217w)) {
                    z9 = false;
                }
                c1201c2.f16606a = z9;
                ?? r0 = c1201c2.f16608c;
                if (r0 != 0) {
                    r0.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1343U f(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        String str = abstractComponentCallbacksC1366v.f18389e;
        C1535g c1535g = this.f18198c;
        C1343U c1343u = (C1343U) ((HashMap) c1535g.f20183b).get(str);
        if (c1343u != null) {
            return c1343u;
        }
        C1343U c1343u2 = new C1343U(this.f18207m, c1535g, abstractComponentCallbacksC1366v);
        c1343u2.m(this.f18215u.f18427o.getClassLoader());
        c1343u2.f18253e = this.f18214t;
        return c1343u2;
    }

    public final void g(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        if (H(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC1366v);
        }
        if (!abstractComponentCallbacksC1366v.f18379A) {
            abstractComponentCallbacksC1366v.f18379A = true;
            if (abstractComponentCallbacksC1366v.f18399k) {
                if (H(2)) {
                    Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC1366v);
                }
                C1535g c1535g = this.f18198c;
                synchronized (((ArrayList) c1535g.f20182a)) {
                    ((ArrayList) c1535g.f20182a).remove(abstractComponentCallbacksC1366v);
                }
                abstractComponentCallbacksC1366v.f18399k = false;
                if (I(abstractComponentCallbacksC1366v)) {
                    this.f18187E = true;
                }
                a0(abstractComponentCallbacksC1366v);
            }
        }
    }

    public final void h(boolean z9, Configuration configuration) {
        if (z9 && this.f18215u != null) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v : this.f18198c.q()) {
            if (abstractComponentCallbacksC1366v != null) {
                abstractComponentCallbacksC1366v.onConfigurationChanged(configuration);
                if (z9) {
                    abstractComponentCallbacksC1366v.f18418u.h(true, configuration);
                }
            }
        }
    }

    public final boolean i() {
        boolean z9;
        if (this.f18214t >= 1) {
            for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v : this.f18198c.q()) {
                if (abstractComponentCallbacksC1366v != null) {
                    if (!abstractComponentCallbacksC1366v.f18423z) {
                        z9 = abstractComponentCallbacksC1366v.f18418u.i();
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        boolean z9;
        if (this.f18214t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v : this.f18198c.q()) {
            if (abstractComponentCallbacksC1366v != null && K(abstractComponentCallbacksC1366v)) {
                if (!abstractComponentCallbacksC1366v.f18423z) {
                    z9 = abstractComponentCallbacksC1366v.f18418u.j();
                } else {
                    z9 = false;
                }
                if (z9) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC1366v);
                    z10 = true;
                }
            }
        }
        if (this.f18200e != null) {
            for (int i9 = 0; i9 < this.f18200e.size(); i9++) {
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = (AbstractComponentCallbacksC1366v) this.f18200e.get(i9);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC1366v2)) {
                    abstractComponentCallbacksC1366v2.getClass();
                }
            }
        }
        this.f18200e = arrayList;
        return z10;
    }

    public final void k() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        this.f18190H = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C1353i) it.next()).e();
        }
        C1368x c1368x = this.f18215u;
        if (c1368x != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        C1535g c1535g = this.f18198c;
        if (z9) {
            z10 = ((C1340Q) c1535g.f20185d).f18234h;
        } else {
            AbstractActivityC1369y abstractActivityC1369y = c1368x.f18427o;
            if (u0.z.i(abstractActivityC1369y)) {
                z10 = !abstractActivityC1369y.isChangingConfigurations();
            } else {
                z10 = true;
            }
        }
        if (z10) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((C1347c) it2.next()).f18315a;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((C1340Q) c1535g.f20185d).e((String) obj, false);
                }
            }
        }
        t(-1);
        C1368x c1368x2 = this.f18215u;
        if (c1368x2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            c1368x2.f18430r.f16597n.remove(this.f18210p);
        }
        C1368x c1368x3 = this.f18215u;
        if (c1368x3 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            c1368x3.f18430r.f16596m.remove(this.f18209o);
        }
        C1368x c1368x4 = this.f18215u;
        if (c1368x4 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            c1368x4.f18430r.f16599p.remove(this.f18211q);
        }
        C1368x c1368x5 = this.f18215u;
        if (c1368x5 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            c1368x5.f18430r.f16600q.remove(this.f18212r);
        }
        C1368x c1368x6 = this.f18215u;
        if (c1368x6 == null) {
            z15 = false;
        }
        if (z15 && this.f18217w == null) {
            AbstractActivityC1369y abstractActivityC1369y2 = c1368x6.f18430r;
            C1328E c1328e = this.f18213s;
            android.support.v4.media.session.y yVar = abstractActivityC1369y2.f16587c;
            ((CopyOnWriteArrayList) yVar.f9332c).remove(c1328e);
            if (((HashMap) yVar.f9333d).remove(c1328e) == null) {
                ((Runnable) yVar.f9331b).run();
            } else {
                throw new ClassCastException();
            }
        }
        this.f18215u = null;
        this.f18216v = null;
        this.f18217w = null;
        if (this.f18202g != null) {
            Iterator it3 = this.f18203h.f16607b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC1062c) it3.next()).cancel();
            }
            this.f18202g = null;
        }
        f.e eVar = this.f18183A;
        if (eVar != null) {
            eVar.b();
            this.f18184B.b();
            this.f18185C.b();
        }
    }

    public final void l(boolean z9) {
        if (z9 && this.f18215u != null) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v : this.f18198c.q()) {
            if (abstractComponentCallbacksC1366v != null) {
                abstractComponentCallbacksC1366v.f18382D = true;
                if (z9) {
                    abstractComponentCallbacksC1366v.f18418u.l(true);
                }
            }
        }
    }

    public final void m(boolean z9) {
        if (z9 && this.f18215u != null) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v : this.f18198c.q()) {
            if (abstractComponentCallbacksC1366v != null && z9) {
                abstractComponentCallbacksC1366v.f18418u.m(true);
            }
        }
    }

    public final void n() {
        ArrayList p9 = this.f18198c.p();
        int size = p9.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = p9.get(i9);
            i9++;
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) obj;
            if (abstractComponentCallbacksC1366v != null) {
                abstractComponentCallbacksC1366v.z();
                abstractComponentCallbacksC1366v.L();
                abstractComponentCallbacksC1366v.f18418u.n();
            }
        }
    }

    public final boolean o() {
        boolean z9;
        if (this.f18214t >= 1) {
            for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v : this.f18198c.q()) {
                if (abstractComponentCallbacksC1366v != null) {
                    if (!abstractComponentCallbacksC1366v.f18423z) {
                        z9 = abstractComponentCallbacksC1366v.f18418u.o();
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f18214t >= 1) {
            for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v : this.f18198c.q()) {
                if (abstractComponentCallbacksC1366v != null && !abstractComponentCallbacksC1366v.f18423z) {
                    abstractComponentCallbacksC1366v.f18418u.p();
                }
            }
        }
    }

    public final void q(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        if (abstractComponentCallbacksC1366v != null) {
            if (abstractComponentCallbacksC1366v.equals(this.f18198c.j(abstractComponentCallbacksC1366v.f18389e))) {
                abstractComponentCallbacksC1366v.f18414s.getClass();
                boolean L8 = L(abstractComponentCallbacksC1366v);
                Boolean bool = abstractComponentCallbacksC1366v.j;
                if (bool == null || bool.booleanValue() != L8) {
                    abstractComponentCallbacksC1366v.j = Boolean.valueOf(L8);
                    C1337N c1337n = abstractComponentCallbacksC1366v.f18418u;
                    c1337n.e0();
                    c1337n.q(c1337n.f18218x);
                }
            }
        }
    }

    public final void r(boolean z9) {
        if (z9 && this.f18215u != null) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v : this.f18198c.q()) {
            if (abstractComponentCallbacksC1366v != null && z9) {
                abstractComponentCallbacksC1366v.f18418u.r(true);
            }
        }
    }

    public final boolean s() {
        boolean z9;
        if (this.f18214t < 1) {
            return false;
        }
        boolean z10 = false;
        for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v : this.f18198c.q()) {
            if (abstractComponentCallbacksC1366v != null && K(abstractComponentCallbacksC1366v)) {
                if (!abstractComponentCallbacksC1366v.f18423z) {
                    z9 = abstractComponentCallbacksC1366v.f18418u.s();
                } else {
                    z9 = false;
                }
                if (z9) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void t(int i9) {
        try {
            this.f18197b = true;
            for (C1343U c1343u : ((HashMap) this.f18198c.f20183b).values()) {
                if (c1343u != null) {
                    c1343u.f18253e = i9;
                }
            }
            N(i9, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C1353i) it.next()).e();
            }
            this.f18197b = false;
            x(true);
        } catch (Throwable th) {
            this.f18197b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18217w;
        if (abstractComponentCallbacksC1366v != null) {
            sb.append(abstractComponentCallbacksC1366v.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f18217w)));
            sb.append("}");
        } else {
            C1368x c1368x = this.f18215u;
            if (c1368x != null) {
                sb.append(c1368x.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f18215u)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String n7 = AbstractC0953k1.n(str, "    ");
        C1535g c1535g = this.f18198c;
        c1535g.getClass();
        String str2 = str + "    ";
        HashMap hashMap = (HashMap) c1535g.f20183b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1343U c1343u : hashMap.values()) {
                printWriter.print(str);
                if (c1343u != null) {
                    AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1343u.f18251c;
                    printWriter.println(abstractComponentCallbacksC1366v);
                    abstractComponentCallbacksC1366v.h(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c1535g.f20182a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i9 = 0; i9 < size3; i9++) {
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = (AbstractComponentCallbacksC1366v) arrayList.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1366v2.toString());
            }
        }
        ArrayList arrayList2 = this.f18200e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v3 = (AbstractComponentCallbacksC1366v) this.f18200e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1366v3.toString());
            }
        }
        ArrayList arrayList3 = this.f18199d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C1345a c1345a = (C1345a) this.f18199d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c1345a.toString());
                c1345a.h(n7, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f18204i.get());
        synchronized (this.f18196a) {
            try {
                int size4 = this.f18196a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (InterfaceC1333J) this.f18196a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f18215u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f18216v);
        if (this.f18217w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f18217w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f18214t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f18188F);
        printWriter.print(" mStopped=");
        printWriter.print(this.f18189G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f18190H);
        if (this.f18187E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f18187E);
        }
    }

    public final void v(InterfaceC1333J interfaceC1333J, boolean z9) {
        if (!z9) {
            if (this.f18215u == null) {
                if (this.f18190H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (M()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f18196a) {
            try {
                if (this.f18215u == null) {
                    if (z9) {
                    } else {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f18196a.add(interfaceC1333J);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z9) {
        if (!this.f18197b) {
            if (this.f18215u == null) {
                if (this.f18190H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.f18215u.f18428p.getLooper()) {
                if (!z9 && M()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.f18192J == null) {
                    this.f18192J = new ArrayList();
                    this.K = new ArrayList();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean x(boolean z9) {
        boolean z10;
        w(z9);
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f18192J;
            ArrayList arrayList2 = this.K;
            synchronized (this.f18196a) {
                if (this.f18196a.isEmpty()) {
                    z10 = false;
                } else {
                    try {
                        int size = this.f18196a.size();
                        z10 = false;
                        for (int i9 = 0; i9 < size; i9++) {
                            z10 |= ((InterfaceC1333J) this.f18196a.get(i9)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z10) {
                break;
            }
            z11 = true;
            this.f18197b = true;
            try {
                T(this.f18192J, this.K);
            } finally {
                d();
            }
        }
        e0();
        if (this.f18191I) {
            this.f18191I = false;
            c0();
        }
        ((HashMap) this.f18198c.f20183b).values().removeAll(Collections.singleton(null));
        return z11;
    }

    public final void y(C1345a c1345a, boolean z9) {
        if (z9 && (this.f18215u == null || this.f18190H)) {
            return;
        }
        w(z9);
        c1345a.a(this.f18192J, this.K);
        this.f18197b = true;
        try {
            T(this.f18192J, this.K);
            d();
            e0();
            if (this.f18191I) {
                this.f18191I = false;
                c0();
            }
            ((HashMap) this.f18198c.f20183b).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:142:0x024f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:176:0x0329. Please report as an issue. */
    public final void z(ArrayList arrayList, ArrayList arrayList2, int i9, int i10) {
        Object obj;
        ViewGroup viewGroup;
        ArrayList arrayList3;
        boolean z9;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        int i14;
        boolean z14 = ((C1345a) arrayList.get(i9)).f18296p;
        ArrayList arrayList4 = this.f18193L;
        if (arrayList4 == null) {
            this.f18193L = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.f18193L;
        C1535g c1535g = this.f18198c;
        arrayList5.addAll(c1535g.q());
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18218x;
        int i15 = i9;
        boolean z15 = false;
        while (true) {
            int i16 = 1;
            if (i15 < i10) {
                C1345a c1345a = (C1345a) arrayList.get(i15);
                if (!((Boolean) arrayList2.get(i15)).booleanValue()) {
                    ArrayList arrayList6 = this.f18193L;
                    int i17 = 0;
                    while (true) {
                        ArrayList arrayList7 = c1345a.f18282a;
                        if (i17 < arrayList7.size()) {
                            C1344V c1344v = (C1344V) arrayList7.get(i17);
                            int i18 = c1344v.f18254a;
                            if (i18 != i16) {
                                z11 = z14;
                                if (i18 != 2) {
                                    if (i18 != 3 && i18 != 6) {
                                        if (i18 != 7) {
                                            if (i18 == 8) {
                                                arrayList7.add(i17, new C1344V(9, abstractComponentCallbacksC1366v, 0));
                                                c1344v.f18256c = true;
                                                i17++;
                                                abstractComponentCallbacksC1366v = c1344v.f18255b;
                                            }
                                        } else {
                                            i12 = 1;
                                        }
                                    } else {
                                        arrayList6.remove(c1344v.f18255b);
                                        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = c1344v.f18255b;
                                        if (abstractComponentCallbacksC1366v2 == abstractComponentCallbacksC1366v) {
                                            arrayList7.add(i17, new C1344V(9, abstractComponentCallbacksC1366v2));
                                            i17++;
                                            i13 = i15;
                                            z12 = z15;
                                            i12 = 1;
                                            abstractComponentCallbacksC1366v = null;
                                        }
                                    }
                                    i13 = i15;
                                    z12 = z15;
                                    i12 = 1;
                                } else {
                                    AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v3 = c1344v.f18255b;
                                    int i19 = abstractComponentCallbacksC1366v3.f18421x;
                                    int size = arrayList6.size() - 1;
                                    boolean z16 = false;
                                    while (size >= 0) {
                                        int i20 = size;
                                        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v4 = (AbstractComponentCallbacksC1366v) arrayList6.get(size);
                                        int i21 = i15;
                                        if (abstractComponentCallbacksC1366v4.f18421x == i19) {
                                            if (abstractComponentCallbacksC1366v4 == abstractComponentCallbacksC1366v3) {
                                                z13 = z15;
                                                z16 = true;
                                            } else {
                                                if (abstractComponentCallbacksC1366v4 == abstractComponentCallbacksC1366v) {
                                                    z13 = z15;
                                                    i14 = 0;
                                                    arrayList7.add(i17, new C1344V(9, abstractComponentCallbacksC1366v4, 0));
                                                    i17++;
                                                    abstractComponentCallbacksC1366v = null;
                                                } else {
                                                    z13 = z15;
                                                    i14 = 0;
                                                }
                                                C1344V c1344v2 = new C1344V(3, abstractComponentCallbacksC1366v4, i14);
                                                c1344v2.f18257d = c1344v.f18257d;
                                                c1344v2.f18259f = c1344v.f18259f;
                                                c1344v2.f18258e = c1344v.f18258e;
                                                c1344v2.f18260g = c1344v.f18260g;
                                                arrayList7.add(i17, c1344v2);
                                                arrayList6.remove(abstractComponentCallbacksC1366v4);
                                                i17++;
                                                abstractComponentCallbacksC1366v = abstractComponentCallbacksC1366v;
                                            }
                                        } else {
                                            z13 = z15;
                                        }
                                        size = i20 - 1;
                                        z15 = z13;
                                        i15 = i21;
                                    }
                                    i13 = i15;
                                    z12 = z15;
                                    i12 = 1;
                                    if (z16) {
                                        arrayList7.remove(i17);
                                        i17--;
                                    } else {
                                        c1344v.f18254a = 1;
                                        c1344v.f18256c = true;
                                        arrayList6.add(abstractComponentCallbacksC1366v3);
                                    }
                                }
                                i17 += i12;
                                i16 = i12;
                                z14 = z11;
                                z15 = z12;
                                i15 = i13;
                            } else {
                                z11 = z14;
                                i12 = i16;
                            }
                            i13 = i15;
                            z12 = z15;
                            arrayList6.add(c1344v.f18255b);
                            i17 += i12;
                            i16 = i12;
                            z14 = z11;
                            z15 = z12;
                            i15 = i13;
                        } else {
                            z9 = z14;
                            i11 = i15;
                            z10 = z15;
                        }
                    }
                } else {
                    z9 = z14;
                    i11 = i15;
                    z10 = z15;
                    int i22 = 1;
                    ArrayList arrayList8 = this.f18193L;
                    ArrayList arrayList9 = c1345a.f18282a;
                    int size2 = arrayList9.size() - 1;
                    while (size2 >= 0) {
                        C1344V c1344v3 = (C1344V) arrayList9.get(size2);
                        int i23 = c1344v3.f18254a;
                        if (i23 != i22) {
                            if (i23 != 3) {
                                switch (i23) {
                                    case 8:
                                        abstractComponentCallbacksC1366v = null;
                                        break;
                                    case 9:
                                        abstractComponentCallbacksC1366v = c1344v3.f18255b;
                                        break;
                                    case R.styleable.GradientColor_android_endX /* 10 */:
                                        c1344v3.f18262i = c1344v3.f18261h;
                                        break;
                                }
                                size2--;
                                i22 = 1;
                            }
                            arrayList8.add(c1344v3.f18255b);
                            size2--;
                            i22 = 1;
                        }
                        arrayList8.remove(c1344v3.f18255b);
                        size2--;
                        i22 = 1;
                    }
                }
                if (!z10 && !c1345a.f18288g) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                i15 = i11 + 1;
                z14 = z9;
            } else {
                boolean z17 = z14;
                boolean z18 = z15;
                this.f18193L.clear();
                if (!z17 && this.f18214t >= 1) {
                    for (int i24 = i9; i24 < i10; i24++) {
                        ArrayList arrayList10 = ((C1345a) arrayList.get(i24)).f18282a;
                        int size3 = arrayList10.size();
                        int i25 = 0;
                        while (i25 < size3) {
                            Object obj2 = arrayList10.get(i25);
                            i25++;
                            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v5 = ((C1344V) obj2).f18255b;
                            if (abstractComponentCallbacksC1366v5 != null && abstractComponentCallbacksC1366v5.f18414s != null) {
                                c1535g.u(f(abstractComponentCallbacksC1366v5));
                            }
                        }
                    }
                }
                for (int i26 = i9; i26 < i10; i26++) {
                    C1345a c1345a2 = (C1345a) arrayList.get(i26);
                    if (((Boolean) arrayList2.get(i26)).booleanValue()) {
                        c1345a2.d(-1);
                        ArrayList arrayList11 = c1345a2.f18282a;
                        for (int size4 = arrayList11.size() - 1; size4 >= 0; size4--) {
                            C1344V c1344v4 = (C1344V) arrayList11.get(size4);
                            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v6 = c1344v4.f18255b;
                            if (abstractComponentCallbacksC1366v6 != null) {
                                abstractComponentCallbacksC1366v6.f18403m = c1345a2.f18300t;
                                if (abstractComponentCallbacksC1366v6.f18393g0 != null) {
                                    abstractComponentCallbacksC1366v6.i().f18367a = true;
                                }
                                int i27 = c1345a2.f18287f;
                                int i28 = 8194;
                                int i29 = 4097;
                                if (i27 != 4097) {
                                    if (i27 != 8194) {
                                        i28 = 4100;
                                        i29 = 8197;
                                        if (i27 != 8197) {
                                            if (i27 != 4099) {
                                                if (i27 != 4100) {
                                                    i28 = 0;
                                                }
                                            } else {
                                                i28 = 4099;
                                            }
                                        }
                                    }
                                    i28 = i29;
                                }
                                if (abstractComponentCallbacksC1366v6.f18393g0 != null || i28 != 0) {
                                    abstractComponentCallbacksC1366v6.i();
                                    abstractComponentCallbacksC1366v6.f18393g0.f18372f = i28;
                                }
                                abstractComponentCallbacksC1366v6.i();
                                abstractComponentCallbacksC1366v6.f18393g0.getClass();
                            }
                            int i30 = c1344v4.f18254a;
                            AbstractC1336M abstractC1336M = c1345a2.f18297q;
                            switch (i30) {
                                case 1:
                                    abstractComponentCallbacksC1366v6.b0(c1344v4.f18257d, c1344v4.f18258e, c1344v4.f18259f, c1344v4.f18260g);
                                    abstractC1336M.X(abstractComponentCallbacksC1366v6, true);
                                    abstractC1336M.S(abstractComponentCallbacksC1366v6);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c1344v4.f18254a);
                                case 3:
                                    abstractComponentCallbacksC1366v6.b0(c1344v4.f18257d, c1344v4.f18258e, c1344v4.f18259f, c1344v4.f18260g);
                                    abstractC1336M.a(abstractComponentCallbacksC1366v6);
                                case 4:
                                    abstractComponentCallbacksC1366v6.b0(c1344v4.f18257d, c1344v4.f18258e, c1344v4.f18259f, c1344v4.f18260g);
                                    abstractC1336M.getClass();
                                    b0(abstractComponentCallbacksC1366v6);
                                case 5:
                                    abstractComponentCallbacksC1366v6.b0(c1344v4.f18257d, c1344v4.f18258e, c1344v4.f18259f, c1344v4.f18260g);
                                    abstractC1336M.X(abstractComponentCallbacksC1366v6, true);
                                    abstractC1336M.G(abstractComponentCallbacksC1366v6);
                                case 6:
                                    abstractComponentCallbacksC1366v6.b0(c1344v4.f18257d, c1344v4.f18258e, c1344v4.f18259f, c1344v4.f18260g);
                                    abstractC1336M.c(abstractComponentCallbacksC1366v6);
                                case 7:
                                    abstractComponentCallbacksC1366v6.b0(c1344v4.f18257d, c1344v4.f18258e, c1344v4.f18259f, c1344v4.f18260g);
                                    abstractC1336M.X(abstractComponentCallbacksC1366v6, true);
                                    abstractC1336M.g(abstractComponentCallbacksC1366v6);
                                case 8:
                                    abstractC1336M.Z(null);
                                case 9:
                                    abstractC1336M.Z(abstractComponentCallbacksC1366v6);
                                case R.styleable.GradientColor_android_endX /* 10 */:
                                    abstractC1336M.Y(abstractComponentCallbacksC1366v6, c1344v4.f18261h);
                            }
                        }
                    } else {
                        c1345a2.d(1);
                        ArrayList arrayList12 = c1345a2.f18282a;
                        int size5 = arrayList12.size();
                        for (int i31 = 0; i31 < size5; i31++) {
                            C1344V c1344v5 = (C1344V) arrayList12.get(i31);
                            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v7 = c1344v5.f18255b;
                            if (abstractComponentCallbacksC1366v7 != null) {
                                abstractComponentCallbacksC1366v7.f18403m = c1345a2.f18300t;
                                if (abstractComponentCallbacksC1366v7.f18393g0 != null) {
                                    abstractComponentCallbacksC1366v7.i().f18367a = false;
                                }
                                int i32 = c1345a2.f18287f;
                                if (abstractComponentCallbacksC1366v7.f18393g0 != null || i32 != 0) {
                                    abstractComponentCallbacksC1366v7.i();
                                    abstractComponentCallbacksC1366v7.f18393g0.f18372f = i32;
                                }
                                abstractComponentCallbacksC1366v7.i();
                                abstractComponentCallbacksC1366v7.f18393g0.getClass();
                            }
                            int i33 = c1344v5.f18254a;
                            AbstractC1336M abstractC1336M2 = c1345a2.f18297q;
                            switch (i33) {
                                case 1:
                                    abstractComponentCallbacksC1366v7.b0(c1344v5.f18257d, c1344v5.f18258e, c1344v5.f18259f, c1344v5.f18260g);
                                    abstractC1336M2.X(abstractComponentCallbacksC1366v7, false);
                                    abstractC1336M2.a(abstractComponentCallbacksC1366v7);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c1344v5.f18254a);
                                case 3:
                                    abstractComponentCallbacksC1366v7.b0(c1344v5.f18257d, c1344v5.f18258e, c1344v5.f18259f, c1344v5.f18260g);
                                    abstractC1336M2.S(abstractComponentCallbacksC1366v7);
                                case 4:
                                    abstractComponentCallbacksC1366v7.b0(c1344v5.f18257d, c1344v5.f18258e, c1344v5.f18259f, c1344v5.f18260g);
                                    abstractC1336M2.G(abstractComponentCallbacksC1366v7);
                                case 5:
                                    abstractComponentCallbacksC1366v7.b0(c1344v5.f18257d, c1344v5.f18258e, c1344v5.f18259f, c1344v5.f18260g);
                                    abstractC1336M2.X(abstractComponentCallbacksC1366v7, false);
                                    b0(abstractComponentCallbacksC1366v7);
                                case 6:
                                    abstractComponentCallbacksC1366v7.b0(c1344v5.f18257d, c1344v5.f18258e, c1344v5.f18259f, c1344v5.f18260g);
                                    abstractC1336M2.g(abstractComponentCallbacksC1366v7);
                                case 7:
                                    abstractComponentCallbacksC1366v7.b0(c1344v5.f18257d, c1344v5.f18258e, c1344v5.f18259f, c1344v5.f18260g);
                                    abstractC1336M2.X(abstractComponentCallbacksC1366v7, false);
                                    abstractC1336M2.c(abstractComponentCallbacksC1366v7);
                                case 8:
                                    abstractC1336M2.Z(abstractComponentCallbacksC1366v7);
                                case 9:
                                    abstractC1336M2.Z(null);
                                case R.styleable.GradientColor_android_endX /* 10 */:
                                    abstractC1336M2.Y(abstractComponentCallbacksC1366v7, c1344v5.f18262i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
                if (z18 && (arrayList3 = this.f18206l) != null && !arrayList3.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int size6 = arrayList.size();
                    int i34 = 0;
                    while (i34 < size6) {
                        Object obj3 = arrayList.get(i34);
                        i34++;
                        C1345a c1345a3 = (C1345a) obj3;
                        HashSet hashSet = new HashSet();
                        for (int i35 = 0; i35 < c1345a3.f18282a.size(); i35++) {
                            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v8 = ((C1344V) c1345a3.f18282a.get(i35)).f18255b;
                            if (abstractComponentCallbacksC1366v8 != null && c1345a3.f18288g) {
                                hashSet.add(abstractComponentCallbacksC1366v8);
                            }
                        }
                        linkedHashSet.addAll(hashSet);
                    }
                    ArrayList arrayList13 = this.f18206l;
                    int size7 = arrayList13.size();
                    int i36 = 0;
                    while (i36 < size7) {
                        Object obj4 = arrayList13.get(i36);
                        i36++;
                        InterfaceC1332I interfaceC1332I = (InterfaceC1332I) obj4;
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            interfaceC1332I.c((AbstractComponentCallbacksC1366v) it.next(), booleanValue);
                        }
                    }
                    ArrayList arrayList14 = this.f18206l;
                    int size8 = arrayList14.size();
                    int i37 = 0;
                    while (i37 < size8) {
                        Object obj5 = arrayList14.get(i37);
                        i37++;
                        InterfaceC1332I interfaceC1332I2 = (InterfaceC1332I) obj5;
                        Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            interfaceC1332I2.a((AbstractComponentCallbacksC1366v) it2.next(), booleanValue);
                        }
                    }
                }
                for (int i38 = i9; i38 < i10; i38++) {
                    C1345a c1345a4 = (C1345a) arrayList.get(i38);
                    if (booleanValue) {
                        for (int size9 = c1345a4.f18282a.size() - 1; size9 >= 0; size9--) {
                            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v9 = ((C1344V) c1345a4.f18282a.get(size9)).f18255b;
                            if (abstractComponentCallbacksC1366v9 != null) {
                                f(abstractComponentCallbacksC1366v9).k();
                            }
                        }
                    } else {
                        ArrayList arrayList15 = c1345a4.f18282a;
                        int size10 = arrayList15.size();
                        int i39 = 0;
                        while (i39 < size10) {
                            Object obj6 = arrayList15.get(i39);
                            i39++;
                            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v10 = ((C1344V) obj6).f18255b;
                            if (abstractComponentCallbacksC1366v10 != null) {
                                f(abstractComponentCallbacksC1366v10).k();
                            }
                        }
                    }
                }
                N(this.f18214t, true);
                HashSet hashSet2 = new HashSet();
                for (int i40 = i9; i40 < i10; i40++) {
                    ArrayList arrayList16 = ((C1345a) arrayList.get(i40)).f18282a;
                    int size11 = arrayList16.size();
                    int i41 = 0;
                    while (i41 < size11) {
                        Object obj7 = arrayList16.get(i41);
                        i41++;
                        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v11 = ((C1344V) obj7).f18255b;
                        if (abstractComponentCallbacksC1366v11 != null && (viewGroup = abstractComponentCallbacksC1366v11.f18383X) != null) {
                            hashSet2.add(C1353i.f(viewGroup, this));
                        }
                    }
                }
                Iterator it3 = hashSet2.iterator();
                while (it3.hasNext()) {
                    C1353i c1353i = (C1353i) it3.next();
                    c1353i.f18336d = booleanValue;
                    synchronized (c1353i.f18334b) {
                        try {
                            c1353i.g();
                            ArrayList arrayList17 = c1353i.f18334b;
                            ListIterator listIterator = arrayList17.listIterator(arrayList17.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    obj = listIterator.previous();
                                    Z z19 = (Z) obj;
                                    View view = z19.f18276c.Y;
                                    kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
                                    char c3 = 4;
                                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                        int visibility = view.getVisibility();
                                        if (visibility != 0) {
                                            if (visibility != 4) {
                                                if (visibility == 8) {
                                                    c3 = 3;
                                                } else {
                                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                                }
                                            }
                                        } else {
                                            c3 = 2;
                                        }
                                    }
                                    if (z19.f18274a != 2 || c3 == 2) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            c1353i.f18337e = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c1353i.c();
                }
                for (int i42 = i9; i42 < i10; i42++) {
                    C1345a c1345a5 = (C1345a) arrayList.get(i42);
                    if (((Boolean) arrayList2.get(i42)).booleanValue() && c1345a5.f18299s >= 0) {
                        c1345a5.f18299s = -1;
                    }
                    c1345a5.getClass();
                }
                if (z18 && this.f18206l != null) {
                    for (int i43 = 0; i43 < this.f18206l.size(); i43++) {
                        ((InterfaceC1332I) this.f18206l.get(i43)).b();
                    }
                    return;
                }
                return;
            }
        }
    }
}
