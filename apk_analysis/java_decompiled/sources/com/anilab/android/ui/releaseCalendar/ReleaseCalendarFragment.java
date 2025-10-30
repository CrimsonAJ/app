package com.anilab.android.ui.releaseCalendar;

import A7.e;
import A7.f;
import A7.l;
import B6.u0;
import F0.j0;
import G0.C0142h;
import J1.AbstractC0200s0;
import N1.t;
import W.g;
import Y2.r;
import Y7.B;
import Z0.a;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.Y;
import c2.C0762h;
import co.notix.R;
import com.anilab.android.ui.main.HostFragment;
import com.anilab.android.ui.releaseCalendar.ReleaseCalendarFragment;
import i0.AbstractComponentCallbacksC1366v;
import java.util.List;
import k2.C1484b;
import k2.c;
import k2.i;
import k2.k;
import k2.m;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class ReleaseCalendarFragment extends c<m, AbstractC0200s0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13825D0;

    /* renamed from: E0, reason: collision with root package name */
    public final l f13826E0;

    /* renamed from: F0, reason: collision with root package name */
    public final l f13827F0;

    public ReleaseCalendarFragment() {
        e p9 = a.p(f.f545a, new e2.e(9, new e2.e(8, this)));
        this.f13825D0 = M4.a.i(this, p.a(m.class), new C0762h(p9, 20), new C0762h(p9, 21), new t(this, p9, 25));
        final int i9 = 0;
        this.f13826E0 = a.q(new O7.a(this) { // from class: k2.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReleaseCalendarFragment f19895b;

            {
                this.f19895b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return new C1484b(new C0142h(1, this.f19895b, ReleaseCalendarFragment.class, "onCalendarClick", "onCalendarClick(Lcom/anilab/domain/model/CalendarItem;)V", 0, 6));
                    default:
                        ReleaseCalendarFragment releaseCalendarFragment = this.f19895b;
                        return new f(releaseCalendarFragment.h0().f19908g.f5769a.b(), new C0142h(1, releaseCalendarFragment, ReleaseCalendarFragment.class, "onItemClick", "onItemClick(Lcom/anilab/domain/model/Movie;)V", 0, 7), new N1.i(2, releaseCalendarFragment, ReleaseCalendarFragment.class, "onUpdateWatchList", "onUpdateWatchList(Lcom/anilab/domain/model/Movie;Z)V", 0, 1));
                }
            }
        });
        final int i10 = 1;
        this.f13827F0 = a.q(new O7.a(this) { // from class: k2.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReleaseCalendarFragment f19895b;

            {
                this.f19895b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new C1484b(new C0142h(1, this.f19895b, ReleaseCalendarFragment.class, "onCalendarClick", "onCalendarClick(Lcom/anilab/domain/model/CalendarItem;)V", 0, 6));
                    default:
                        ReleaseCalendarFragment releaseCalendarFragment = this.f19895b;
                        return new f(releaseCalendarFragment.h0().f19908g.f5769a.b(), new C0142h(1, releaseCalendarFragment, ReleaseCalendarFragment.class, "onItemClick", "onItemClick(Lcom/anilab/domain/model/Movie;)V", 0, 7), new N1.i(2, releaseCalendarFragment, ReleaseCalendarFragment.class, "onUpdateWatchList", "onUpdateWatchList(Lcom/anilab/domain/model/Movie;Z)V", 0, 1));
                }
            }
        });
    }

    @Override // M1.n, i0.AbstractComponentCallbacksC1366v
    public final void O() {
        super.O();
        s0().d();
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_release_calendar;
    }

    @Override // M1.n
    public final void k0(int i9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v;
        HostFragment hostFragment;
        if (i9 == R.id.buttonSearch) {
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = this.f18419v;
            if (abstractComponentCallbacksC1366v2 != null) {
                abstractComponentCallbacksC1366v = abstractComponentCallbacksC1366v2.f18419v;
            } else {
                abstractComponentCallbacksC1366v = null;
            }
            if (abstractComponentCallbacksC1366v instanceof HostFragment) {
                hostFragment = (HostFragment) abstractComponentCallbacksC1366v;
            } else {
                hostFragment = null;
            }
            if (hostFragment != null) {
                hostFragment.i0(R.id.goToSearch, null);
            }
        }
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new i(this, null), 3);
        m h02 = h0();
        if (((List) h02.f19911k.h()) != null && (!r1.isEmpty())) {
            return;
        }
        h02.d(true, new k(h02, null));
    }

    @Override // M1.n
    public final List m0(g gVar) {
        return u0.D(((AbstractC0200s0) gVar).f4074v);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        InterfaceC0561w interfaceC0561w;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18419v;
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
            hostFragment.n0(z9);
        }
    }

    @Override // M1.n
    public final void p0() {
        s0().m(new j0(3, this));
        ((AbstractC0200s0) e0()).f4076x.setHasFixedSize(true);
        ((AbstractC0200s0) e0()).f4076x.setAdapter(s0());
        ((AbstractC0200s0) e0()).f4077y.setHasFixedSize(true);
        AbstractC0200s0 abstractC0200s0 = (AbstractC0200s0) e0();
        abstractC0200s0.f4077y.setAdapter((k2.f) this.f13827F0.getValue());
    }

    public final C1484b s0() {
        return (C1484b) this.f13826E0.getValue();
    }

    @Override // M1.n
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final m h0() {
        return (m) this.f13825D0.getValue();
    }
}
