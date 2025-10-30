package com.anilab.android.ui.home;

import A7.e;
import A7.f;
import A7.l;
import B2.i;
import B7.k;
import J1.P;
import N1.s;
import N1.t;
import W.g;
import X1.AbstractC0435d;
import X1.C0436e;
import X1.F;
import X1.H;
import X1.o;
import X1.v;
import X1.x;
import X1.y;
import Y2.r;
import Y7.B;
import Y7.y0;
import Z0.a;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.Y;
import co.notix.R;
import com.anilab.android.ui.main.HostFragment;
import com.anilab.domain.model.Movie;
import com.google.android.material.button.MaterialButton;
import i0.AbstractComponentCallbacksC1366v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import u0.C2030a;

/* loaded from: classes.dex */
public final class HomeFragment extends AbstractC0435d<y, P> {

    /* renamed from: F0, reason: collision with root package name */
    public final r f13772F0;

    /* renamed from: G0, reason: collision with root package name */
    public final l f13773G0;

    /* renamed from: H0, reason: collision with root package name */
    public H f13774H0;

    /* renamed from: I0, reason: collision with root package name */
    public y0 f13775I0;

    public HomeFragment() {
        e p9 = a.p(f.f545a, new N1.r(16, new N1.r(15, this)));
        this.f13772F0 = M4.a.i(this, p.a(y.class), new s(p9, 20), new s(p9, 21), new t(this, p9, 10));
        this.f13773G0 = a.q(new i(7, this));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    public final void A0(int i9) {
        int i10;
        int i11;
        P p9 = (P) e0();
        H h7 = this.f13774H0;
        if (h7 != null) {
            boolean z9 = ((Movie) h7.f8246e.get(i9)).f14428p;
            if (z9) {
                i10 = R.color.colorRed;
            } else {
                i10 = R.color.white;
            }
            if (z9) {
                i11 = R.drawable.ic_tick_red;
            } else {
                i11 = R.drawable.ic_add;
            }
            MaterialButton materialButton = p9.f3750v;
            materialButton.setIconResource(i11);
            materialButton.setTextColor(p9.f7853k.getContext().getColor(i10));
            materialButton.setIconTintResource(i10);
            materialButton.setStrokeColorResource(i10);
            return;
        }
        h.h("sliderAdapter");
        throw null;
    }

    @Override // M1.n, i0.AbstractComponentCallbacksC1366v
    public final void N() {
        super.N();
        y0 y0Var = this.f13775I0;
        if (y0Var != null) {
            y0Var.d(null);
        }
    }

    @Override // M1.n, i0.AbstractComponentCallbacksC1366v
    public final void O() {
        super.O();
        x0();
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_home;
    }

    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // M1.n
    public final void k0(int i9) {
        InterfaceC0561w interfaceC0561w;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v;
        HostFragment hostFragment;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2;
        HostFragment hostFragment2;
        HostFragment hostFragment3 = null;
        switch (i9) {
            case R.id.buttonAddMyList /* 2131361901 */:
                if (!h0().f8314k.f5769a.b()) {
                    AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v3 = this.f18419v;
                    if (abstractComponentCallbacksC1366v3 != null) {
                        interfaceC0561w = abstractComponentCallbacksC1366v3.f18419v;
                    } else {
                        interfaceC0561w = null;
                    }
                    if (interfaceC0561w instanceof HostFragment) {
                        hostFragment3 = (HostFragment) interfaceC0561w;
                    }
                    if (hostFragment3 != null) {
                        hostFragment3.j0(new C2030a(R.id.goToLogin));
                        return;
                    }
                    return;
                }
                H h7 = this.f13774H0;
                if (h7 != null) {
                    Movie movie = (Movie) k.r0(h7.f8246e, ((P) e0()).f3747B.getCurrentItem());
                    if (movie != null) {
                        H h9 = this.f13774H0;
                        if (h9 != null) {
                            int currentItem = ((P) e0()).f3747B.getCurrentItem();
                            ((Movie) h9.f8246e.get(currentItem)).f14428p = !((Movie) r1.get(currentItem)).f14428p;
                            y h02 = h0();
                            boolean z9 = movie.f14428p;
                            h02.getClass();
                            h02.d(false, new x(z9, h02, movie.f14414a, null));
                            A0(((P) e0()).f3747B.getCurrentItem());
                            return;
                        }
                        h.h("sliderAdapter");
                        throw null;
                    }
                    return;
                }
                h.h("sliderAdapter");
                throw null;
            case R.id.buttonPlay /* 2131361942 */:
                if (k() != null) {
                    H h10 = this.f13774H0;
                    if (h10 != null) {
                        Movie movie2 = (Movie) k.r0(h10.f8246e, ((P) e0()).f3747B.getCurrentItem());
                        if (movie2 != null) {
                            t0(new H2.s(movie2.f14414a, movie2.f14416c, movie2.f14415b, 0L, movie2.f14420g, movie2.f14417d, 8));
                            return;
                        }
                        return;
                    }
                    h.h("sliderAdapter");
                    throw null;
                }
                return;
            case R.id.imageNotification /* 2131362244 */:
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v4 = this.f18419v;
                if (abstractComponentCallbacksC1366v4 != null) {
                    abstractComponentCallbacksC1366v = abstractComponentCallbacksC1366v4.f18419v;
                } else {
                    abstractComponentCallbacksC1366v = null;
                }
                if (abstractComponentCallbacksC1366v instanceof HostFragment) {
                    hostFragment = (HostFragment) abstractComponentCallbacksC1366v;
                } else {
                    hostFragment = null;
                }
                if (hostFragment != null) {
                    hostFragment.i0(R.id.hostToNotification, null);
                    return;
                }
                return;
            case R.id.imageSearch /* 2131362251 */:
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v5 = this.f18419v;
                if (abstractComponentCallbacksC1366v5 != null) {
                    abstractComponentCallbacksC1366v2 = abstractComponentCallbacksC1366v5.f18419v;
                } else {
                    abstractComponentCallbacksC1366v2 = null;
                }
                if (abstractComponentCallbacksC1366v2 instanceof HostFragment) {
                    hostFragment2 = (HostFragment) abstractComponentCallbacksC1366v2;
                } else {
                    hostFragment2 = null;
                }
                if (hostFragment2 != null) {
                    hostFragment2.i0(R.id.goToSearch, null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // M1.B, M1.n
    public final void l0() {
        super.l0();
        B.r(Y.f(this), null, new o(null, this), 3);
        y h02 = h0();
        h02.getClass();
        h02.d(false, new v(h02, false, null));
    }

    @Override // M1.n
    public final List m0(g gVar) {
        P p9 = (P) gVar;
        return B7.l.b0(p9.f3752x, p9.f3753y, p9.f3750v, p9.f3751w);
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
        P p9 = (P) e0();
        p9.f3754z.setAdapter((F) this.f13773G0.getValue());
        P p10 = (P) e0();
        ((ArrayList) p10.f3747B.f10394c.f8284b).add(new X1.p(0, this));
        P p11 = (P) e0();
        p11.f3746A.setOnRefreshListener(new C3.v(9, this));
    }

    @Override // M1.B
    public final void u0() {
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
            hostFragment.u0();
        }
    }

    @Override // M1.B
    public final void v0() {
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
            hostFragment.v0();
        }
    }

    public final void x0() {
        y0 y0Var = this.f13775I0;
        if (y0Var != null && y0Var.a()) {
            return;
        }
        y0 r5 = B.r(Y.f(this), null, new C0436e(null, this), 3);
        this.f13775I0 = r5;
        r5.start();
    }

    @Override // M1.n
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final y h0() {
        return (y) this.f13772F0.getValue();
    }

    public final void z0(Movie movie) {
        InterfaceC0561w interfaceC0561w;
        h.e(movie, "movie");
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
            HostFragment.y0(hostFragment, movie);
        }
    }
}
