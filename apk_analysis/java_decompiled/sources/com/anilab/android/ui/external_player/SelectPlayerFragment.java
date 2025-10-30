package com.anilab.android.ui.external_player;

import A7.e;
import A7.f;
import A7.l;
import B7.k;
import C2.P;
import J1.AbstractC0192o;
import L1.C;
import L1.S;
import M4.a;
import N1.s;
import N1.t;
import T1.AbstractC0387a;
import T1.C0389c;
import T1.i;
import T1.j;
import T1.p;
import W.g;
import Y2.r;
import Y7.B;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import b8.C0718Q;
import co.notix.R;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class SelectPlayerFragment extends AbstractC0387a<AbstractC0192o, p> {

    /* renamed from: S0, reason: collision with root package name */
    public final r f13754S0 = a.i(this, kotlin.jvm.internal.p.a(S.class), new j(this, 0), new j(this, 1), new j(this, 2));

    /* renamed from: T0, reason: collision with root package name */
    public final r f13755T0;

    /* renamed from: U0, reason: collision with root package name */
    public final l f13756U0;

    public SelectPlayerFragment() {
        e p9 = Z0.a.p(f.f545a, new N1.r(8, new j(this, 3)));
        this.f13755T0 = a.i(this, kotlin.jvm.internal.p.a(p.class), new s(p9, 10), new s(p9, 11), new t(this, p9, 5));
        this.f13756U0 = Z0.a.q(new P(6));
    }

    @Override // M1.g
    public final int n0() {
        return R.layout.bottom_sheet_select_player;
    }

    @Override // M1.g
    public final void o0(int i9) {
        if (i9 != R.id.buttonBack) {
            if (i9 == R.id.buttonSelectAndPlay) {
                C0389c c0389c = (C0389c) this.f13756U0.getValue();
                List list = c0389c.f2039d.f2100f;
                h.d(list, "getCurrentList(...)");
                H2.t tVar = (H2.t) k.r0(list, c0389c.f7010e);
                if (tVar == null) {
                    return;
                }
                S s9 = (S) this.f13754S0.getValue();
                s9.f4492B = tVar;
                M1.t tVar2 = new M1.t(new C(tVar.f3057a));
                C0718Q c0718q = s9.f4507u;
                c0718q.getClass();
                c0718q.j(null, tVar2);
                return;
            }
            return;
        }
        l0();
    }

    @Override // M1.g
    public final List q0(g gVar) {
        AbstractC0192o abstractC0192o = (AbstractC0192o) gVar;
        return B7.l.b0(abstractC0192o.f4022v, abstractC0192o.f4023w);
    }

    @Override // M1.g
    public final void r0() {
        RecyclerView recyclerView = ((AbstractC0192o) m0()).f4025y;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((C0389c) this.f13756U0.getValue());
        B.r(Y.f(this), null, new i(null, this), 3);
    }
}
