package Q2;

import android.view.TextureView;
import android.view.View;
import com.anilab.exoplayer.StyledPlayerView;
import com.anilab.exoplayer.SubtitleView;
import j3.C0;
import j3.C1446b0;
import j3.C1461l;
import j3.C1462m;
import j3.E0;
import j3.G0;
import j3.m0;
import j3.n0;
import j3.o0;
import j3.p0;
import j3.q0;
import j3.r0;
import java.util.List;

/* loaded from: classes.dex */
public final class K implements p0, View.OnLayoutChangeListener, View.OnClickListener, C, r {

    /* renamed from: a, reason: collision with root package name */
    public final C0 f6157a = new C0();

    /* renamed from: b, reason: collision with root package name */
    public Object f6158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StyledPlayerView f6159c;

    public K(StyledPlayerView styledPlayerView) {
        this.f6159c = styledPlayerView;
    }

    @Override // j3.p0
    public final /* synthetic */ void A(m0 m0Var) {
    }

    @Override // j3.p0
    public final /* synthetic */ void B(C1446b0 c1446b0) {
    }

    @Override // j3.p0
    public final /* synthetic */ void C(boolean z9) {
    }

    @Override // j3.p0
    public final void E(int i9, q0 q0Var, q0 q0Var2) {
        D d9;
        int i10 = StyledPlayerView.f14447D;
        StyledPlayerView styledPlayerView = this.f6159c;
        if (styledPlayerView.c() && styledPlayerView.f14475z && (d9 = styledPlayerView.j) != null) {
            d9.e();
        }
    }

    @Override // j3.p0
    public final /* synthetic */ void F(int i9, int i10) {
    }

    @Override // j3.p0
    public final /* synthetic */ void G(C1462m c1462m) {
    }

    @Override // j3.p0
    public final /* synthetic */ void I(C1462m c1462m) {
    }

    @Override // j3.p0
    public final /* synthetic */ void K(j3.Y y9, int i9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void M(int i9, boolean z9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void N(boolean z9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void a(int i9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void b(int i9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void d(n0 n0Var) {
    }

    @Override // j3.p0
    public final /* synthetic */ void f(C1461l c1461l) {
    }

    @Override // j3.p0
    public final void g(m4.v vVar) {
        int i9 = StyledPlayerView.f14447D;
        this.f6159c.h();
    }

    @Override // j3.p0
    public final /* synthetic */ void i(int i9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void k(boolean z9) {
    }

    @Override // j3.p0
    public final void l() {
        View view = this.f6159c.f14453c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // j3.p0
    public final /* synthetic */ void m() {
    }

    @Override // j3.p0
    public final /* synthetic */ void n(boolean z9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void o(List list) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        StyledPlayerView.b((TextureView) view, this.f6159c.f14449B);
    }

    @Override // j3.p0
    public final /* synthetic */ void q(int i9, boolean z9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void r(i4.v vVar) {
    }

    @Override // j3.p0
    public final void s(int i9, boolean z9) {
        int i10 = StyledPlayerView.f14447D;
        StyledPlayerView styledPlayerView = this.f6159c;
        styledPlayerView.i();
        if (styledPlayerView.c() && styledPlayerView.f14475z) {
            D d9 = styledPlayerView.j;
            if (d9 != null) {
                d9.e();
                return;
            }
            return;
        }
        styledPlayerView.d(false);
    }

    @Override // j3.p0
    public final /* synthetic */ void t(D3.c cVar) {
    }

    @Override // j3.p0
    public final void v(G0 g02) {
        StyledPlayerView styledPlayerView = this.f6159c;
        r0 r0Var = styledPlayerView.f14464o;
        r0Var.getClass();
        E0 I4 = r0Var.I();
        if (I4.p()) {
            this.f6158b = null;
        } else {
            boolean isEmpty = r0Var.q().f19338a.isEmpty();
            C0 c02 = this.f6157a;
            if (!isEmpty) {
                this.f6158b = I4.f(r0Var.t(), c02, true).f19236b;
            } else {
                Object obj = this.f6158b;
                if (obj != null) {
                    int b9 = I4.b(obj);
                    if (b9 != -1) {
                        if (r0Var.z() == I4.f(b9, c02, false).f19237c) {
                            return;
                        }
                    }
                    this.f6158b = null;
                }
            }
        }
        styledPlayerView.l(false);
    }

    @Override // j3.p0
    public final void w(int i9) {
        int i10 = StyledPlayerView.f14447D;
        StyledPlayerView styledPlayerView = this.f6159c;
        styledPlayerView.i();
        styledPlayerView.k();
        if (styledPlayerView.c() && styledPlayerView.f14475z) {
            D d9 = styledPlayerView.j;
            if (d9 != null) {
                d9.e();
                return;
            }
            return;
        }
        styledPlayerView.d(false);
    }

    @Override // j3.p0
    public final void y(Y3.c cVar) {
        SubtitleView subtitleView = this.f6159c.f14457g;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.f8696a);
        }
    }

    @Override // j3.p0
    public final /* synthetic */ void z(o0 o0Var) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
