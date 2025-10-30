package Q2;

import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
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

/* renamed from: Q2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0374q implements p0, Q, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f6293a;

    public ViewOnClickListenerC0374q(D d9) {
        this.f6293a = d9;
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
    public final /* synthetic */ void E(int i9, q0 q0Var, q0 q0Var2) {
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

    @Override // Q2.Q
    public final void c(long j) {
        D d9 = this.f6293a;
        d9.f6104s0 = true;
        TextView textView = d9.f6096o;
        if (textView != null) {
            textView.setText(l4.y.A(d9.f6100q, d9.f6102r, j));
        }
        d9.f6052B0.f();
    }

    @Override // j3.p0
    public final /* synthetic */ void d(n0 n0Var) {
    }

    @Override // Q2.Q
    public final void e(long j, boolean z9) {
        r0 r0Var;
        D d9 = this.f6293a;
        int i9 = 0;
        d9.f6104s0 = false;
        if (!z9 && (r0Var = d9.f6093m0) != null) {
            E0 I4 = r0Var.I();
            if (d9.r0 && !I4.p()) {
                int o9 = I4.o();
                while (true) {
                    long T8 = l4.y.T(I4.m(i9, d9.f6105t, 0L).f19315n);
                    if (j < T8) {
                        break;
                    }
                    if (i9 == o9 - 1) {
                        j = T8;
                        break;
                    } else {
                        j -= T8;
                        i9++;
                    }
                }
            } else {
                i9 = r0Var.z();
            }
            r0Var.Q(j, i9);
            d9.n();
        }
        d9.f6052B0.g();
    }

    @Override // j3.p0
    public final /* synthetic */ void f(C1461l c1461l) {
    }

    @Override // j3.p0
    public final /* synthetic */ void g(m4.v vVar) {
    }

    @Override // Q2.Q
    public final void h(long j) {
        D d9 = this.f6293a;
        TextView textView = d9.f6096o;
        if (textView != null) {
            textView.setText(l4.y.A(d9.f6100q, d9.f6102r, j));
        }
    }

    @Override // j3.p0
    public final /* synthetic */ void i(int i9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void k(boolean z9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void l() {
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        D d9 = this.f6293a;
        r0 r0Var = d9.f6093m0;
        if (r0Var != null) {
            d9.f6052B0.g();
            if (d9.f6078e == view) {
                ((D.n) r0Var).i0();
                return;
            }
            if (d9.f6077d == view) {
                ((D.n) r0Var).j0();
                return;
            }
            if (d9.f6081g == view) {
                if (r0Var.e() != 4) {
                    D.n nVar = (D.n) r0Var;
                    long T8 = nVar.T() + nVar.i();
                    long H8 = nVar.H();
                    if (H8 != -9223372036854775807L) {
                        T8 = Math.min(T8, H8);
                    }
                    nVar.Q(Math.max(T8, 0L), nVar.z());
                    return;
                }
                return;
            }
            if (d9.f6083h == view) {
                D.n nVar2 = (D.n) r0Var;
                long T9 = nVar2.T() + (-nVar2.U());
                long H9 = nVar2.H();
                if (H9 != -9223372036854775807L) {
                    T9 = Math.min(T9, H9);
                }
                nVar2.Q(Math.max(T9, 0L), nVar2.z());
                return;
            }
            if (d9.f6079f == view) {
                int e8 = r0Var.e();
                if (e8 != 1 && e8 != 4 && r0Var.m()) {
                    ((D.n) r0Var).f(false);
                    return;
                }
                int e9 = r0Var.e();
                if (e9 == 1) {
                    r0Var.b();
                } else if (e9 == 4) {
                    r0Var.Q(-9223372036854775807L, r0Var.z());
                }
                ((D.n) r0Var).f(true);
                return;
            }
            if (d9.f6088k == view) {
                int j = r0Var.j();
                int i9 = d9.f6110v0;
                for (int i10 = 1; i10 <= 2; i10++) {
                    int i11 = (j + i10) % 3;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2 && (i9 & 2) != 0) {
                            }
                        } else if ((i9 & 1) == 0) {
                        }
                    }
                    j = i11;
                }
                r0Var.h(j);
                return;
            }
            if (d9.f6090l == view) {
                r0Var.n(!r0Var.L());
                return;
            }
            if (d9.f6071S0 == view) {
                d9.f6052B0.f();
                d9.c(d9.f6059G0);
                return;
            }
            if (d9.f6072T0 == view) {
                d9.f6052B0.f();
                d9.c(d9.f6060H0);
                return;
            }
            if (d9.f6073U0 == view) {
                d9.f6052B0.f();
                d9.c(d9.f6065M0);
            } else if (d9.f6067O0 == view) {
                d9.f6052B0.f();
                if (r0Var instanceof o3.e) {
                    d9.c(d9.f6063K0);
                } else {
                    d9.c(d9.f6064L0);
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        D d9 = this.f6293a;
        if (d9.f6062J0) {
            d9.f6052B0.g();
        }
    }

    @Override // j3.p0
    public final /* synthetic */ void q(int i9, boolean z9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void r(i4.v vVar) {
    }

    @Override // j3.p0
    public final /* synthetic */ void s(int i9, boolean z9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void t(D3.c cVar) {
    }

    @Override // j3.p0
    public final /* synthetic */ void v(G0 g02) {
    }

    @Override // j3.p0
    public final /* synthetic */ void w(int i9) {
    }

    @Override // j3.p0
    public final /* synthetic */ void y(Y3.c cVar) {
    }

    @Override // j3.p0
    public final void z(o0 o0Var) {
        boolean a5 = o0Var.a(4, 5);
        D d9 = this.f6293a;
        if (a5) {
            d9.l();
        }
        if (o0Var.a(4, 5, 7)) {
            d9.n();
        }
        l4.f fVar = o0Var.f19701a;
        if (fVar.f20498a.get(8)) {
            d9.o();
        }
        if (fVar.f20498a.get(9)) {
            d9.p();
        }
        if (o0Var.a(8, 9, 11, 0, 16, 17, 13)) {
            d9.k();
        }
        if (o0Var.a(11, 0)) {
            d9.q();
        }
        if (fVar.f20498a.get(12)) {
            d9.m();
        }
        if (fVar.f20498a.get(2)) {
            d9.r();
        }
    }
}
