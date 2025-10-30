package com.google.android.material.appbar;

import P.H;
import P.InterfaceC0310k;
import P.Q;
import P.V;
import P.u0;
import a.AbstractC0485a;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;
import h5.AbstractC1281a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import s.C1939i;
import u0.z;
import w5.C2143c;
import w5.p;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements B.b {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f15721z = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f15722a;

    /* renamed from: b, reason: collision with root package name */
    public int f15723b;

    /* renamed from: c, reason: collision with root package name */
    public int f15724c;

    /* renamed from: d, reason: collision with root package name */
    public int f15725d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15726e;

    /* renamed from: f, reason: collision with root package name */
    public int f15727f;

    /* renamed from: g, reason: collision with root package name */
    public u0 f15728g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f15729h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15730i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15731k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15732l;

    /* renamed from: m, reason: collision with root package name */
    public int f15733m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference f15734n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f15735o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f15736p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f15737q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f15738r;

    /* renamed from: s, reason: collision with root package name */
    public final long f15739s;

    /* renamed from: t, reason: collision with root package name */
    public final TimeInterpolator f15740t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f15741u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f15742v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f15743w;

    /* renamed from: x, reason: collision with root package name */
    public final float f15744x;

    /* renamed from: y, reason: collision with root package name */
    public Behavior f15745y;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends k {

        /* renamed from: a, reason: collision with root package name */
        public int f15746a;

        /* renamed from: b, reason: collision with root package name */
        public int f15747b;

        /* renamed from: c, reason: collision with root package name */
        public ValueAnimator f15748c;

        /* renamed from: d, reason: collision with root package name */
        public e f15749d;

        /* renamed from: e, reason: collision with root package name */
        public WeakReference f15750e;

        public BaseBehavior() {
        }

        public static View C(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            baseBehavior.getClass();
            int childCount = coordinatorLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = coordinatorLayout.getChildAt(i9);
                if (((B.f) childAt.getLayoutParams()).f567a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View E(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = coordinatorLayout.getChildAt(i9);
                if ((childAt instanceof InterfaceC0310k) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void I(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                r0 = 1
                int r1 = java.lang.Math.abs(r9)
                int r2 = r8.getChildCount()
                r3 = 0
                r4 = r3
            Lb:
                if (r4 >= r2) goto L20
                android.view.View r5 = r8.getChildAt(r4)
                int r6 = r5.getTop()
                if (r1 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r1 > r6) goto L1e
                goto L21
            L1e:
                int r4 = r4 + r0
                goto Lb
            L20:
                r5 = 0
            L21:
                if (r5 == 0) goto L5c
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.f r1 = (com.google.android.material.appbar.f) r1
                int r1 = r1.f15803a
                r2 = r1 & 1
                if (r2 == 0) goto L5c
                java.util.WeakHashMap r2 = P.Q.f5546a
                int r2 = r5.getMinimumHeight()
                if (r10 <= 0) goto L4a
                r10 = r1 & 12
                if (r10 == 0) goto L4a
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r2
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5c
            L48:
                r9 = r0
                goto L5d
            L4a:
                r10 = r1 & 2
                if (r10 == 0) goto L5c
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r2
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5c
                goto L48
            L5c:
                r9 = r3
            L5d:
                boolean r10 = r8.f15732l
                if (r10 == 0) goto L69
                android.view.View r9 = E(r7)
                boolean r9 = r8.g(r9)
            L69:
                boolean r9 = r8.f(r9)
                if (r11 != 0) goto La8
                if (r9 == 0) goto Lcf
                com.google.firebase.messaging.s r9 = r7.f9548b
                java.lang.Object r9 = r9.f16505c
                s.i r9 = (s.C1939i) r9
                java.lang.Object r9 = r9.get(r8)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.f9550d
                r7.clear()
                if (r9 == 0) goto L87
                r7.addAll(r9)
            L87:
                int r9 = r7.size()
            L8b:
                if (r3 >= r9) goto Lcf
                java.lang.Object r10 = r7.get(r3)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                B.f r10 = (B.f) r10
                B.c r10 = r10.f567a
                boolean r11 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r11 == 0) goto La6
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r7 = r10.f15815d
                if (r7 == 0) goto Lcf
                goto La8
            La6:
                int r3 = r3 + r0
                goto L8b
            La8:
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                if (r7 == 0) goto Lb5
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                r7.jumpToCurrentState()
            Lb5:
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                if (r7 == 0) goto Lc2
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                r7.jumpToCurrentState()
            Lc2:
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                if (r7 == 0) goto Lcf
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                r7.jumpToCurrentState()
            Lcf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.I(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // com.google.android.material.appbar.k
        public final int A(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11) {
            int i12;
            int i13;
            List list;
            int i14;
            int i15;
            int i16 = 1;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int z9 = z();
            int i17 = 0;
            if (i10 != 0 && z9 >= i10 && z9 <= i11) {
                int k5 = B6.u0.k(i9, i10, i11);
                if (z9 != k5) {
                    if (appBarLayout.f15726e) {
                        int abs = Math.abs(k5);
                        int childCount = appBarLayout.getChildCount();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i18);
                            f fVar = (f) childAt.getLayoutParams();
                            Interpolator interpolator = fVar.f15805c;
                            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i19 = fVar.f15803a;
                                    if ((i19 & 1) != 0) {
                                        i15 = childAt.getHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                                        if ((i19 & 2) != 0) {
                                            WeakHashMap weakHashMap = Q.f5546a;
                                            i15 -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        i15 = 0;
                                    }
                                    WeakHashMap weakHashMap2 = Q.f5546a;
                                    if (childAt.getFitsSystemWindows()) {
                                        i15 -= appBarLayout.getTopInset();
                                    }
                                    if (i15 > 0) {
                                        float f9 = i15;
                                        i12 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f9) * f9)) * Integer.signum(k5);
                                    }
                                }
                            } else {
                                i18++;
                            }
                        }
                    }
                    i12 = k5;
                    boolean y9 = y(i12);
                    int i20 = z9 - k5;
                    this.f15746a = k5 - i12;
                    if (y9) {
                        int i21 = 0;
                        while (i21 < appBarLayout.getChildCount()) {
                            f fVar2 = (f) appBarLayout.getChildAt(i21).getLayoutParams();
                            O0.c cVar = fVar2.f15804b;
                            if (cVar != null && (fVar2.f15803a & i16) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i21);
                                float w7 = w();
                                Rect rect = (Rect) cVar.f5263b;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = rect.top - Math.abs(w7);
                                if (abs2 <= 0.0f) {
                                    i14 = i16;
                                    float j = 1.0f - B6.u0.j(Math.abs(abs2 / rect.height()), 0.0f, 1.0f);
                                    float height = (-abs2) - ((rect.height() * 0.3f) * (1.0f - (j * j)));
                                    childAt2.setTranslationY(height);
                                    Rect rect2 = (Rect) cVar.f5264c;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-height));
                                    if (height >= rect2.height()) {
                                        childAt2.setVisibility(4);
                                    } else {
                                        childAt2.setVisibility(0);
                                    }
                                    WeakHashMap weakHashMap3 = Q.f5546a;
                                    childAt2.setClipBounds(rect2);
                                } else {
                                    i14 = i16;
                                    WeakHashMap weakHashMap4 = Q.f5546a;
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setVisibility(0);
                                }
                            } else {
                                i14 = i16;
                            }
                            i21++;
                            i16 = i14;
                        }
                    }
                    int i22 = i16;
                    if (!y9 && appBarLayout.f15726e && (list = (List) ((C1939i) coordinatorLayout.f9548b.f16505c).get(appBarLayout)) != null && !list.isEmpty()) {
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            View view2 = (View) list.get(i23);
                            B.c cVar2 = ((B.f) view2.getLayoutParams()).f567a;
                            if (cVar2 != null) {
                                cVar2.h(coordinatorLayout, view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.d(w());
                    if (k5 < z9) {
                        i13 = -1;
                    } else {
                        i13 = i22;
                    }
                    I(coordinatorLayout, appBarLayout, k5, i13, false);
                    i17 = i20;
                }
            } else {
                this.f15746a = 0;
            }
            if (Q.d(coordinatorLayout) != null) {
                return i17;
            }
            Q.m(coordinatorLayout, new c(coordinatorLayout, this, appBarLayout));
            return i17;
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i9) {
            int height;
            int abs = Math.abs(z() - i9);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int z9 = z();
            if (z9 == i9) {
                ValueAnimator valueAnimator = this.f15748c;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f15748c.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f15748c;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f15748c = valueAnimator3;
                valueAnimator3.setInterpolator(AbstractC1281a.f17929e);
                this.f15748c.addUpdateListener(new b(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f15748c.setDuration(Math.min(height, 600));
            this.f15748c.setIntValues(z9, i9);
            this.f15748c.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void F(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L2b
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
            Le:
                r6 = r0
                r7 = r1
                goto L18
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                goto Le
            L18:
                if (r6 == r7) goto L2b
                int r0 = r8.z()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r9 = r2.A(r3, r4, r5, r6, r7)
                r10 = 1
                r13[r10] = r9
                goto L2c
            L2b:
                r4 = r10
            L2c:
                boolean r9 = r4.f15732l
                if (r9 == 0) goto L37
                boolean r9 = r4.g(r11)
                r4.f(r9)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.F(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [U.b, com.google.android.material.appbar.e] */
        public final e G(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z9;
            boolean z10;
            boolean z11 = true;
            int w7 = w();
            int childCount = appBarLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = appBarLayout.getChildAt(i9);
                int bottom = childAt.getBottom() + w7;
                if (childAt.getTop() + w7 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = U.b.f7245b;
                    }
                    ?? bVar = new U.b(parcelable);
                    if (w7 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bVar.f15799d = z9;
                    if (!z9 && (-w7) >= appBarLayout.getTotalScrollRange()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.f15798c = z10;
                    bVar.f15800e = i9;
                    WeakHashMap weakHashMap = Q.f5546a;
                    if (bottom != appBarLayout.getTopInset() + childAt.getMinimumHeight()) {
                        z11 = false;
                    }
                    bVar.f15802g = z11;
                    bVar.f15801f = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int z9 = z() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 < childCount) {
                    View childAt = appBarLayout.getChildAt(i9);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    f fVar = (f) childAt.getLayoutParams();
                    if ((fVar.f15803a & 32) == 32) {
                        top -= ((LinearLayout.LayoutParams) fVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) fVar).bottomMargin;
                    }
                    int i10 = -z9;
                    if (top <= i10 && bottom >= i10) {
                        break;
                    } else {
                        i9++;
                    }
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i9);
                f fVar2 = (f) childAt2.getLayoutParams();
                int i11 = fVar2.f15803a;
                if ((i11 & 17) == 17) {
                    int i12 = -childAt2.getTop();
                    int i13 = -childAt2.getBottom();
                    if (i9 == 0) {
                        WeakHashMap weakHashMap = Q.f5546a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            i12 -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i11 & 2) == 2) {
                        WeakHashMap weakHashMap2 = Q.f5546a;
                        i13 += childAt2.getMinimumHeight();
                    } else if ((i11 & 5) == 5) {
                        WeakHashMap weakHashMap3 = Q.f5546a;
                        int minimumHeight = childAt2.getMinimumHeight() + i13;
                        if (z9 < minimumHeight) {
                            i12 = minimumHeight;
                        } else {
                            i13 = minimumHeight;
                        }
                    }
                    if ((i11 & 32) == 32) {
                        i12 += ((LinearLayout.LayoutParams) fVar2).topMargin;
                        i13 -= ((LinearLayout.LayoutParams) fVar2).bottomMargin;
                    }
                    if (z9 < (i13 + i12) / 2) {
                        i12 = i13;
                    }
                    D(coordinatorLayout, appBarLayout, B6.u0.k(i12 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // com.google.android.material.appbar.m, B.c
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
            boolean z9;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i9);
            int pendingAction = appBarLayout.getPendingAction();
            e eVar = this.f15749d;
            if (eVar != null && (pendingAction & 8) == 0) {
                if (eVar.f15798c) {
                    B(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                } else if (eVar.f15799d) {
                    B(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(eVar.f15800e);
                    int i10 = -childAt.getBottom();
                    if (this.f15749d.f15802g) {
                        WeakHashMap weakHashMap = Q.f5546a;
                        round = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i10;
                    } else {
                        round = Math.round(childAt.getHeight() * this.f15749d.f15801f) + i10;
                    }
                    B(coordinatorLayout, appBarLayout, round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i11 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z9) {
                        D(coordinatorLayout, appBarLayout, i11);
                    } else {
                        B(coordinatorLayout, appBarLayout, i11);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z9) {
                        D(coordinatorLayout, appBarLayout, 0);
                    } else {
                        B(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f15727f = 0;
            this.f15749d = null;
            y(B6.u0.k(w(), -appBarLayout.getTotalScrollRange(), 0));
            I(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.d(w());
            if (Q.d(coordinatorLayout) != null) {
                return true;
            }
            Q.m(coordinatorLayout, new c(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // B.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((B.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.r(i9, i10, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // B.c
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int[] iArr, int i11) {
            F(coordinatorLayout, (AppBarLayout) view, view2, i10, iArr);
        }

        @Override // B.c
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i11 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = A(coordinatorLayout2, appBarLayout, z() - i11, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i11 == 0 && Q.d(coordinatorLayout2) == null) {
                Q.m(coordinatorLayout2, new c(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // B.c
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof e) {
                this.f15749d = (e) parcelable;
            } else {
                this.f15749d = null;
            }
        }

        @Override // B.c
        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            e G8 = G(absSavedState, (AppBarLayout) view);
            if (G8 == null) {
                return absSavedState;
            }
            return G8;
        }

        @Override // B.c
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10) {
            boolean z9;
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i9 & 2) != 0 && (appBarLayout.f15732l || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && (valueAnimator = this.f15748c) != null) {
                valueAnimator.cancel();
            }
            this.f15750e = null;
            this.f15747b = i10;
            return z9;
        }

        @Override // B.c
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i9) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f15747b == 0 || i9 == 1) {
                H(coordinatorLayout, appBarLayout);
                if (appBarLayout.f15732l) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.f15750e = new WeakReference(view2);
        }

        @Override // com.google.android.material.appbar.k
        public final int z() {
            return w() + this.f15746a;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends l {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout A(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = (View) arrayList.get(i9);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // B.c
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // B.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            B.c cVar = ((B.f) view2.getLayoutParams()).f567a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f15746a) + this.f15814c) - z(view2);
                WeakHashMap weakHashMap = Q.f5546a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f15732l) {
                    appBarLayout.f(appBarLayout.g(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // B.c
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                Q.m(coordinatorLayout, null);
            }
        }

        @Override // B.c
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z9) {
            AppBarLayout A2 = A(coordinatorLayout.j(view));
            if (A2 != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f15812a;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    A2.e(false, !z9, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.f17723H);
            this.f15815d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        boolean z9;
        Integer num;
        int i9;
        int i10 = 1;
        this.f15723b = -1;
        this.f15724c = -1;
        this.f15725d = -1;
        this.f15727f = 0;
        this.f15738r = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i11 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray i12 = p.i(context3, attributeSet, o.f15821a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (i12.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, i12.getResourceId(0, 0)));
            }
            i12.recycle();
            TypedArray i13 = p.i(context2, attributeSet, AbstractC1254a.f17736a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = i13.getDrawable(0);
            WeakHashMap weakHashMap = Q.f5546a;
            setBackground(drawable);
            final ColorStateList p9 = D1.p(context2, i13, 6);
            if (p9 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f15735o = z9;
            final ColorStateList u9 = O4.h.u(getBackground());
            if (u9 != null) {
                final F5.h hVar = new F5.h();
                hVar.k(u9);
                if (p9 != null) {
                    Context context4 = getContext();
                    TypedValue X8 = AbstractC1002u1.X(context4, R.attr.colorSurface);
                    if (X8 != null) {
                        int i14 = X8.resourceId;
                        if (i14 != 0) {
                            i9 = context4.getColor(i14);
                        } else {
                            i9 = X8.data;
                        }
                        num = Integer.valueOf(i9);
                    } else {
                        num = null;
                    }
                    final Integer num2 = num;
                    this.f15737q = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num3;
                            int i15 = AppBarLayout.f15721z;
                            AppBarLayout appBarLayout = AppBarLayout.this;
                            int t7 = s8.n.t(u9.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), p9.getDefaultColor());
                            ColorStateList valueOf = ColorStateList.valueOf(t7);
                            F5.h hVar2 = hVar;
                            hVar2.k(valueOf);
                            if (appBarLayout.f15742v != null && (num3 = appBarLayout.f15743w) != null && num3.equals(num2)) {
                                appBarLayout.f15742v.setTint(t7);
                            }
                            ArrayList arrayList = appBarLayout.f15738r;
                            if (!arrayList.isEmpty()) {
                                int size = arrayList.size();
                                int i16 = 0;
                                while (i16 < size) {
                                    Object obj = arrayList.get(i16);
                                    i16++;
                                    if (obj == null) {
                                        if (hVar2.f2483a.f2468c != null) {
                                            throw null;
                                        }
                                    } else {
                                        throw new ClassCastException();
                                    }
                                }
                            }
                        }
                    };
                    setBackground(hVar);
                } else {
                    hVar.i(context2);
                    this.f15737q = new V(this, i10, hVar);
                    setBackground(hVar);
                }
            }
            this.f15739s = Z0.a.y(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f15740t = Z0.a.z(context2, R.attr.motionEasingStandardInterpolator, AbstractC1281a.f17925a);
            if (i13.hasValue(4)) {
                e(i13.getBoolean(4, false), false, false);
            }
            if (i13.hasValue(3)) {
                o.a(this, i13.getDimensionPixelSize(3, 0));
            }
            if (i11 >= 26) {
                if (i13.hasValue(2)) {
                    setKeyboardNavigationCluster(i13.getBoolean(2, false));
                }
                if (i13.hasValue(1)) {
                    setTouchscreenBlocksFocus(i13.getBoolean(1, false));
                }
            }
            this.f15744x = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f15732l = i13.getBoolean(5, false);
            this.f15733m = i13.getResourceId(7, -1);
            setStatusBarForeground(i13.getDrawable(8));
            i13.recycle();
            H.l(this, new s4.i(this));
        } catch (Throwable th) {
            i12.recycle();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, com.google.android.material.appbar.f] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, com.google.android.material.appbar.f] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, com.google.android.material.appbar.f] */
    public static f b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ?? layoutParams2 = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.f15803a = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? layoutParams3 = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.f15803a = 1;
            return layoutParams3;
        }
        ?? layoutParams4 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams4.f15803a = 1;
        return layoutParams4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, com.google.android.material.appbar.f] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f generateLayoutParams(AttributeSet attributeSet) {
        O0.c cVar;
        Context context = getContext();
        ?? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        layoutParams.f15803a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.f17737b);
        layoutParams.f15803a = obtainStyledAttributes.getInt(1, 0);
        if (obtainStyledAttributes.getInt(0, 0) != 1) {
            cVar = null;
        } else {
            cVar = new O0.c(17);
        }
        layoutParams.f15804b = cVar;
        if (obtainStyledAttributes.hasValue(2)) {
            layoutParams.f15805c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public final void c() {
        e eVar;
        Behavior behavior = this.f15745y;
        if (behavior != null && this.f15723b != -1 && this.f15727f == 0) {
            eVar = behavior.G(U.b.f7245b, this);
        } else {
            eVar = null;
        }
        this.f15723b = -1;
        this.f15724c = -1;
        this.f15725d = -1;
        if (eVar != null) {
            Behavior behavior2 = this.f15745y;
            if (behavior2.f15749d == null) {
                behavior2.f15749d = eVar;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    public final void d(int i9) {
        int i10;
        this.f15722a = i9;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = Q.f5546a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f15729h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = (h) this.f15729h.get(i11);
                if (hVar != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = hVar.f15808a;
                    collapsingToolbarLayout.f15779y = i9;
                    u0 u0Var = collapsingToolbarLayout.f15751A;
                    if (u0Var != null) {
                        i10 = u0Var.d();
                    } else {
                        i10 = 0;
                    }
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i12);
                        g gVar = (g) childAt.getLayoutParams();
                        n b9 = CollapsingToolbarLayout.b(childAt);
                        int i13 = gVar.f15806a;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                b9.b(Math.round((-i9) * gVar.f15807b));
                            }
                        } else {
                            b9.b(B6.u0.k(-i9, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f15817b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((g) childAt.getLayoutParams())).bottomMargin));
                        }
                    }
                    collapsingToolbarLayout.d();
                    if (collapsingToolbarLayout.f15770p != null && i10 > 0) {
                        WeakHashMap weakHashMap2 = Q.f5546a;
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    WeakHashMap weakHashMap3 = Q.f5546a;
                    int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - i10;
                    float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                    float f9 = minimumHeight;
                    float min = Math.min(1.0f, scrimVisibleHeightTrigger / f9);
                    C2143c c2143c = collapsingToolbarLayout.f15765k;
                    c2143c.f24246d = min;
                    c2143c.f24248e = z.b(1.0f, min, 0.5f, min);
                    c2143c.f24250f = collapsingToolbarLayout.f15779y + minimumHeight;
                    c2143c.p(Math.abs(i9) / f9);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f15742v != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f15722a);
            this.f15742v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f15742v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z9, boolean z10, boolean z11) {
        int i9;
        int i10;
        if (z9) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        int i11 = 0;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        int i12 = i9 | i10;
        if (z11) {
            i11 = 8;
        }
        this.f15727f = i12 | i11;
        requestLayout();
    }

    public final boolean f(boolean z9) {
        float f9;
        float f10;
        if (!this.f15730i && this.f15731k != z9) {
            this.f15731k = z9;
            refreshDrawableState();
            if (getBackground() instanceof F5.h) {
                float f11 = 0.0f;
                if (this.f15735o) {
                    if (z9) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    if (z9) {
                        f11 = 1.0f;
                    }
                    h(f10, f11);
                    return true;
                }
                if (this.f15732l) {
                    float f12 = this.f15744x;
                    if (z9) {
                        f9 = 0.0f;
                    } else {
                        f9 = f12;
                    }
                    if (z9) {
                        f11 = f12;
                    }
                    h(f9, f11);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean g(View view) {
        int i9;
        View view2;
        View view3 = null;
        if (this.f15734n == null && (i9 = this.f15733m) != -1) {
            if (view != null) {
                view2 = view.findViewById(i9);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f15733m);
            }
            if (view2 != null) {
                this.f15734n = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.f15734n;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null) {
            if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams, com.google.android.material.appbar.f] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.f15803a = 1;
        return layoutParams;
    }

    @Override // B.b
    public B.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f15745y = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getDownNestedPreScrollRange() {
        /*
            r11 = this;
            r0 = 5
            r1 = 8
            int r2 = r11.f15724c
            r3 = -1
            if (r2 == r3) goto L9
            return r2
        L9:
            int r2 = r11.getChildCount()
            int r2 = r2 + (-1)
            r4 = 0
            r5 = r4
        L11:
            if (r2 < 0) goto L68
            android.view.View r6 = r11.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 != r1) goto L1e
            goto L66
        L1e:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            com.google.android.material.appbar.f r7 = (com.google.android.material.appbar.f) r7
            int r8 = r6.getMeasuredHeight()
            int r9 = r7.f15803a
            r10 = r9 & 5
            if (r10 != r0) goto L63
            int r10 = r7.topMargin
            int r7 = r7.bottomMargin
            int r10 = r10 + r7
            r7 = r9 & 8
            if (r7 == 0) goto L3f
            java.util.WeakHashMap r7 = P.Q.f5546a
            int r7 = r6.getMinimumHeight()
        L3d:
            int r7 = r7 + r10
            goto L4e
        L3f:
            r7 = r9 & 2
            if (r7 == 0) goto L4c
            java.util.WeakHashMap r7 = P.Q.f5546a
            int r7 = r6.getMinimumHeight()
            int r7 = r8 - r7
            goto L3d
        L4c:
            int r7 = r10 + r8
        L4e:
            if (r2 != 0) goto L61
            java.util.WeakHashMap r9 = P.Q.f5546a
            boolean r6 = r6.getFitsSystemWindows()
            if (r6 == 0) goto L61
            int r6 = r11.getTopInset()
            int r8 = r8 - r6
            int r7 = java.lang.Math.min(r7, r8)
        L61:
            int r5 = r5 + r7
            goto L66
        L63:
            if (r5 <= 0) goto L66
            goto L68
        L66:
            int r2 = r2 + r3
            goto L11
        L68:
            int r0 = java.lang.Math.max(r4, r5)
            r11.f15724c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i9 = this.f15725d;
        if (i9 != -1) {
            return i9;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin + childAt.getMeasuredHeight();
                int i12 = fVar.f15803a;
                if ((i12 & 1) == 0) {
                    break;
                }
                i11 += measuredHeight;
                if ((i12 & 2) != 0) {
                    WeakHashMap weakHashMap = Q.f5546a;
                    i11 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i10++;
        }
        int max = Math.max(0, i11);
        this.f15725d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f15733m;
    }

    public F5.h getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof F5.h) {
            return (F5.h) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = Q.f5546a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                minimumHeight = getChildAt(childCount - 1).getMinimumHeight();
            } else {
                minimumHeight = 0;
            }
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f15727f;
    }

    public Drawable getStatusBarForeground() {
        return this.f15742v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        u0 u0Var = this.f15728g;
        if (u0Var != null) {
            return u0Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i9 = this.f15723b;
        if (i9 != -1) {
            return i9;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = fVar.f15803a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int i13 = measuredHeight + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin + i11;
                if (i10 == 0) {
                    WeakHashMap weakHashMap = Q.f5546a;
                    if (childAt.getFitsSystemWindows()) {
                        i13 -= getTopInset();
                    }
                }
                i11 = i13;
                if ((i12 & 2) != 0) {
                    WeakHashMap weakHashMap2 = Q.f5546a;
                    i11 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i10++;
        }
        int max = Math.max(0, i11);
        this.f15723b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void h(float f9, float f10) {
        ValueAnimator valueAnimator = this.f15736p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
        this.f15736p = ofFloat;
        ofFloat.setDuration(this.f15739s);
        this.f15736p.setInterpolator(this.f15740t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f15737q;
        if (animatorUpdateListener != null) {
            this.f15736p.addUpdateListener(animatorUpdateListener);
        }
        this.f15736p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1002u1.c0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f15741u == null) {
            this.f15741u = new int[4];
        }
        int[] iArr = this.f15741u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + iArr.length);
        boolean z9 = this.j;
        if (z9) {
            i10 = R.attr.state_liftable;
        } else {
            i10 = -2130969684;
        }
        iArr[0] = i10;
        if (z9 && this.f15731k) {
            i11 = R.attr.state_lifted;
        } else {
            i11 = -2130969685;
        }
        iArr[1] = i11;
        if (z9) {
            i12 = R.attr.state_collapsible;
        } else {
            i12 = -2130969680;
        }
        iArr[2] = i12;
        if (z9 && this.f15731k) {
            i13 = R.attr.state_collapsed;
        } else {
            i13 = -2130969679;
        }
        iArr[3] = i13;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f15734n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f15734n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        boolean z10 = true;
        super.onLayout(z9, i9, i10, i11, i12);
        WeakHashMap weakHashMap = Q.f5546a;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f15726e = false;
        int childCount2 = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount2) {
                break;
            }
            if (((f) getChildAt(i13).getLayoutParams()).f15805c != null) {
                this.f15726e = true;
                break;
            }
            i13++;
        }
        Drawable drawable = this.f15742v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f15730i) {
            if (!this.f15732l) {
                int childCount3 = getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 < childCount3) {
                        int i15 = ((f) getChildAt(i14).getLayoutParams()).f15803a;
                        if ((i15 & 1) == 1 && (i15 & 10) != 0) {
                            break;
                        } else {
                            i14++;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
            if (this.j != z10) {
                this.j = z10;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = Q.f5546a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode != Integer.MIN_VALUE) {
                        if (mode == 0) {
                            measuredHeight += getTopInset();
                        }
                    } else {
                        measuredHeight = B6.u0.k(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i10));
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        AbstractC1002u1.a0(this, f9);
    }

    public void setExpanded(boolean z9) {
        WeakHashMap weakHashMap = Q.f5546a;
        e(z9, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z9) {
        this.f15732l = z9;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f15733m = -1;
        if (view == null) {
            WeakReference weakReference = this.f15734n;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f15734n = null;
            return;
        }
        this.f15734n = new WeakReference(view);
    }

    public void setLiftOnScrollTargetViewId(int i9) {
        this.f15733m = i9;
        WeakReference weakReference = this.f15734n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f15734n = null;
    }

    public void setLiftableOverrideEnabled(boolean z9) {
        this.f15730i = z9;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i9) {
        if (i9 == 1) {
            super.setOrientation(i9);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2;
        boolean z9;
        Drawable drawable3 = this.f15742v;
        if (drawable3 != drawable) {
            Integer num = null;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            } else {
                drawable2 = null;
            }
            this.f15742v = drawable2;
            if (drawable2 instanceof F5.h) {
                num = Integer.valueOf(((F5.h) drawable2).f2502u);
            } else {
                ColorStateList u9 = O4.h.u(drawable2);
                if (u9 != null) {
                    num = Integer.valueOf(u9.getDefaultColor());
                }
            }
            this.f15743w = num;
            Drawable drawable4 = this.f15742v;
            boolean z10 = false;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f15742v.setState(getDrawableState());
                }
                Drawable drawable5 = this.f15742v;
                WeakHashMap weakHashMap = Q.f5546a;
                drawable5.setLayoutDirection(getLayoutDirection());
                Drawable drawable6 = this.f15742v;
                if (getVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                drawable6.setVisible(z9, false);
                this.f15742v.setCallback(this);
            }
            if (this.f15742v != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            WeakHashMap weakHashMap2 = Q.f5546a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i9) {
        setStatusBarForeground(new ColorDrawable(i9));
    }

    public void setStatusBarForegroundResource(int i9) {
        setStatusBarForeground(AbstractC0485a.q(getContext(), i9));
    }

    @Deprecated
    public void setTargetElevation(float f9) {
        o.a(this, f9);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        boolean z9;
        super.setVisibility(i9);
        if (i9 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable = this.f15742v;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f15742v) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, com.google.android.material.appbar.f] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.f15803a = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
