package c2;

import F0.S;
import F0.j0;
import F0.r0;
import P.Q;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.C0547h;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0555p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b5.G1;
import c1.C0752a;
import c1.C0753b;
import c1.C0754c;
import com.anilab.android.ui.mal.MalSyncFragment;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1326C;
import i0.C1343U;
import i0.C1345a;
import i0.C1365u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import s.C1931a;
import s.C1936f;
import s.C1937g;

/* renamed from: c2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768n extends S {

    /* renamed from: d, reason: collision with root package name */
    public final D.n f11625d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1336M f11626e;

    /* renamed from: f, reason: collision with root package name */
    public final C1937g f11627f;

    /* renamed from: g, reason: collision with root package name */
    public final C1937g f11628g;

    /* renamed from: h, reason: collision with root package name */
    public final C1937g f11629h;

    /* renamed from: i, reason: collision with root package name */
    public C0753b f11630i;
    public final C0752a j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11631k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11632l;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, c1.a] */
    public C0768n(MalSyncFragment malSyncFragment) {
        AbstractC1336M l9 = malSyncFragment.l();
        C0563y c0563y = malSyncFragment.f18404m0;
        this.f11627f = new C1937g();
        this.f11628g = new C1937g();
        this.f11629h = new C1937g();
        ?? obj = new Object();
        obj.f11587a = new CopyOnWriteArrayList();
        this.j = obj;
        this.f11631k = false;
        this.f11632l = false;
        this.f11626e = l9;
        this.f11625d = c0563y;
        if (!this.f2055a.a()) {
            this.f2056b = true;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public static void n(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public static boolean o(long j) {
        if (j >= 0 && j < 2) {
            return true;
        }
        return false;
    }

    @Override // F0.S
    public final int a() {
        return 2;
    }

    @Override // F0.S
    public final long b(int i9) {
        return i9;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, c1.b] */
    @Override // F0.S
    public final void f(RecyclerView recyclerView) {
        if (this.f11630i == null) {
            ?? obj = new Object();
            obj.f11593f = this;
            obj.f11588a = -1L;
            this.f11630i = obj;
            ViewPager2 a5 = C0753b.a(recyclerView);
            obj.f11592e = a5;
            X1.p pVar = new X1.p(1, obj);
            obj.f11589b = pVar;
            ((ArrayList) a5.f10394c.f8284b).add(pVar);
            j0 j0Var = new j0(2, obj);
            obj.f11590c = j0Var;
            m(j0Var);
            N0.b bVar = new N0.b(3, obj);
            obj.f11591d = bVar;
            this.f11625d.V(bVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        AbstractComponentCallbacksC1366v c0766l;
        Bundle bundle;
        C0754c c0754c = (C0754c) r0Var;
        long j = c0754c.f2214e;
        FrameLayout frameLayout = (FrameLayout) c0754c.f2210a;
        int id = frameLayout.getId();
        Long q9 = q(id);
        C1937g c1937g = this.f11629h;
        if (q9 != null && q9.longValue() != j) {
            s(q9.longValue());
            c1937g.l(q9.longValue());
        }
        c1937g.k(j, Integer.valueOf(id));
        long j4 = i9;
        C1937g c1937g2 = this.f11627f;
        if (c1937g2.i(j4) < 0) {
            if (i9 == 1) {
                c0766l = new C0763i();
            } else {
                c0766l = new C0766l();
            }
            C1365u c1365u = (C1365u) this.f11628g.f(j4);
            if (c0766l.f18414s == null) {
                if (c1365u == null || (bundle = c1365u.f18377a) == null) {
                    bundle = null;
                }
                c0766l.f18386b = bundle;
                c1937g2.k(j4, c0766l);
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        WeakHashMap weakHashMap = Q.f5546a;
        if (frameLayout.isAttachedToWindow()) {
            r(c0754c);
        }
        p();
    }

    @Override // F0.S
    public final r0 h(ViewGroup viewGroup, int i9) {
        int i10 = C0754c.f11594u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = Q.f5546a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new r0(frameLayout);
    }

    @Override // F0.S
    public final void i(RecyclerView recyclerView) {
        C0753b c0753b = this.f11630i;
        c0753b.getClass();
        ViewPager2 a5 = C0753b.a(recyclerView);
        ((ArrayList) a5.f10394c.f8284b).remove((X1.p) c0753b.f11589b);
        j0 j0Var = (j0) c0753b.f11590c;
        C0768n c0768n = (C0768n) c0753b.f11593f;
        c0768n.f2055a.unregisterObserver(j0Var);
        c0768n.f11625d.g0((N0.b) c0753b.f11591d);
        c0753b.f11592e = null;
        this.f11630i = null;
    }

    @Override // F0.S
    public final /* bridge */ /* synthetic */ boolean j(r0 r0Var) {
        return true;
    }

    @Override // F0.S
    public final void k(r0 r0Var) {
        r((C0754c) r0Var);
        p();
    }

    @Override // F0.S
    public final void l(r0 r0Var) {
        Long q9 = q(((FrameLayout) ((C0754c) r0Var).f2210a).getId());
        if (q9 != null) {
            s(q9.longValue());
            this.f11629h.l(q9.longValue());
        }
    }

    public final void p() {
        C1937g c1937g;
        C1937g c1937g2;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v;
        View view;
        if (this.f11632l && !this.f11626e.M()) {
            C1936f c1936f = new C1936f(0);
            int i9 = 0;
            while (true) {
                c1937g = this.f11627f;
                int m9 = c1937g.m();
                c1937g2 = this.f11629h;
                if (i9 >= m9) {
                    break;
                }
                long j = c1937g.j(i9);
                if (!o(j)) {
                    c1936f.add(Long.valueOf(j));
                    c1937g2.l(j);
                }
                i9++;
            }
            if (!this.f11631k) {
                this.f11632l = false;
                for (int i10 = 0; i10 < c1937g.m(); i10++) {
                    long j4 = c1937g.j(i10);
                    if (c1937g2.i(j4) < 0 && ((abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) c1937g.f(j4)) == null || (view = abstractComponentCallbacksC1366v.Y) == null || view.getParent() == null)) {
                        c1936f.add(Long.valueOf(j4));
                    }
                }
            }
            C1931a c1931a = new C1931a(c1936f);
            while (c1931a.hasNext()) {
                s(((Long) c1931a.next()).longValue());
            }
        }
    }

    public final Long q(int i9) {
        Long l9 = null;
        int i10 = 0;
        while (true) {
            C1937g c1937g = this.f11629h;
            if (i10 < c1937g.m()) {
                if (((Integer) c1937g.n(i10)).intValue() == i9) {
                    if (l9 == null) {
                        l9 = Long.valueOf(c1937g.j(i10));
                    } else {
                        throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    }
                }
                i10++;
            } else {
                return l9;
            }
        }
    }

    public final void r(C0754c c0754c) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) this.f11627f.f(c0754c.f2214e);
        if (abstractComponentCallbacksC1366v != null) {
            FrameLayout frameLayout = (FrameLayout) c0754c.f2210a;
            View view = abstractComponentCallbacksC1366v.Y;
            if (!abstractComponentCallbacksC1366v.y() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            boolean y9 = abstractComponentCallbacksC1366v.y();
            AbstractC1336M abstractC1336M = this.f11626e;
            if (y9 && view == null) {
                ((CopyOnWriteArrayList) abstractC1336M.f18207m.f5263b).add(new C1326C(new G1(this, abstractComponentCallbacksC1366v, frameLayout, 2)));
                return;
            }
            if (abstractComponentCallbacksC1366v.y() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    n(view, frameLayout);
                    return;
                }
                return;
            }
            if (abstractComponentCallbacksC1366v.y()) {
                n(view, frameLayout);
                return;
            }
            if (!abstractC1336M.M()) {
                ((CopyOnWriteArrayList) abstractC1336M.f18207m.f5263b).add(new C1326C(new G1(this, abstractComponentCallbacksC1366v, frameLayout, 2)));
                C0752a c0752a = this.j;
                c0752a.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = c0752a.f11587a.iterator();
                if (!it.hasNext()) {
                    try {
                        if (abstractComponentCallbacksC1366v.f18381C) {
                            abstractComponentCallbacksC1366v.f18381C = false;
                        }
                        C1345a c1345a = new C1345a(abstractC1336M);
                        c1345a.g(0, abstractComponentCallbacksC1366v, "f" + c0754c.f2214e, 1);
                        c1345a.j(abstractComponentCallbacksC1366v, EnumC0555p.f9896d);
                        c1345a.f();
                        this.f11630i.b(false);
                        return;
                    } finally {
                        C0752a.a(arrayList);
                    }
                }
                throw A0.a.h(it);
            }
            if (abstractC1336M.f18190H) {
                return;
            }
            this.f11625d.V(new C0547h(this, c0754c));
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void s(long j) {
        ViewParent parent;
        C1937g c1937g = this.f11627f;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) c1937g.f(j);
        if (abstractComponentCallbacksC1366v == null) {
            return;
        }
        View view = abstractComponentCallbacksC1366v.Y;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean o9 = o(j);
        C1937g c1937g2 = this.f11628g;
        if (!o9) {
            c1937g2.l(j);
        }
        if (!abstractComponentCallbacksC1366v.y()) {
            c1937g.l(j);
            return;
        }
        AbstractC1336M abstractC1336M = this.f11626e;
        if (abstractC1336M.M()) {
            this.f11632l = true;
            return;
        }
        boolean y9 = abstractComponentCallbacksC1366v.y();
        C0752a c0752a = this.j;
        if (y9 && o(j)) {
            c0752a.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = c0752a.f11587a.iterator();
            if (!it.hasNext()) {
                C1343U c1343u = (C1343U) ((HashMap) abstractC1336M.f18198c.f20183b).get(abstractComponentCallbacksC1366v.f18389e);
                C1365u c1365u = null;
                if (c1343u != null) {
                    AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = c1343u.f18251c;
                    if (abstractComponentCallbacksC1366v2.equals(abstractComponentCallbacksC1366v)) {
                        if (abstractComponentCallbacksC1366v2.f18385a > -1) {
                            c1365u = new C1365u(c1343u.o());
                        }
                        C0752a.a(arrayList);
                        c1937g2.k(j, c1365u);
                    }
                }
                abstractC1336M.d0(new IllegalStateException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " is not currently in the FragmentManager")));
                throw null;
            }
            throw A0.a.h(it);
        }
        c0752a.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = c0752a.f11587a.iterator();
        if (!it2.hasNext()) {
            try {
                C1345a c1345a = new C1345a(abstractC1336M);
                c1345a.i(abstractComponentCallbacksC1366v);
                c1345a.f();
                c1937g.l(j);
                return;
            } finally {
                C0752a.a(arrayList2);
            }
        }
        throw A0.a.h(it2);
    }
}
