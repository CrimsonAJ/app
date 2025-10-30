package com.google.android.material.sidesheet;

import A5.t;
import B.c;
import B.f;
import D4.n;
import F5.h;
import F5.l;
import F5.m;
import G.j;
import G5.a;
import P.H;
import P.Q;
import V.d;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d.C1061b;
import g5.AbstractC1254a;
import h5.AbstractC1281a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k0.C1478a;
import v4.e;
import y5.b;
import y5.g;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends c implements b {

    /* renamed from: a, reason: collision with root package name */
    public e f16091a;

    /* renamed from: b, reason: collision with root package name */
    public final h f16092b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f16093c;

    /* renamed from: d, reason: collision with root package name */
    public final m f16094d;

    /* renamed from: e, reason: collision with root package name */
    public final n f16095e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16096f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16097g;

    /* renamed from: h, reason: collision with root package name */
    public int f16098h;

    /* renamed from: i, reason: collision with root package name */
    public d f16099i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final float f16100k;

    /* renamed from: l, reason: collision with root package name */
    public int f16101l;

    /* renamed from: m, reason: collision with root package name */
    public int f16102m;

    /* renamed from: n, reason: collision with root package name */
    public int f16103n;

    /* renamed from: o, reason: collision with root package name */
    public int f16104o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f16105p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f16106q;

    /* renamed from: r, reason: collision with root package name */
    public final int f16107r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f16108s;

    /* renamed from: t, reason: collision with root package name */
    public y5.h f16109t;

    /* renamed from: u, reason: collision with root package name */
    public int f16110u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f16111v;

    /* renamed from: w, reason: collision with root package name */
    public final G5.d f16112w;

    public SideSheetBehavior() {
        this.f16095e = new n(this);
        this.f16097g = true;
        this.f16098h = 5;
        this.f16100k = 0.1f;
        this.f16107r = -1;
        this.f16111v = new LinkedHashSet();
        this.f16112w = new G5.d(this, 0);
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.f16105p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            Q.j(view, 262144);
            Q.h(view, 0);
            Q.j(view, 1048576);
            Q.h(view, 0);
            if (this.f16098h != 5) {
                Q.k(view, Q.e.j, new G5.b(5, this));
            }
            if (this.f16098h != 3) {
                Q.k(view, Q.e.f6023h, new G5.b(3, this));
            }
        }
    }

    @Override // y5.b
    public final void a(C1061b c1061b) {
        int i9;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z9;
        y5.h hVar = this.f16109t;
        if (hVar != null) {
            e eVar = this.f16091a;
            if (eVar != null && eVar.A() != 0) {
                i9 = 3;
            } else {
                i9 = 5;
            }
            if (hVar.f25010f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            C1061b c1061b2 = hVar.f25010f;
            hVar.f25010f = c1061b;
            if (c1061b2 != null) {
                if (c1061b.f16560d == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                hVar.a(c1061b.f16559c, z9, i9);
            }
            WeakReference weakReference = this.f16105p;
            if (weakReference != null && weakReference.get() != null) {
                View view2 = (View) this.f16105p.get();
                WeakReference weakReference2 = this.f16106q;
                if (weakReference2 != null) {
                    view = (View) weakReference2.get();
                } else {
                    view = null;
                }
                if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                    this.f16091a.W(marginLayoutParams, (int) ((view2.getScaleX() * this.f16101l) + this.f16104o));
                    view.requestLayout();
                }
            }
        }
    }

    @Override // y5.b
    public final void b() {
        final View view;
        boolean z9;
        boolean z10;
        int i9;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        y5.h hVar = this.f16109t;
        if (hVar == null) {
            return;
        }
        C1061b c1061b = hVar.f25010f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        hVar.f25010f = null;
        int i10 = 5;
        if (c1061b != null && Build.VERSION.SDK_INT >= 34) {
            e eVar = this.f16091a;
            if (eVar != null && eVar.A() != 0) {
                i10 = 3;
            }
            t tVar = new t(1, this);
            WeakReference weakReference = this.f16106q;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                final int q9 = this.f16091a.q(marginLayoutParams);
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: G5.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SideSheetBehavior.this.f16091a.W(marginLayoutParams, AbstractC1281a.c(q9, valueAnimator.getAnimatedFraction(), 0));
                        view.requestLayout();
                    }
                };
            }
            if (c1061b.f16560d == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            WeakHashMap weakHashMap = Q.f5546a;
            View view2 = hVar.f25006b;
            if ((Gravity.getAbsoluteGravity(i10, view2.getLayoutDirection()) & 3) == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            float scaleX = view2.getScaleX() * view2.getWidth();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z10) {
                    i9 = marginLayoutParams2.leftMargin;
                } else {
                    i9 = marginLayoutParams2.rightMargin;
                }
            } else {
                i9 = 0;
            }
            float f9 = scaleX + i9;
            Property property = View.TRANSLATION_X;
            if (z10) {
                f9 = -f9;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f9);
            if (animatorUpdateListener != null) {
                ofFloat.addUpdateListener(animatorUpdateListener);
            }
            ofFloat.setInterpolator(new C1478a(1));
            ofFloat.setDuration(AbstractC1281a.c(hVar.f25007c, c1061b.f16559c, hVar.f25008d));
            ofFloat.addListener(new g(hVar, z9, i10));
            ofFloat.addListener(tVar);
            ofFloat.start();
            return;
        }
        w(5);
    }

    @Override // y5.b
    public final void c(C1061b c1061b) {
        y5.h hVar = this.f16109t;
        if (hVar == null) {
            return;
        }
        hVar.f25010f = c1061b;
    }

    @Override // y5.b
    public final void d() {
        y5.h hVar = this.f16109t;
        if (hVar != null) {
            if (hVar.f25010f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            C1061b c1061b = hVar.f25010f;
            hVar.f25010f = null;
            if (c1061b == null) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            View view = hVar.f25006b;
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i9), (Property<View, Float>) View.SCALE_Y, 1.0f));
                }
            }
            animatorSet.setDuration(hVar.f25009e);
            animatorSet.start();
        }
    }

    @Override // B.c
    public final void g(f fVar) {
        this.f16105p = null;
        this.f16099i = null;
        this.f16109t = null;
    }

    @Override // B.c
    public final void j() {
        this.f16105p = null;
        this.f16099i = null;
        this.f16109t = null;
    }

    @Override // B.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d dVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || Q.e(view) != null) && this.f16097g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f16108s) != null) {
                velocityTracker.recycle();
                this.f16108s = null;
            }
            if (this.f16108s == null) {
                this.f16108s = VelocityTracker.obtain();
            }
            this.f16108s.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.j) {
                    this.j = false;
                    return false;
                }
            } else {
                this.f16110u = (int) motionEvent.getX();
            }
            if (!this.j && (dVar = this.f16099i) != null && dVar.p(motionEvent)) {
                return true;
            }
            return false;
        }
        this.j = true;
        return false;
    }

    @Override // B.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
        int i10;
        View view2;
        View view3;
        int i11;
        int i12;
        View findViewById;
        int i13;
        int i14 = 0;
        int i15 = 1;
        h hVar = this.f16092b;
        WeakHashMap weakHashMap = Q.f5546a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f16105p == null) {
            this.f16105p = new WeakReference(view);
            this.f16109t = new y5.h(view);
            if (hVar != null) {
                view.setBackground(hVar);
                float f9 = this.f16096f;
                if (f9 == -1.0f) {
                    f9 = H.e(view);
                }
                hVar.j(f9);
            } else {
                ColorStateList colorStateList = this.f16093c;
                if (colorStateList != null) {
                    H.i(view, colorStateList);
                }
            }
            if (this.f16098h == 5) {
                i13 = 4;
            } else {
                i13 = 0;
            }
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (Q.e(view) == null) {
                Q.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((f) view.getLayoutParams()).f569c, i9) == 3) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        e eVar = this.f16091a;
        if (eVar == null || eVar.A() != i10) {
            m mVar = this.f16094d;
            f fVar = null;
            if (i10 == 0) {
                this.f16091a = new a(this, i15);
                if (mVar != null) {
                    WeakReference weakReference = this.f16105p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof f)) {
                        fVar = (f) view3.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).rightMargin <= 0) {
                        l e8 = mVar.e();
                        e8.f2513f = new F5.a(0.0f);
                        e8.f2514g = new F5.a(0.0f);
                        m a5 = e8.a();
                        if (hVar != null) {
                            hVar.setShapeAppearanceModel(a5);
                        }
                    }
                }
            } else if (i10 == 1) {
                this.f16091a = new a(this, i14);
                if (mVar != null) {
                    WeakReference weakReference2 = this.f16105p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof f)) {
                        fVar = (f) view2.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).leftMargin <= 0) {
                        l e9 = mVar.e();
                        e9.f2512e = new F5.a(0.0f);
                        e9.f2515h = new F5.a(0.0f);
                        m a9 = e9.a();
                        if (hVar != null) {
                            hVar.setShapeAppearanceModel(a9);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(A0.a.m("Invalid sheet edge position value: ", i10, ". Must be 0 or 1."));
            }
        }
        if (this.f16099i == null) {
            this.f16099i = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f16112w);
        }
        int x5 = this.f16091a.x(view);
        coordinatorLayout.q(view, i9);
        this.f16102m = coordinatorLayout.getWidth();
        this.f16103n = this.f16091a.y(coordinatorLayout);
        this.f16101l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i11 = this.f16091a.c(marginLayoutParams);
        } else {
            i11 = 0;
        }
        this.f16104o = i11;
        int i16 = this.f16098h;
        if (i16 != 1 && i16 != 2) {
            if (i16 != 3) {
                if (i16 == 5) {
                    i14 = this.f16091a.s();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f16098h);
                }
            }
        } else {
            i14 = x5 - this.f16091a.x(view);
        }
        view.offsetLeftAndRight(i14);
        if (this.f16106q == null && (i12 = this.f16107r) != -1 && (findViewById = coordinatorLayout.findViewById(i12)) != null) {
            this.f16106q = new WeakReference(findViewById);
        }
        Iterator it = this.f16111v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // B.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i9, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // B.c
    public final void r(View view, Parcelable parcelable) {
        int i9 = ((G5.e) parcelable).f2873c;
        if (i9 == 1 || i9 == 2) {
            i9 = 5;
        }
        this.f16098h = i9;
    }

    @Override // B.c
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new G5.e(this);
    }

    @Override // B.c
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f16098h == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.f16099i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f16108s) != null) {
            velocityTracker.recycle();
            this.f16108s = null;
        }
        if (this.f16108s == null) {
            this.f16108s = VelocityTracker.obtain();
        }
        this.f16108s.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.j && y()) {
            float abs = Math.abs(this.f16110u - motionEvent.getX());
            d dVar = this.f16099i;
            if (abs > dVar.f7558b) {
                dVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void w(int i9) {
        String str;
        if (i9 != 1 && i9 != 2) {
            WeakReference weakReference = this.f16105p;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f16105p.get();
                j jVar = new j(i9, 1, this);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap weakHashMap = Q.f5546a;
                    if (view.isAttachedToWindow()) {
                        view.post(jVar);
                        return;
                    }
                }
                jVar.run();
                return;
            }
            x(i9);
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

    public final void x(int i9) {
        View view;
        int i10;
        if (this.f16098h != i9) {
            this.f16098h = i9;
            WeakReference weakReference = this.f16105p;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            if (this.f16098h == 5) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            if (view.getVisibility() != i10) {
                view.setVisibility(i10);
            }
            Iterator it = this.f16111v.iterator();
            if (!it.hasNext()) {
                A();
                return;
            }
            throw A0.a.h(it);
        }
    }

    public final boolean y() {
        if (this.f16099i != null) {
            if (this.f16097g || this.f16098h == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        x(2);
        r2.f16095e.h(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            v4.e r0 = r2.f16091a
            int r0 = r0.s()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = com.google.android.gms.internal.measurement.AbstractC0953k1.j(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            v4.e r0 = r2.f16091a
            int r0 = r0.r()
        L1f:
            V.d r1 = r2.f16099i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f7573r = r3
            r3 = -1
            r1.f7559c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f7557a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f7573r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f7573r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.x(r3)
            D4.n r3 = r2.f16095e
            r3.h(r4)
            return
        L57:
            r2.x(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.z(android.view.View, int, boolean):void");
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f16095e = new n(this);
        this.f16097g = true;
        this.f16098h = 5;
        this.f16100k = 0.1f;
        this.f16107r = -1;
        this.f16111v = new LinkedHashSet();
        this.f16112w = new G5.d(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.K);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f16093c = D1.p(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f16094d = m.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f16107r = resourceId;
            WeakReference weakReference = this.f16106q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f16106q = null;
            WeakReference weakReference2 = this.f16105p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = Q.f5546a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        m mVar = this.f16094d;
        if (mVar != null) {
            h hVar = new h(mVar);
            this.f16092b = hVar;
            hVar.i(context);
            ColorStateList colorStateList = this.f16093c;
            if (colorStateList != null) {
                this.f16092b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f16092b.setTint(typedValue.data);
            }
        }
        this.f16096f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f16097g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
