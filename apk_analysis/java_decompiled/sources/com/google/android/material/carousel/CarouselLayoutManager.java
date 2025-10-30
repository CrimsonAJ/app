package com.google.android.material.carousel;

import F0.C0099c0;
import F0.L;
import F0.h0;
import F0.m0;
import F0.n0;
import Q0.b;
import Q2.ViewOnLayoutChangeListenerC0371n;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import c0.C0749c;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import g5.AbstractC1254a;
import o5.C1701a;
import o5.C1702b;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends a implements m0 {

    /* renamed from: p, reason: collision with root package name */
    public final C0749c f15917p;

    /* renamed from: q, reason: collision with root package name */
    public b f15918q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f15919r;

    public CarouselLayoutManager() {
        C0749c c0749c = new C0749c();
        new C1701a();
        this.f15919r = new ViewOnLayoutChangeListenerC0371n(2, this);
        this.f15917p = c0749c;
        v0();
        M0(0);
    }

    @Override // androidx.recyclerview.widget.a
    public final void A(View view, Rect rect) {
        super.A(view, rect);
        rect.centerY();
        if (K0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void H0(RecyclerView recyclerView, int i9) {
        L l9 = new L(this, recyclerView.getContext(), 1);
        l9.f2023a = i9;
        I0(l9);
    }

    public final boolean K0() {
        if (this.f15918q.f6039b == 0) {
            return true;
        }
        return false;
    }

    public final boolean L0() {
        if (K0() && this.f10338b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void M0(int i9) {
        C1702b c1702b;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException(AbstractC0953k1.j(i9, "invalid orientation:"));
        }
        c(null);
        b bVar = this.f15918q;
        if (bVar != null && i9 == bVar.f6039b) {
            return;
        }
        if (i9 != 0) {
            if (i9 == 1) {
                c1702b = new C1702b(this, 0);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            c1702b = new C1702b(this, 1);
        }
        this.f15918q = c1702b;
        v0();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean P() {
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void W(RecyclerView recyclerView) {
        C0749c c0749c = this.f15917p;
        Context context = recyclerView.getContext();
        float f9 = c0749c.f11558a;
        if (f9 <= 0.0f) {
            f9 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0749c.f11558a = f9;
        float f10 = c0749c.f11559b;
        if (f10 <= 0.0f) {
            f10 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0749c.f11559b = f10;
        v0();
        recyclerView.addOnLayoutChangeListener(this.f15919r);
    }

    @Override // androidx.recyclerview.widget.a
    public final void X(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f15919r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (L0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (L0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Y(android.view.View r4, int r5, F0.h0 r6, F0.n0 r7) {
        /*
            r3 = this;
            int r6 = r3.w()
            if (r6 != 0) goto L8
            goto L96
        L8:
            Q0.b r6 = r3.f15918q
            int r6 = r6.f6039b
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.L0()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.L0()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = androidx.recyclerview.widget.a.L(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.v(r6)
            int r4 = androidx.recyclerview.widget.a.L(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.G()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            Q0.b r4 = r3.f15918q
            r4.i()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.L0()
            if (r4 == 0) goto L86
            int r4 = r3.w()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.v(r6)
            return r4
        L8b:
            int r4 = androidx.recyclerview.widget.a.L(r4)
            int r5 = r3.G()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.w()
            int r4 = r4 - r1
            android.view.View r4 = r3.v(r4)
            int r4 = androidx.recyclerview.widget.a.L(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.G()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            Q0.b r4 = r3.f15918q
            r4.i()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.L0()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.w()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.v(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.Y(android.view.View, int, F0.h0, F0.n0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(a.L(v(0)));
            accessibilityEvent.setToIndex(a.L(v(w() - 1)));
        }
    }

    @Override // F0.m0
    public final PointF a(int i9) {
        return null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(int i9, int i10) {
        G();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean e() {
        return K0();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        return !K0();
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i9, int i10) {
        G();
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(h0 h0Var, n0 n0Var) {
        int i9;
        if (n0Var.b() > 0) {
            if (K0()) {
                i9 = this.f10349n;
            } else {
                i9 = this.f10350o;
            }
            if (i9 > 0.0f) {
                L0();
                View view = h0Var.k(Long.MAX_VALUE, 0).f2210a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        r0(h0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final int k(n0 n0Var) {
        w();
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(n0 n0Var) {
        if (w() == 0) {
            return;
        }
        a.L(v(0));
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(n0 n0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(n0 n0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(n0 n0Var) {
        w();
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(n0 n0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(n0 n0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final C0099c0 s() {
        return new C0099c0(-2, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean u0(RecyclerView recyclerView, View view, Rect rect, boolean z9, boolean z10) {
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final int w0(int i9, h0 h0Var, n0 n0Var) {
        if (!K0() || w() == 0 || i9 == 0) {
            return 0;
        }
        View view = h0Var.k(Long.MAX_VALUE, 0).f2210a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.a
    public final void x0(int i9) {
    }

    @Override // androidx.recyclerview.widget.a
    public final int y0(int i9, h0 h0Var, n0 n0Var) {
        if (!f() || w() == 0 || i9 == 0) {
            return 0;
        }
        View view = h0Var.k(Long.MAX_VALUE, 0).f2210a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        new C1701a();
        this.f15919r = new ViewOnLayoutChangeListenerC0371n(2, this);
        this.f15917p = new C0749c();
        v0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.f17742g);
            obtainStyledAttributes.getInt(0, 0);
            v0();
            M0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
