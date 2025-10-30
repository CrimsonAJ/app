package com.google.android.flexbox;

import F0.C0097b0;
import F0.C0099c0;
import F0.G;
import F0.J;
import F0.K;
import F0.h0;
import F0.m0;
import F0.n0;
import Y2.r;
import Z3.j;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.List;
import o4.C1696b;
import o4.C1697c;
import o4.C1698d;
import o4.C1699e;
import o4.C1700f;

/* loaded from: classes.dex */
public class FlexboxLayoutManager extends a implements m0 {

    /* renamed from: N, reason: collision with root package name */
    public static final Rect f14520N = new Rect();

    /* renamed from: B, reason: collision with root package name */
    public K f14522B;

    /* renamed from: C, reason: collision with root package name */
    public K f14523C;

    /* renamed from: D, reason: collision with root package name */
    public C1700f f14524D;

    /* renamed from: J, reason: collision with root package name */
    public final Context f14530J;
    public View K;

    /* renamed from: p, reason: collision with root package name */
    public int f14533p;

    /* renamed from: q, reason: collision with root package name */
    public int f14534q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14535r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14537t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14538u;

    /* renamed from: x, reason: collision with root package name */
    public h0 f14541x;

    /* renamed from: y, reason: collision with root package name */
    public n0 f14542y;

    /* renamed from: z, reason: collision with root package name */
    public C1699e f14543z;

    /* renamed from: s, reason: collision with root package name */
    public final int f14536s = -1;

    /* renamed from: v, reason: collision with root package name */
    public List f14539v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final r f14540w = new r(this);

    /* renamed from: A, reason: collision with root package name */
    public final C1697c f14521A = new C1697c(this);

    /* renamed from: E, reason: collision with root package name */
    public int f14525E = -1;

    /* renamed from: F, reason: collision with root package name */
    public int f14526F = Integer.MIN_VALUE;

    /* renamed from: G, reason: collision with root package name */
    public int f14527G = Integer.MIN_VALUE;

    /* renamed from: H, reason: collision with root package name */
    public int f14528H = Integer.MIN_VALUE;

    /* renamed from: I, reason: collision with root package name */
    public final SparseArray f14529I = new SparseArray();

    /* renamed from: L, reason: collision with root package name */
    public int f14531L = -1;

    /* renamed from: M, reason: collision with root package name */
    public final j f14532M = new j();

    public FlexboxLayoutManager(Context context) {
        e1(0);
        f1();
        if (this.f14535r != 4) {
            q0();
            this.f14539v.clear();
            C1697c c1697c = this.f14521A;
            C1697c.b(c1697c);
            c1697c.f21613d = 0;
            this.f14535r = 4;
            v0();
        }
        this.f14530J = context;
    }

    public static boolean R(int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i9 != i11) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i9) {
                return false;
            }
            return true;
        }
        if (size < i9) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void H0(RecyclerView recyclerView, int i9) {
        G g9 = new G(recyclerView.getContext());
        g9.f2023a = i9;
        I0(g9);
    }

    public final int K0(n0 n0Var) {
        if (w() != 0) {
            int b9 = n0Var.b();
            N0();
            View P02 = P0(b9);
            View R02 = R0(b9);
            if (n0Var.b() != 0 && P02 != null && R02 != null) {
                return Math.min(this.f14522B.n(), this.f14522B.d(R02) - this.f14522B.g(P02));
            }
            return 0;
        }
        return 0;
    }

    public final int L0(n0 n0Var) {
        if (w() != 0) {
            int b9 = n0Var.b();
            View P02 = P0(b9);
            View R02 = R0(b9);
            if (n0Var.b() != 0 && P02 != null && R02 != null) {
                int L8 = a.L(P02);
                int L9 = a.L(R02);
                int abs = Math.abs(this.f14522B.d(R02) - this.f14522B.g(P02));
                int i9 = ((int[]) this.f14540w.f8649c)[L8];
                if (i9 != 0 && i9 != -1) {
                    return Math.round((i9 * (abs / ((r3[L9] - i9) + 1))) + (this.f14522B.m() - this.f14522B.g(P02)));
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    public final int M0(n0 n0Var) {
        int L8;
        if (w() != 0) {
            int b9 = n0Var.b();
            View P02 = P0(b9);
            View R02 = R0(b9);
            if (n0Var.b() != 0 && P02 != null && R02 != null) {
                View T02 = T0(0, w());
                int i9 = -1;
                if (T02 == null) {
                    L8 = -1;
                } else {
                    L8 = a.L(T02);
                }
                View T03 = T0(w() - 1, -1);
                if (T03 != null) {
                    i9 = a.L(T03);
                }
                return (int) ((Math.abs(this.f14522B.d(R02) - this.f14522B.g(P02)) / ((i9 - L8) + 1)) * n0Var.b());
            }
        }
        return 0;
    }

    public final void N0() {
        if (this.f14522B != null) {
            return;
        }
        if (c1()) {
            if (this.f14534q == 0) {
                this.f14522B = new J(this, 0);
                this.f14523C = new J(this, 1);
                return;
            } else {
                this.f14522B = new J(this, 1);
                this.f14523C = new J(this, 0);
                return;
            }
        }
        if (this.f14534q == 0) {
            this.f14522B = new J(this, 1);
            this.f14523C = new J(this, 0);
        } else {
            this.f14522B = new J(this, 0);
            this.f14523C = new J(this, 1);
        }
    }

    public final int O0(h0 h0Var, n0 n0Var, C1699e c1699e) {
        int i9;
        int i10;
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        r rVar;
        float f9;
        int i15;
        Rect rect;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int i19;
        int i20;
        int i21;
        r rVar2;
        Rect rect2;
        int i22;
        int i23 = c1699e.f21631f;
        if (i23 != Integer.MIN_VALUE) {
            int i24 = c1699e.f21626a;
            if (i24 < 0) {
                c1699e.f21631f = i23 + i24;
            }
            d1(h0Var, c1699e);
        }
        int i25 = c1699e.f21626a;
        boolean c12 = c1();
        int i26 = i25;
        int i27 = 0;
        while (true) {
            if (i26 <= 0 && !this.f14543z.f21627b) {
                break;
            }
            List list = this.f14539v;
            int i28 = c1699e.f21629d;
            if (i28 < 0 || i28 >= n0Var.b() || (i9 = c1699e.f21628c) < 0 || i9 >= list.size()) {
                break;
            }
            C1696b c1696b = (C1696b) this.f14539v.get(c1699e.f21628c);
            c1699e.f21629d = c1696b.f21606k;
            boolean c13 = c1();
            C1697c c1697c = this.f14521A;
            r rVar3 = this.f14540w;
            Rect rect3 = f14520N;
            if (c13) {
                int I4 = I();
                int J8 = J();
                int i29 = this.f10349n;
                int i30 = c1699e.f21630e;
                if (c1699e.f21633h == -1) {
                    i30 -= c1696b.f21599c;
                }
                int i31 = i30;
                int i32 = c1699e.f21629d;
                float f10 = c1697c.f21613d;
                float f11 = I4 - f10;
                float f12 = (i29 - J8) - f10;
                float max = Math.max(0.0f, 0.0f);
                int i33 = c1696b.f21600d;
                i10 = i25;
                int i34 = i32;
                int i35 = 0;
                while (i34 < i32 + i33) {
                    int i36 = i34;
                    View Y02 = Y0(i36);
                    if (Y02 == null) {
                        i19 = i35;
                        i22 = i36;
                        z10 = c12;
                        i20 = i33;
                        i21 = i32;
                        rVar2 = rVar3;
                        rect2 = rect3;
                    } else {
                        z10 = c12;
                        if (c1699e.f21633h == 1) {
                            d(Y02, rect3);
                            b(Y02, -1, false);
                        } else {
                            d(Y02, rect3);
                            b(Y02, i35, false);
                            i35++;
                        }
                        float f13 = f12;
                        long j = ((long[]) rVar3.f8650d)[i36];
                        int i37 = (int) j;
                        int i38 = (int) (j >> 32);
                        if (g1(Y02, i37, i38, (C1698d) Y02.getLayoutParams())) {
                            Y02.measure(i37, i38);
                        }
                        float f14 = f11 + ((ViewGroup.MarginLayoutParams) r6).leftMargin + ((C0099c0) Y02.getLayoutParams()).f2084b.left;
                        float f15 = f13 - (((ViewGroup.MarginLayoutParams) r6).rightMargin + ((C0099c0) Y02.getLayoutParams()).f2084b.right);
                        int i39 = i31 + ((C0099c0) Y02.getLayoutParams()).f2084b.top;
                        i19 = i35;
                        if (this.f14537t) {
                            i20 = i33;
                            i21 = i32;
                            rect2 = rect3;
                            i22 = i36;
                            rVar2 = rVar3;
                            this.f14540w.E(Y02, c1696b, Math.round(f15) - Y02.getMeasuredWidth(), i39, Math.round(f15), Y02.getMeasuredHeight() + i39);
                        } else {
                            i20 = i33;
                            i21 = i32;
                            rVar2 = rVar3;
                            rect2 = rect3;
                            i22 = i36;
                            this.f14540w.E(Y02, c1696b, Math.round(f14), i39, Y02.getMeasuredWidth() + Math.round(f14), Y02.getMeasuredHeight() + i39);
                        }
                        float measuredWidth = Y02.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + ((C0099c0) Y02.getLayoutParams()).f2084b.right + max + f14;
                        f12 = f15 - (((Y02.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin) + ((C0099c0) Y02.getLayoutParams()).f2084b.left) + max);
                        f11 = measuredWidth;
                    }
                    i34 = i22 + 1;
                    rVar3 = rVar2;
                    i32 = i21;
                    c12 = z10;
                    i35 = i19;
                    i33 = i20;
                    rect3 = rect2;
                }
                z9 = c12;
                c1699e.f21628c += this.f14543z.f21633h;
                i14 = c1696b.f21599c;
                i13 = i26;
            } else {
                i10 = i25;
                z9 = c12;
                r rVar4 = rVar3;
                Rect rect4 = rect3;
                int K = K();
                int H8 = H();
                int i40 = this.f10350o;
                int i41 = c1699e.f21630e;
                if (c1699e.f21633h == -1) {
                    int i42 = c1696b.f21599c;
                    i12 = i41 + i42;
                    i11 = i41 - i42;
                } else {
                    i11 = i41;
                    i12 = i11;
                }
                int i43 = c1699e.f21629d;
                float f16 = i40 - H8;
                float f17 = c1697c.f21613d;
                float f18 = K - f17;
                float f19 = f16 - f17;
                float max2 = Math.max(0.0f, 0.0f);
                int i44 = c1696b.f21600d;
                float f20 = f19;
                int i45 = i43;
                int i46 = 0;
                while (i45 < i43 + i44) {
                    int i47 = i43;
                    View Y03 = Y0(i45);
                    if (Y03 == null) {
                        rVar = rVar4;
                        i15 = i26;
                        i16 = i44;
                        i17 = i45;
                        i18 = i47;
                        rect = rect4;
                    } else {
                        rVar = rVar4;
                        float f21 = f18;
                        long j4 = ((long[]) rVar4.f8650d)[i45];
                        int i48 = (int) j4;
                        int i49 = (int) (j4 >> 32);
                        if (g1(Y03, i48, i49, (C1698d) Y03.getLayoutParams())) {
                            Y03.measure(i48, i49);
                        }
                        float f22 = f21 + ((ViewGroup.MarginLayoutParams) r4).topMargin + ((C0099c0) Y03.getLayoutParams()).f2084b.top;
                        float f23 = f20 - (((ViewGroup.MarginLayoutParams) r4).rightMargin + ((C0099c0) Y03.getLayoutParams()).f2084b.bottom);
                        if (c1699e.f21633h == 1) {
                            rect = rect4;
                            d(Y03, rect);
                            f9 = f23;
                            i15 = i26;
                            b(Y03, -1, false);
                        } else {
                            f9 = f23;
                            i15 = i26;
                            rect = rect4;
                            d(Y03, rect);
                            b(Y03, i46, false);
                            i46++;
                        }
                        int i50 = i11 + ((C0099c0) Y03.getLayoutParams()).f2084b.left;
                        int i51 = i12 - ((C0099c0) Y03.getLayoutParams()).f2084b.right;
                        boolean z11 = this.f14537t;
                        if (z11) {
                            if (this.f14538u) {
                                i16 = i44;
                                i18 = i47;
                                i17 = i45;
                                this.f14540w.F(Y03, c1696b, z11, i51 - Y03.getMeasuredWidth(), Math.round(f9) - Y03.getMeasuredHeight(), i51, Math.round(f9));
                            } else {
                                i16 = i44;
                                i17 = i45;
                                i18 = i47;
                                this.f14540w.F(Y03, c1696b, z11, i51 - Y03.getMeasuredWidth(), Math.round(f22), i51, Y03.getMeasuredHeight() + Math.round(f22));
                            }
                        } else {
                            i16 = i44;
                            i17 = i45;
                            i18 = i47;
                            if (this.f14538u) {
                                this.f14540w.F(Y03, c1696b, z11, i50, Math.round(f9) - Y03.getMeasuredHeight(), Y03.getMeasuredWidth() + i50, Math.round(f9));
                            } else {
                                this.f14540w.F(Y03, c1696b, z11, i50, Math.round(f22), Y03.getMeasuredWidth() + i50, Y03.getMeasuredHeight() + Math.round(f22));
                            }
                        }
                        f20 = f9 - (((Y03.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).bottomMargin) + ((C0099c0) Y03.getLayoutParams()).f2084b.top) + max2);
                        f18 = Y03.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).topMargin + ((C0099c0) Y03.getLayoutParams()).f2084b.bottom + max2 + f22;
                    }
                    i45 = i17 + 1;
                    rect4 = rect;
                    i43 = i18;
                    i26 = i15;
                    rVar4 = rVar;
                    i44 = i16;
                }
                i13 = i26;
                c1699e.f21628c += this.f14543z.f21633h;
                i14 = c1696b.f21599c;
            }
            i27 += i14;
            if (!z9 && this.f14537t) {
                c1699e.f21630e -= c1696b.f21599c * c1699e.f21633h;
            } else {
                c1699e.f21630e += c1696b.f21599c * c1699e.f21633h;
            }
            i26 = i13 - c1696b.f21599c;
            i25 = i10;
            c12 = z9;
        }
        int i52 = i25;
        int i53 = c1699e.f21626a - i27;
        c1699e.f21626a = i53;
        int i54 = c1699e.f21631f;
        if (i54 != Integer.MIN_VALUE) {
            int i55 = i54 + i27;
            c1699e.f21631f = i55;
            if (i53 < 0) {
                c1699e.f21631f = i55 + i53;
            }
            d1(h0Var, c1699e);
        }
        return i52 - c1699e.f21626a;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean P() {
        return true;
    }

    public final View P0(int i9) {
        View U02 = U0(0, w(), i9);
        if (U02 != null) {
            int i10 = ((int[]) this.f14540w.f8649c)[a.L(U02)];
            if (i10 == -1) {
                return null;
            }
            return Q0(U02, (C1696b) this.f14539v.get(i10));
        }
        return null;
    }

    public final View Q0(View view, C1696b c1696b) {
        boolean c12 = c1();
        int i9 = c1696b.f21600d;
        for (int i10 = 1; i10 < i9; i10++) {
            View v8 = v(i10);
            if (v8 != null && v8.getVisibility() != 8) {
                if (this.f14537t && !c12) {
                    if (this.f14522B.d(view) >= this.f14522B.d(v8)) {
                    }
                    view = v8;
                } else {
                    if (this.f14522B.g(view) <= this.f14522B.g(v8)) {
                    }
                    view = v8;
                }
            }
        }
        return view;
    }

    public final View R0(int i9) {
        View U02 = U0(w() - 1, -1, i9);
        if (U02 == null) {
            return null;
        }
        return S0(U02, (C1696b) this.f14539v.get(((int[]) this.f14540w.f8649c)[a.L(U02)]));
    }

    public final View S0(View view, C1696b c1696b) {
        boolean c12 = c1();
        int w7 = (w() - c1696b.f21600d) - 1;
        for (int w9 = w() - 2; w9 > w7; w9--) {
            View v8 = v(w9);
            if (v8 != null && v8.getVisibility() != 8) {
                if (this.f14537t && !c12) {
                    if (this.f14522B.g(view) <= this.f14522B.g(v8)) {
                    }
                    view = v8;
                } else {
                    if (this.f14522B.d(view) >= this.f14522B.d(v8)) {
                    }
                    view = v8;
                }
            }
        }
        return view;
    }

    public final View T0(int i9, int i10) {
        int i11;
        boolean z9;
        if (i10 > i9) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        while (i9 != i10) {
            View v8 = v(i9);
            int I4 = I();
            int K = K();
            int J8 = this.f10349n - J();
            int H8 = this.f10350o - H();
            int B9 = a.B(v8) - ((ViewGroup.MarginLayoutParams) ((C0099c0) v8.getLayoutParams())).leftMargin;
            int F2 = a.F(v8) - ((ViewGroup.MarginLayoutParams) ((C0099c0) v8.getLayoutParams())).topMargin;
            int E8 = a.E(v8) + ((ViewGroup.MarginLayoutParams) ((C0099c0) v8.getLayoutParams())).rightMargin;
            int z10 = a.z(v8) + ((ViewGroup.MarginLayoutParams) ((C0099c0) v8.getLayoutParams())).bottomMargin;
            boolean z11 = false;
            if (B9 < J8 && E8 < I4) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (F2 >= H8 || z10 >= K) {
                z11 = true;
            }
            if (z9 && z11) {
                return v8;
            }
            i9 += i11;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o4.e] */
    public final View U0(int i9, int i10, int i11) {
        int L8;
        N0();
        int i12 = 1;
        if (this.f14543z == null) {
            ?? obj = new Object();
            obj.f21633h = 1;
            this.f14543z = obj;
        }
        int m9 = this.f14522B.m();
        int i13 = this.f14522B.i();
        if (i10 <= i9) {
            i12 = -1;
        }
        View view = null;
        View view2 = null;
        while (i9 != i10) {
            View v8 = v(i9);
            if (v8 != null && (L8 = a.L(v8)) >= 0 && L8 < i11) {
                if (((C0099c0) v8.getLayoutParams()).f2083a.i()) {
                    if (view2 == null) {
                        view2 = v8;
                    }
                } else {
                    if (this.f14522B.g(v8) >= m9 && this.f14522B.d(v8) <= i13) {
                        return v8;
                    }
                    if (view == null) {
                        view = v8;
                    }
                }
            }
            i9 += i12;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override // androidx.recyclerview.widget.a
    public final void V() {
        q0();
    }

    public final int V0(int i9, h0 h0Var, n0 n0Var, boolean z9) {
        int i10;
        int i11;
        if (!c1() && this.f14537t) {
            int m9 = i9 - this.f14522B.m();
            if (m9 > 0) {
                i10 = a1(m9, h0Var, n0Var);
            } else {
                return 0;
            }
        } else {
            int i12 = this.f14522B.i() - i9;
            if (i12 > 0) {
                i10 = -a1(-i12, h0Var, n0Var);
            } else {
                return 0;
            }
        }
        int i13 = i9 + i10;
        if (z9 && (i11 = this.f14522B.i() - i13) > 0) {
            this.f14522B.r(i11);
            return i11 + i10;
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.a
    public final void W(RecyclerView recyclerView) {
        this.K = (View) recyclerView.getParent();
    }

    public final int W0(int i9, h0 h0Var, n0 n0Var, boolean z9) {
        int i10;
        int m9;
        if (!c1() && this.f14537t) {
            int i11 = this.f14522B.i() - i9;
            if (i11 > 0) {
                i10 = a1(-i11, h0Var, n0Var);
            } else {
                return 0;
            }
        } else {
            int m10 = i9 - this.f14522B.m();
            if (m10 > 0) {
                i10 = -a1(m10, h0Var, n0Var);
            } else {
                return 0;
            }
        }
        int i12 = i9 + i10;
        if (z9 && (m9 = i12 - this.f14522B.m()) > 0) {
            this.f14522B.r(-m9);
            return i10 - m9;
        }
        return i10;
    }

    public final int X0(View view) {
        if (c1()) {
            return ((C0099c0) view.getLayoutParams()).f2084b.top + ((C0099c0) view.getLayoutParams()).f2084b.bottom;
        }
        return ((C0099c0) view.getLayoutParams()).f2084b.left + ((C0099c0) view.getLayoutParams()).f2084b.right;
    }

    public final View Y0(int i9) {
        View view = (View) this.f14529I.get(i9);
        if (view != null) {
            return view;
        }
        return this.f14541x.k(Long.MAX_VALUE, i9).f2210a;
    }

    public final int Z0() {
        if (this.f14539v.size() == 0) {
            return 0;
        }
        int size = this.f14539v.size();
        int i9 = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = Math.max(i9, ((C1696b) this.f14539v.get(i10)).f21597a);
        }
        return i9;
    }

    @Override // F0.m0
    public final PointF a(int i9) {
        View v8;
        int i10;
        if (w() == 0 || (v8 = v(0)) == null) {
            return null;
        }
        if (i9 < a.L(v8)) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        if (c1()) {
            return new PointF(0.0f, i10);
        }
        return new PointF(i10, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a1(int r20, F0.h0 r21, F0.n0 r22) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.a1(int, F0.h0, F0.n0):int");
    }

    public final int b1(int i9) {
        int height;
        int i10;
        if (w() != 0 && i9 != 0) {
            N0();
            boolean c12 = c1();
            View view = this.K;
            if (c12) {
                height = view.getWidth();
            } else {
                height = view.getHeight();
            }
            if (c12) {
                i10 = this.f10349n;
            } else {
                i10 = this.f10350o;
            }
            int layoutDirection = this.f10338b.getLayoutDirection();
            C1697c c1697c = this.f14521A;
            if (layoutDirection == 1) {
                int abs = Math.abs(i9);
                if (i9 < 0) {
                    return -Math.min((i10 + c1697c.f21613d) - height, abs);
                }
                int i11 = c1697c.f21613d;
                if (i11 + i9 > 0) {
                    return -i11;
                }
            } else {
                if (i9 > 0) {
                    return Math.min((i10 - c1697c.f21613d) - height, i9);
                }
                int i12 = c1697c.f21613d;
                if (i12 + i9 < 0) {
                    return -i12;
                }
            }
            return i9;
        }
        return 0;
    }

    public final boolean c1() {
        int i9 = this.f14533p;
        if (i9 == 0 || i9 == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(int i9, int i10) {
        h1(i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d1(F0.h0 r10, o4.C1699e r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.d1(F0.h0, o4.e):void");
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean e() {
        int i9;
        if (this.f14534q == 0) {
            return c1();
        }
        if (c1()) {
            int i10 = this.f10349n;
            View view = this.K;
            if (view != null) {
                i9 = view.getWidth();
            } else {
                i9 = 0;
            }
            if (i10 <= i9) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void e1(int i9) {
        if (this.f14533p != i9) {
            q0();
            this.f14533p = i9;
            this.f14522B = null;
            this.f14523C = null;
            this.f14539v.clear();
            C1697c c1697c = this.f14521A;
            C1697c.b(c1697c);
            c1697c.f21613d = 0;
            v0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        int i9;
        if (this.f14534q == 0) {
            return !c1();
        }
        if (!c1()) {
            int i10 = this.f10350o;
            View view = this.K;
            if (view != null) {
                i9 = view.getHeight();
            } else {
                i9 = 0;
            }
            if (i10 <= i9) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i9, int i10) {
        h1(Math.min(i9, i10));
    }

    public final void f1() {
        int i9 = this.f14534q;
        if (i9 != 1) {
            if (i9 == 0) {
                q0();
                this.f14539v.clear();
                C1697c c1697c = this.f14521A;
                C1697c.b(c1697c);
                c1697c.f21613d = 0;
            }
            this.f14534q = 1;
            this.f14522B = null;
            this.f14523C = null;
            v0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g(C0099c0 c0099c0) {
        return c0099c0 instanceof C1698d;
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i9, int i10) {
        h1(i9);
    }

    public final boolean g1(View view, int i9, int i10, C1698d c1698d) {
        if (!view.isLayoutRequested() && this.f10344h && R(view.getWidth(), i9, ((ViewGroup.MarginLayoutParams) c1698d).width) && R(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) c1698d).height)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void h0(int i9) {
        h1(i9);
    }

    public final void h1(int i9) {
        int i10 = -1;
        View T02 = T0(w() - 1, -1);
        if (T02 != null) {
            i10 = a.L(T02);
        }
        if (i9 < i10) {
            int w7 = w();
            r rVar = this.f14540w;
            rVar.x(w7);
            rVar.y(w7);
            rVar.v(w7);
            if (i9 < ((int[]) rVar.f8649c).length) {
                this.f14531L = i9;
                View v8 = v(0);
                if (v8 == null) {
                    return;
                }
                this.f14525E = a.L(v8);
                if (!c1() && this.f14537t) {
                    this.f14526F = this.f14522B.j() + this.f14522B.d(v8);
                } else {
                    this.f14526F = this.f14522B.g(v8) - this.f14522B.m();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(RecyclerView recyclerView, int i9, int i10) {
        h1(i9);
        h1(i9);
    }

    public final void i1(C1697c c1697c, boolean z9, boolean z10) {
        int i9;
        int i10;
        boolean z11 = false;
        if (z10) {
            if (c1()) {
                i10 = this.f10348m;
            } else {
                i10 = this.f10347l;
            }
            C1699e c1699e = this.f14543z;
            if (i10 == 0 || i10 == Integer.MIN_VALUE) {
                z11 = true;
            }
            c1699e.f21627b = z11;
        } else {
            this.f14543z.f21627b = false;
        }
        if (!c1() && this.f14537t) {
            this.f14543z.f21626a = c1697c.f21612c - J();
        } else {
            this.f14543z.f21626a = this.f14522B.i() - c1697c.f21612c;
        }
        C1699e c1699e2 = this.f14543z;
        c1699e2.f21629d = c1697c.f21610a;
        c1699e2.f21633h = 1;
        c1699e2.f21630e = c1697c.f21612c;
        c1699e2.f21631f = Integer.MIN_VALUE;
        c1699e2.f21628c = c1697c.f21611b;
        if (z9 && this.f14539v.size() > 1 && (i9 = c1697c.f21611b) >= 0 && i9 < this.f14539v.size() - 1) {
            C1696b c1696b = (C1696b) this.f14539v.get(c1697c.f21611b);
            C1699e c1699e3 = this.f14543z;
            c1699e3.f21628c++;
            c1699e3.f21629d += c1696b.f21600d;
        }
    }

    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, o4.e] */
    @Override // androidx.recyclerview.widget.a
    public final void j0(h0 h0Var, n0 n0Var) {
        boolean z9;
        boolean z10;
        View P02;
        K k5;
        int i9;
        View v8;
        boolean z11;
        int g9;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        this.f14541x = h0Var;
        this.f14542y = n0Var;
        int b9 = n0Var.b();
        if (b9 != 0 || !n0Var.f2170g) {
            int layoutDirection = this.f10338b.getLayoutDirection();
            int i15 = this.f14533p;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            this.f14537t = false;
                            this.f14538u = false;
                        } else {
                            if (layoutDirection == 1) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            this.f14537t = z16;
                            if (this.f14534q == 2) {
                                this.f14537t = !z16;
                            }
                            this.f14538u = true;
                        }
                    } else {
                        if (layoutDirection == 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f14537t = z15;
                        if (this.f14534q == 2) {
                            this.f14537t = !z15;
                        }
                        this.f14538u = false;
                    }
                } else {
                    if (layoutDirection != 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.f14537t = z13;
                    if (this.f14534q == 2) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f14538u = z14;
                }
            } else {
                if (layoutDirection == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f14537t = z9;
                if (this.f14534q == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f14538u = z10;
            }
            N0();
            if (this.f14543z == null) {
                ?? obj = new Object();
                obj.f21633h = 1;
                this.f14543z = obj;
            }
            r rVar = this.f14540w;
            rVar.x(b9);
            rVar.y(b9);
            rVar.v(b9);
            this.f14543z.f21634i = false;
            C1700f c1700f = this.f14524D;
            if (c1700f != null && (i14 = c1700f.f21635a) >= 0 && i14 < b9) {
                this.f14525E = i14;
            }
            C1697c c1697c = this.f14521A;
            if (!c1697c.f21615f || this.f14525E != -1 || c1700f != null) {
                C1697c.b(c1697c);
                C1700f c1700f2 = this.f14524D;
                if (!n0Var.f2170g && (i9 = this.f14525E) != -1) {
                    if (i9 >= 0 && i9 < n0Var.b()) {
                        int i16 = this.f14525E;
                        c1697c.f21610a = i16;
                        c1697c.f21611b = ((int[]) rVar.f8649c)[i16];
                        C1700f c1700f3 = this.f14524D;
                        if (c1700f3 != null) {
                            int b10 = n0Var.b();
                            int i17 = c1700f3.f21635a;
                            if (i17 >= 0 && i17 < b10) {
                                c1697c.f21612c = this.f14522B.m() + c1700f2.f21636b;
                                c1697c.f21616g = true;
                                c1697c.f21611b = -1;
                                c1697c.f21615f = true;
                            }
                        }
                        if (this.f14526F == Integer.MIN_VALUE) {
                            View r5 = r(this.f14525E);
                            if (r5 != null) {
                                if (this.f14522B.e(r5) > this.f14522B.n()) {
                                    C1697c.a(c1697c);
                                } else if (this.f14522B.g(r5) - this.f14522B.m() < 0) {
                                    c1697c.f21612c = this.f14522B.m();
                                    c1697c.f21614e = false;
                                } else if (this.f14522B.i() - this.f14522B.d(r5) < 0) {
                                    c1697c.f21612c = this.f14522B.i();
                                    c1697c.f21614e = true;
                                } else {
                                    if (c1697c.f21614e) {
                                        g9 = this.f14522B.o() + this.f14522B.d(r5);
                                    } else {
                                        g9 = this.f14522B.g(r5);
                                    }
                                    c1697c.f21612c = g9;
                                }
                            } else {
                                if (w() > 0 && (v8 = v(0)) != null) {
                                    if (this.f14525E < a.L(v8)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    c1697c.f21614e = z11;
                                }
                                C1697c.a(c1697c);
                            }
                        } else if (!c1() && this.f14537t) {
                            c1697c.f21612c = this.f14526F - this.f14522B.j();
                        } else {
                            c1697c.f21612c = this.f14522B.m() + this.f14526F;
                        }
                        c1697c.f21615f = true;
                    } else {
                        this.f14525E = -1;
                        this.f14526F = Integer.MIN_VALUE;
                    }
                }
                if (w() != 0) {
                    if (c1697c.f21614e) {
                        P02 = R0(n0Var.b());
                    } else {
                        P02 = P0(n0Var.b());
                    }
                    if (P02 != null) {
                        FlexboxLayoutManager flexboxLayoutManager = c1697c.f21617h;
                        if (flexboxLayoutManager.f14534q == 0) {
                            k5 = flexboxLayoutManager.f14523C;
                        } else {
                            k5 = flexboxLayoutManager.f14522B;
                        }
                        if (!flexboxLayoutManager.c1() && flexboxLayoutManager.f14537t) {
                            if (c1697c.f21614e) {
                                c1697c.f21612c = k5.o() + k5.g(P02);
                            } else {
                                c1697c.f21612c = k5.d(P02);
                            }
                        } else if (c1697c.f21614e) {
                            c1697c.f21612c = k5.o() + k5.d(P02);
                        } else {
                            c1697c.f21612c = k5.g(P02);
                        }
                        int L8 = a.L(P02);
                        c1697c.f21610a = L8;
                        c1697c.f21616g = false;
                        int[] iArr = (int[]) flexboxLayoutManager.f14540w.f8649c;
                        if (L8 == -1) {
                            L8 = 0;
                        }
                        int i18 = iArr[L8];
                        if (i18 == -1) {
                            i18 = 0;
                        }
                        c1697c.f21611b = i18;
                        int size = flexboxLayoutManager.f14539v.size();
                        int i19 = c1697c.f21611b;
                        if (size > i19) {
                            c1697c.f21610a = ((C1696b) flexboxLayoutManager.f14539v.get(i19)).f21606k;
                        }
                        c1697c.f21615f = true;
                    }
                }
                C1697c.a(c1697c);
                c1697c.f21610a = 0;
                c1697c.f21611b = 0;
                c1697c.f21615f = true;
            }
            q(h0Var);
            if (c1697c.f21614e) {
                j1(c1697c, false, true);
            } else {
                i1(c1697c, false, true);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f10349n, this.f10347l);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f10350o, this.f10348m);
            int i20 = this.f10349n;
            int i21 = this.f10350o;
            boolean c12 = c1();
            Context context = this.f14530J;
            if (c12) {
                int i22 = this.f14527G;
                if (i22 != Integer.MIN_VALUE && i22 != i20) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C1699e c1699e = this.f14543z;
                if (c1699e.f21627b) {
                    i10 = context.getResources().getDisplayMetrics().heightPixels;
                } else {
                    i10 = c1699e.f21626a;
                }
            } else {
                int i23 = this.f14528H;
                if (i23 != Integer.MIN_VALUE && i23 != i21) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C1699e c1699e2 = this.f14543z;
                if (c1699e2.f21627b) {
                    i10 = context.getResources().getDisplayMetrics().widthPixels;
                } else {
                    i10 = c1699e2.f21626a;
                }
            }
            int i24 = i10;
            this.f14527G = i20;
            this.f14528H = i21;
            int i25 = this.f14531L;
            j jVar = this.f14532M;
            if (i25 == -1 && (this.f14525E != -1 || z12)) {
                if (!c1697c.f21614e) {
                    this.f14539v.clear();
                    jVar.f9056b = null;
                    if (c1()) {
                        this.f14540w.q(this.f14532M, makeMeasureSpec, makeMeasureSpec2, i24, 0, c1697c.f21610a, this.f14539v);
                    } else {
                        this.f14540w.q(this.f14532M, makeMeasureSpec2, makeMeasureSpec, i24, 0, c1697c.f21610a, this.f14539v);
                        makeMeasureSpec2 = makeMeasureSpec2;
                        makeMeasureSpec = makeMeasureSpec;
                    }
                    this.f14539v = jVar.f9056b;
                    rVar.u(makeMeasureSpec, makeMeasureSpec2, 0);
                    rVar.Q(0);
                    int i26 = ((int[]) rVar.f8649c)[c1697c.f21610a];
                    c1697c.f21611b = i26;
                    this.f14543z.f21628c = i26;
                }
            } else {
                if (i25 != -1) {
                    i11 = Math.min(i25, c1697c.f21610a);
                } else {
                    i11 = c1697c.f21610a;
                }
                jVar.f9056b = null;
                if (c1()) {
                    if (this.f14539v.size() > 0) {
                        rVar.s(this.f14539v, i11);
                        this.f14540w.q(this.f14532M, makeMeasureSpec, makeMeasureSpec2, i24, i11, c1697c.f21610a, this.f14539v);
                    } else {
                        rVar.v(b9);
                        this.f14540w.q(this.f14532M, makeMeasureSpec, makeMeasureSpec2, i24, 0, -1, this.f14539v);
                    }
                } else if (this.f14539v.size() > 0) {
                    rVar.s(this.f14539v, i11);
                    int i27 = i11;
                    this.f14540w.q(this.f14532M, makeMeasureSpec2, makeMeasureSpec, i24, i27, c1697c.f21610a, this.f14539v);
                    makeMeasureSpec2 = makeMeasureSpec2;
                    makeMeasureSpec = makeMeasureSpec;
                    i11 = i27;
                } else {
                    rVar.v(b9);
                    this.f14540w.q(this.f14532M, makeMeasureSpec2, makeMeasureSpec, i24, 0, -1, this.f14539v);
                    makeMeasureSpec2 = makeMeasureSpec2;
                    makeMeasureSpec = makeMeasureSpec;
                }
                this.f14539v = jVar.f9056b;
                rVar.u(makeMeasureSpec, makeMeasureSpec2, i11);
                rVar.Q(i11);
            }
            O0(h0Var, n0Var, this.f14543z);
            if (c1697c.f21614e) {
                i13 = this.f14543z.f21630e;
                i1(c1697c, true, false);
                O0(h0Var, n0Var, this.f14543z);
                i12 = this.f14543z.f21630e;
            } else {
                i12 = this.f14543z.f21630e;
                j1(c1697c, true, false);
                O0(h0Var, n0Var, this.f14543z);
                i13 = this.f14543z.f21630e;
            }
            if (w() > 0) {
                if (c1697c.f21614e) {
                    W0(V0(i12, h0Var, n0Var, true) + i13, h0Var, n0Var, false);
                } else {
                    V0(W0(i13, h0Var, n0Var, true) + i12, h0Var, n0Var, false);
                }
            }
        }
    }

    public final void j1(C1697c c1697c, boolean z9, boolean z10) {
        int i9;
        boolean z11 = false;
        if (z10) {
            if (c1()) {
                i9 = this.f10348m;
            } else {
                i9 = this.f10347l;
            }
            C1699e c1699e = this.f14543z;
            if (i9 == 0 || i9 == Integer.MIN_VALUE) {
                z11 = true;
            }
            c1699e.f21627b = z11;
        } else {
            this.f14543z.f21627b = false;
        }
        if (!c1() && this.f14537t) {
            this.f14543z.f21626a = (this.K.getWidth() - c1697c.f21612c) - this.f14522B.m();
        } else {
            this.f14543z.f21626a = c1697c.f21612c - this.f14522B.m();
        }
        C1699e c1699e2 = this.f14543z;
        c1699e2.f21629d = c1697c.f21610a;
        c1699e2.f21633h = -1;
        c1699e2.f21630e = c1697c.f21612c;
        c1699e2.f21631f = Integer.MIN_VALUE;
        int i10 = c1697c.f21611b;
        c1699e2.f21628c = i10;
        if (z9 && i10 > 0) {
            int size = this.f14539v.size();
            int i11 = c1697c.f21611b;
            if (size > i11) {
                C1696b c1696b = (C1696b) this.f14539v.get(i11);
                C1699e c1699e3 = this.f14543z;
                c1699e3.f21628c--;
                c1699e3.f21629d -= c1696b.f21600d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int k(n0 n0Var) {
        return K0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(n0 n0Var) {
        this.f14524D = null;
        this.f14525E = -1;
        this.f14526F = Integer.MIN_VALUE;
        this.f14531L = -1;
        C1697c.b(this.f14521A);
        this.f14529I.clear();
    }

    public final void k1(View view, int i9) {
        this.f14529I.put(i9, view);
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(n0 n0Var) {
        return L0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof C1700f) {
            this.f14524D = (C1700f) parcelable;
            v0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(n0 n0Var) {
        return M0(n0Var);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, o4.f] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.os.Parcelable, java.lang.Object, o4.f] */
    @Override // androidx.recyclerview.widget.a
    public final Parcelable m0() {
        C1700f c1700f = this.f14524D;
        if (c1700f != null) {
            ?? obj = new Object();
            obj.f21635a = c1700f.f21635a;
            obj.f21636b = c1700f.f21636b;
            return obj;
        }
        ?? obj2 = new Object();
        if (w() > 0) {
            View v8 = v(0);
            obj2.f21635a = a.L(v8);
            obj2.f21636b = this.f14522B.g(v8) - this.f14522B.m();
            return obj2;
        }
        obj2.f21635a = -1;
        return obj2;
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(n0 n0Var) {
        return K0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(n0 n0Var) {
        return L0(n0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(n0 n0Var) {
        return M0(n0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [F0.c0, o4.d] */
    @Override // androidx.recyclerview.widget.a
    public final C0099c0 s() {
        ?? c0099c0 = new C0099c0(-2, -2);
        c0099c0.f21618e = 0.0f;
        c0099c0.f21619f = 1.0f;
        c0099c0.f21620g = -1;
        c0099c0.f21621h = -1.0f;
        c0099c0.f21623k = 16777215;
        c0099c0.f21624l = 16777215;
        return c0099c0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [F0.c0, o4.d] */
    @Override // androidx.recyclerview.widget.a
    public final C0099c0 t(Context context, AttributeSet attributeSet) {
        ?? c0099c0 = new C0099c0(context, attributeSet);
        c0099c0.f21618e = 0.0f;
        c0099c0.f21619f = 1.0f;
        c0099c0.f21620g = -1;
        c0099c0.f21621h = -1.0f;
        c0099c0.f21623k = 16777215;
        c0099c0.f21624l = 16777215;
        return c0099c0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int w0(int i9, h0 h0Var, n0 n0Var) {
        if (c1() && this.f14534q != 0) {
            int b12 = b1(i9);
            this.f14521A.f21613d += b12;
            this.f14523C.r(-b12);
            return b12;
        }
        int a12 = a1(i9, h0Var, n0Var);
        this.f14529I.clear();
        return a12;
    }

    @Override // androidx.recyclerview.widget.a
    public final void x0(int i9) {
        this.f14525E = i9;
        this.f14526F = Integer.MIN_VALUE;
        C1700f c1700f = this.f14524D;
        if (c1700f != null) {
            c1700f.f21635a = -1;
        }
        v0();
    }

    @Override // androidx.recyclerview.widget.a
    public final int y0(int i9, h0 h0Var, n0 n0Var) {
        if (!c1() && (this.f14534q != 0 || c1())) {
            int b12 = b1(i9);
            this.f14521A.f21613d += b12;
            this.f14523C.r(-b12);
            return b12;
        }
        int a12 = a1(i9, h0Var, n0Var);
        this.f14529I.clear();
        return a12;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        C0097b0 M7 = a.M(context, attributeSet, i9, i10);
        int i11 = M7.f2076a;
        if (i11 != 0) {
            if (i11 == 1) {
                if (M7.f2078c) {
                    e1(3);
                } else {
                    e1(2);
                }
            }
        } else if (M7.f2078c) {
            e1(1);
        } else {
            e1(0);
        }
        f1();
        if (this.f14535r != 4) {
            q0();
            this.f14539v.clear();
            C1697c c1697c = this.f14521A;
            C1697c.b(c1697c);
            c1697c.f21613d = 0;
            this.f14535r = 4;
            v0();
        }
        this.f14530J = context;
    }

    @Override // androidx.recyclerview.widget.a
    public final void X(RecyclerView recyclerView) {
    }
}
