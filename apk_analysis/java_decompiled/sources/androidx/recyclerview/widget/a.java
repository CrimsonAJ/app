package androidx.recyclerview.widget;

import A1.g;
import A3.F;
import F0.B0;
import F0.C0097b0;
import F0.C0099c0;
import F0.C0104h;
import F0.C0120y;
import F0.G;
import F0.S;
import F0.Z;
import F0.h0;
import F0.n0;
import F0.q0;
import F0.r0;
import P.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import b7.C0701c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o1.C1671f;
import s4.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public F f10337a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f10338b;

    /* renamed from: c, reason: collision with root package name */
    public final g f10339c;

    /* renamed from: d, reason: collision with root package name */
    public final g f10340d;

    /* renamed from: e, reason: collision with root package name */
    public G f10341e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10342f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10343g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10344h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10345i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10346k;

    /* renamed from: l, reason: collision with root package name */
    public int f10347l;

    /* renamed from: m, reason: collision with root package name */
    public int f10348m;

    /* renamed from: n, reason: collision with root package name */
    public int f10349n;

    /* renamed from: o, reason: collision with root package name */
    public int f10350o;

    public a() {
        C1671f c1671f = new C1671f(6, this);
        i iVar = new i(this);
        this.f10339c = new g((B0) c1671f);
        this.f10340d = new g((B0) iVar);
        this.f10342f = false;
        this.f10343g = false;
        this.f10344h = true;
        this.f10345i = true;
    }

    public static int B(View view) {
        return view.getLeft() - ((C0099c0) view.getLayoutParams()).f2084b.left;
    }

    public static int C(View view) {
        Rect rect = ((C0099c0) view.getLayoutParams()).f2084b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int D(View view) {
        Rect rect = ((C0099c0) view.getLayoutParams()).f2084b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int E(View view) {
        return view.getRight() + ((C0099c0) view.getLayoutParams()).f2084b.right;
    }

    public static int F(View view) {
        return view.getTop() - ((C0099c0) view.getLayoutParams()).f2084b.top;
    }

    public static int L(View view) {
        return ((C0099c0) view.getLayoutParams()).f2083a.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [F0.b0, java.lang.Object] */
    public static C0097b0 M(Context context, AttributeSet attributeSet, int i9, int i10) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E0.a.f1924a, i9, i10);
        obj.f2076a = obtainStyledAttributes.getInt(0, 1);
        obj.f2077b = obtainStyledAttributes.getInt(10, 1);
        obj.f2078c = obtainStyledAttributes.getBoolean(9, false);
        obj.f2079d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
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

    public static void S(View view, int i9, int i10, int i11, int i12) {
        C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
        Rect rect = c0099c0.f2084b;
        view.layout(i9 + rect.left + ((ViewGroup.MarginLayoutParams) c0099c0).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) c0099c0).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) c0099c0).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0099c0).bottomMargin);
    }

    public static int h(int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i10, i11);
            }
            return size;
        }
        return Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int x(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.x(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        return view.getBottom() + ((C0099c0) view.getLayoutParams()).f2084b.bottom;
    }

    public void A(View view, Rect rect) {
        boolean z9 = RecyclerView.f10232a1;
        C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
        Rect rect2 = c0099c0.f2084b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0099c0).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0099c0).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0099c0).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0099c0).bottomMargin);
    }

    public final void A0(int i9, int i10) {
        this.f10349n = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        this.f10347l = mode;
        if (mode == 0 && !RecyclerView.f10236e1) {
            this.f10349n = 0;
        }
        this.f10350o = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.f10348m = mode2;
        if (mode2 == 0 && !RecyclerView.f10236e1) {
            this.f10350o = 0;
        }
    }

    public void B0(Rect rect, int i9, int i10) {
        int J8 = J() + I() + rect.width();
        int H8 = H() + K() + rect.height();
        RecyclerView recyclerView = this.f10338b;
        WeakHashMap weakHashMap = Q.f5546a;
        this.f10338b.setMeasuredDimension(h(i9, J8, recyclerView.getMinimumWidth()), h(i10, H8, this.f10338b.getMinimumHeight()));
    }

    public final void C0(int i9, int i10) {
        int w7 = w();
        if (w7 == 0) {
            this.f10338b.q(i9, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < w7; i15++) {
            View v8 = v(i15);
            Rect rect = this.f10338b.j;
            A(v8, rect);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.f10338b.j.set(i14, i12, i11, i13);
        B0(this.f10338b.j, i9, i10);
    }

    public final void D0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f10338b = null;
            this.f10337a = null;
            this.f10349n = 0;
            this.f10350o = 0;
        } else {
            this.f10338b = recyclerView;
            this.f10337a = recyclerView.f10276f;
            this.f10349n = recyclerView.getWidth();
            this.f10350o = recyclerView.getHeight();
        }
        this.f10347l = 1073741824;
        this.f10348m = 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean E0(View view, int i9, int i10, C0099c0 c0099c0) {
        if (!view.isLayoutRequested() && this.f10344h && R(view.getWidth(), i9, ((ViewGroup.MarginLayoutParams) c0099c0).width) && R(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) c0099c0).height)) {
            return false;
        }
        return true;
    }

    public boolean F0() {
        return false;
    }

    public final int G() {
        S s9;
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null) {
            s9 = recyclerView.getAdapter();
        } else {
            s9 = null;
        }
        if (s9 != null) {
            return s9.a();
        }
        return 0;
    }

    public final boolean G0(View view, int i9, int i10, C0099c0 c0099c0) {
        if (this.f10344h && R(view.getMeasuredWidth(), i9, ((ViewGroup.MarginLayoutParams) c0099c0).width) && R(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) c0099c0).height)) {
            return false;
        }
        return true;
    }

    public final int H() {
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public abstract void H0(RecyclerView recyclerView, int i9);

    public final int I() {
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final void I0(G g9) {
        G g10 = this.f10341e;
        if (g10 != null && g9 != g10 && g10.f2027e) {
            g10.i();
        }
        this.f10341e = g9;
        RecyclerView recyclerView = this.f10338b;
        q0 q0Var = recyclerView.f10246C0;
        q0Var.f2205g.removeCallbacks(q0Var);
        q0Var.f2201c.abortAnimation();
        if (g9.f2030h) {
            Log.w("RecyclerView", "An instance of " + g9.getClass().getSimpleName() + " was started more than once. Each instance of" + g9.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        g9.f2024b = recyclerView;
        g9.f2025c = this;
        int i9 = g9.f2023a;
        if (i9 != -1) {
            recyclerView.f10250F0.f2164a = i9;
            g9.f2027e = true;
            g9.f2026d = true;
            g9.f2028f = recyclerView.f10291n.r(i9);
            g9.f2024b.f10246C0.b();
            g9.f2030h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final int J() {
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public boolean J0() {
        return false;
    }

    public final int K() {
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int N(h0 h0Var, n0 n0Var) {
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null && recyclerView.f10289m != null && f()) {
            return this.f10338b.f10289m.a();
        }
        return 1;
    }

    public final void O(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0099c0) view.getLayoutParams()).f2084b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f10338b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f10338b.f10287l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean P();

    public boolean Q() {
        return false;
    }

    public void T(int i9) {
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null) {
            int i10 = recyclerView.f10276f.i();
            for (int i11 = 0; i11 < i10; i11++) {
                recyclerView.f10276f.h(i11).offsetLeftAndRight(i9);
            }
        }
    }

    public void U(int i9) {
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null) {
            int i10 = recyclerView.f10276f.i();
            for (int i11 = 0; i11 < i10; i11++) {
                recyclerView.f10276f.h(i11).offsetTopAndBottom(i9);
            }
        }
    }

    public void W(RecyclerView recyclerView) {
    }

    public abstract void X(RecyclerView recyclerView);

    public View Y(View view, int i9, h0 h0Var, n0 n0Var) {
        return null;
    }

    public void Z(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f10338b;
        h0 h0Var = recyclerView.f10273c;
        if (accessibilityEvent != null) {
            boolean z9 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f10338b.canScrollVertically(-1) && !this.f10338b.canScrollHorizontally(-1) && !this.f10338b.canScrollHorizontally(1)) {
                z9 = false;
            }
            accessibilityEvent.setScrollable(z9);
            S s9 = this.f10338b.f10289m;
            if (s9 != null) {
                accessibilityEvent.setItemCount(s9.a());
            }
        }
    }

    public void a0(h0 h0Var, n0 n0Var, Q.g gVar) {
        if (this.f10338b.canScrollVertically(-1) || this.f10338b.canScrollHorizontally(-1)) {
            gVar.a(8192);
            gVar.l(true);
            gVar.h(67108864, true);
        }
        if (this.f10338b.canScrollVertically(1) || this.f10338b.canScrollHorizontally(1)) {
            gVar.a(4096);
            gVar.l(true);
            gVar.h(67108864, true);
        }
        gVar.f6035a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i.L(N(h0Var, n0Var), y(h0Var, n0Var), 0).f22734a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.b(android.view.View, int, boolean):void");
    }

    public void b0(h0 h0Var, n0 n0Var, View view, Q.g gVar) {
        int i9;
        int i10;
        if (f()) {
            i9 = L(view);
        } else {
            i9 = 0;
        }
        if (e()) {
            i10 = L(view);
        } else {
            i10 = 0;
        }
        gVar.j(C0701c.I(false, i9, 1, i10, 1));
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public final void c0(View view, Q.g gVar) {
        r0 N8 = RecyclerView.N(view);
        if (N8 != null && !N8.i() && !((ArrayList) this.f10337a.f53e).contains(N8.f2210a)) {
            RecyclerView recyclerView = this.f10338b;
            b0(recyclerView.f10273c, recyclerView.f10250F0, view, gVar);
        }
    }

    public final void d(View view, Rect rect) {
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.O(view));
        }
    }

    public abstract boolean e();

    public abstract boolean f();

    public boolean g(C0099c0 c0099c0) {
        if (c0099c0 != null) {
            return true;
        }
        return false;
    }

    public void i0(RecyclerView recyclerView, int i9, int i10) {
        h0(i9);
    }

    public abstract void j0(h0 h0Var, n0 n0Var);

    public abstract int k(n0 n0Var);

    public abstract void k0(n0 n0Var);

    public abstract int l(n0 n0Var);

    public void l0(Parcelable parcelable) {
    }

    public abstract int m(n0 n0Var);

    public Parcelable m0() {
        return null;
    }

    public abstract int n(n0 n0Var);

    public void n0(int i9) {
    }

    public abstract int o(n0 n0Var);

    public boolean o0(int i9, Bundle bundle) {
        RecyclerView recyclerView = this.f10338b;
        return p0(recyclerView.f10273c, recyclerView.f10250F0, i9, bundle);
    }

    public abstract int p(n0 n0Var);

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p0(F0.h0 r8, F0.n0 r9, int r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.p0(F0.h0, F0.n0, int, android.os.Bundle):boolean");
    }

    public final void q(h0 h0Var) {
        for (int w7 = w() - 1; w7 >= 0; w7--) {
            View v8 = v(w7);
            r0 N8 = RecyclerView.N(v8);
            if (N8.p()) {
                if (RecyclerView.f10233b1) {
                    Log.d("RecyclerView", "ignoring view " + N8);
                }
            } else if (N8.g() && !N8.i() && !this.f10338b.f10289m.f2056b) {
                if (v(w7) != null) {
                    this.f10337a.n(w7);
                }
                h0Var.i(N8);
            } else {
                v(w7);
                this.f10337a.f(w7);
                h0Var.j(v8);
                this.f10338b.f10278g.E(N8);
            }
        }
    }

    public final void q0() {
        for (int w7 = w() - 1; w7 >= 0; w7--) {
            this.f10337a.n(w7);
        }
    }

    public View r(int i9) {
        int w7 = w();
        for (int i10 = 0; i10 < w7; i10++) {
            View v8 = v(i10);
            r0 N8 = RecyclerView.N(v8);
            if (N8 != null && N8.c() == i9 && !N8.p() && (this.f10338b.f10250F0.f2170g || !N8.i())) {
                return v8;
            }
        }
        return null;
    }

    public final void r0(h0 h0Var) {
        for (int w7 = w() - 1; w7 >= 0; w7--) {
            if (!RecyclerView.N(v(w7)).p()) {
                View v8 = v(w7);
                if (v(w7) != null) {
                    this.f10337a.n(w7);
                }
                h0Var.h(v8);
            }
        }
    }

    public abstract C0099c0 s();

    public final void s0(h0 h0Var) {
        ArrayList arrayList;
        int size = h0Var.f2116a.size();
        int i9 = size - 1;
        while (true) {
            arrayList = h0Var.f2116a;
            if (i9 < 0) {
                break;
            }
            View view = ((r0) arrayList.get(i9)).f2210a;
            r0 N8 = RecyclerView.N(view);
            if (!N8.p()) {
                N8.o(false);
                if (N8.k()) {
                    this.f10338b.removeDetachedView(view, false);
                }
                Z z9 = this.f10338b.f10292n0;
                if (z9 != null) {
                    z9.d(N8);
                }
                N8.o(true);
                r0 N9 = RecyclerView.N(view);
                N9.f2222n = null;
                N9.f2223o = false;
                N9.j &= -33;
                h0Var.i(N9);
            }
            i9--;
        }
        arrayList.clear();
        ArrayList arrayList2 = h0Var.f2117b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f10338b.invalidate();
        }
    }

    public C0099c0 t(Context context, AttributeSet attributeSet) {
        return new C0099c0(context, attributeSet);
    }

    public final void t0(View view, h0 h0Var) {
        F f9 = this.f10337a;
        C1671f c1671f = (C1671f) f9.f51c;
        int i9 = f9.f50b;
        if (i9 != 1) {
            if (i9 != 2) {
                try {
                    f9.f50b = 1;
                    f9.f54f = view;
                    int indexOfChild = ((RecyclerView) c1671f.f21473b).indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (((C0104h) f9.f52d).K(indexOfChild)) {
                            f9.o(view);
                        }
                        c1671f.K(indexOfChild);
                    }
                    f9.f50b = 0;
                    f9.f54f = null;
                    h0Var.h(view);
                    return;
                } catch (Throwable th) {
                    f9.f50b = 0;
                    f9.f54f = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public C0099c0 u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0099c0) {
            return new C0099c0((C0099c0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0099c0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0099c0(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.I()
            int r1 = r8.K()
            int r2 = r8.f10349n
            int r3 = r8.J()
            int r2 = r2 - r3
            int r3 = r8.f10350o
            int r4 = r8.H()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f10338b
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L5e
            if (r2 == 0) goto L59
            goto L66
        L59:
            int r2 = java.lang.Math.max(r6, r10)
            goto L66
        L5e:
            if (r6 == 0) goto L61
            goto L65
        L61:
            int r6 = java.lang.Math.min(r4, r2)
        L65:
            r2 = r6
        L66:
            if (r1 == 0) goto L69
            goto L6d
        L69:
            int r1 = java.lang.Math.min(r5, r11)
        L6d:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb0
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7e
            goto Lb5
        L7e:
            int r1 = r8.I()
            int r2 = r8.K()
            int r3 = r8.f10349n
            int r4 = r8.J()
            int r3 = r3 - r4
            int r4 = r8.f10350o
            int r5 = r8.H()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f10338b
            android.graphics.Rect r5 = r5.j
            r8.A(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb5
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb5
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb5
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb0
            goto Lb5
        Lb0:
            if (r11 != 0) goto Lb6
            if (r10 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r0
        Lb6:
            if (r12 == 0) goto Lbc
            r9.scrollBy(r11, r10)
            return r7
        Lbc:
            r9.j0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.u0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final View v(int i9) {
        F f9 = this.f10337a;
        if (f9 != null) {
            return f9.h(i9);
        }
        return null;
    }

    public final void v0() {
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final int w() {
        F f9 = this.f10337a;
        if (f9 != null) {
            return f9.i();
        }
        return 0;
    }

    public abstract int w0(int i9, h0 h0Var, n0 n0Var);

    public abstract void x0(int i9);

    public int y(h0 h0Var, n0 n0Var) {
        RecyclerView recyclerView = this.f10338b;
        if (recyclerView != null && recyclerView.f10289m != null && e()) {
            return this.f10338b.f10289m.a();
        }
        return 1;
    }

    public abstract int y0(int i9, h0 h0Var, n0 n0Var);

    public final void z0(RecyclerView recyclerView) {
        A0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public void V() {
    }

    public void e0() {
    }

    public void h0(int i9) {
    }

    public void d0(int i9, int i10) {
    }

    public void f0(int i9, int i10) {
    }

    public void g0(int i9, int i10) {
    }

    public void j(int i9, C0120y c0120y) {
    }

    public void i(int i9, int i10, n0 n0Var, C0120y c0120y) {
    }
}
