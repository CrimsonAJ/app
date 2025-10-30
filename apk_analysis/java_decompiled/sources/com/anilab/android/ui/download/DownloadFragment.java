package com.anilab.android.ui.download;

import A7.e;
import A7.f;
import A7.l;
import B7.k;
import H2.i;
import J1.AbstractC0176g;
import J5.j;
import N1.s;
import N1.t;
import R1.A;
import R1.C;
import R1.C0382a;
import R1.C0383b;
import R1.D;
import R1.o;
import R1.q;
import R1.v;
import R1.x;
import R1.z;
import W.g;
import Y2.r;
import Y7.B;
import Y7.y0;
import Z0.a;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import b5.G1;
import b8.C0718Q;
import co.notix.R;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class DownloadFragment extends D<AbstractC0176g, A> {

    /* renamed from: S0, reason: collision with root package name */
    public final r f13745S0;

    /* renamed from: T0, reason: collision with root package name */
    public final G1 f13746T0;

    /* renamed from: U0, reason: collision with root package name */
    public final l f13747U0;

    /* renamed from: V0, reason: collision with root package name */
    public final l f13748V0;

    /* renamed from: W0, reason: collision with root package name */
    public final j f13749W0;

    /* renamed from: X0, reason: collision with root package name */
    public y0 f13750X0;

    public DownloadFragment() {
        e p9 = a.p(f.f545a, new N1.r(5, new R1.r(this, 1)));
        this.f13745S0 = M4.a.i(this, p.a(A.class), new s(p9, 6), new s(p9, 7), new t(this, p9, 3));
        this.f13746T0 = new G1(p.a(R1.s.class), new R1.r(this, 0));
        this.f13747U0 = a.q(new C0382a(this, 0));
        int i9 = 1;
        this.f13748V0 = a.q(new C0382a(this, i9));
        this.f13749W0 = new j(i9, this);
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void Q() {
        super.Q();
        ((AbstractC0176g) m0()).f3931E.a(this.f13749W0);
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void R() {
        ((AbstractC0176g) m0()).f3931E.f16150m0.remove(this.f13749W0);
        super.R();
    }

    @Override // M1.g
    public final int n0() {
        return R.layout.bottom_sheet_download;
    }

    @Override // M1.g
    public final void o0(int i9) {
        Long l9;
        if (i9 != R.id.buttonCancel) {
            if (i9 == R.id.buttonDownload) {
                A t02 = t0();
                C c3 = (C) this.f13747U0.getValue();
                List list = c3.f2039d.f2100f;
                h.d(list, "getCurrentList(...)");
                i iVar = (i) k.r0(list, c3.f6510h);
                if (iVar != null) {
                    l9 = Long.valueOf(iVar.f3026a);
                } else {
                    l9 = null;
                }
                if (l9 == null) {
                    t02.getClass();
                    return;
                }
                if (t02.f6501m.f3444a == l9.longValue() && t02.f6501m.f3453k) {
                    M1.t tVar = new M1.t(v.f6556a);
                    C0718Q c0718q = t02.f6502n;
                    c0718q.getClass();
                    c0718q.j(null, tVar);
                    return;
                }
                t02.d(false, new x(t02, l9, null));
                return;
            }
            return;
        }
        try {
            AbstractC1002u1.A(this).m();
        } catch (Exception unused) {
        }
    }

    @Override // M1.g
    public final void p0() {
        B.r(Y.f(this), null, new o(null, this), 3);
        A t02 = t0();
        Movie movie = ((R1.s) this.f13746T0.getValue()).f6554a;
        t02.getClass();
        t02.d(true, new z(t02, movie.f14414a, null));
    }

    @Override // M1.g
    public final List q0(g gVar) {
        AbstractC0176g abstractC0176g = (AbstractC0176g) gVar;
        return B7.l.b0(abstractC0176g.f3933v, abstractC0176g.f3934w);
    }

    @Override // M1.g
    public final void r0() {
        AbstractC0176g abstractC0176g = (AbstractC0176g) m0();
        RecyclerView recyclerView = abstractC0176g.f3929C;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((C) this.f13747U0.getValue());
        abstractC0176g.f3930D.setAdapter((SpinnerAdapter) this.f13748V0.getValue());
        abstractC0176g.f3935x.setOnClickListener(new I5.k(abstractC0176g, 2, this));
        AppCompatEditText inputSearchEpisode = abstractC0176g.f3937z;
        h.d(inputSearchEpisode, "inputSearchEpisode");
        inputSearchEpisode.addTextChangedListener(new q(abstractC0176g, this, 0));
        inputSearchEpisode.setOnEditorActionListener(new C0383b(0, this));
    }

    public final A t0() {
        return (A) this.f13745S0.getValue();
    }
}
