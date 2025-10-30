package com.google.android.material.tabs;

import F0.C0118w;
import J5.b;
import J5.e;
import J5.f;
import M5.a;
import O.c;
import O.d;
import O4.h;
import P.H;
import P.Q;
import a.AbstractC0485a;
import a1.AbstractC0488a;
import a1.AbstractC0489b;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;
import h.AbstractC1260a;
import h5.AbstractC1281a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import s4.i;
import w5.p;

/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: q0, reason: collision with root package name */
    public static final d f16126q0 = new d(16);

    /* renamed from: A, reason: collision with root package name */
    public final int f16127A;

    /* renamed from: B, reason: collision with root package name */
    public int f16128B;

    /* renamed from: C, reason: collision with root package name */
    public int f16129C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f16130D;

    /* renamed from: a, reason: collision with root package name */
    public int f16131a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16132b;

    /* renamed from: c, reason: collision with root package name */
    public f f16133c;

    /* renamed from: d, reason: collision with root package name */
    public final e f16134d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16135e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16136f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f16137f0;

    /* renamed from: g, reason: collision with root package name */
    public final int f16138g;

    /* renamed from: g0, reason: collision with root package name */
    public int f16139g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f16140h;

    /* renamed from: h0, reason: collision with root package name */
    public int f16141h0;

    /* renamed from: i, reason: collision with root package name */
    public final int f16142i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f16143i0;
    public final int j;

    /* renamed from: j0, reason: collision with root package name */
    public Q6.f f16144j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f16145k;

    /* renamed from: k0, reason: collision with root package name */
    public final TimeInterpolator f16146k0;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f16147l;

    /* renamed from: l0, reason: collision with root package name */
    public b f16148l0;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f16149m;

    /* renamed from: m0, reason: collision with root package name */
    public final ArrayList f16150m0;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f16151n;

    /* renamed from: n0, reason: collision with root package name */
    public ValueAnimator f16152n0;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f16153o;

    /* renamed from: o0, reason: collision with root package name */
    public int f16154o0;

    /* renamed from: p, reason: collision with root package name */
    public int f16155p;

    /* renamed from: p0, reason: collision with root package name */
    public final c f16156p0;

    /* renamed from: q, reason: collision with root package name */
    public final PorterDuff.Mode f16157q;

    /* renamed from: r, reason: collision with root package name */
    public final float f16158r;

    /* renamed from: s, reason: collision with root package name */
    public final float f16159s;

    /* renamed from: t, reason: collision with root package name */
    public final int f16160t;

    /* renamed from: u, reason: collision with root package name */
    public int f16161u;

    /* renamed from: v, reason: collision with root package name */
    public final int f16162v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16163w;

    /* renamed from: x, reason: collision with root package name */
    public final int f16164x;

    /* renamed from: y, reason: collision with root package name */
    public final int f16165y;

    /* renamed from: z, reason: collision with root package name */
    public int f16166z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f16131a = -1;
        this.f16132b = new ArrayList();
        this.f16145k = -1;
        this.f16155p = 0;
        this.f16161u = Integer.MAX_VALUE;
        this.f16139g0 = -1;
        this.f16150m0 = new ArrayList();
        this.f16156p0 = new c(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(this, context2);
        this.f16134d = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray i9 = p.i(context2, attributeSet, AbstractC1254a.f17730P, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList u9 = h.u(getBackground());
        if (u9 != null) {
            F5.h hVar = new F5.h();
            hVar.k(u9);
            hVar.i(context2);
            WeakHashMap weakHashMap = Q.f5546a;
            hVar.j(H.e(this));
            setBackground(hVar);
        }
        setSelectedTabIndicator(D1.t(context2, i9, 5));
        setSelectedTabIndicatorColor(i9.getColor(8, 0));
        eVar.b(i9.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(i9.getInt(10, 0));
        setTabIndicatorAnimationMode(i9.getInt(7, 0));
        setTabIndicatorFullWidth(i9.getBoolean(9, true));
        int dimensionPixelSize = i9.getDimensionPixelSize(16, 0);
        this.f16140h = dimensionPixelSize;
        this.f16138g = dimensionPixelSize;
        this.f16136f = dimensionPixelSize;
        this.f16135e = dimensionPixelSize;
        this.f16135e = i9.getDimensionPixelSize(19, dimensionPixelSize);
        this.f16136f = i9.getDimensionPixelSize(20, dimensionPixelSize);
        this.f16138g = i9.getDimensionPixelSize(18, dimensionPixelSize);
        this.f16140h = i9.getDimensionPixelSize(17, dimensionPixelSize);
        if (AbstractC1002u1.Y(context2, R.attr.isMaterial3Theme, false)) {
            this.f16142i = R.attr.textAppearanceTitleSmall;
        } else {
            this.f16142i = R.attr.textAppearanceButton;
        }
        int resourceId = i9.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.j = resourceId;
        int[] iArr = AbstractC1260a.f17826w;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f16158r = dimensionPixelSize2;
            this.f16147l = D1.p(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (i9.hasValue(22)) {
                this.f16145k = i9.getResourceId(22, resourceId);
            }
            int i10 = this.f16145k;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i10 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i10, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList p9 = D1.p(context2, obtainStyledAttributes, 3);
                    if (p9 != null) {
                        this.f16147l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{p9.getColorForState(new int[]{android.R.attr.state_selected}, p9.getDefaultColor()), this.f16147l.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (i9.hasValue(25)) {
                this.f16147l = D1.p(context2, i9, 25);
            }
            if (i9.hasValue(23)) {
                this.f16147l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{i9.getColor(23, 0), this.f16147l.getDefaultColor()});
            }
            this.f16149m = D1.p(context2, i9, 3);
            this.f16157q = p.k(i9.getInt(4, -1), null);
            this.f16151n = D1.p(context2, i9, 21);
            this.f16127A = i9.getInt(6, 300);
            this.f16146k0 = Z0.a.z(context2, R.attr.motionEasingEmphasizedInterpolator, AbstractC1281a.f17926b);
            this.f16162v = i9.getDimensionPixelSize(14, -1);
            this.f16163w = i9.getDimensionPixelSize(13, -1);
            this.f16160t = i9.getResourceId(0, 0);
            this.f16165y = i9.getDimensionPixelSize(1, 0);
            this.f16129C = i9.getInt(15, 1);
            this.f16166z = i9.getInt(2, 0);
            this.f16130D = i9.getBoolean(12, false);
            this.f16143i0 = i9.getBoolean(26, false);
            i9.recycle();
            Resources resources = getResources();
            this.f16159s = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f16164x = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            e();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f16132b;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            f fVar = (f) arrayList.get(i9);
            if (fVar != null && fVar.f4198a != null && !TextUtils.isEmpty(fVar.f4199b)) {
                if (!this.f16130D) {
                    return 72;
                }
                return 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i9 = this.f16162v;
        if (i9 != -1) {
            return i9;
        }
        int i10 = this.f16129C;
        if (i10 != 0 && i10 != 2) {
            return 0;
        }
        return this.f16164x;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f16134d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i9) {
        boolean z9;
        boolean z10;
        e eVar = this.f16134d;
        int childCount = eVar.getChildCount();
        if (i9 < childCount) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = eVar.getChildAt(i10);
                boolean z11 = true;
                if ((i10 == i9 && !childAt.isSelected()) || (i10 != i9 && childAt.isSelected())) {
                    if (i10 == i9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i10 != i9) {
                        z11 = false;
                    }
                    childAt.setActivated(z11);
                    if (childAt instanceof J5.h) {
                        ((J5.h) childAt).e();
                    }
                } else {
                    if (i10 == i9) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    childAt.setSelected(z9);
                    if (i10 != i9) {
                        z11 = false;
                    }
                    childAt.setActivated(z11);
                }
            }
        }
    }

    public final void a(b bVar) {
        ArrayList arrayList = this.f16150m0;
        if (!arrayList.contains(bVar)) {
            arrayList.add(bVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    public final void b(f fVar, boolean z9) {
        ArrayList arrayList = this.f16132b;
        int size = arrayList.size();
        if (fVar.f4203f == this) {
            fVar.f4201d = size;
            arrayList.add(size, fVar);
            int size2 = arrayList.size();
            int i9 = -1;
            for (int i10 = size + 1; i10 < size2; i10++) {
                if (((f) arrayList.get(i10)).f4201d == this.f16131a) {
                    i9 = i10;
                }
                ((f) arrayList.get(i10)).f4201d = i10;
            }
            this.f16131a = i9;
            J5.h hVar = fVar.f4204g;
            hVar.setSelected(false);
            hVar.setActivated(false);
            int i11 = fVar.f4201d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.f16129C == 1 && this.f16166z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            this.f16134d.addView(hVar, i11, layoutParams);
            if (z9) {
                TabLayout tabLayout = fVar.f4203f;
                if (tabLayout != null) {
                    tabLayout.k(fVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void c(View view) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            f i9 = i();
            CharSequence charSequence = tabItem.f16123a;
            boolean z12 = false;
            if (charSequence != null) {
                if (TextUtils.isEmpty(i9.f4200c) && !TextUtils.isEmpty(charSequence)) {
                    i9.f4204g.setContentDescription(charSequence);
                }
                i9.f4199b = charSequence;
                J5.h hVar = i9.f4204g;
                if (hVar != null) {
                    hVar.e();
                    f fVar = hVar.f4208a;
                    if (fVar != null && fVar.a()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hVar.setSelected(z11);
                }
            }
            Drawable drawable = tabItem.f16124b;
            if (drawable != null) {
                i9.f4198a = drawable;
                TabLayout tabLayout = i9.f4203f;
                if (tabLayout.f16166z == 1 || tabLayout.f16129C == 2) {
                    tabLayout.m(true);
                }
                J5.h hVar2 = i9.f4204g;
                if (hVar2 != null) {
                    hVar2.e();
                    f fVar2 = hVar2.f4208a;
                    if (fVar2 != null && fVar2.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hVar2.setSelected(z10);
                }
            }
            int i10 = tabItem.f16125c;
            if (i10 != 0) {
                i9.f4202e = LayoutInflater.from(i9.f4204g.getContext()).inflate(i10, (ViewGroup) i9.f4204g, false);
                J5.h hVar3 = i9.f4204g;
                if (hVar3 != null) {
                    hVar3.e();
                    f fVar3 = hVar3.f4208a;
                    if (fVar3 != null && fVar3.a()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    hVar3.setSelected(z9);
                }
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                i9.f4200c = tabItem.getContentDescription();
                J5.h hVar4 = i9.f4204g;
                if (hVar4 != null) {
                    hVar4.e();
                    f fVar4 = hVar4.f4208a;
                    if (fVar4 != null && fVar4.a()) {
                        z12 = true;
                    }
                    hVar4.setSelected(z12);
                }
            }
            b(i9, this.f16132b.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void d(int i9) {
        if (i9 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = Q.f5546a;
            if (isLaidOut()) {
                e eVar = this.f16134d;
                int childCount = eVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    if (eVar.getChildAt(i10).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int f9 = f(i9, 0.0f);
                if (scrollX != f9) {
                    g();
                    this.f16152n0.setIntValues(scrollX, f9);
                    this.f16152n0.start();
                }
                ValueAnimator valueAnimator = eVar.f4196a;
                if (valueAnimator != null && valueAnimator.isRunning() && eVar.f4197b.f16131a != i9) {
                    eVar.f4196a.cancel();
                }
                eVar.d(i9, this.f16127A, true);
                return;
            }
        }
        l(i9, 0.0f, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r5 = this;
            int r0 = r5.f16129C
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r5.f16165y
            int r3 = r5.f16135e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap r3 = P.Q.f5546a
            J5.e r3 = r5.f16134d
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r5.f16129C
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 == r4) goto L27
            if (r0 == r1) goto L27
            goto L4c
        L27:
            int r0 = r5.f16166z
            if (r0 != r1) goto L30
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L30:
            r3.setGravity(r4)
            goto L4c
        L34:
            int r0 = r5.f16166z
            if (r0 == 0) goto L41
            if (r0 == r4) goto L3d
            if (r0 == r1) goto L46
            goto L4c
        L3d:
            r3.setGravity(r4)
            goto L4c
        L41:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L46:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L4c:
            r5.m(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e():void");
    }

    public final int f(int i9, float f9) {
        e eVar;
        View childAt;
        View view;
        int i10 = this.f16129C;
        int i11 = 0;
        if ((i10 != 0 && i10 != 2) || (childAt = (eVar = this.f16134d).getChildAt(i9)) == null) {
            return 0;
        }
        int i12 = i9 + 1;
        if (i12 < eVar.getChildCount()) {
            view = eVar.getChildAt(i12);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i11 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) ((width + i11) * 0.5f * f9);
        WeakHashMap weakHashMap = Q.f5546a;
        if (getLayoutDirection() == 0) {
            return left + i13;
        }
        return left - i13;
    }

    public final void g() {
        if (this.f16152n0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f16152n0 = valueAnimator;
            valueAnimator.setInterpolator(this.f16146k0);
            this.f16152n0.setDuration(this.f16127A);
            this.f16152n0.addUpdateListener(new C0118w(2, this));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        f fVar = this.f16133c;
        if (fVar != null) {
            return fVar.f4201d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f16132b.size();
    }

    public int getTabGravity() {
        return this.f16166z;
    }

    public ColorStateList getTabIconTint() {
        return this.f16149m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f16141h0;
    }

    public int getTabIndicatorGravity() {
        return this.f16128B;
    }

    public int getTabMaxWidth() {
        return this.f16161u;
    }

    public int getTabMode() {
        return this.f16129C;
    }

    public ColorStateList getTabRippleColor() {
        return this.f16151n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f16153o;
    }

    public ColorStateList getTabTextColors() {
        return this.f16147l;
    }

    public final f h(int i9) {
        if (i9 >= 0 && i9 < getTabCount()) {
            return (f) this.f16132b.get(i9);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [J5.f, java.lang.Object] */
    public final f i() {
        J5.h hVar;
        f fVar = (f) f16126q0.a();
        f fVar2 = fVar;
        if (fVar == null) {
            ?? obj = new Object();
            obj.f4201d = -1;
            fVar2 = obj;
        }
        fVar2.f4203f = this;
        c cVar = this.f16156p0;
        if (cVar != null) {
            hVar = (J5.h) cVar.a();
        } else {
            hVar = null;
        }
        if (hVar == null) {
            hVar = new J5.h(this, getContext());
        }
        hVar.setTab(fVar2);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar2.f4200c)) {
            hVar.setContentDescription(fVar2.f4199b);
        } else {
            hVar.setContentDescription(fVar2.f4200c);
        }
        fVar2.f4204g = hVar;
        return fVar2;
    }

    public final void j() {
        e eVar = this.f16134d;
        int childCount = eVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            J5.h hVar = (J5.h) eVar.getChildAt(childCount);
            eVar.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.f16156p0.c(hVar);
            }
            requestLayout();
        }
        Iterator it = this.f16132b.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            it.remove();
            fVar.f4203f = null;
            fVar.f4204g = null;
            fVar.f4198a = null;
            fVar.f4199b = null;
            fVar.f4200c = null;
            fVar.f4201d = -1;
            fVar.f4202e = null;
            f16126q0.c(fVar);
        }
        this.f16133c = null;
    }

    public final void k(f fVar, boolean z9) {
        int i9;
        TabLayout tabLayout;
        f fVar2 = this.f16133c;
        ArrayList arrayList = this.f16150m0;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((b) arrayList.get(size)).getClass();
                }
                d(fVar.f4201d);
                return;
            }
            return;
        }
        if (fVar != null) {
            i9 = fVar.f4201d;
        } else {
            i9 = -1;
        }
        if (z9) {
            if ((fVar2 != null && fVar2.f4201d != -1) || i9 == -1) {
                tabLayout = this;
                d(i9);
            } else {
                tabLayout = this;
                tabLayout.l(i9, 0.0f, true, true, true);
            }
            if (i9 != -1) {
                setSelectedTabView(i9);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.f16133c = fVar;
        if (fVar2 != null && fVar2.f4203f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((b) arrayList.get(size2)).getClass();
            }
        }
        if (fVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((b) arrayList.get(size3)).a(fVar);
            }
        }
    }

    public final void l(int i9, float f9, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        float f10 = i9 + f9;
        int round = Math.round(f10);
        if (round >= 0) {
            e eVar = this.f16134d;
            if (round < eVar.getChildCount()) {
                if (z10) {
                    eVar.f4197b.f16131a = Math.round(f10);
                    ValueAnimator valueAnimator = eVar.f4196a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        eVar.f4196a.cancel();
                    }
                    eVar.c(eVar.getChildAt(i9), eVar.getChildAt(i9 + 1), f9);
                }
                ValueAnimator valueAnimator2 = this.f16152n0;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f16152n0.cancel();
                }
                int f11 = f(i9, f9);
                int scrollX = getScrollX();
                if ((i9 < getSelectedTabPosition() && f11 >= scrollX) || ((i9 > getSelectedTabPosition() && f11 <= scrollX) || i9 == getSelectedTabPosition())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                WeakHashMap weakHashMap = Q.f5546a;
                if (getLayoutDirection() == 1) {
                    if ((i9 < getSelectedTabPosition() && f11 <= scrollX) || ((i9 > getSelectedTabPosition() && f11 >= scrollX) || i9 == getSelectedTabPosition())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z12 || this.f16154o0 == 1 || z11) {
                    if (i9 < 0) {
                        f11 = 0;
                    }
                    scrollTo(f11, 0);
                }
                if (z9) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void m(boolean z9) {
        int i9 = 0;
        while (true) {
            e eVar = this.f16134d;
            if (i9 < eVar.getChildCount()) {
                View childAt = eVar.getChildAt(i9);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.f16129C == 1 && this.f16166z == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                if (z9) {
                    childAt.requestLayout();
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1002u1.c0(this);
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        J5.h hVar;
        Drawable drawable;
        int i9 = 0;
        while (true) {
            e eVar = this.f16134d;
            if (i9 < eVar.getChildCount()) {
                View childAt = eVar.getChildAt(i9);
                if ((childAt instanceof J5.h) && (drawable = (hVar = (J5.h) childAt).f4216i) != null) {
                    drawable.setBounds(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
                    hVar.f4216i.draw(canvas);
                }
                i9++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i.L(1, getTabCount(), 1).f22734a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int round = Math.round(p.e(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i10) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i9);
        if (View.MeasureSpec.getMode(i9) != 0) {
            int i11 = this.f16163w;
            if (i11 <= 0) {
                i11 = (int) (size - p.e(getContext(), 56));
            }
            this.f16161u = i11;
        }
        super.onMeasure(i9, i10);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.f16129C;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        AbstractC1002u1.a0(this, f9);
    }

    public void setInlineLabel(boolean z9) {
        if (this.f16130D != z9) {
            this.f16130D = z9;
            int i9 = 0;
            while (true) {
                e eVar = this.f16134d;
                if (i9 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i9);
                    if (childAt instanceof J5.h) {
                        J5.h hVar = (J5.h) childAt;
                        hVar.setOrientation(!hVar.f4217k.f16130D ? 1 : 0);
                        TextView textView = hVar.f4214g;
                        if (textView == null && hVar.f4215h == null) {
                            hVar.f(hVar.f4209b, hVar.f4210c, true);
                        } else {
                            hVar.f(textView, hVar.f4215h, false);
                        }
                    }
                    i9++;
                } else {
                    e();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i9) {
        setInlineLabel(getResources().getBoolean(i9));
    }

    @Deprecated
    public void setOnTabSelectedListener(J5.c cVar) {
        setOnTabSelectedListener((b) cVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.f16152n0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.f16153o = mutate;
        int i9 = this.f16155p;
        if (i9 != 0) {
            mutate.setTint(i9);
        } else {
            mutate.setTintList(null);
        }
        int i10 = this.f16139g0;
        if (i10 == -1) {
            i10 = this.f16153o.getIntrinsicHeight();
        }
        this.f16134d.b(i10);
    }

    public void setSelectedTabIndicatorColor(int i9) {
        this.f16155p = i9;
        Drawable drawable = this.f16153o;
        if (i9 != 0) {
            drawable.setTint(i9);
        } else {
            drawable.setTintList(null);
        }
        m(false);
    }

    public void setSelectedTabIndicatorGravity(int i9) {
        if (this.f16128B != i9) {
            this.f16128B = i9;
            WeakHashMap weakHashMap = Q.f5546a;
            this.f16134d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i9) {
        this.f16139g0 = i9;
        this.f16134d.b(i9);
    }

    public void setTabGravity(int i9) {
        if (this.f16166z != i9) {
            this.f16166z = i9;
            e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        boolean z9;
        if (this.f16149m != colorStateList) {
            this.f16149m = colorStateList;
            ArrayList arrayList = this.f16132b;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                J5.h hVar = ((f) arrayList.get(i9)).f4204g;
                if (hVar != null) {
                    hVar.e();
                    f fVar = hVar.f4208a;
                    if (fVar != null && fVar.a()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    hVar.setSelected(z9);
                }
            }
        }
    }

    public void setTabIconTintResource(int i9) {
        setTabIconTint(E.d.c(getContext(), i9));
    }

    public void setTabIndicatorAnimationMode(int i9) {
        this.f16141h0 = i9;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    this.f16144j0 = new J5.a(1);
                    return;
                }
                throw new IllegalArgumentException(i9 + " is not a valid TabIndicatorAnimationMode");
            }
            this.f16144j0 = new J5.a(0);
            return;
        }
        this.f16144j0 = new Q6.f(8);
    }

    public void setTabIndicatorFullWidth(boolean z9) {
        this.f16137f0 = z9;
        int i9 = e.f4195c;
        e eVar = this.f16134d;
        eVar.a(eVar.f4197b.getSelectedTabPosition());
        WeakHashMap weakHashMap = Q.f5546a;
        eVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i9) {
        if (i9 != this.f16129C) {
            this.f16129C = i9;
            e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f16151n != colorStateList) {
            this.f16151n = colorStateList;
            int i9 = 0;
            while (true) {
                e eVar = this.f16134d;
                if (i9 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i9);
                    if (childAt instanceof J5.h) {
                        Context context = getContext();
                        int i10 = J5.h.f4207l;
                        ((J5.h) childAt).d(context);
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i9) {
        setTabRippleColor(E.d.c(getContext(), i9));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        boolean z9;
        if (this.f16147l != colorStateList) {
            this.f16147l = colorStateList;
            ArrayList arrayList = this.f16132b;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                J5.h hVar = ((f) arrayList.get(i9)).f4204g;
                if (hVar != null) {
                    hVar.e();
                    f fVar = hVar.f4208a;
                    if (fVar != null && fVar.a()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    hVar.setSelected(z9);
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC0488a abstractC0488a) {
        j();
    }

    public void setUnboundedRipple(boolean z9) {
        if (this.f16143i0 != z9) {
            this.f16143i0 = z9;
            int i9 = 0;
            while (true) {
                e eVar = this.f16134d;
                if (i9 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i9);
                    if (childAt instanceof J5.h) {
                        Context context = getContext();
                        int i10 = J5.h.f4207l;
                        ((J5.h) childAt).d(context);
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i9) {
        setUnboundedRipple(getResources().getBoolean(i9));
    }

    public void setupWithViewPager(AbstractC0489b abstractC0489b) {
        j();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i9) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(b bVar) {
        b bVar2 = this.f16148l0;
        if (bVar2 != null) {
            this.f16150m0.remove(bVar2);
        }
        this.f16148l0 = bVar;
        if (bVar != null) {
            a(bVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public void setSelectedTabIndicator(int i9) {
        if (i9 != 0) {
            setSelectedTabIndicator(AbstractC0485a.q(getContext(), i9));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
