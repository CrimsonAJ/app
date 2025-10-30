package androidx.recyclerview.widget;

import A3.v;
import F0.AbstractC0098c;
import F0.C0097b0;
import F0.C0099c0;
import F0.C0120y;
import F0.D;
import F0.E;
import F0.F;
import F0.G;
import F0.K;
import F0.S;
import F0.h0;
import F0.m0;
import F0.n0;
import F0.r0;
import Q.e;
import Q.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends a implements m0 {

    /* renamed from: A, reason: collision with root package name */
    public final v f10217A;

    /* renamed from: B, reason: collision with root package name */
    public final D f10218B;

    /* renamed from: C, reason: collision with root package name */
    public final int f10219C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f10220D;

    /* renamed from: p, reason: collision with root package name */
    public int f10221p;

    /* renamed from: q, reason: collision with root package name */
    public E f10222q;

    /* renamed from: r, reason: collision with root package name */
    public K f10223r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10224s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f10225t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10226u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10227v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f10228w;

    /* renamed from: x, reason: collision with root package name */
    public int f10229x;

    /* renamed from: y, reason: collision with root package name */
    public int f10230y;

    /* renamed from: z, reason: collision with root package name */
    public F f10231z;

    /* JADX WARN: Type inference failed for: r2v1, types: [F0.D, java.lang.Object] */
    public LinearLayoutManager(int i9) {
        this.f10221p = 1;
        this.f10225t = false;
        this.f10226u = false;
        this.f10227v = false;
        this.f10228w = true;
        this.f10229x = -1;
        this.f10230y = Integer.MIN_VALUE;
        this.f10231z = null;
        this.f10217A = new v();
        this.f10218B = new Object();
        this.f10219C = 2;
        this.f10220D = new int[2];
        l1(i9);
        c(null);
        if (this.f10225t) {
            this.f10225t = false;
            v0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean F0() {
        if (this.f10348m != 1073741824 && this.f10347l != 1073741824) {
            int w7 = w();
            for (int i9 = 0; i9 < w7; i9++) {
                ViewGroup.LayoutParams layoutParams = v(i9).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public void H0(RecyclerView recyclerView, int i9) {
        G g9 = new G(recyclerView.getContext());
        g9.f2023a = i9;
        I0(g9);
    }

    @Override // androidx.recyclerview.widget.a
    public boolean J0() {
        if (this.f10231z == null && this.f10224s == this.f10227v) {
            return true;
        }
        return false;
    }

    public void K0(n0 n0Var, int[] iArr) {
        int i9;
        int i10;
        if (n0Var.f2164a != -1) {
            i9 = this.f10223r.n();
        } else {
            i9 = 0;
        }
        if (this.f10222q.f2014f == -1) {
            i10 = 0;
        } else {
            i10 = i9;
            i9 = 0;
        }
        iArr[0] = i9;
        iArr[1] = i10;
    }

    public void L0(n0 n0Var, E e8, C0120y c0120y) {
        int i9 = e8.f2012d;
        if (i9 >= 0 && i9 < n0Var.b()) {
            c0120y.c(i9, Math.max(0, e8.f2015g));
        }
    }

    public final int M0(n0 n0Var) {
        if (w() == 0) {
            return 0;
        }
        Q0();
        K k5 = this.f10223r;
        boolean z9 = !this.f10228w;
        return AbstractC0098c.c(n0Var, k5, T0(z9), S0(z9), this, this.f10228w);
    }

    public final int N0(n0 n0Var) {
        if (w() == 0) {
            return 0;
        }
        Q0();
        K k5 = this.f10223r;
        boolean z9 = !this.f10228w;
        return AbstractC0098c.d(n0Var, k5, T0(z9), S0(z9), this, this.f10228w, this.f10226u);
    }

    public final int O0(n0 n0Var) {
        if (w() == 0) {
            return 0;
        }
        Q0();
        K k5 = this.f10223r;
        boolean z9 = !this.f10228w;
        return AbstractC0098c.e(n0Var, k5, T0(z9), S0(z9), this, this.f10228w);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean P() {
        return true;
    }

    public final int P0(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 17) {
                    if (i9 != 33) {
                        if (i9 != 66) {
                            if (i9 == 130 && this.f10221p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f10221p == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f10221p == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f10221p == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f10221p != 1 && d1()) {
                return -1;
            }
            return 1;
        }
        if (this.f10221p == 1 || !d1()) {
            return -1;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean Q() {
        return this.f10225t;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [F0.E, java.lang.Object] */
    public final void Q0() {
        if (this.f10222q == null) {
            ?? obj = new Object();
            obj.f2009a = true;
            obj.f2016h = 0;
            obj.f2017i = 0;
            obj.f2018k = null;
            this.f10222q = obj;
        }
    }

    public final int R0(h0 h0Var, E e8, n0 n0Var, boolean z9) {
        int i9;
        int i10 = e8.f2011c;
        int i11 = e8.f2015g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                e8.f2015g = i11 + i10;
            }
            g1(h0Var, e8);
        }
        int i12 = e8.f2011c + e8.f2016h;
        while (true) {
            if ((!e8.f2019l && i12 <= 0) || (i9 = e8.f2012d) < 0 || i9 >= n0Var.b()) {
                break;
            }
            D d9 = this.f10218B;
            d9.f2005a = 0;
            d9.f2006b = false;
            d9.f2007c = false;
            d9.f2008d = false;
            e1(h0Var, n0Var, e8, d9);
            if (!d9.f2006b) {
                int i13 = e8.f2010b;
                int i14 = d9.f2005a;
                e8.f2010b = (e8.f2014f * i14) + i13;
                if (!d9.f2007c || e8.f2018k != null || !n0Var.f2170g) {
                    e8.f2011c -= i14;
                    i12 -= i14;
                }
                int i15 = e8.f2015g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    e8.f2015g = i16;
                    int i17 = e8.f2011c;
                    if (i17 < 0) {
                        e8.f2015g = i16 + i17;
                    }
                    g1(h0Var, e8);
                }
                if (z9 && d9.f2008d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - e8.f2011c;
    }

    public final View S0(boolean z9) {
        if (this.f10226u) {
            return X0(0, w(), z9, true);
        }
        return X0(w() - 1, -1, z9, true);
    }

    public final View T0(boolean z9) {
        if (this.f10226u) {
            return X0(w() - 1, -1, z9, true);
        }
        return X0(0, w(), z9, true);
    }

    public final int U0() {
        View X02 = X0(0, w(), false, true);
        if (X02 == null) {
            return -1;
        }
        return a.L(X02);
    }

    public final int V0() {
        View X02 = X0(w() - 1, -1, false, true);
        if (X02 == null) {
            return -1;
        }
        return a.L(X02);
    }

    public final View W0(int i9, int i10) {
        int i11;
        int i12;
        Q0();
        if (i10 > i9 || i10 < i9) {
            if (this.f10223r.g(v(i9)) < this.f10223r.m()) {
                i11 = 16644;
                i12 = 16388;
            } else {
                i11 = 4161;
                i12 = 4097;
            }
            if (this.f10221p == 0) {
                return this.f10339c.t(i9, i10, i11, i12);
            }
            return this.f10340d.t(i9, i10, i11, i12);
        }
        return v(i9);
    }

    public final View X0(int i9, int i10, boolean z9, boolean z10) {
        int i11;
        Q0();
        int i12 = 320;
        if (z9) {
            i11 = 24579;
        } else {
            i11 = 320;
        }
        if (!z10) {
            i12 = 0;
        }
        if (this.f10221p == 0) {
            return this.f10339c.t(i9, i10, i11, i12);
        }
        return this.f10340d.t(i9, i10, i11, i12);
    }

    @Override // androidx.recyclerview.widget.a
    public View Y(View view, int i9, h0 h0Var, n0 n0Var) {
        int P02;
        View W02;
        View b12;
        i1();
        if (w() != 0 && (P02 = P0(i9)) != Integer.MIN_VALUE) {
            Q0();
            n1(P02, (int) (this.f10223r.n() * 0.33333334f), false, n0Var);
            E e8 = this.f10222q;
            e8.f2015g = Integer.MIN_VALUE;
            e8.f2009a = false;
            R0(h0Var, e8, n0Var, true);
            if (P02 == -1) {
                if (this.f10226u) {
                    W02 = W0(w() - 1, -1);
                } else {
                    W02 = W0(0, w());
                }
            } else if (this.f10226u) {
                W02 = W0(0, w());
            } else {
                W02 = W0(w() - 1, -1);
            }
            if (P02 == -1) {
                b12 = c1();
            } else {
                b12 = b1();
            }
            if (b12.hasFocusable()) {
                if (W02 != null) {
                    return b12;
                }
            } else {
                return W02;
            }
        }
        return null;
    }

    public View Y0(h0 h0Var, n0 n0Var, boolean z9, boolean z10) {
        int i9;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        Q0();
        int w7 = w();
        if (z10) {
            i10 = w() - 1;
            i9 = -1;
            i11 = -1;
        } else {
            i9 = w7;
            i10 = 0;
            i11 = 1;
        }
        int b9 = n0Var.b();
        int m9 = this.f10223r.m();
        int i12 = this.f10223r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i9) {
            View v8 = v(i10);
            int L8 = a.L(v8);
            int g9 = this.f10223r.g(v8);
            int d9 = this.f10223r.d(v8);
            if (L8 >= 0 && L8 < b9) {
                if (((C0099c0) v8.getLayoutParams()).f2083a.i()) {
                    if (view3 == null) {
                        view3 = v8;
                    }
                } else {
                    if (d9 <= m9 && g9 < m9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (g9 >= i12 && d9 > i12) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z11 && !z12) {
                        return v8;
                    }
                    if (z9) {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = v8;
                        }
                        view2 = v8;
                    } else {
                        if (!z11) {
                            if (view != null) {
                            }
                            view = v8;
                        }
                        view2 = v8;
                    }
                }
            }
            i10 += i11;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(U0());
            accessibilityEvent.setToIndex(V0());
        }
    }

    public final int Z0(int i9, h0 h0Var, n0 n0Var, boolean z9) {
        int i10;
        int i11 = this.f10223r.i() - i9;
        if (i11 > 0) {
            int i12 = -j1(-i11, h0Var, n0Var);
            int i13 = i9 + i12;
            if (z9 && (i10 = this.f10223r.i() - i13) > 0) {
                this.f10223r.r(i10);
                return i10 + i12;
            }
            return i12;
        }
        return 0;
    }

    @Override // F0.m0
    public final PointF a(int i9) {
        if (w() == 0) {
            return null;
        }
        boolean z9 = false;
        int i10 = 1;
        if (i9 < a.L(v(0))) {
            z9 = true;
        }
        if (z9 != this.f10226u) {
            i10 = -1;
        }
        if (this.f10221p == 0) {
            return new PointF(i10, 0.0f);
        }
        return new PointF(0.0f, i10);
    }

    @Override // androidx.recyclerview.widget.a
    public void a0(h0 h0Var, n0 n0Var, g gVar) {
        super.a0(h0Var, n0Var, gVar);
        S s9 = this.f10338b.f10289m;
        if (s9 != null && s9.a() > 0) {
            gVar.b(e.f6025k);
        }
    }

    public final int a1(int i9, h0 h0Var, n0 n0Var, boolean z9) {
        int m9;
        int m10 = i9 - this.f10223r.m();
        if (m10 > 0) {
            int i10 = -j1(m10, h0Var, n0Var);
            int i11 = i9 + i10;
            if (z9 && (m9 = i11 - this.f10223r.m()) > 0) {
                this.f10223r.r(-m9);
                return i10 - m9;
            }
            return i10;
        }
        return 0;
    }

    public final View b1() {
        int w7;
        if (this.f10226u) {
            w7 = 0;
        } else {
            w7 = w() - 1;
        }
        return v(w7);
    }

    @Override // androidx.recyclerview.widget.a
    public final void c(String str) {
        if (this.f10231z == null) {
            super.c(str);
        }
    }

    public final View c1() {
        int i9;
        if (this.f10226u) {
            i9 = w() - 1;
        } else {
            i9 = 0;
        }
        return v(i9);
    }

    public final boolean d1() {
        if (this.f10338b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean e() {
        if (this.f10221p == 0) {
            return true;
        }
        return false;
    }

    public void e1(h0 h0Var, n0 n0Var, E e8, D d9) {
        boolean z9;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z10;
        View b9 = e8.b(h0Var);
        if (b9 == null) {
            d9.f2006b = true;
            return;
        }
        C0099c0 c0099c0 = (C0099c0) b9.getLayoutParams();
        if (e8.f2018k == null) {
            boolean z11 = this.f10226u;
            if (e8.f2014f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                b(b9, -1, false);
            } else {
                b(b9, 0, false);
            }
        } else {
            boolean z12 = this.f10226u;
            if (e8.f2014f == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z12 == z9) {
                b(b9, -1, true);
            } else {
                b(b9, 0, true);
            }
        }
        C0099c0 c0099c02 = (C0099c0) b9.getLayoutParams();
        Rect O8 = this.f10338b.O(b9);
        int i13 = O8.left + O8.right;
        int i14 = O8.top + O8.bottom;
        int x5 = a.x(e(), this.f10349n, this.f10347l, J() + I() + ((ViewGroup.MarginLayoutParams) c0099c02).leftMargin + ((ViewGroup.MarginLayoutParams) c0099c02).rightMargin + i13, ((ViewGroup.MarginLayoutParams) c0099c02).width);
        int x9 = a.x(f(), this.f10350o, this.f10348m, H() + K() + ((ViewGroup.MarginLayoutParams) c0099c02).topMargin + ((ViewGroup.MarginLayoutParams) c0099c02).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) c0099c02).height);
        if (E0(b9, x5, x9, c0099c02)) {
            b9.measure(x5, x9);
        }
        d9.f2005a = this.f10223r.e(b9);
        if (this.f10221p == 1) {
            if (d1()) {
                i12 = this.f10349n - J();
                i9 = i12 - this.f10223r.f(b9);
            } else {
                i9 = I();
                i12 = this.f10223r.f(b9) + i9;
            }
            if (e8.f2014f == -1) {
                i10 = e8.f2010b;
                i11 = i10 - d9.f2005a;
            } else {
                i11 = e8.f2010b;
                i10 = d9.f2005a + i11;
            }
        } else {
            int K = K();
            int f9 = this.f10223r.f(b9) + K;
            if (e8.f2014f == -1) {
                int i15 = e8.f2010b;
                int i16 = i15 - d9.f2005a;
                i12 = i15;
                i10 = f9;
                i9 = i16;
                i11 = K;
            } else {
                int i17 = e8.f2010b;
                int i18 = d9.f2005a + i17;
                i9 = i17;
                i10 = f9;
                i11 = K;
                i12 = i18;
            }
        }
        a.S(b9, i9, i11, i12, i10);
        if (c0099c0.f2083a.i() || c0099c0.f2083a.l()) {
            d9.f2007c = true;
        }
        d9.f2008d = b9.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        if (this.f10221p == 1) {
            return true;
        }
        return false;
    }

    public final void g1(h0 h0Var, E e8) {
        if (e8.f2009a && !e8.f2019l) {
            int i9 = e8.f2015g;
            int i10 = e8.f2017i;
            if (e8.f2014f == -1) {
                int w7 = w();
                if (i9 >= 0) {
                    int h7 = (this.f10223r.h() - i9) + i10;
                    if (this.f10226u) {
                        for (int i11 = 0; i11 < w7; i11++) {
                            View v8 = v(i11);
                            if (this.f10223r.g(v8) < h7 || this.f10223r.q(v8) < h7) {
                                h1(h0Var, 0, i11);
                                return;
                            }
                        }
                        return;
                    }
                    int i12 = w7 - 1;
                    for (int i13 = i12; i13 >= 0; i13--) {
                        View v9 = v(i13);
                        if (this.f10223r.g(v9) < h7 || this.f10223r.q(v9) < h7) {
                            h1(h0Var, i12, i13);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i9 >= 0) {
                int i14 = i9 - i10;
                int w9 = w();
                if (this.f10226u) {
                    int i15 = w9 - 1;
                    for (int i16 = i15; i16 >= 0; i16--) {
                        View v10 = v(i16);
                        if (this.f10223r.d(v10) > i14 || this.f10223r.p(v10) > i14) {
                            h1(h0Var, i15, i16);
                            return;
                        }
                    }
                    return;
                }
                for (int i17 = 0; i17 < w9; i17++) {
                    View v11 = v(i17);
                    if (this.f10223r.d(v11) > i14 || this.f10223r.p(v11) > i14) {
                        h1(h0Var, 0, i17);
                        return;
                    }
                }
            }
        }
    }

    public final void h1(h0 h0Var, int i9, int i10) {
        if (i9 != i10) {
            if (i10 > i9) {
                for (int i11 = i10 - 1; i11 >= i9; i11--) {
                    View v8 = v(i11);
                    if (v(i11) != null) {
                        this.f10337a.n(i11);
                    }
                    h0Var.h(v8);
                }
                return;
            }
            while (i9 > i10) {
                View v9 = v(i9);
                if (v(i9) != null) {
                    this.f10337a.n(i9);
                }
                h0Var.h(v9);
                i9--;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void i(int i9, int i10, n0 n0Var, C0120y c0120y) {
        int i11;
        if (this.f10221p != 0) {
            i9 = i10;
        }
        if (w() != 0 && i9 != 0) {
            Q0();
            if (i9 > 0) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            n1(i11, Math.abs(i9), true, n0Var);
            L0(n0Var, this.f10222q, c0120y);
        }
    }

    public final void i1() {
        if (this.f10221p != 1 && d1()) {
            this.f10226u = !this.f10225t;
        } else {
            this.f10226u = this.f10225t;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void j(int i9, C0120y c0120y) {
        boolean z9;
        int i10;
        F f9 = this.f10231z;
        int i11 = -1;
        if (f9 != null && (i10 = f9.f2020a) >= 0) {
            z9 = f9.f2022c;
        } else {
            i1();
            z9 = this.f10226u;
            i10 = this.f10229x;
            if (i10 == -1) {
                i10 = z9 ? i9 - 1 : 0;
            }
        }
        if (!z9) {
            i11 = 1;
        }
        for (int i12 = 0; i12 < this.f10219C && i10 >= 0 && i10 < i9; i12++) {
            c0120y.c(i10, 0);
            i10 += i11;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public void j0(h0 h0Var, n0 n0Var) {
        View view;
        int i9;
        View view2;
        View Y02;
        boolean z9;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int g9;
        int i11;
        boolean z13;
        int i12;
        int i13;
        List list;
        boolean z14;
        int i14;
        int i15;
        int Z02;
        int i16;
        View r5;
        int g10;
        int i17;
        int i18;
        int i19 = -1;
        if ((this.f10231z != null || this.f10229x != -1) && n0Var.b() == 0) {
            r0(h0Var);
            return;
        }
        F f9 = this.f10231z;
        if (f9 != null && (i18 = f9.f2020a) >= 0) {
            this.f10229x = i18;
        }
        Q0();
        this.f10222q.f2009a = false;
        i1();
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f10337a.f53e).contains(view)) {
            view = null;
        }
        v vVar = this.f10217A;
        if (vVar.f298e && this.f10229x == -1 && this.f10231z == null) {
            if (view != null && (this.f10223r.g(view) >= this.f10223r.i() || this.f10223r.d(view) <= this.f10223r.m())) {
                vVar.d(view, a.L(view));
            }
        } else {
            vVar.f();
            vVar.f297d = this.f10226u ^ this.f10227v;
            if (!n0Var.f2170g && (i10 = this.f10229x) != -1) {
                if (i10 >= 0 && i10 < n0Var.b()) {
                    int i20 = this.f10229x;
                    vVar.f295b = i20;
                    F f10 = this.f10231z;
                    if (f10 != null && f10.f2020a >= 0) {
                        boolean z15 = f10.f2022c;
                        vVar.f297d = z15;
                        if (z15) {
                            vVar.f296c = this.f10223r.i() - this.f10231z.f2021b;
                        } else {
                            vVar.f296c = this.f10223r.m() + this.f10231z.f2021b;
                        }
                    } else if (this.f10230y == Integer.MIN_VALUE) {
                        View r7 = r(i20);
                        if (r7 != null) {
                            if (this.f10223r.e(r7) > this.f10223r.n()) {
                                vVar.b();
                            } else if (this.f10223r.g(r7) - this.f10223r.m() < 0) {
                                vVar.f296c = this.f10223r.m();
                                vVar.f297d = false;
                            } else if (this.f10223r.i() - this.f10223r.d(r7) < 0) {
                                vVar.f296c = this.f10223r.i();
                                vVar.f297d = true;
                            } else {
                                if (vVar.f297d) {
                                    g9 = this.f10223r.o() + this.f10223r.d(r7);
                                } else {
                                    g9 = this.f10223r.g(r7);
                                }
                                vVar.f296c = g9;
                            }
                        } else {
                            if (w() > 0) {
                                if (this.f10229x < a.L(v(0))) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11 == this.f10226u) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                vVar.f297d = z12;
                            }
                            vVar.b();
                        }
                    } else {
                        boolean z16 = this.f10226u;
                        vVar.f297d = z16;
                        if (z16) {
                            vVar.f296c = this.f10223r.i() - this.f10230y;
                        } else {
                            vVar.f296c = this.f10223r.m() + this.f10230y;
                        }
                    }
                    vVar.f298e = true;
                } else {
                    this.f10229x = -1;
                    this.f10230y = Integer.MIN_VALUE;
                }
            }
            if (w() != 0) {
                RecyclerView recyclerView2 = this.f10338b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f10337a.f53e).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    C0099c0 c0099c0 = (C0099c0) view2.getLayoutParams();
                    if (!c0099c0.f2083a.i() && c0099c0.f2083a.c() >= 0 && c0099c0.f2083a.c() < n0Var.b()) {
                        vVar.d(view2, a.L(view2));
                        vVar.f298e = true;
                    }
                }
                boolean z17 = this.f10224s;
                boolean z18 = this.f10227v;
                if (z17 == z18 && (Y02 = Y0(h0Var, n0Var, vVar.f297d, z18)) != null) {
                    vVar.c(Y02, a.L(Y02));
                    if (!n0Var.f2170g && J0()) {
                        int g11 = this.f10223r.g(Y02);
                        int d9 = this.f10223r.d(Y02);
                        int m9 = this.f10223r.m();
                        int i21 = this.f10223r.i();
                        if (d9 <= m9 && g11 < m9) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (g11 >= i21 && d9 > i21) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z9 || z10) {
                            if (vVar.f297d) {
                                m9 = i21;
                            }
                            vVar.f296c = m9;
                        }
                    }
                    vVar.f298e = true;
                }
            }
            vVar.b();
            if (this.f10227v) {
                i9 = n0Var.b() - 1;
            } else {
                i9 = 0;
            }
            vVar.f295b = i9;
            vVar.f298e = true;
        }
        E e8 = this.f10222q;
        if (e8.j >= 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        e8.f2014f = i11;
        int[] iArr = this.f10220D;
        iArr[0] = 0;
        iArr[1] = 0;
        K0(n0Var, iArr);
        int m10 = this.f10223r.m() + Math.max(0, iArr[0]);
        int j = this.f10223r.j() + Math.max(0, iArr[1]);
        if (n0Var.f2170g && (i16 = this.f10229x) != -1 && this.f10230y != Integer.MIN_VALUE && (r5 = r(i16)) != null) {
            if (this.f10226u) {
                i17 = this.f10223r.i() - this.f10223r.d(r5);
                g10 = this.f10230y;
            } else {
                g10 = this.f10223r.g(r5) - this.f10223r.m();
                i17 = this.f10230y;
            }
            int i22 = i17 - g10;
            if (i22 > 0) {
                m10 += i22;
            } else {
                j -= i22;
            }
        }
        if (!vVar.f297d ? !this.f10226u : this.f10226u) {
            i19 = 1;
        }
        f1(h0Var, n0Var, vVar, i19);
        q(h0Var);
        E e9 = this.f10222q;
        if (this.f10223r.k() == 0 && this.f10223r.h() == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        e9.f2019l = z13;
        this.f10222q.getClass();
        this.f10222q.f2017i = 0;
        if (vVar.f297d) {
            p1(vVar.f295b, vVar.f296c);
            E e10 = this.f10222q;
            e10.f2016h = m10;
            R0(h0Var, e10, n0Var, false);
            E e11 = this.f10222q;
            i13 = e11.f2010b;
            int i23 = e11.f2012d;
            int i24 = e11.f2011c;
            if (i24 > 0) {
                j += i24;
            }
            o1(vVar.f295b, vVar.f296c);
            E e12 = this.f10222q;
            e12.f2016h = j;
            e12.f2012d += e12.f2013e;
            R0(h0Var, e12, n0Var, false);
            E e13 = this.f10222q;
            i12 = e13.f2010b;
            int i25 = e13.f2011c;
            if (i25 > 0) {
                p1(i23, i13);
                E e14 = this.f10222q;
                e14.f2016h = i25;
                R0(h0Var, e14, n0Var, false);
                i13 = this.f10222q.f2010b;
            }
        } else {
            o1(vVar.f295b, vVar.f296c);
            E e15 = this.f10222q;
            e15.f2016h = j;
            R0(h0Var, e15, n0Var, false);
            E e16 = this.f10222q;
            i12 = e16.f2010b;
            int i26 = e16.f2012d;
            int i27 = e16.f2011c;
            if (i27 > 0) {
                m10 += i27;
            }
            p1(vVar.f295b, vVar.f296c);
            E e17 = this.f10222q;
            e17.f2016h = m10;
            e17.f2012d += e17.f2013e;
            R0(h0Var, e17, n0Var, false);
            E e18 = this.f10222q;
            int i28 = e18.f2010b;
            int i29 = e18.f2011c;
            if (i29 > 0) {
                o1(i26, i12);
                E e19 = this.f10222q;
                e19.f2016h = i29;
                R0(h0Var, e19, n0Var, false);
                i12 = this.f10222q.f2010b;
            }
            i13 = i28;
        }
        if (w() > 0) {
            if (this.f10226u ^ this.f10227v) {
                int Z03 = Z0(i12, h0Var, n0Var, true);
                i14 = i13 + Z03;
                i15 = i12 + Z03;
                Z02 = a1(i14, h0Var, n0Var, false);
            } else {
                int a12 = a1(i13, h0Var, n0Var, true);
                i14 = i13 + a12;
                i15 = i12 + a12;
                Z02 = Z0(i15, h0Var, n0Var, false);
            }
            i13 = i14 + Z02;
            i12 = i15 + Z02;
        }
        if (n0Var.f2173k && w() != 0 && !n0Var.f2170g && J0()) {
            List list2 = h0Var.f2119d;
            int size = list2.size();
            int L8 = a.L(v(0));
            int i30 = 0;
            int i31 = 0;
            for (int i32 = 0; i32 < size; i32++) {
                r0 r0Var = (r0) list2.get(i32);
                if (!r0Var.i()) {
                    if (r0Var.c() < L8) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z19 = this.f10226u;
                    View view3 = r0Var.f2210a;
                    if (z14 != z19) {
                        i30 += this.f10223r.e(view3);
                    } else {
                        i31 += this.f10223r.e(view3);
                    }
                }
            }
            this.f10222q.f2018k = list2;
            if (i30 > 0) {
                p1(a.L(c1()), i13);
                E e20 = this.f10222q;
                e20.f2016h = i30;
                e20.f2011c = 0;
                e20.a(null);
                R0(h0Var, this.f10222q, n0Var, false);
            }
            if (i31 > 0) {
                o1(a.L(b1()), i12);
                E e21 = this.f10222q;
                e21.f2016h = i31;
                e21.f2011c = 0;
                list = null;
                e21.a(null);
                R0(h0Var, this.f10222q, n0Var, false);
            } else {
                list = null;
            }
            this.f10222q.f2018k = list;
        }
        if (!n0Var.f2170g) {
            K k5 = this.f10223r;
            k5.f2041a = k5.n();
        } else {
            vVar.f();
        }
        this.f10224s = this.f10227v;
    }

    public final int j1(int i9, h0 h0Var, n0 n0Var) {
        int i10;
        if (w() != 0 && i9 != 0) {
            Q0();
            this.f10222q.f2009a = true;
            if (i9 > 0) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int abs = Math.abs(i9);
            n1(i10, abs, true, n0Var);
            E e8 = this.f10222q;
            int R02 = R0(h0Var, e8, n0Var, false) + e8.f2015g;
            if (R02 >= 0) {
                if (abs > R02) {
                    i9 = i10 * R02;
                }
                this.f10223r.r(-i9);
                this.f10222q.j = i9;
                return i9;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int k(n0 n0Var) {
        return M0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public void k0(n0 n0Var) {
        this.f10231z = null;
        this.f10229x = -1;
        this.f10230y = Integer.MIN_VALUE;
        this.f10217A.f();
    }

    public final void k1(int i9, int i10) {
        this.f10229x = i9;
        this.f10230y = i10;
        F f9 = this.f10231z;
        if (f9 != null) {
            f9.f2020a = -1;
        }
        v0();
    }

    @Override // androidx.recyclerview.widget.a
    public int l(n0 n0Var) {
        return N0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof F) {
            F f9 = (F) parcelable;
            this.f10231z = f9;
            if (this.f10229x != -1) {
                f9.f2020a = -1;
            }
            v0();
        }
    }

    public final void l1(int i9) {
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException(AbstractC0953k1.j(i9, "invalid orientation:"));
        }
        c(null);
        if (i9 == this.f10221p && this.f10223r != null) {
            return;
        }
        K b9 = K.b(this, i9);
        this.f10223r = b9;
        this.f10217A.f299f = b9;
        this.f10221p = i9;
        v0();
    }

    @Override // androidx.recyclerview.widget.a
    public int m(n0 n0Var) {
        return O0(n0Var);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [F0.F, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [F0.F, android.os.Parcelable, java.lang.Object] */
    @Override // androidx.recyclerview.widget.a
    public final Parcelable m0() {
        F f9 = this.f10231z;
        if (f9 != null) {
            ?? obj = new Object();
            obj.f2020a = f9.f2020a;
            obj.f2021b = f9.f2021b;
            obj.f2022c = f9.f2022c;
            return obj;
        }
        ?? obj2 = new Object();
        if (w() > 0) {
            Q0();
            boolean z9 = this.f10224s ^ this.f10226u;
            obj2.f2022c = z9;
            if (z9) {
                View b12 = b1();
                obj2.f2021b = this.f10223r.i() - this.f10223r.d(b12);
                obj2.f2020a = a.L(b12);
                return obj2;
            }
            View c12 = c1();
            obj2.f2020a = a.L(c12);
            obj2.f2021b = this.f10223r.g(c12) - this.f10223r.m();
            return obj2;
        }
        obj2.f2020a = -1;
        return obj2;
    }

    public void m1(boolean z9) {
        c(null);
        if (this.f10227v == z9) {
            return;
        }
        this.f10227v = z9;
        v0();
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(n0 n0Var) {
        return M0(n0Var);
    }

    public final void n1(int i9, int i10, boolean z9, n0 n0Var) {
        boolean z10;
        int i11;
        int m9;
        E e8 = this.f10222q;
        boolean z11 = false;
        int i12 = 1;
        if (this.f10223r.k() == 0 && this.f10223r.h() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e8.f2019l = z10;
        this.f10222q.f2014f = i9;
        int[] iArr = this.f10220D;
        iArr[0] = 0;
        iArr[1] = 0;
        K0(n0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i9 == 1) {
            z11 = true;
        }
        E e9 = this.f10222q;
        if (z11) {
            i11 = max2;
        } else {
            i11 = max;
        }
        e9.f2016h = i11;
        if (!z11) {
            max = max2;
        }
        e9.f2017i = max;
        if (z11) {
            e9.f2016h = this.f10223r.j() + i11;
            View b12 = b1();
            E e10 = this.f10222q;
            if (this.f10226u) {
                i12 = -1;
            }
            e10.f2013e = i12;
            int L8 = a.L(b12);
            E e11 = this.f10222q;
            e10.f2012d = L8 + e11.f2013e;
            e11.f2010b = this.f10223r.d(b12);
            m9 = this.f10223r.d(b12) - this.f10223r.i();
        } else {
            View c12 = c1();
            E e12 = this.f10222q;
            e12.f2016h = this.f10223r.m() + e12.f2016h;
            E e13 = this.f10222q;
            if (!this.f10226u) {
                i12 = -1;
            }
            e13.f2013e = i12;
            int L9 = a.L(c12);
            E e14 = this.f10222q;
            e13.f2012d = L9 + e14.f2013e;
            e14.f2010b = this.f10223r.g(c12);
            m9 = (-this.f10223r.g(c12)) + this.f10223r.m();
        }
        E e15 = this.f10222q;
        e15.f2011c = i10;
        if (z9) {
            e15.f2011c = i10 - m9;
        }
        e15.f2015g = m9;
    }

    @Override // androidx.recyclerview.widget.a
    public int o(n0 n0Var) {
        return N0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public boolean o0(int i9, Bundle bundle) {
        int min;
        if (super.o0(i9, bundle)) {
            return true;
        }
        if (i9 == 16908343 && bundle != null) {
            if (this.f10221p == 1) {
                int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i10 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f10338b;
                min = Math.min(i10, N(recyclerView.f10273c, recyclerView.f10250F0) - 1);
            } else {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f10338b;
                min = Math.min(i11, y(recyclerView2.f10273c, recyclerView2.f10250F0) - 1);
            }
            if (min >= 0) {
                k1(min, 0);
                return true;
            }
        }
        return false;
    }

    public final void o1(int i9, int i10) {
        int i11;
        this.f10222q.f2011c = this.f10223r.i() - i10;
        E e8 = this.f10222q;
        if (this.f10226u) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        e8.f2013e = i11;
        e8.f2012d = i9;
        e8.f2014f = 1;
        e8.f2010b = i10;
        e8.f2015g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public int p(n0 n0Var) {
        return O0(n0Var);
    }

    public final void p1(int i9, int i10) {
        int i11;
        this.f10222q.f2011c = i10 - this.f10223r.m();
        E e8 = this.f10222q;
        e8.f2012d = i9;
        if (this.f10226u) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        e8.f2013e = i11;
        e8.f2014f = -1;
        e8.f2010b = i10;
        e8.f2015g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public final View r(int i9) {
        int w7 = w();
        if (w7 == 0) {
            return null;
        }
        int L8 = i9 - a.L(v(0));
        if (L8 >= 0 && L8 < w7) {
            View v8 = v(L8);
            if (a.L(v8) == i9) {
                return v8;
            }
        }
        return super.r(i9);
    }

    @Override // androidx.recyclerview.widget.a
    public C0099c0 s() {
        return new C0099c0(-2, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public int w0(int i9, h0 h0Var, n0 n0Var) {
        if (this.f10221p == 1) {
            return 0;
        }
        return j1(i9, h0Var, n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public void x0(int i9) {
        this.f10229x = i9;
        this.f10230y = Integer.MIN_VALUE;
        F f9 = this.f10231z;
        if (f9 != null) {
            f9.f2020a = -1;
        }
        v0();
    }

    @Override // androidx.recyclerview.widget.a
    public int y0(int i9, h0 h0Var, n0 n0Var) {
        if (this.f10221p == 0) {
            return 0;
        }
        return j1(i9, h0Var, n0Var);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [F0.D, java.lang.Object] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        this.f10221p = 1;
        this.f10225t = false;
        this.f10226u = false;
        this.f10227v = false;
        this.f10228w = true;
        this.f10229x = -1;
        this.f10230y = Integer.MIN_VALUE;
        this.f10231z = null;
        this.f10217A = new v();
        this.f10218B = new Object();
        this.f10219C = 2;
        this.f10220D = new int[2];
        C0097b0 M7 = a.M(context, attributeSet, i9, i10);
        l1(M7.f2076a);
        boolean z9 = M7.f2078c;
        c(null);
        if (z9 != this.f10225t) {
            this.f10225t = z9;
            v0();
        }
        m1(M7.f2079d);
    }

    @Override // androidx.recyclerview.widget.a
    public final void X(RecyclerView recyclerView) {
    }

    public void f1(h0 h0Var, n0 n0Var, v vVar, int i9) {
    }
}
