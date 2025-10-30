package com.anilab.android.ui.mal;

import A7.e;
import A7.f;
import B6.u0;
import C3.v;
import F0.S;
import F0.j0;
import J1.AbstractC0166c0;
import J5.i;
import J5.j;
import J5.k;
import M1.n;
import N1.t;
import W.g;
import Y2.r;
import Z0.a;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import c2.AbstractC0757c;
import c2.C0762h;
import c2.C0768n;
import c2.C0772r;
import co.notix.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class MalSyncFragment extends AbstractC0757c<C0772r, AbstractC0166c0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13784D0;

    public MalSyncFragment() {
        e p9 = a.p(f.f545a, new N1.r(27, new N1.r(26, this)));
        this.f13784D0 = M4.a.i(this, p.a(C0772r.class), new C0762h(p9, 4), new C0762h(p9, 5), new t(this, p9, 17));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_mal_sync;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (C0772r) this.f13784D0.getValue();
    }

    @Override // M1.n
    public final void k0(int i9) {
        if (i9 == R.id.buttonBack) {
            n.q0(this);
        }
    }

    @Override // M1.n
    public final List m0(g gVar) {
        return u0.D(((AbstractC0166c0) gVar).f3875v);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        int i9;
        View view = ((AbstractC0166c0) e0()).f3876w.f7853k;
        h.d(view, "getRoot(...)");
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        view.setVisibility(i9);
    }

    @Override // M1.n
    public final void p0() {
        AbstractC0166c0 abstractC0166c0 = (AbstractC0166c0) e0();
        abstractC0166c0.f3877x.setAdapter(new C0768n(this));
        AbstractC0166c0 abstractC0166c02 = (AbstractC0166c0) e0();
        AbstractC0166c0 abstractC0166c03 = (AbstractC0166c0) e0();
        v vVar = new v(14, this);
        TabLayout tabLayout = abstractC0166c02.f3878y;
        ViewPager2 viewPager2 = abstractC0166c03.f3877x;
        k kVar = new k(tabLayout, viewPager2, vVar);
        if (!kVar.f4223a) {
            S adapter = viewPager2.getAdapter();
            kVar.f4227e = adapter;
            if (adapter != null) {
                kVar.f4223a = true;
                ((ArrayList) viewPager2.f10394c.f8284b).add(new i(tabLayout));
                tabLayout.a(new j(0, viewPager2));
                ((S) kVar.f4227e).m(new j0(1, kVar));
                kVar.d();
                tabLayout.l(viewPager2.getCurrentItem(), 0.0f, true, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }
}
