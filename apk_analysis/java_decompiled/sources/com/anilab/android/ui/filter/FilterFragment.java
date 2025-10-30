package com.anilab.android.ui.filter;

import A7.e;
import A7.f;
import C2.P;
import J1.J;
import N1.s;
import N1.t;
import U1.i;
import U1.l;
import U1.m;
import U1.n;
import W.g;
import Y2.r;
import Y7.B;
import Z0.a;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import co.notix.R;
import com.anilab.domain.model.FilterConfig;
import com.anilab.domain.model.Genre;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class FilterFragment extends n<l, J> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13761D0;

    /* renamed from: E0, reason: collision with root package name */
    public final A7.l f13762E0;

    /* renamed from: F0, reason: collision with root package name */
    public final A7.l f13763F0;

    /* renamed from: G0, reason: collision with root package name */
    public final A7.l f13764G0;

    /* renamed from: H0, reason: collision with root package name */
    public final A7.l f13765H0;

    public FilterFragment() {
        e p9 = a.p(f.f545a, new N1.r(11, new N1.r(10, this)));
        this.f13761D0 = M4.a.i(this, p.a(l.class), new s(p9, 14), new s(p9, 15), new t(this, p9, 7));
        this.f13762E0 = a.q(new P(8));
        this.f13763F0 = a.q(new P(9));
        this.f13764G0 = a.q(new P(10));
        this.f13765H0 = a.q(new P(11));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_filter;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (l) this.f13761D0.getValue();
    }

    @Override // M1.n
    public final void k0(int i9) {
        A7.l lVar = this.f13763F0;
        A7.l lVar2 = this.f13764G0;
        A7.l lVar3 = this.f13762E0;
        A7.l lVar4 = this.f13765H0;
        if (i9 != R.id.buttonApply) {
            if (i9 != R.id.buttonBack) {
                if (i9 == R.id.buttonReset) {
                    m mVar = (m) lVar4.getValue();
                    mVar.f7276e.clear();
                    mVar.d();
                    U1.a aVar = (U1.a) lVar3.getValue();
                    int i10 = aVar.f7249e;
                    aVar.f7249e = 0;
                    aVar.e(i10);
                    aVar.e(aVar.f7249e);
                    U1.a aVar2 = (U1.a) lVar2.getValue();
                    int i11 = aVar2.f7249e;
                    aVar2.f7249e = 0;
                    aVar2.e(i11);
                    aVar2.e(aVar2.f7249e);
                    U1.a aVar3 = (U1.a) lVar.getValue();
                    int i12 = aVar3.f7249e;
                    aVar3.f7249e = 0;
                    aVar3.e(i12);
                    aVar3.e(aVar3.f7249e);
                    return;
                }
                return;
            }
            M1.n.q0(this);
            return;
        }
        FilterConfig r5 = ((U1.a) lVar3.getValue()).r();
        FilterConfig r7 = ((U1.a) lVar.getValue()).r();
        FilterConfig r9 = ((U1.a) lVar2.getValue()).r();
        if (r5 != null && r7 != null && r9 != null) {
            Genre[] genres = (Genre[]) ((m) lVar4.getValue()).f7276e.toArray(new Genre[0]);
            h.e(genres, "genres");
            j0(new i(r7, r9, r5, genres));
        }
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new U1.h(this, null), 3);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        J j = (J) gVar;
        return B7.l.b0(j.f3697v, j.f3698w, j.f3699x);
    }

    @Override // M1.n
    public final void p0() {
        J j = (J) e0();
        RecyclerView recyclerView = j.f3701z;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager.e1(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter((U1.a) this.f13762E0.getValue());
        FlexboxLayoutManager flexboxLayoutManager2 = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager2.e1(0);
        RecyclerView recyclerView2 = j.f3700y;
        recyclerView2.setLayoutManager(flexboxLayoutManager2);
        recyclerView2.setAdapter((m) this.f13765H0.getValue());
        FlexboxLayoutManager flexboxLayoutManager3 = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager3.e1(0);
        RecyclerView recyclerView3 = j.f3696B;
        recyclerView3.setLayoutManager(flexboxLayoutManager3);
        recyclerView3.setAdapter((U1.a) this.f13763F0.getValue());
        FlexboxLayoutManager flexboxLayoutManager4 = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager4.e1(0);
        RecyclerView recyclerView4 = j.f3695A;
        recyclerView4.setLayoutManager(flexboxLayoutManager4);
        recyclerView4.setAdapter((U1.a) this.f13764G0.getValue());
    }
}
