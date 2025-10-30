package com.anilab.android.ui.myList;

import A7.e;
import A7.f;
import A7.l;
import J1.AbstractC0177g0;
import N1.h;
import N1.t;
import W.g;
import Y2.r;
import Y7.B;
import Z0.a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import b2.C0599l;
import c2.C0762h;
import co.notix.R;
import com.anilab.android.ui.main.HostFragment;
import com.anilab.android.ui.myList.MyListFragment;
import e2.AbstractC1138b;
import e2.C1136B;
import e2.j;
import e2.u;
import e2.v;
import e2.y;
import i0.AbstractComponentCallbacksC1366v;
import java.util.List;
import kotlin.jvm.internal.p;
import u0.C2030a;

/* loaded from: classes.dex */
public final class MyListFragment extends AbstractC1138b<C1136B, AbstractC0177g0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13793D0;

    /* renamed from: E0, reason: collision with root package name */
    public final l f13794E0;

    /* renamed from: F0, reason: collision with root package name */
    public final r f13795F0;

    /* renamed from: G0, reason: collision with root package name */
    public final l f13796G0;

    public MyListFragment() {
        e p9 = a.p(f.f545a, new e2.e(1, new v(this, 3)));
        this.f13793D0 = M4.a.i(this, p.a(C1136B.class), new C0762h(p9, 10), new C0762h(p9, 11), new t(this, p9, 20));
        final int i9 = 0;
        this.f13794E0 = a.q(new O7.a(this) { // from class: e2.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyListFragment f17113b;

            {
                this.f17113b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return new j(new com.google.firebase.messaging.u(this.f17113b));
                    default:
                        MyListFragment myListFragment = this.f17113b;
                        return new l(myListFragment, ((AbstractC0177g0) myListFragment.e0()).f3944z.getLayoutManager());
                }
            }
        });
        this.f13795F0 = M4.a.i(this, p.a(C0599l.class), new v(this, 0), new v(this, 1), new v(this, 2));
        final int i10 = 1;
        this.f13796G0 = a.q(new O7.a(this) { // from class: e2.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyListFragment f17113b;

            {
                this.f17113b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new j(new com.google.firebase.messaging.u(this.f17113b));
                    default:
                        MyListFragment myListFragment = this.f17113b;
                        return new l(myListFragment, ((AbstractC0177g0) myListFragment.e0()).f3944z.getLayoutManager());
                }
            }
        });
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_my_list;
    }

    @Override // M1.n
    public final void k0(int i9) {
        InterfaceC0561w interfaceC0561w;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v;
        HostFragment hostFragment;
        HostFragment hostFragment2 = null;
        if (i9 != R.id.buttonContinue) {
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
                    return;
                }
                return;
            }
            return;
        }
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v3 = this.f18419v;
        if (abstractComponentCallbacksC1366v3 != null) {
            interfaceC0561w = abstractComponentCallbacksC1366v3.f18419v;
        } else {
            interfaceC0561w = null;
        }
        if (interfaceC0561w instanceof HostFragment) {
            hostFragment2 = (HostFragment) interfaceC0561w;
        }
        if (hostFragment2 != null) {
            hostFragment2.j0(new C2030a(R.id.goToLogin));
        }
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new u(null, this), 3);
        C1136B h02 = h0();
        h02.getClass();
        h02.d(true, new y(h02, 1, null));
    }

    @Override // M1.n
    public final List m0(g gVar) {
        AbstractC0177g0 abstractC0177g0 = (AbstractC0177g0) gVar;
        AppCompatImageView appCompatImageView = abstractC0177g0.f3941w;
        return B7.l.b0(appCompatImageView, abstractC0177g0.f3940v, appCompatImageView);
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
        AbstractC0177g0 abstractC0177g0 = (AbstractC0177g0) e0();
        RecyclerView recyclerView = abstractC0177g0.f3944z;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((j) this.f13794E0.getValue());
        androidx.recyclerview.widget.a layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            e2.l s02 = s0();
            s02.getClass();
            s02.f4750i = layoutManager;
        }
        recyclerView.j(s0());
        abstractC0177g0.f3938A.setOnRefreshListener(new h(abstractC0177g0, 11, this));
    }

    public final e2.l s0() {
        return (e2.l) this.f13796G0.getValue();
    }

    @Override // M1.n
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final C1136B h0() {
        return (C1136B) this.f13793D0.getValue();
    }
}
