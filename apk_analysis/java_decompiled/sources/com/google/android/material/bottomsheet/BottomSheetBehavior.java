package com.google.android.material.bottomsheet;

import A1.i;
import A5.t;
import B.c;
import D4.n;
import F0.C0118w;
import F5.g;
import F5.h;
import F5.m;
import P.C0300a;
import P.C0301b;
import P.H;
import P.Q;
import P.a0;
import P.b0;
import P.c0;
import Q.e;
import V.d;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.notix.R;
import com.google.android.gms.internal.cast.RunnableC0869s;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.D1;
import d.C1061b;
import g5.AbstractC1254a;
import h5.AbstractC1281a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k0.C1478a;
import m5.AbstractC1593a;
import w5.p;
import y5.b;
import y5.f;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends c implements b {

    /* renamed from: A, reason: collision with root package name */
    public final n f15838A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f15839B;

    /* renamed from: C, reason: collision with root package name */
    public final int f15840C;

    /* renamed from: D, reason: collision with root package name */
    public int f15841D;

    /* renamed from: E, reason: collision with root package name */
    public int f15842E;

    /* renamed from: F, reason: collision with root package name */
    public final float f15843F;

    /* renamed from: G, reason: collision with root package name */
    public int f15844G;

    /* renamed from: H, reason: collision with root package name */
    public final float f15845H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f15846I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f15847J;
    public final boolean K;

    /* renamed from: L, reason: collision with root package name */
    public int f15848L;

    /* renamed from: M, reason: collision with root package name */
    public d f15849M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f15850N;

    /* renamed from: O, reason: collision with root package name */
    public int f15851O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f15852P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f15853Q;

    /* renamed from: R, reason: collision with root package name */
    public int f15854R;

    /* renamed from: S, reason: collision with root package name */
    public int f15855S;

    /* renamed from: T, reason: collision with root package name */
    public int f15856T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f15857U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f15858V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f15859W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f15860X;
    public f Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f15861Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f15862a;

    /* renamed from: a0, reason: collision with root package name */
    public int f15863a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15864b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f15865b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f15866c;

    /* renamed from: c0, reason: collision with root package name */
    public HashMap f15867c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f15868d;

    /* renamed from: d0, reason: collision with root package name */
    public final SparseIntArray f15869d0;

    /* renamed from: e, reason: collision with root package name */
    public int f15870e;

    /* renamed from: e0, reason: collision with root package name */
    public final G5.d f15871e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15872f;

    /* renamed from: g, reason: collision with root package name */
    public int f15873g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15874h;

    /* renamed from: i, reason: collision with root package name */
    public final h f15875i;
    public final ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15876k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15877l;

    /* renamed from: m, reason: collision with root package name */
    public int f15878m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f15879n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f15880o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f15881p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15882q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f15883r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f15884s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f15885t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f15886u;

    /* renamed from: v, reason: collision with root package name */
    public int f15887v;

    /* renamed from: w, reason: collision with root package name */
    public int f15888w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f15889x;

    /* renamed from: y, reason: collision with root package name */
    public final m f15890y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f15891z;

    public BottomSheetBehavior() {
        this.f15862a = 0;
        this.f15864b = true;
        this.f15876k = -1;
        this.f15877l = -1;
        this.f15838A = new n(this);
        this.f15843F = 0.5f;
        this.f15845H = -1.0f;
        this.K = true;
        this.f15848L = 4;
        this.f15853Q = 0.1f;
        this.f15859W = new ArrayList();
        this.f15863a0 = -1;
        this.f15869d0 = new SparseIntArray();
        this.f15871e0 = new G5.d(this, 1);
    }

    public static View A(View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap weakHashMap = Q.f5546a;
            if (H.h(view)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View A2 = A(viewGroup.getChildAt(i9));
                    if (A2 != null) {
                        return A2;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static BottomSheetBehavior B(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof B.f) {
            c cVar = ((B.f) layoutParams).f567a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public static int C(int i9, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i11 = Math.min(size, i11);
            }
            return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
    }

    public final int D() {
        int i9;
        if (this.f15864b) {
            return this.f15841D;
        }
        int i10 = this.f15840C;
        if (this.f15883r) {
            i9 = 0;
        } else {
            i9 = this.f15888w;
        }
        return Math.max(i10, i9);
    }

    public final int E(int i9) {
        if (i9 != 3) {
            if (i9 != 4) {
                if (i9 != 5) {
                    if (i9 == 6) {
                        return this.f15842E;
                    }
                    throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Invalid state to get top offset: "));
                }
                return this.f15856T;
            }
            return this.f15844G;
        }
        return D();
    }

    public final boolean F() {
        WeakReference weakReference = this.f15857U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f15857U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void G(boolean z9) {
        if (this.f15846I != z9) {
            this.f15846I = z9;
            if (!z9 && this.f15848L == 5) {
                I(4);
            }
            M();
        }
    }

    public final void H(int i9) {
        if (i9 == -1) {
            if (!this.f15872f) {
                this.f15872f = true;
            } else {
                return;
            }
        } else {
            if (!this.f15872f && this.f15870e == i9) {
                return;
            }
            this.f15872f = false;
            this.f15870e = Math.max(0, i9);
        }
        P();
    }

    public final void I(int i9) {
        String str;
        int i10;
        if (i9 != 1 && i9 != 2) {
            if (!this.f15846I && i9 == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i9);
                return;
            }
            if (i9 == 6 && this.f15864b && E(i9) <= this.f15841D) {
                i10 = 3;
            } else {
                i10 = i9;
            }
            WeakReference weakReference = this.f15857U;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f15857U.get();
                RunnableC0869s runnableC0869s = new RunnableC0869s(this, view, i10);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap weakHashMap = Q.f5546a;
                    if (view.isAttachedToWindow()) {
                        view.post(runnableC0869s);
                        return;
                    }
                }
                runnableC0869s.run();
                return;
            }
            J(i9);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i9 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(AbstractC0953k1.q(sb, str, " should not be set externally."));
    }

    public final void J(int i9) {
        View view;
        if (this.f15848L != i9) {
            this.f15848L = i9;
            if (i9 != 4 && i9 != 3 && i9 != 6) {
                boolean z9 = this.f15846I;
            }
            WeakReference weakReference = this.f15857U;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            int i10 = 0;
            if (i9 == 3) {
                O(true);
            } else if (i9 == 6 || i9 == 5 || i9 == 4) {
                O(false);
            }
            N(i9, true);
            while (true) {
                ArrayList arrayList = this.f15859W;
                if (i10 < arrayList.size()) {
                    ((AbstractC1593a) arrayList.get(i10)).c(view, i9);
                    i10++;
                } else {
                    M();
                    return;
                }
            }
        }
    }

    public final boolean K(View view, float f9) {
        if (this.f15847J) {
            return true;
        }
        if (view.getTop() < this.f15844G) {
            return false;
        }
        if (Math.abs(((f9 * this.f15853Q) + view.getTop()) - this.f15844G) / y() > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        J(2);
        N(r4, true);
        r2.f15838A.h(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.E(r4)
            V.d r1 = r2.f15849M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f7573r = r3
            r3 = -1
            r1.f7559c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f7557a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f7573r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f7573r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.J(r3)
            r3 = 1
            r2.N(r4, r3)
            D4.n r3 = r2.f15838A
            r3.h(r4)
            return
        L40:
            r2.J(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.L(android.view.View, int, boolean):void");
    }

    public final void M() {
        View view;
        int i9;
        boolean z9;
        C0301b c0301b;
        WeakReference weakReference = this.f15857U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            Q.j(view, 524288);
            Q.h(view, 0);
            Q.j(view, 262144);
            Q.h(view, 0);
            Q.j(view, 1048576);
            Q.h(view, 0);
            SparseIntArray sparseIntArray = this.f15869d0;
            int i10 = sparseIntArray.get(0, -1);
            if (i10 != -1) {
                Q.j(view, i10);
                Q.h(view, 0);
                sparseIntArray.delete(0);
            }
            int i11 = 6;
            if (!this.f15864b && this.f15848L != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                i iVar = new i(6, this);
                ArrayList f9 = Q.f(view);
                int i12 = 0;
                while (true) {
                    if (i12 < f9.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((e) f9.get(i12)).f6030a).getLabel())) {
                            i9 = ((e) f9.get(i12)).a();
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = -1;
                        for (int i14 = 0; i14 < 32 && i13 == -1; i14++) {
                            int i15 = Q.f5549d[i14];
                            boolean z10 = true;
                            for (int i16 = 0; i16 < f9.size(); i16++) {
                                if (((e) f9.get(i16)).a() != i15) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                z10 &= z9;
                            }
                            if (z10) {
                                i13 = i15;
                            }
                        }
                        i9 = i13;
                    }
                }
                if (i9 != -1) {
                    e eVar = new e(null, i9, string, iVar, null);
                    View.AccessibilityDelegate d9 = Q.d(view);
                    if (d9 == null) {
                        c0301b = null;
                    } else if (d9 instanceof C0300a) {
                        c0301b = ((C0300a) d9).f5569a;
                    } else {
                        c0301b = new C0301b(d9);
                    }
                    if (c0301b == null) {
                        c0301b = new C0301b();
                    }
                    Q.m(view, c0301b);
                    Q.j(view, eVar.a());
                    Q.f(view).add(eVar);
                    Q.h(view, 0);
                }
                sparseIntArray.put(0, i9);
            }
            if (this.f15846I && this.f15848L != 5) {
                Q.k(view, e.j, new i(5, this));
            }
            int i17 = this.f15848L;
            if (i17 != 3) {
                if (i17 != 4) {
                    if (i17 == 6) {
                        Q.k(view, e.f6024i, new i(4, this));
                        Q.k(view, e.f6023h, new i(3, this));
                        return;
                    }
                    return;
                }
                if (this.f15864b) {
                    i11 = 3;
                }
                Q.k(view, e.f6023h, new i(i11, this));
                return;
            }
            if (this.f15864b) {
                i11 = 4;
            }
            Q.k(view, e.f6024i, new i(i11, this));
        }
    }

    public final void N(int i9, boolean z9) {
        boolean z10;
        h hVar = this.f15875i;
        ValueAnimator valueAnimator = this.f15839B;
        if (i9 != 2) {
            if (this.f15848L == 3 && (this.f15889x || F())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f15891z != z10 && hVar != null) {
                this.f15891z = z10;
                float f9 = 1.0f;
                if (z9 && valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f10 = hVar.f2483a.f2474i;
                    if (z10) {
                        f9 = x();
                    }
                    valueAnimator.setFloatValues(f10, f9);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.f15891z) {
                    f9 = x();
                }
                g gVar = hVar.f2483a;
                if (gVar.f2474i != f9) {
                    gVar.f2474i = f9;
                    hVar.f2487e = true;
                    hVar.invalidateSelf();
                }
            }
        }
    }

    public final void O(boolean z9) {
        WeakReference weakReference = this.f15857U;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z9) {
                    if (this.f15867c0 == null) {
                        this.f15867c0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = coordinatorLayout.getChildAt(i9);
                    if (childAt != this.f15857U.get() && z9) {
                        this.f15867c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z9) {
                    this.f15867c0 = null;
                }
            }
        }
    }

    public final void P() {
        View view;
        if (this.f15857U != null) {
            w();
            if (this.f15848L == 4 && (view = (View) this.f15857U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // y5.b
    public final void a(C1061b c1061b) {
        f fVar = this.Y;
        if (fVar != null) {
            if (fVar.f25010f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            C1061b c1061b2 = fVar.f25010f;
            fVar.f25010f = c1061b;
            if (c1061b2 == null) {
                return;
            }
            fVar.b(c1061b.f16559c);
        }
    }

    @Override // y5.b
    public final void b() {
        f fVar = this.Y;
        if (fVar == null) {
            return;
        }
        C1061b c1061b = fVar.f25010f;
        fVar.f25010f = null;
        int i9 = 4;
        if (c1061b != null && Build.VERSION.SDK_INT >= 34) {
            boolean z9 = this.f15846I;
            int i10 = fVar.f25008d;
            int i11 = fVar.f25007c;
            float f9 = c1061b.f16559c;
            if (z9) {
                t tVar = new t(7, this);
                View view = fVar.f25006b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                ofFloat.setInterpolator(new C1478a(1));
                ofFloat.setDuration(AbstractC1281a.c(i11, f9, i10));
                ofFloat.addListener(new t(9, fVar));
                ofFloat.addListener(tVar);
                ofFloat.start();
                return;
            }
            AnimatorSet a5 = fVar.a();
            a5.setDuration(AbstractC1281a.c(i11, f9, i10));
            a5.start();
            I(4);
            return;
        }
        if (this.f15846I) {
            i9 = 5;
        }
        I(i9);
    }

    @Override // y5.b
    public final void c(C1061b c1061b) {
        f fVar = this.Y;
        if (fVar == null) {
            return;
        }
        fVar.f25010f = c1061b;
    }

    @Override // y5.b
    public final void d() {
        f fVar = this.Y;
        if (fVar != null) {
            if (fVar.f25010f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            C1061b c1061b = fVar.f25010f;
            fVar.f25010f = null;
            if (c1061b == null) {
                return;
            }
            AnimatorSet a5 = fVar.a();
            a5.setDuration(fVar.f25009e);
            a5.start();
        }
    }

    @Override // B.c
    public final void g(B.f fVar) {
        this.f15857U = null;
        this.f15849M = null;
        this.Y = null;
    }

    @Override // B.c
    public final void j() {
        this.f15857U = null;
        this.f15849M = null;
        this.Y = null;
    }

    @Override // B.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z9;
        View view2;
        int i9;
        d dVar;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.f15861Z = -1;
                this.f15863a0 = -1;
                VelocityTracker velocityTracker = this.f15860X;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f15860X = null;
                }
            }
            if (this.f15860X == null) {
                this.f15860X = VelocityTracker.obtain();
            }
            this.f15860X.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f15865b0 = false;
                    this.f15861Z = -1;
                    if (this.f15850N) {
                        this.f15850N = false;
                        return false;
                    }
                }
            } else {
                int x5 = (int) motionEvent.getX();
                this.f15863a0 = (int) motionEvent.getY();
                if (this.f15848L != 2) {
                    WeakReference weakReference = this.f15858V;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x5, this.f15863a0)) {
                        this.f15861Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f15865b0 = true;
                    }
                }
                if (this.f15861Z == -1 && !coordinatorLayout.o(view, x5, this.f15863a0)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f15850N = z9;
            }
            if (this.f15850N || (dVar = this.f15849M) == null || !dVar.p(motionEvent)) {
                WeakReference weakReference2 = this.f15858V;
                if (weakReference2 != null) {
                    view3 = (View) weakReference2.get();
                }
                if (actionMasked != 2 || view3 == null || this.f15850N || this.f15848L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f15849M == null || (i9 = this.f15863a0) == -1 || Math.abs(i9 - motionEvent.getY()) <= this.f15849M.f7558b) {
                    return false;
                }
            }
            return true;
        }
        this.f15850N = true;
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, com.google.firebase.messaging.n] */
    /* JADX WARN: Type inference failed for: r7v1, types: [w5.q, java.lang.Object, A6.i] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int[], java.io.Serializable] */
    @Override // B.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
        boolean z9;
        int i10 = this.f15877l;
        h hVar = this.f15875i;
        WeakHashMap weakHashMap = Q.f5546a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i11 = 0;
        if (this.f15857U == null) {
            this.f15873g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29 && !this.f15879n && !this.f15872f) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.f15880o || this.f15881p || this.f15882q || this.f15884s || this.f15885t || this.f15886u || z9) {
                ?? obj = new Object();
                obj.f509b = this;
                obj.f508a = z9;
                p.d(view, obj);
            }
            ?? obj2 = new Object();
            obj2.f16492e = new int[2];
            obj2.f16491d = view;
            if (i12 >= 30) {
                view.setWindowInsetsAnimationCallback(new c0(obj2));
            } else {
                PathInterpolator pathInterpolator = b0.f5575e;
                View.OnApplyWindowInsetsListener a0Var = new a0(view, obj2);
                view.setTag(R.id.tag_window_insets_animation_callback, a0Var);
                if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    view.setOnApplyWindowInsetsListener(a0Var);
                }
            }
            this.f15857U = new WeakReference(view);
            this.Y = new f(view);
            if (hVar != null) {
                view.setBackground(hVar);
                float f9 = this.f15845H;
                if (f9 == -1.0f) {
                    f9 = H.e(view);
                }
                hVar.j(f9);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    H.i(view, colorStateList);
                }
            }
            M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f15849M == null) {
            this.f15849M = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f15871e0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i9);
        this.f15855S = coordinatorLayout.getWidth();
        this.f15856T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f15854R = height;
        int i13 = this.f15856T;
        int i14 = i13 - height;
        int i15 = this.f15888w;
        if (i14 < i15) {
            if (this.f15883r) {
                if (i10 != -1) {
                    i13 = Math.min(i13, i10);
                }
                this.f15854R = i13;
            } else {
                int i16 = i13 - i15;
                if (i10 != -1) {
                    i16 = Math.min(i16, i10);
                }
                this.f15854R = i16;
            }
        }
        this.f15841D = Math.max(0, this.f15856T - this.f15854R);
        this.f15842E = (int) ((1.0f - this.f15843F) * this.f15856T);
        w();
        int i17 = this.f15848L;
        if (i17 == 3) {
            view.offsetTopAndBottom(D());
        } else if (i17 == 6) {
            view.offsetTopAndBottom(this.f15842E);
        } else if (this.f15846I && i17 == 5) {
            view.offsetTopAndBottom(this.f15856T);
        } else if (i17 == 4) {
            view.offsetTopAndBottom(this.f15844G);
        } else if (i17 == 1 || i17 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        N(this.f15848L, false);
        this.f15858V = new WeakReference(A(view));
        while (true) {
            ArrayList arrayList = this.f15859W;
            if (i11 >= arrayList.size()) {
                return true;
            }
            ((AbstractC1593a) arrayList.get(i11)).a(view);
            i11++;
        }
    }

    @Override // B.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(C(i9, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.f15876k, marginLayoutParams.width), C(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f15877l, marginLayoutParams.height));
        return true;
    }

    @Override // B.c
    public final boolean n(View view) {
        WeakReference weakReference = this.f15858V;
        if (weakReference != null && view == weakReference.get() && this.f15848L != 3) {
            return true;
        }
        return false;
    }

    @Override // B.c
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int[] iArr, int i11) {
        View view3;
        boolean z9 = this.K;
        if (i11 != 1) {
            WeakReference weakReference = this.f15858V;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i12 = top - i10;
                if (i10 > 0) {
                    if (i12 < D()) {
                        int D8 = top - D();
                        iArr[1] = D8;
                        WeakHashMap weakHashMap = Q.f5546a;
                        view.offsetTopAndBottom(-D8);
                        J(3);
                    } else if (z9) {
                        iArr[1] = i10;
                        WeakHashMap weakHashMap2 = Q.f5546a;
                        view.offsetTopAndBottom(-i10);
                        J(1);
                    } else {
                        return;
                    }
                } else if (i10 < 0 && !view2.canScrollVertically(-1)) {
                    int i13 = this.f15844G;
                    if (i12 > i13 && !this.f15846I) {
                        int i14 = top - i13;
                        iArr[1] = i14;
                        WeakHashMap weakHashMap3 = Q.f5546a;
                        view.offsetTopAndBottom(-i14);
                        J(4);
                    } else {
                        if (!z9) {
                            return;
                        }
                        iArr[1] = i10;
                        WeakHashMap weakHashMap4 = Q.f5546a;
                        view.offsetTopAndBottom(-i10);
                        J(1);
                    }
                }
                z(view.getTop());
                this.f15851O = i10;
                this.f15852P = true;
            }
        }
    }

    @Override // B.c
    public final void r(View view, Parcelable parcelable) {
        m5.b bVar = (m5.b) parcelable;
        int i9 = this.f15862a;
        if (i9 != 0) {
            if (i9 == -1 || (i9 & 1) == 1) {
                this.f15870e = bVar.f20835d;
            }
            if (i9 == -1 || (i9 & 2) == 2) {
                this.f15864b = bVar.f20836e;
            }
            if (i9 == -1 || (i9 & 4) == 4) {
                this.f15846I = bVar.f20837f;
            }
            if (i9 == -1 || (i9 & 8) == 8) {
                this.f15847J = bVar.f20838g;
            }
        }
        int i10 = bVar.f20834c;
        if (i10 != 1 && i10 != 2) {
            this.f15848L = i10;
        } else {
            this.f15848L = 4;
        }
    }

    @Override // B.c
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new m5.b(this);
    }

    @Override // B.c
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10) {
        this.f15851O = 0;
        this.f15852P = false;
        if ((i9 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.f15842E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f15841D) < java.lang.Math.abs(r3 - r2.f15844G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.f15844G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f15844G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f15842E) < java.lang.Math.abs(r3 - r2.f15844G)) goto L50;
     */
    @Override // B.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.D()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.J(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.f15858V
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.f15852P
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.f15851O
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f15864b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.f15842E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.f15846I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.f15860X
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f15866c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.f15860X
            int r6 = r2.f15861Z
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.K(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.f15851O
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f15864b
            if (r1 == 0) goto L74
            int r5 = r2.f15841D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f15844G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.f15842E
            if (r3 >= r1) goto L83
            int r6 = r2.f15844G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f15844G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f15864b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.f15842E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f15844G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.L(r4, r0, r3)
            r2.f15852P = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // B.c
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i9 = this.f15848L;
        if (i9 == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.f15849M;
        if (dVar != null && (this.K || i9 == 1)) {
            dVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f15861Z = -1;
            this.f15863a0 = -1;
            VelocityTracker velocityTracker = this.f15860X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f15860X = null;
            }
        }
        if (this.f15860X == null) {
            this.f15860X = VelocityTracker.obtain();
        }
        this.f15860X.addMovement(motionEvent);
        if (this.f15849M != null && ((this.K || this.f15848L == 1) && actionMasked == 2 && !this.f15850N)) {
            float abs = Math.abs(this.f15863a0 - motionEvent.getY());
            d dVar2 = this.f15849M;
            if (abs > dVar2.f7558b) {
                dVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f15850N;
    }

    public final void w() {
        int y9 = y();
        if (this.f15864b) {
            this.f15844G = Math.max(this.f15856T - y9, this.f15841D);
        } else {
            this.f15844G = this.f15856T - y9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float x() {
        /*
            r5 = this;
            F5.h r0 = r5.f15875i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f15857U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f15857U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.F()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            F5.h r2 = r5.f15875i
            F5.g r3 = r2.f2483a
            F5.m r3 = r3.f2466a
            F5.c r3 = r3.f2523e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = k3.AbstractC1493i.g(r0)
            if (r3 == 0) goto L4e
            int r3 = k3.AbstractC1493i.b(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            F5.h r2 = r5.f15875i
            F5.g r4 = r2.f2483a
            F5.m r4 = r4.f2466a
            F5.c r4 = r4.f2524f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = k3.AbstractC1493i.q(r0)
            if (r0 == 0) goto L74
            int r0 = k3.AbstractC1493i.b(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.x():float");
    }

    public final int y() {
        int i9;
        if (this.f15872f) {
            return Math.min(Math.max(this.f15873g, this.f15856T - ((this.f15855S * 9) / 16)), this.f15854R) + this.f15887v;
        }
        if (!this.f15879n && !this.f15880o && (i9 = this.f15878m) > 0) {
            return Math.max(this.f15870e, i9 + this.f15874h);
        }
        return this.f15870e + this.f15887v;
    }

    public final void z(int i9) {
        View view = (View) this.f15857U.get();
        if (view != null) {
            ArrayList arrayList = this.f15859W;
            if (!arrayList.isEmpty()) {
                int i10 = this.f15844G;
                if (i9 <= i10 && i10 != D()) {
                    D();
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((AbstractC1593a) arrayList.get(i11)).b(view);
                }
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i9;
        int i10 = 6;
        this.f15862a = 0;
        this.f15864b = true;
        this.f15876k = -1;
        this.f15877l = -1;
        this.f15838A = new n(this);
        this.f15843F = 0.5f;
        this.f15845H = -1.0f;
        this.K = true;
        this.f15848L = 4;
        this.f15853Q = 0.1f;
        this.f15859W = new ArrayList();
        this.f15863a0 = -1;
        this.f15869d0 = new SparseIntArray();
        this.f15871e0 = new G5.d(this, 1);
        this.f15874h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.f17741f);
        if (obtainStyledAttributes.hasValue(3)) {
            this.j = D1.p(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f15890y = m.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        m mVar = this.f15890y;
        if (mVar != null) {
            h hVar = new h(mVar);
            this.f15875i = hVar;
            hVar.i(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.f15875i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f15875i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.f15839B = ofFloat;
        ofFloat.setDuration(500L);
        this.f15839B.addUpdateListener(new C0118w(i10, this));
        this.f15845H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f15876k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f15877l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i9 = peekValue.data) == -1) {
            H(i9);
        } else {
            H(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        G(obtainStyledAttributes.getBoolean(8, false));
        this.f15879n = obtainStyledAttributes.getBoolean(13, false);
        boolean z9 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f15864b != z9) {
            this.f15864b = z9;
            if (this.f15857U != null) {
                w();
            }
            J((this.f15864b && this.f15848L == 6) ? 3 : this.f15848L);
            N(this.f15848L, true);
            M();
        }
        this.f15847J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.f15862a = obtainStyledAttributes.getInt(10, 0);
        float f9 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f9 > 0.0f && f9 < 1.0f) {
            this.f15843F = f9;
            if (this.f15857U != null) {
                this.f15842E = (int) ((1.0f - f9) * this.f15856T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i11 = peekValue2.data;
                if (i11 >= 0) {
                    this.f15840C = i11;
                    N(this.f15848L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f15840C = dimensionPixelOffset;
                    N(this.f15848L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f15868d = obtainStyledAttributes.getInt(11, 500);
            this.f15880o = obtainStyledAttributes.getBoolean(17, false);
            this.f15881p = obtainStyledAttributes.getBoolean(18, false);
            this.f15882q = obtainStyledAttributes.getBoolean(19, false);
            this.f15883r = obtainStyledAttributes.getBoolean(20, true);
            this.f15884s = obtainStyledAttributes.getBoolean(14, false);
            this.f15885t = obtainStyledAttributes.getBoolean(15, false);
            this.f15886u = obtainStyledAttributes.getBoolean(16, false);
            this.f15889x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f15866c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // B.c
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11, int[] iArr) {
    }
}
