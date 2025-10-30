package androidx.recyclerview.widget;

import A1.g;
import A3.v;
import F0.B;
import F0.C0099c0;
import F0.C0120y;
import F0.E;
import F0.S;
import F0.h0;
import F0.n0;
import P.Q;
import Q.e;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import b7.C0701c;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: P, reason: collision with root package name */
    public static final Set f10206P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* renamed from: E, reason: collision with root package name */
    public boolean f10207E;

    /* renamed from: F, reason: collision with root package name */
    public int f10208F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f10209G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f10210H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f10211I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f10212J;
    public final g K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f10213L;

    /* renamed from: M, reason: collision with root package name */
    public int f10214M;

    /* renamed from: N, reason: collision with root package name */
    public int f10215N;

    /* renamed from: O, reason: collision with root package name */
    public int f10216O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f10207E = false;
        this.f10208F = -1;
        this.f10211I = new SparseIntArray();
        this.f10212J = new SparseIntArray();
        this.K = new g(11, (byte) 0);
        this.f10213L = new Rect();
        this.f10214M = -1;
        this.f10215N = -1;
        this.f10216O = -1;
        B1(a.M(context, attributeSet, i9, i10).f2077b);
    }

    public final void A1(View view, int i9, boolean z9) {
        int i10;
        int i11;
        boolean E02;
        B b9 = (B) view.getLayoutParams();
        Rect rect = b9.f2084b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) b9).topMargin + ((ViewGroup.MarginLayoutParams) b9).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) b9).leftMargin + ((ViewGroup.MarginLayoutParams) b9).rightMargin;
        int w12 = w1(b9.f1990e, b9.f1991f);
        if (this.f10221p == 1) {
            i11 = a.x(false, w12, i9, i13, ((ViewGroup.MarginLayoutParams) b9).width);
            i10 = a.x(true, this.f10223r.n(), this.f10348m, i12, ((ViewGroup.MarginLayoutParams) b9).height);
        } else {
            int x5 = a.x(false, w12, i9, i12, ((ViewGroup.MarginLayoutParams) b9).height);
            int x9 = a.x(true, this.f10223r.n(), this.f10347l, i13, ((ViewGroup.MarginLayoutParams) b9).width);
            i10 = x5;
            i11 = x9;
        }
        C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
        if (z9) {
            E02 = G0(view, i11, i10, c0099c0);
        } else {
            E02 = E0(view, i11, i10, c0099c0);
        }
        if (E02) {
            view.measure(i11, i10);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void B0(Rect rect, int i9, int i10) {
        int h7;
        int h9;
        if (this.f10209G == null) {
            super.B0(rect, i9, i10);
        }
        int J8 = J() + I();
        int H8 = H() + K();
        if (this.f10221p == 1) {
            int height = rect.height() + H8;
            RecyclerView recyclerView = this.f10338b;
            WeakHashMap weakHashMap = Q.f5546a;
            h9 = a.h(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f10209G;
            h7 = a.h(i9, iArr[iArr.length - 1] + J8, this.f10338b.getMinimumWidth());
        } else {
            int width = rect.width() + J8;
            RecyclerView recyclerView2 = this.f10338b;
            WeakHashMap weakHashMap2 = Q.f5546a;
            h7 = a.h(i9, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f10209G;
            h9 = a.h(i10, iArr2[iArr2.length - 1] + H8, this.f10338b.getMinimumHeight());
        }
        this.f10338b.setMeasuredDimension(h7, h9);
    }

    public final void B1(int i9) {
        if (i9 == this.f10208F) {
            return;
        }
        this.f10207E = true;
        if (i9 >= 1) {
            this.f10208F = i9;
            this.K.w();
            v0();
            return;
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Span count should be at least 1. Provided "));
    }

    public final void C1() {
        int H8;
        int K;
        if (this.f10221p == 1) {
            H8 = this.f10349n - J();
            K = I();
        } else {
            H8 = this.f10350o - H();
            K = K();
        }
        q1(H8 - K);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean J0() {
        if (this.f10231z == null && !this.f10207E) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void L0(n0 n0Var, E e8, C0120y c0120y) {
        int i9;
        int i10 = this.f10208F;
        for (int i11 = 0; i11 < this.f10208F && (i9 = e8.f2012d) >= 0 && i9 < n0Var.b() && i10 > 0; i11++) {
            c0120y.c(e8.f2012d, Math.max(0, e8.f2015g));
            this.K.getClass();
            i10--;
            e8.f2012d += e8.f2013e;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int N(h0 h0Var, n0 n0Var) {
        if (this.f10221p == 0) {
            return Math.min(this.f10208F, G());
        }
        if (n0Var.b() < 1) {
            return 0;
        }
        return x1(n0Var.b() - 1, h0Var, n0Var) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == r9) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.f10337a.f53e).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Y(android.view.View r23, int r24, F0.h0 r25, F0.n0 r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Y(android.view.View, int, F0.h0, F0.n0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Y0(h0 h0Var, n0 n0Var, boolean z9, boolean z10) {
        int i9;
        int i10;
        int w7 = w();
        int i11 = 1;
        if (z10) {
            i10 = w() - 1;
            i9 = -1;
            i11 = -1;
        } else {
            i9 = w7;
            i10 = 0;
        }
        int b9 = n0Var.b();
        Q0();
        int m9 = this.f10223r.m();
        int i12 = this.f10223r.i();
        View view = null;
        View view2 = null;
        while (i10 != i9) {
            View v8 = v(i10);
            int L8 = a.L(v8);
            if (L8 >= 0 && L8 < b9 && y1(L8, h0Var, n0Var) == 0) {
                if (((C0099c0) v8.getLayoutParams()).f2083a.i()) {
                    if (view2 == null) {
                        view2 = v8;
                    }
                } else {
                    if (this.f10223r.g(v8) < i12 && this.f10223r.d(v8) >= m9) {
                        return v8;
                    }
                    if (view == null) {
                        view = v8;
                    }
                }
            }
            i10 += i11;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void a0(h0 h0Var, n0 n0Var, Q.g gVar) {
        super.a0(h0Var, n0Var, gVar);
        gVar.i(GridView.class.getName());
        S s9 = this.f10338b.f10289m;
        if (s9 != null && s9.a() > 1) {
            gVar.b(e.f6029o);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void b0(h0 h0Var, n0 n0Var, View view, Q.g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof B)) {
            c0(view, gVar);
            return;
        }
        B b9 = (B) layoutParams;
        int x12 = x1(b9.f2083a.c(), h0Var, n0Var);
        if (this.f10221p == 0) {
            gVar.j(C0701c.I(false, b9.f1990e, b9.f1991f, x12, 1));
        } else {
            gVar.j(C0701c.I(false, x12, 1, b9.f1990e, b9.f1991f));
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(int i9, int i10) {
        g gVar = this.K;
        gVar.w();
        ((SparseIntArray) gVar.f19c).clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final void e0() {
        g gVar = this.K;
        gVar.w();
        ((SparseIntArray) gVar.f19c).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        r22.f2006b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e1(F0.h0 r19, F0.n0 r20, F0.E r21, F0.D r22) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.e1(F0.h0, F0.n0, F0.E, F0.D):void");
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i9, int i10) {
        g gVar = this.K;
        gVar.w();
        ((SparseIntArray) gVar.f19c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void f1(h0 h0Var, n0 n0Var, v vVar, int i9) {
        boolean z9;
        C1();
        if (n0Var.b() > 0 && !n0Var.f2170g) {
            if (i9 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            int y12 = y1(vVar.f295b, h0Var, n0Var);
            if (z9) {
                while (y12 > 0) {
                    int i10 = vVar.f295b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    vVar.f295b = i11;
                    y12 = y1(i11, h0Var, n0Var);
                }
            } else {
                int b9 = n0Var.b() - 1;
                int i12 = vVar.f295b;
                while (i12 < b9) {
                    int i13 = i12 + 1;
                    int y13 = y1(i13, h0Var, n0Var);
                    if (y13 <= y12) {
                        break;
                    }
                    i12 = i13;
                    y12 = y13;
                }
                vVar.f295b = i12;
            }
        }
        r1();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g(C0099c0 c0099c0) {
        return c0099c0 instanceof B;
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i9, int i10) {
        g gVar = this.K;
        gVar.w();
        ((SparseIntArray) gVar.f19c).clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(RecyclerView recyclerView, int i9, int i10) {
        g gVar = this.K;
        gVar.w();
        ((SparseIntArray) gVar.f19c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void j0(h0 h0Var, n0 n0Var) {
        boolean z9 = n0Var.f2170g;
        SparseIntArray sparseIntArray = this.f10212J;
        SparseIntArray sparseIntArray2 = this.f10211I;
        if (z9) {
            int w7 = w();
            for (int i9 = 0; i9 < w7; i9++) {
                B b9 = (B) v(i9).getLayoutParams();
                int c3 = b9.f2083a.c();
                sparseIntArray2.put(c3, b9.f1991f);
                sparseIntArray.put(c3, b9.f1990e);
            }
        }
        super.j0(h0Var, n0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void k0(n0 n0Var) {
        View r5;
        super.k0(n0Var);
        this.f10207E = false;
        int i9 = this.f10214M;
        if (i9 != -1 && (r5 = r(i9)) != null) {
            r5.sendAccessibilityEvent(67108864);
            this.f10214M = -1;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int l(n0 n0Var) {
        return N0(n0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int m(n0 n0Var) {
        return O0(n0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void m1(boolean z9) {
        if (!z9) {
            super.m1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int o(n0 n0Var) {
        return N0(n0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0219  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o0(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.o0(int, android.os.Bundle):boolean");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int p(n0 n0Var) {
        return O0(n0Var);
    }

    public final void q1(int i9) {
        int i10;
        int[] iArr = this.f10209G;
        int i11 = this.f10208F;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i9) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i9 / i11;
        int i14 = i9 % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 > 0 && i11 - i12 < i14) {
                i10 = i13 + 1;
                i12 -= i11;
            } else {
                i10 = i13;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.f10209G = iArr;
    }

    public final void r1() {
        View[] viewArr = this.f10210H;
        if (viewArr != null && viewArr.length == this.f10208F) {
            return;
        }
        this.f10210H = new View[this.f10208F];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final C0099c0 s() {
        if (this.f10221p == 0) {
            return new B(-2, -1);
        }
        return new B(-1, -2);
    }

    public final int s1(int i9) {
        if (this.f10221p == 0) {
            RecyclerView recyclerView = this.f10338b;
            return x1(i9, recyclerView.f10273c, recyclerView.f10250F0);
        }
        RecyclerView recyclerView2 = this.f10338b;
        return y1(i9, recyclerView2.f10273c, recyclerView2.f10250F0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [F0.c0, F0.B] */
    @Override // androidx.recyclerview.widget.a
    public final C0099c0 t(Context context, AttributeSet attributeSet) {
        ?? c0099c0 = new C0099c0(context, attributeSet);
        c0099c0.f1990e = -1;
        c0099c0.f1991f = 0;
        return c0099c0;
    }

    public final int t1(int i9) {
        if (this.f10221p == 1) {
            RecyclerView recyclerView = this.f10338b;
            return x1(i9, recyclerView.f10273c, recyclerView.f10250F0);
        }
        RecyclerView recyclerView2 = this.f10338b;
        return y1(i9, recyclerView2.f10273c, recyclerView2.f10250F0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [F0.c0, F0.B] */
    /* JADX WARN: Type inference failed for: r0v2, types: [F0.c0, F0.B] */
    @Override // androidx.recyclerview.widget.a
    public final C0099c0 u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? c0099c0 = new C0099c0((ViewGroup.MarginLayoutParams) layoutParams);
            c0099c0.f1990e = -1;
            c0099c0.f1991f = 0;
            return c0099c0;
        }
        ?? c0099c02 = new C0099c0(layoutParams);
        c0099c02.f1990e = -1;
        c0099c02.f1991f = 0;
        return c0099c02;
    }

    public final HashSet u1(int i9) {
        return v1(t1(i9), i9);
    }

    public final HashSet v1(int i9, int i10) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f10338b;
        int z12 = z1(i10, recyclerView.f10273c, recyclerView.f10250F0);
        for (int i11 = i9; i11 < i9 + z12; i11++) {
            hashSet.add(Integer.valueOf(i11));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int w0(int i9, h0 h0Var, n0 n0Var) {
        C1();
        r1();
        return super.w0(i9, h0Var, n0Var);
    }

    public final int w1(int i9, int i10) {
        if (this.f10221p == 1 && d1()) {
            int[] iArr = this.f10209G;
            int i11 = this.f10208F;
            return iArr[i11 - i9] - iArr[(i11 - i9) - i10];
        }
        int[] iArr2 = this.f10209G;
        return iArr2[i10 + i9] - iArr2[i9];
    }

    public final int x1(int i9, h0 h0Var, n0 n0Var) {
        boolean z9 = n0Var.f2170g;
        g gVar = this.K;
        if (!z9) {
            int i10 = this.f10208F;
            gVar.getClass();
            return g.u(i9, i10);
        }
        int b9 = h0Var.b(i9);
        if (b9 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i9);
            return 0;
        }
        int i11 = this.f10208F;
        gVar.getClass();
        return g.u(b9, i11);
    }

    @Override // androidx.recyclerview.widget.a
    public final int y(h0 h0Var, n0 n0Var) {
        if (this.f10221p == 1) {
            return Math.min(this.f10208F, G());
        }
        if (n0Var.b() < 1) {
            return 0;
        }
        return x1(n0Var.b() - 1, h0Var, n0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int y0(int i9, h0 h0Var, n0 n0Var) {
        C1();
        r1();
        return super.y0(i9, h0Var, n0Var);
    }

    public final int y1(int i9, h0 h0Var, n0 n0Var) {
        boolean z9 = n0Var.f2170g;
        g gVar = this.K;
        if (!z9) {
            int i10 = this.f10208F;
            gVar.getClass();
            return i9 % i10;
        }
        int i11 = this.f10212J.get(i9, -1);
        if (i11 != -1) {
            return i11;
        }
        int b9 = h0Var.b(i9);
        if (b9 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i9);
            return 0;
        }
        int i12 = this.f10208F;
        gVar.getClass();
        return b9 % i12;
    }

    public final int z1(int i9, h0 h0Var, n0 n0Var) {
        boolean z9 = n0Var.f2170g;
        g gVar = this.K;
        if (!z9) {
            gVar.getClass();
            return 1;
        }
        int i10 = this.f10211I.get(i9, -1);
        if (i10 != -1) {
            return i10;
        }
        if (h0Var.b(i9) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i9);
            return 1;
        }
        gVar.getClass();
        return 1;
    }

    public GridLayoutManager(int i9, int i10) {
        super(1);
        this.f10207E = false;
        this.f10208F = -1;
        this.f10211I = new SparseIntArray();
        this.f10212J = new SparseIntArray();
        this.K = new g(11, (byte) 0);
        this.f10213L = new Rect();
        this.f10214M = -1;
        this.f10215N = -1;
        this.f10216O = -1;
        B1(i9);
    }

    public GridLayoutManager(int i9) {
        super(1);
        this.f10207E = false;
        this.f10208F = -1;
        this.f10211I = new SparseIntArray();
        this.f10212J = new SparseIntArray();
        this.K = new g(11, (byte) 0);
        this.f10213L = new Rect();
        this.f10214M = -1;
        this.f10215N = -1;
        this.f10216O = -1;
        B1(i9);
    }
}
