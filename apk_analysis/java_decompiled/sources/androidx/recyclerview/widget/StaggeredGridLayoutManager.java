package androidx.recyclerview.widget;

import A1.g;
import A4.e;
import F0.AbstractC0098c;
import F0.C;
import F0.C0097b0;
import F0.C0099c0;
import F0.C0120y;
import F0.G;
import F0.K;
import F0.h0;
import F0.m0;
import F0.n0;
import F0.v0;
import F0.w0;
import F0.y0;
import F0.z0;
import P.Q;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b7.C0701c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends a implements m0 {

    /* renamed from: B, reason: collision with root package name */
    public final g f10317B;

    /* renamed from: C, reason: collision with root package name */
    public final int f10318C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f10319D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f10320E;

    /* renamed from: F, reason: collision with root package name */
    public y0 f10321F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f10322G;

    /* renamed from: H, reason: collision with root package name */
    public final v0 f10323H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f10324I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f10325J;
    public final e K;

    /* renamed from: p, reason: collision with root package name */
    public final int f10326p;

    /* renamed from: q, reason: collision with root package name */
    public final z0[] f10327q;

    /* renamed from: r, reason: collision with root package name */
    public final K f10328r;

    /* renamed from: s, reason: collision with root package name */
    public final K f10329s;

    /* renamed from: t, reason: collision with root package name */
    public final int f10330t;

    /* renamed from: u, reason: collision with root package name */
    public int f10331u;

    /* renamed from: v, reason: collision with root package name */
    public final C f10332v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10333w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f10335y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10334x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f10336z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f10316A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, F0.C] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        this.f10326p = -1;
        this.f10333w = false;
        g gVar = new g(12, (byte) 0);
        this.f10317B = gVar;
        this.f10318C = 2;
        this.f10322G = new Rect();
        this.f10323H = new v0(this);
        this.f10324I = true;
        this.K = new e(5, this);
        C0097b0 M7 = a.M(context, attributeSet, i9, i10);
        int i11 = M7.f2076a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i11 != this.f10330t) {
            this.f10330t = i11;
            K k5 = this.f10328r;
            this.f10328r = this.f10329s;
            this.f10329s = k5;
            v0();
        }
        int i12 = M7.f2077b;
        c(null);
        if (i12 != this.f10326p) {
            gVar.m();
            v0();
            this.f10326p = i12;
            this.f10335y = new BitSet(this.f10326p);
            this.f10327q = new z0[this.f10326p];
            for (int i13 = 0; i13 < this.f10326p; i13++) {
                this.f10327q[i13] = new z0(this, i13);
            }
            v0();
        }
        boolean z9 = M7.f2078c;
        c(null);
        y0 y0Var = this.f10321F;
        if (y0Var != null && y0Var.f2301h != z9) {
            y0Var.f2301h = z9;
        }
        this.f10333w = z9;
        v0();
        ?? obj = new Object();
        obj.f1992a = true;
        obj.f1997f = 0;
        obj.f1998g = 0;
        this.f10332v = obj;
        this.f10328r = K.b(this, this.f10330t);
        this.f10329s = K.b(this, 1 - this.f10330t);
    }

    public static int m1(int i9, int i10, int i11) {
        int mode;
        if ((i10 == 0 && i11 == 0) || ((mode = View.MeasureSpec.getMode(i9)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i9;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i9) - i10) - i11), mode);
    }

    @Override // androidx.recyclerview.widget.a
    public final void B0(Rect rect, int i9, int i10) {
        int h7;
        int h9;
        int i11 = this.f10326p;
        int J8 = J() + I();
        int H8 = H() + K();
        if (this.f10330t == 1) {
            int height = rect.height() + H8;
            RecyclerView recyclerView = this.f10338b;
            WeakHashMap weakHashMap = Q.f5546a;
            h9 = a.h(i10, height, recyclerView.getMinimumHeight());
            h7 = a.h(i9, (this.f10331u * i11) + J8, this.f10338b.getMinimumWidth());
        } else {
            int width = rect.width() + J8;
            RecyclerView recyclerView2 = this.f10338b;
            WeakHashMap weakHashMap2 = Q.f5546a;
            h7 = a.h(i9, width, recyclerView2.getMinimumWidth());
            h9 = a.h(i10, (this.f10331u * i11) + H8, this.f10338b.getMinimumHeight());
        }
        this.f10338b.setMeasuredDimension(h7, h9);
    }

    @Override // androidx.recyclerview.widget.a
    public final void H0(RecyclerView recyclerView, int i9) {
        G g9 = new G(recyclerView.getContext());
        g9.f2023a = i9;
        I0(g9);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean J0() {
        if (this.f10321F == null) {
            return true;
        }
        return false;
    }

    public final boolean K0() {
        int T02;
        if (w() != 0 && this.f10318C != 0 && this.f10343g) {
            if (this.f10334x) {
                T02 = U0();
                T0();
            } else {
                T02 = T0();
                U0();
            }
            g gVar = this.f10317B;
            if (T02 == 0 && Y0() != null) {
                gVar.m();
                this.f10342f = true;
                v0();
                return true;
            }
        }
        return false;
    }

    public final int L0(n0 n0Var) {
        if (w() == 0) {
            return 0;
        }
        K k5 = this.f10328r;
        boolean z9 = !this.f10324I;
        return AbstractC0098c.c(n0Var, k5, Q0(z9), P0(z9), this, this.f10324I);
    }

    public final int M0(n0 n0Var) {
        if (w() == 0) {
            return 0;
        }
        K k5 = this.f10328r;
        boolean z9 = !this.f10324I;
        return AbstractC0098c.d(n0Var, k5, Q0(z9), P0(z9), this, this.f10324I, this.f10334x);
    }

    @Override // androidx.recyclerview.widget.a
    public final int N(h0 h0Var, n0 n0Var) {
        if (this.f10330t == 0) {
            return Math.min(this.f10326p, n0Var.b());
        }
        return -1;
    }

    public final int N0(n0 n0Var) {
        if (w() == 0) {
            return 0;
        }
        K k5 = this.f10328r;
        boolean z9 = !this.f10324I;
        return AbstractC0098c.e(n0Var, k5, Q0(z9), P0(z9), this, this.f10324I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int, boolean] */
    public final int O0(h0 h0Var, C c3, n0 n0Var) {
        int i9;
        int m9;
        int i10;
        int V02;
        int i11;
        z0 z0Var;
        ?? r62;
        int i12;
        int k5;
        int e8;
        int m10;
        int e9;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        int i17 = 1;
        this.f10335y.set(0, this.f10326p, true);
        C c9 = this.f10332v;
        if (c9.f2000i) {
            if (c3.f1996e == 1) {
                i9 = Integer.MAX_VALUE;
            } else {
                i9 = Integer.MIN_VALUE;
            }
        } else if (c3.f1996e == 1) {
            i9 = c3.f1998g + c3.f1993b;
        } else {
            i9 = c3.f1997f - c3.f1993b;
        }
        int i18 = c3.f1996e;
        for (int i19 = 0; i19 < this.f10326p; i19++) {
            if (!((ArrayList) this.f10327q[i19].f2313f).isEmpty()) {
                l1(this.f10327q[i19], i18, i9);
            }
        }
        if (this.f10334x) {
            m9 = this.f10328r.i();
        } else {
            m9 = this.f10328r.m();
        }
        boolean z9 = false;
        while (true) {
            int i20 = c3.f1994c;
            if (i20 >= 0 && i20 < n0Var.b()) {
                i10 = i17;
            } else {
                i10 = i16;
            }
            if (i10 == 0 || (!c9.f2000i && this.f10335y.isEmpty())) {
                break;
            }
            View view = h0Var.k(Long.MAX_VALUE, c3.f1994c).f2210a;
            c3.f1994c += c3.f1995d;
            w0 w0Var = (w0) view.getLayoutParams();
            int c10 = w0Var.f2083a.c();
            g gVar = this.f10317B;
            int[] iArr = (int[]) gVar.f18b;
            if (iArr != null && c10 < iArr.length) {
                i11 = iArr[c10];
            } else {
                i11 = -1;
            }
            if (i11 == -1) {
                if (c1(c3.f1996e)) {
                    i15 = this.f10326p - i17;
                    i14 = -1;
                    i13 = -1;
                } else {
                    i13 = i17;
                    i14 = this.f10326p;
                    i15 = i16;
                }
                z0 z0Var2 = null;
                if (c3.f1996e == i17) {
                    int m11 = this.f10328r.m();
                    int i21 = Integer.MAX_VALUE;
                    while (i15 != i14) {
                        z0 z0Var3 = this.f10327q[i15];
                        int i22 = z0Var3.i(m11);
                        if (i22 < i21) {
                            i21 = i22;
                            z0Var2 = z0Var3;
                        }
                        i15 += i13;
                    }
                } else {
                    int i23 = this.f10328r.i();
                    int i24 = Integer.MIN_VALUE;
                    while (i15 != i14) {
                        z0 z0Var4 = this.f10327q[i15];
                        int k9 = z0Var4.k(i23);
                        if (k9 > i24) {
                            z0Var2 = z0Var4;
                            i24 = k9;
                        }
                        i15 += i13;
                    }
                }
                z0Var = z0Var2;
                gVar.r(c10);
                ((int[]) gVar.f18b)[c10] = z0Var.f2312e;
            } else {
                z0Var = this.f10327q[i11];
            }
            w0Var.f2255e = z0Var;
            if (c3.f1996e == 1) {
                r62 = 0;
                b(view, -1, false);
            } else {
                r62 = 0;
                b(view, 0, false);
            }
            if (this.f10330t == 1) {
                i12 = 1;
                a1(view, a.x(r62, this.f10331u, this.f10347l, r62, ((ViewGroup.MarginLayoutParams) w0Var).width), a.x(true, this.f10350o, this.f10348m, H() + K(), ((ViewGroup.MarginLayoutParams) w0Var).height));
            } else {
                i12 = 1;
                a1(view, a.x(true, this.f10349n, this.f10347l, J() + I(), ((ViewGroup.MarginLayoutParams) w0Var).width), a.x(false, this.f10331u, this.f10348m, 0, ((ViewGroup.MarginLayoutParams) w0Var).height));
            }
            if (c3.f1996e == i12) {
                e8 = z0Var.i(m9);
                k5 = this.f10328r.e(view) + e8;
            } else {
                k5 = z0Var.k(m9);
                e8 = k5 - this.f10328r.e(view);
            }
            if (c3.f1996e == 1) {
                z0 z0Var5 = w0Var.f2255e;
                z0Var5.getClass();
                w0 w0Var2 = (w0) view.getLayoutParams();
                w0Var2.f2255e = z0Var5;
                ArrayList arrayList = (ArrayList) z0Var5.f2313f;
                arrayList.add(view);
                z0Var5.f2310c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    z0Var5.f2309b = Integer.MIN_VALUE;
                }
                if (w0Var2.f2083a.i() || w0Var2.f2083a.l()) {
                    z0Var5.f2311d = ((StaggeredGridLayoutManager) z0Var5.f2314g).f10328r.e(view) + z0Var5.f2311d;
                }
            } else {
                z0 z0Var6 = w0Var.f2255e;
                z0Var6.getClass();
                w0 w0Var3 = (w0) view.getLayoutParams();
                w0Var3.f2255e = z0Var6;
                ArrayList arrayList2 = (ArrayList) z0Var6.f2313f;
                arrayList2.add(0, view);
                z0Var6.f2309b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    z0Var6.f2310c = Integer.MIN_VALUE;
                }
                if (w0Var3.f2083a.i() || w0Var3.f2083a.l()) {
                    z0Var6.f2311d = ((StaggeredGridLayoutManager) z0Var6.f2314g).f10328r.e(view) + z0Var6.f2311d;
                }
            }
            if (Z0() && this.f10330t == 1) {
                e9 = this.f10329s.i() - (((this.f10326p - 1) - z0Var.f2312e) * this.f10331u);
                m10 = e9 - this.f10329s.e(view);
            } else {
                m10 = this.f10329s.m() + (z0Var.f2312e * this.f10331u);
                e9 = this.f10329s.e(view) + m10;
            }
            if (this.f10330t == 1) {
                a.S(view, m10, e8, e9, k5);
            } else {
                a.S(view, e8, m10, k5, e9);
            }
            l1(z0Var, c9.f1996e, i9);
            e1(h0Var, c9);
            if (c9.f1999h && view.hasFocusable()) {
                this.f10335y.set(z0Var.f2312e, false);
            }
            i17 = 1;
            z9 = true;
            i16 = 0;
        }
        if (!z9) {
            e1(h0Var, c9);
        }
        if (c9.f1996e == -1) {
            V02 = this.f10328r.m() - W0(this.f10328r.m());
        } else {
            V02 = V0(this.f10328r.i()) - this.f10328r.i();
        }
        if (V02 > 0) {
            return Math.min(c3.f1993b, V02);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean P() {
        if (this.f10318C != 0) {
            return true;
        }
        return false;
    }

    public final View P0(boolean z9) {
        int m9 = this.f10328r.m();
        int i9 = this.f10328r.i();
        View view = null;
        for (int w7 = w() - 1; w7 >= 0; w7--) {
            View v8 = v(w7);
            int g9 = this.f10328r.g(v8);
            int d9 = this.f10328r.d(v8);
            if (d9 > m9 && g9 < i9) {
                if (d9 > i9 && z9) {
                    if (view == null) {
                        view = v8;
                    }
                } else {
                    return v8;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean Q() {
        return this.f10333w;
    }

    public final View Q0(boolean z9) {
        int m9 = this.f10328r.m();
        int i9 = this.f10328r.i();
        int w7 = w();
        View view = null;
        for (int i10 = 0; i10 < w7; i10++) {
            View v8 = v(i10);
            int g9 = this.f10328r.g(v8);
            if (this.f10328r.d(v8) > m9 && g9 < i9) {
                if (g9 < m9 && z9) {
                    if (view == null) {
                        view = v8;
                    }
                } else {
                    return v8;
                }
            }
        }
        return view;
    }

    public final void R0(h0 h0Var, n0 n0Var, boolean z9) {
        int i9;
        int V02 = V0(Integer.MIN_VALUE);
        if (V02 != Integer.MIN_VALUE && (i9 = this.f10328r.i() - V02) > 0) {
            int i10 = i9 - (-i1(-i9, h0Var, n0Var));
            if (z9 && i10 > 0) {
                this.f10328r.r(i10);
            }
        }
    }

    public final void S0(h0 h0Var, n0 n0Var, boolean z9) {
        int m9;
        int W02 = W0(Integer.MAX_VALUE);
        if (W02 != Integer.MAX_VALUE && (m9 = W02 - this.f10328r.m()) > 0) {
            int i12 = m9 - i1(m9, h0Var, n0Var);
            if (z9 && i12 > 0) {
                this.f10328r.r(-i12);
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void T(int i9) {
        super.T(i9);
        for (int i10 = 0; i10 < this.f10326p; i10++) {
            z0 z0Var = this.f10327q[i10];
            int i11 = z0Var.f2309b;
            if (i11 != Integer.MIN_VALUE) {
                z0Var.f2309b = i11 + i9;
            }
            int i12 = z0Var.f2310c;
            if (i12 != Integer.MIN_VALUE) {
                z0Var.f2310c = i12 + i9;
            }
        }
    }

    public final int T0() {
        if (w() == 0) {
            return 0;
        }
        return a.L(v(0));
    }

    @Override // androidx.recyclerview.widget.a
    public final void U(int i9) {
        super.U(i9);
        for (int i10 = 0; i10 < this.f10326p; i10++) {
            z0 z0Var = this.f10327q[i10];
            int i11 = z0Var.f2309b;
            if (i11 != Integer.MIN_VALUE) {
                z0Var.f2309b = i11 + i9;
            }
            int i12 = z0Var.f2310c;
            if (i12 != Integer.MIN_VALUE) {
                z0Var.f2310c = i12 + i9;
            }
        }
    }

    public final int U0() {
        int w7 = w();
        if (w7 == 0) {
            return 0;
        }
        return a.L(v(w7 - 1));
    }

    @Override // androidx.recyclerview.widget.a
    public final void V() {
        this.f10317B.m();
        for (int i9 = 0; i9 < this.f10326p; i9++) {
            this.f10327q[i9].b();
        }
    }

    public final int V0(int i9) {
        int i10 = this.f10327q[0].i(i9);
        for (int i11 = 1; i11 < this.f10326p; i11++) {
            int i12 = this.f10327q[i11].i(i9);
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    public final int W0(int i9) {
        int k5 = this.f10327q[0].k(i9);
        for (int i10 = 1; i10 < this.f10326p; i10++) {
            int k9 = this.f10327q[i10].k(i9);
            if (k9 < k5) {
                k5 = k9;
            }
        }
        return k5;
    }

    @Override // androidx.recyclerview.widget.a
    public final void X(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10338b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i9 = 0; i9 < this.f10326p; i9++) {
            this.f10327q[i9].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X0(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0051, code lost:
    
        if (r8.f10330t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if (r8.f10330t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (Z0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
    
        if (Z0() == false) goto L37;
     */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Y(android.view.View r9, int r10, F0.h0 r11, F0.n0 r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y(android.view.View, int, F0.h0, F0.n0):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Y0() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            View Q02 = Q0(false);
            View P02 = P0(false);
            if (Q02 != null && P02 != null) {
                int L8 = a.L(Q02);
                int L9 = a.L(P02);
                if (L8 < L9) {
                    accessibilityEvent.setFromIndex(L8);
                    accessibilityEvent.setToIndex(L9);
                } else {
                    accessibilityEvent.setFromIndex(L9);
                    accessibilityEvent.setToIndex(L8);
                }
            }
        }
    }

    public final boolean Z0() {
        if (this.f10338b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (r4 != r3.f10334x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f10334x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // F0.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.w()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f10334x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.T0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f10334x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f10330t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.a
    public final void a0(h0 h0Var, n0 n0Var, Q.g gVar) {
        super.a0(h0Var, n0Var, gVar);
        gVar.i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void a1(View view, int i9, int i10) {
        Rect rect = this.f10322G;
        d(view, rect);
        w0 w0Var = (w0) view.getLayoutParams();
        int m12 = m1(i9, ((ViewGroup.MarginLayoutParams) w0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) w0Var).rightMargin + rect.right);
        int m13 = m1(i10, ((ViewGroup.MarginLayoutParams) w0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin + rect.bottom);
        if (E0(view, m12, m13, w0Var)) {
            view.measure(m12, m13);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void b0(h0 h0Var, n0 n0Var, View view, Q.g gVar) {
        int i9;
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof w0)) {
            c0(view, gVar);
            return;
        }
        w0 w0Var = (w0) layoutParams;
        if (this.f10330t == 0) {
            z0 z0Var = w0Var.f2255e;
            if (z0Var == null) {
                i10 = -1;
            } else {
                i10 = z0Var.f2312e;
            }
            gVar.j(C0701c.I(false, i10, 1, -1, -1));
            return;
        }
        z0 z0Var2 = w0Var.f2255e;
        if (z0Var2 == null) {
            i9 = -1;
        } else {
            i9 = z0Var2.f2312e;
        }
        gVar.j(C0701c.I(false, -1, -1, i9, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if (r11 != r16.f10334x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0416, code lost:
    
        if (K0() != false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f10334x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b1(F0.h0 r17, F0.n0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b1(F0.h0, F0.n0, boolean):void");
    }

    @Override // androidx.recyclerview.widget.a
    public final void c(String str) {
        if (this.f10321F == null) {
            super.c(str);
        }
    }

    public final boolean c1(int i9) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.f10330t == 0) {
            if (i9 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 == this.f10334x) {
                return false;
            }
            return true;
        }
        if (i9 == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 == this.f10334x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != Z0()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(int i9, int i10) {
        X0(i9, i10, 1);
    }

    public final void d1(int i9, n0 n0Var) {
        int T02;
        int i10;
        if (i9 > 0) {
            T02 = U0();
            i10 = 1;
        } else {
            T02 = T0();
            i10 = -1;
        }
        C c3 = this.f10332v;
        c3.f1992a = true;
        k1(T02, n0Var);
        j1(i10);
        c3.f1994c = T02 + c3.f1995d;
        c3.f1993b = Math.abs(i9);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean e() {
        if (this.f10330t == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final void e0() {
        this.f10317B.m();
        v0();
    }

    public final void e1(h0 h0Var, C c3) {
        int min;
        int min2;
        if (c3.f1992a && !c3.f2000i) {
            if (c3.f1993b == 0) {
                if (c3.f1996e == -1) {
                    f1(h0Var, c3.f1998g);
                    return;
                } else {
                    g1(h0Var, c3.f1997f);
                    return;
                }
            }
            int i9 = 1;
            if (c3.f1996e == -1) {
                int i10 = c3.f1997f;
                int k5 = this.f10327q[0].k(i10);
                while (i9 < this.f10326p) {
                    int k9 = this.f10327q[i9].k(i10);
                    if (k9 > k5) {
                        k5 = k9;
                    }
                    i9++;
                }
                int i11 = i10 - k5;
                if (i11 < 0) {
                    min2 = c3.f1998g;
                } else {
                    min2 = c3.f1998g - Math.min(i11, c3.f1993b);
                }
                f1(h0Var, min2);
                return;
            }
            int i12 = c3.f1998g;
            int i13 = this.f10327q[0].i(i12);
            while (i9 < this.f10326p) {
                int i14 = this.f10327q[i9].i(i12);
                if (i14 < i13) {
                    i13 = i14;
                }
                i9++;
            }
            int i15 = i13 - c3.f1998g;
            if (i15 < 0) {
                min = c3.f1997f;
            } else {
                min = Math.min(i15, c3.f1993b) + c3.f1997f;
            }
            g1(h0Var, min);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        if (this.f10330t == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i9, int i10) {
        X0(i9, i10, 8);
    }

    public final void f1(h0 h0Var, int i9) {
        for (int w7 = w() - 1; w7 >= 0; w7--) {
            View v8 = v(w7);
            if (this.f10328r.g(v8) >= i9 && this.f10328r.q(v8) >= i9) {
                w0 w0Var = (w0) v8.getLayoutParams();
                w0Var.getClass();
                if (((ArrayList) w0Var.f2255e.f2313f).size() != 1) {
                    z0 z0Var = w0Var.f2255e;
                    ArrayList arrayList = (ArrayList) z0Var.f2313f;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    w0 w0Var2 = (w0) view.getLayoutParams();
                    w0Var2.f2255e = null;
                    if (w0Var2.f2083a.i() || w0Var2.f2083a.l()) {
                        z0Var.f2311d -= ((StaggeredGridLayoutManager) z0Var.f2314g).f10328r.e(view);
                    }
                    if (size == 1) {
                        z0Var.f2309b = Integer.MIN_VALUE;
                    }
                    z0Var.f2310c = Integer.MIN_VALUE;
                    t0(v8, h0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g(C0099c0 c0099c0) {
        return c0099c0 instanceof w0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i9, int i10) {
        X0(i9, i10, 2);
    }

    public final void g1(h0 h0Var, int i9) {
        while (w() > 0) {
            View v8 = v(0);
            if (this.f10328r.d(v8) <= i9 && this.f10328r.p(v8) <= i9) {
                w0 w0Var = (w0) v8.getLayoutParams();
                w0Var.getClass();
                if (((ArrayList) w0Var.f2255e.f2313f).size() != 1) {
                    z0 z0Var = w0Var.f2255e;
                    ArrayList arrayList = (ArrayList) z0Var.f2313f;
                    View view = (View) arrayList.remove(0);
                    w0 w0Var2 = (w0) view.getLayoutParams();
                    w0Var2.f2255e = null;
                    if (arrayList.size() == 0) {
                        z0Var.f2310c = Integer.MIN_VALUE;
                    }
                    if (w0Var2.f2083a.i() || w0Var2.f2083a.l()) {
                        z0Var.f2311d -= ((StaggeredGridLayoutManager) z0Var.f2314g).f10328r.e(view);
                    }
                    z0Var.f2309b = Integer.MIN_VALUE;
                    t0(v8, h0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void h1() {
        if (this.f10330t != 1 && Z0()) {
            this.f10334x = !this.f10333w;
        } else {
            this.f10334x = this.f10333w;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void i(int i9, int i10, n0 n0Var, C0120y c0120y) {
        C c3;
        int i11;
        int i12;
        if (this.f10330t != 0) {
            i9 = i10;
        }
        if (w() != 0 && i9 != 0) {
            d1(i9, n0Var);
            int[] iArr = this.f10325J;
            if (iArr == null || iArr.length < this.f10326p) {
                this.f10325J = new int[this.f10326p];
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.f10326p;
                c3 = this.f10332v;
                if (i13 >= i15) {
                    break;
                }
                if (c3.f1995d == -1) {
                    i11 = c3.f1997f;
                    i12 = this.f10327q[i13].k(i11);
                } else {
                    i11 = this.f10327q[i13].i(c3.f1998g);
                    i12 = c3.f1998g;
                }
                int i16 = i11 - i12;
                if (i16 >= 0) {
                    this.f10325J[i14] = i16;
                    i14++;
                }
                i13++;
            }
            Arrays.sort(this.f10325J, 0, i14);
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = c3.f1994c;
                if (i18 >= 0 && i18 < n0Var.b()) {
                    c0120y.c(c3.f1994c, this.f10325J[i17]);
                    c3.f1994c += c3.f1995d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(RecyclerView recyclerView, int i9, int i10) {
        X0(i9, i10, 4);
    }

    public final int i1(int i9, h0 h0Var, n0 n0Var) {
        if (w() == 0 || i9 == 0) {
            return 0;
        }
        d1(i9, n0Var);
        C c3 = this.f10332v;
        int O02 = O0(h0Var, c3, n0Var);
        if (c3.f1993b >= O02) {
            if (i9 < 0) {
                i9 = -O02;
            } else {
                i9 = O02;
            }
        }
        this.f10328r.r(-i9);
        this.f10319D = this.f10334x;
        c3.f1993b = 0;
        e1(h0Var, c3);
        return i9;
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(h0 h0Var, n0 n0Var) {
        b1(h0Var, n0Var, true);
    }

    public final void j1(int i9) {
        boolean z9;
        C c3 = this.f10332v;
        c3.f1996e = i9;
        boolean z10 = this.f10334x;
        int i10 = 1;
        if (i9 == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z10 != z9) {
            i10 = -1;
        }
        c3.f1995d = i10;
    }

    @Override // androidx.recyclerview.widget.a
    public final int k(n0 n0Var) {
        return L0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(n0 n0Var) {
        this.f10336z = -1;
        this.f10316A = Integer.MIN_VALUE;
        this.f10321F = null;
        this.f10323H.a();
    }

    public final void k1(int i9, n0 n0Var) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        boolean z10;
        C c3 = this.f10332v;
        boolean z11 = false;
        c3.f1993b = 0;
        c3.f1994c = i9;
        G g9 = this.f10341e;
        if (g9 != null && g9.f2027e) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && (i12 = n0Var.f2164a) != -1) {
            boolean z12 = this.f10334x;
            if (i12 < i9) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                i10 = this.f10328r.n();
                i11 = 0;
            } else {
                i11 = this.f10328r.n();
                i10 = 0;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null && recyclerView.f10280h) {
            c3.f1997f = this.f10328r.m() - i11;
            c3.f1998g = this.f10328r.i() + i10;
        } else {
            c3.f1998g = this.f10328r.h() + i10;
            c3.f1997f = -i11;
        }
        c3.f1999h = false;
        c3.f1992a = true;
        if (this.f10328r.k() == 0 && this.f10328r.h() == 0) {
            z11 = true;
        }
        c3.f2000i = z11;
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(n0 n0Var) {
        return M0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof y0) {
            y0 y0Var = (y0) parcelable;
            this.f10321F = y0Var;
            if (this.f10336z != -1) {
                y0Var.f2297d = null;
                y0Var.f2296c = 0;
                y0Var.f2294a = -1;
                y0Var.f2295b = -1;
                y0Var.f2297d = null;
                y0Var.f2296c = 0;
                y0Var.f2298e = 0;
                y0Var.f2299f = null;
                y0Var.f2300g = null;
            }
            v0();
        }
    }

    public final void l1(z0 z0Var, int i9, int i10) {
        int i11 = z0Var.f2311d;
        int i12 = z0Var.f2312e;
        if (i9 == -1) {
            int i13 = z0Var.f2309b;
            if (i13 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) z0Var.f2313f).get(0);
                w0 w0Var = (w0) view.getLayoutParams();
                z0Var.f2309b = ((StaggeredGridLayoutManager) z0Var.f2314g).f10328r.g(view);
                w0Var.getClass();
                i13 = z0Var.f2309b;
            }
            if (i13 + i11 <= i10) {
                this.f10335y.set(i12, false);
                return;
            }
            return;
        }
        int i14 = z0Var.f2310c;
        if (i14 == Integer.MIN_VALUE) {
            z0Var.a();
            i14 = z0Var.f2310c;
        }
        if (i14 - i11 >= i10) {
            this.f10335y.set(i12, false);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(n0 n0Var) {
        return N0(n0Var);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, F0.y0] */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.os.Parcelable, java.lang.Object, F0.y0] */
    @Override // androidx.recyclerview.widget.a
    public final Parcelable m0() {
        int T02;
        View Q02;
        int k5;
        int m9;
        int[] iArr;
        y0 y0Var = this.f10321F;
        if (y0Var != null) {
            ?? obj = new Object();
            obj.f2296c = y0Var.f2296c;
            obj.f2294a = y0Var.f2294a;
            obj.f2295b = y0Var.f2295b;
            obj.f2297d = y0Var.f2297d;
            obj.f2298e = y0Var.f2298e;
            obj.f2299f = y0Var.f2299f;
            obj.f2301h = y0Var.f2301h;
            obj.f2302i = y0Var.f2302i;
            obj.j = y0Var.j;
            obj.f2300g = y0Var.f2300g;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f2301h = this.f10333w;
        obj2.f2302i = this.f10319D;
        obj2.j = this.f10320E;
        g gVar = this.f10317B;
        if (gVar != null && (iArr = (int[]) gVar.f18b) != null) {
            obj2.f2299f = iArr;
            obj2.f2298e = iArr.length;
            obj2.f2300g = (ArrayList) gVar.f19c;
        } else {
            obj2.f2298e = 0;
        }
        int i9 = -1;
        if (w() > 0) {
            if (this.f10319D) {
                T02 = U0();
            } else {
                T02 = T0();
            }
            obj2.f2294a = T02;
            if (this.f10334x) {
                Q02 = P0(true);
            } else {
                Q02 = Q0(true);
            }
            if (Q02 != null) {
                i9 = a.L(Q02);
            }
            obj2.f2295b = i9;
            int i10 = this.f10326p;
            obj2.f2296c = i10;
            obj2.f2297d = new int[i10];
            for (int i11 = 0; i11 < this.f10326p; i11++) {
                if (this.f10319D) {
                    k5 = this.f10327q[i11].i(Integer.MIN_VALUE);
                    if (k5 != Integer.MIN_VALUE) {
                        m9 = this.f10328r.i();
                        k5 -= m9;
                        obj2.f2297d[i11] = k5;
                    } else {
                        obj2.f2297d[i11] = k5;
                    }
                } else {
                    k5 = this.f10327q[i11].k(Integer.MIN_VALUE);
                    if (k5 != Integer.MIN_VALUE) {
                        m9 = this.f10328r.m();
                        k5 -= m9;
                        obj2.f2297d[i11] = k5;
                    } else {
                        obj2.f2297d[i11] = k5;
                    }
                }
            }
            return obj2;
        }
        obj2.f2294a = -1;
        obj2.f2295b = -1;
        obj2.f2296c = 0;
        return obj2;
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(n0 n0Var) {
        return L0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void n0(int i9) {
        if (i9 == 0) {
            K0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(n0 n0Var) {
        return M0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(n0 n0Var) {
        return N0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final C0099c0 s() {
        if (this.f10330t == 0) {
            return new C0099c0(-2, -1);
        }
        return new C0099c0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final C0099c0 t(Context context, AttributeSet attributeSet) {
        return new C0099c0(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.a
    public final C0099c0 u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0099c0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0099c0(layoutParams);
    }

    @Override // androidx.recyclerview.widget.a
    public final int w0(int i9, h0 h0Var, n0 n0Var) {
        return i1(i9, h0Var, n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void x0(int i9) {
        y0 y0Var = this.f10321F;
        if (y0Var != null && y0Var.f2294a != i9) {
            y0Var.f2297d = null;
            y0Var.f2296c = 0;
            y0Var.f2294a = -1;
            y0Var.f2295b = -1;
        }
        this.f10336z = i9;
        this.f10316A = Integer.MIN_VALUE;
        v0();
    }

    @Override // androidx.recyclerview.widget.a
    public final int y(h0 h0Var, n0 n0Var) {
        if (this.f10330t == 1) {
            return Math.min(this.f10326p, n0Var.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.a
    public final int y0(int i9, h0 h0Var, n0 n0Var) {
        return i1(i9, h0Var, n0Var);
    }
}
