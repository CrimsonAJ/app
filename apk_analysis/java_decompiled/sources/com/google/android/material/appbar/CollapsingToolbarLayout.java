package com.google.android.material.appbar;

import F0.C0118w;
import P.F;
import P.H;
import P.Q;
import P.u0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import b7.C0701c;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;
import h5.AbstractC1281a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u5.C2081a;
import w5.AbstractC2144d;
import w5.C2143c;
import w5.p;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public u0 f15751A;

    /* renamed from: B, reason: collision with root package name */
    public int f15752B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f15753C;

    /* renamed from: D, reason: collision with root package name */
    public int f15754D;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15755a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15756b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f15757c;

    /* renamed from: d, reason: collision with root package name */
    public View f15758d;

    /* renamed from: e, reason: collision with root package name */
    public View f15759e;

    /* renamed from: f, reason: collision with root package name */
    public int f15760f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f15761f0;

    /* renamed from: g, reason: collision with root package name */
    public int f15762g;

    /* renamed from: h, reason: collision with root package name */
    public int f15763h;

    /* renamed from: i, reason: collision with root package name */
    public int f15764i;
    public final Rect j;

    /* renamed from: k, reason: collision with root package name */
    public final C2143c f15765k;

    /* renamed from: l, reason: collision with root package name */
    public final C2081a f15766l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15767m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15768n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f15769o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f15770p;

    /* renamed from: q, reason: collision with root package name */
    public int f15771q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15772r;

    /* renamed from: s, reason: collision with root package name */
    public ValueAnimator f15773s;

    /* renamed from: t, reason: collision with root package name */
    public long f15774t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f15775u;

    /* renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f15776v;

    /* renamed from: w, reason: collision with root package name */
    public int f15777w;

    /* renamed from: x, reason: collision with root package name */
    public h f15778x;

    /* renamed from: y, reason: collision with root package name */
    public int f15779y;

    /* renamed from: z, reason: collision with root package name */
    public int f15780z;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        int i9;
        ColorStateList p9;
        ColorStateList p10;
        TextUtils.TruncateAt truncateAt;
        this.f15755a = true;
        this.j = new Rect();
        this.f15777w = -1;
        this.f15752B = 0;
        this.f15754D = 0;
        Context context2 = getContext();
        C2143c c2143c = new C2143c(this);
        this.f15765k = c2143c;
        c2143c.f24237W = AbstractC1281a.f17929e;
        c2143c.i(false);
        c2143c.f24225J = false;
        this.f15766l = new C2081a(context2);
        int[] iArr = AbstractC1254a.f17747m;
        p.a(context2, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        p.b(context2, attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int i10 = obtainStyledAttributes.getInt(4, 8388691);
        if (c2143c.j != i10) {
            c2143c.j = i10;
            c2143c.i(false);
        }
        c2143c.l(obtainStyledAttributes.getInt(0, 8388627));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f15764i = dimensionPixelSize;
        this.f15763h = dimensionPixelSize;
        this.f15762g = dimensionPixelSize;
        this.f15760f = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(8)) {
            this.f15760f = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.f15763h = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (obtainStyledAttributes.hasValue(9)) {
            this.f15762g = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f15764i = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        this.f15767m = obtainStyledAttributes.getBoolean(20, true);
        setTitle(obtainStyledAttributes.getText(18));
        c2143c.n(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        c2143c.k(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (obtainStyledAttributes.hasValue(10)) {
            c2143c.n(obtainStyledAttributes.getResourceId(10, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            c2143c.k(obtainStyledAttributes.getResourceId(1, 0));
        }
        if (obtainStyledAttributes.hasValue(22)) {
            int i11 = obtainStyledAttributes.getInt(22, -1);
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 3) {
                        truncateAt = TextUtils.TruncateAt.END;
                    } else {
                        truncateAt = TextUtils.TruncateAt.MARQUEE;
                    }
                } else {
                    truncateAt = TextUtils.TruncateAt.MIDDLE;
                }
            } else {
                truncateAt = TextUtils.TruncateAt.START;
            }
            setTitleEllipsize(truncateAt);
        }
        if (obtainStyledAttributes.hasValue(11) && c2143c.f24265n != (p10 = D1.p(context2, obtainStyledAttributes, 11))) {
            c2143c.f24265n = p10;
            c2143c.i(false);
        }
        if (obtainStyledAttributes.hasValue(2) && c2143c.f24267o != (p9 = D1.p(context2, obtainStyledAttributes, 2))) {
            c2143c.f24267o = p9;
            c2143c.i(false);
        }
        this.f15777w = obtainStyledAttributes.getDimensionPixelSize(16, -1);
        if (obtainStyledAttributes.hasValue(14) && (i9 = obtainStyledAttributes.getInt(14, 1)) != c2143c.f24266n0) {
            c2143c.f24266n0 = i9;
            Bitmap bitmap = c2143c.K;
            if (bitmap != null) {
                bitmap.recycle();
                c2143c.K = null;
            }
            c2143c.i(false);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            c2143c.f24236V = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(21, 0));
            c2143c.i(false);
        }
        this.f15774t = obtainStyledAttributes.getInt(15, 600);
        this.f15775u = Z0.a.z(context2, R.attr.motionEasingStandardInterpolator, AbstractC1281a.f17927c);
        this.f15776v = Z0.a.z(context2, R.attr.motionEasingStandardInterpolator, AbstractC1281a.f17928d);
        setContentScrim(obtainStyledAttributes.getDrawable(3));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(17));
        setTitleCollapseMode(obtainStyledAttributes.getInt(19, 0));
        this.f15756b = obtainStyledAttributes.getResourceId(23, -1);
        this.f15753C = obtainStyledAttributes.getBoolean(13, false);
        this.f15761f0 = obtainStyledAttributes.getBoolean(12, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        C0701c c0701c = new C0701c(25, this);
        WeakHashMap weakHashMap = Q.f5546a;
        H.l(this, c0701c);
    }

    public static n b(View view) {
        n nVar = (n) view.getTag(R.id.view_offset_helper);
        if (nVar == null) {
            n nVar2 = new n(view);
            view.setTag(R.id.view_offset_helper, nVar2);
            return nVar2;
        }
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            r1 = 2130968906(0x7f04014a, float:1.7546479E38)
            android.util.TypedValue r1 = com.google.android.gms.internal.measurement.AbstractC1002u1.X(r0, r1)
            if (r1 != 0) goto Le
            goto L20
        Le:
            int r2 = r1.resourceId
            if (r2 == 0) goto L17
            android.content.res.ColorStateList r0 = E.d.c(r0, r2)
            goto L21
        L17:
            int r0 = r1.data
            if (r0 == 0) goto L20
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 == 0) goto L28
            int r0 = r0.getDefaultColor()
            return r0
        L28:
            android.content.res.Resources r0 = r3.getResources()
            r1 = 2131165314(0x7f070082, float:1.7944842E38)
            float r0 = r0.getDimension(r1)
            u5.a r1 = r3.f15766l
            int r2 = r1.f23705d
            int r0 = r1.a(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.getDefaultContentScrimColorForTitleCollapseFadeMode():int");
    }

    public final void a() {
        if (!this.f15755a) {
            return;
        }
        ViewGroup viewGroup = null;
        this.f15757c = null;
        this.f15758d = null;
        int i9 = this.f15756b;
        if (i9 != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i9);
            this.f15757c = viewGroup2;
            if (viewGroup2 != null) {
                ViewParent parent = viewGroup2.getParent();
                View view = viewGroup2;
                while (parent != this && parent != null) {
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    parent = parent.getParent();
                    view = view;
                }
                this.f15758d = view;
            }
        }
        if (this.f15757c == null) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
            }
            this.f15757c = viewGroup;
        }
        c();
        this.f15755a = false;
    }

    public final void c() {
        View view;
        if (!this.f15767m && (view = this.f15759e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f15759e);
            }
        }
        if (this.f15767m && this.f15757c != null) {
            if (this.f15759e == null) {
                this.f15759e = new View(getContext());
            }
            if (this.f15759e.getParent() == null) {
                this.f15757c.addView(this.f15759e, -1, -1);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    public final void d() {
        boolean z9;
        if (this.f15769o == null && this.f15770p == null) {
            return;
        }
        if (getHeight() + this.f15779y < getScrimVisibleHeightTrigger()) {
            z9 = true;
        } else {
            z9 = false;
        }
        setScrimsShown(z9);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i9;
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f15757c == null && (drawable = this.f15769o) != null && this.f15771q > 0) {
            drawable.mutate().setAlpha(this.f15771q);
            this.f15769o.draw(canvas);
        }
        if (this.f15767m && this.f15768n) {
            ViewGroup viewGroup = this.f15757c;
            C2143c c2143c = this.f15765k;
            if (viewGroup != null && this.f15769o != null && this.f15771q > 0 && this.f15780z == 1 && c2143c.f24242b < c2143c.f24248e) {
                int save = canvas.save();
                canvas.clipRect(this.f15769o.getBounds(), Region.Op.DIFFERENCE);
                c2143c.d(canvas);
                canvas.restoreToCount(save);
            } else {
                c2143c.d(canvas);
            }
        }
        if (this.f15770p != null && this.f15771q > 0) {
            u0 u0Var = this.f15751A;
            if (u0Var != null) {
                i9 = u0Var.d();
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                this.f15770p.setBounds(0, -this.f15779y, getWidth(), i9 - this.f15779y);
                this.f15770p.mutate().setAlpha(this.f15771q);
                this.f15770p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z9;
        View view2;
        Drawable drawable = this.f15769o;
        if (drawable != null && this.f15771q > 0 && ((view2 = this.f15758d) == null || view2 == this ? view == this.f15757c : view == view2)) {
            int width = getWidth();
            int height = getHeight();
            if (this.f15780z == 1 && view != null && this.f15767m) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.f15769o.mutate().setAlpha(this.f15771q);
            this.f15769o.draw(canvas);
            z9 = true;
        } else {
            z9 = false;
        }
        if (super.drawChild(canvas, view, j) || z9) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z9;
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f15770p;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z9 = drawable.setState(drawableState);
        } else {
            z9 = false;
        }
        Drawable drawable2 = this.f15769o;
        if (drawable2 != null && drawable2.isStateful()) {
            z9 |= drawable2.setState(drawableState);
        }
        C2143c c2143c = this.f15765k;
        if (c2143c != null) {
            c2143c.f24232R = drawableState;
            ColorStateList colorStateList2 = c2143c.f24267o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c2143c.f24265n) != null && colorStateList.isStateful())) {
                c2143c.i(false);
                z10 = true;
            }
            z9 |= z10;
        }
        if (z9) {
            invalidate();
        }
    }

    public final void e(boolean z9, int i9, int i10, int i11, int i12) {
        View view;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (this.f15767m && (view = this.f15759e) != null) {
            WeakHashMap weakHashMap = Q.f5546a;
            int i19 = 0;
            if (view.isAttachedToWindow() && this.f15759e.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15768n = z10;
            if (z10 || z9) {
                if (getLayoutDirection() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                View view2 = this.f15758d;
                if (view2 == null) {
                    view2 = this.f15757c;
                }
                int height = ((getHeight() - b(view2).f15817b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((g) view2.getLayoutParams())).bottomMargin;
                View view3 = this.f15759e;
                ThreadLocal threadLocal = AbstractC2144d.f24282a;
                int width = view3.getWidth();
                int height2 = view3.getHeight();
                Rect rect = this.j;
                rect.set(0, 0, width, height2);
                AbstractC2144d.b(this, view3, rect);
                ViewGroup viewGroup = this.f15757c;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i19 = toolbar.getTitleMarginStart();
                    i14 = toolbar.getTitleMarginEnd();
                    i15 = toolbar.getTitleMarginTop();
                    i13 = toolbar.getTitleMarginBottom();
                } else if (Build.VERSION.SDK_INT >= 24 && (viewGroup instanceof android.widget.Toolbar)) {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    i19 = toolbar2.getTitleMarginStart();
                    i14 = toolbar2.getTitleMarginEnd();
                    i15 = toolbar2.getTitleMarginTop();
                    i13 = toolbar2.getTitleMarginBottom();
                } else {
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                }
                int i20 = rect.left;
                if (z11) {
                    i16 = i14;
                } else {
                    i16 = i19;
                }
                int i21 = i20 + i16;
                int i22 = rect.top + height + i15;
                int i23 = rect.right;
                if (!z11) {
                    i19 = i14;
                }
                int i24 = i23 - i19;
                int i25 = (rect.bottom + height) - i13;
                C2143c c2143c = this.f15765k;
                Rect rect2 = c2143c.f24254h;
                if (rect2.left != i21 || rect2.top != i22 || rect2.right != i24 || rect2.bottom != i25) {
                    rect2.set(i21, i22, i24, i25);
                    c2143c.f24233S = true;
                }
                if (z11) {
                    i17 = this.f15763h;
                } else {
                    i17 = this.f15760f;
                }
                int i26 = rect.top + this.f15762g;
                int i27 = i11 - i9;
                if (z11) {
                    i18 = this.f15760f;
                } else {
                    i18 = this.f15763h;
                }
                int i28 = i27 - i18;
                int i29 = (i12 - i10) - this.f15764i;
                Rect rect3 = c2143c.f24252g;
                if (rect3.left != i17 || rect3.top != i26 || rect3.right != i28 || rect3.bottom != i29) {
                    rect3.set(i17, i26, i28, i29);
                    c2143c.f24233S = true;
                }
                c2143c.i(z9);
            }
        }
    }

    public final void f() {
        CharSequence charSequence;
        if (this.f15757c != null && this.f15767m && TextUtils.isEmpty(this.f15765k.f24222G)) {
            ViewGroup viewGroup = this.f15757c;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).getTitle();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, com.google.android.material.appbar.g, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.f15806a = 0;
        layoutParams.f15807b = 0.5f;
        return layoutParams;
    }

    public int getCollapsedTitleGravity() {
        return this.f15765k.f24259k;
    }

    public float getCollapsedTitleTextSize() {
        return this.f15765k.f24263m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f15765k.f24278w;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f15769o;
    }

    public int getExpandedTitleGravity() {
        return this.f15765k.j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f15764i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f15763h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f15760f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f15762g;
    }

    public float getExpandedTitleTextSize() {
        return this.f15765k.f24261l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f15765k.f24281z;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.f15765k.f24272q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f15765k.f24257i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f15765k.f24257i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f15765k.f24257i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f15765k.f24266n0;
    }

    public int getScrimAlpha() {
        return this.f15771q;
    }

    public long getScrimAnimationDuration() {
        return this.f15774t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i9;
        int i10 = this.f15777w;
        if (i10 >= 0) {
            return i10 + this.f15752B + this.f15754D;
        }
        u0 u0Var = this.f15751A;
        if (u0Var != null) {
            i9 = u0Var.d();
        } else {
            i9 = 0;
        }
        WeakHashMap weakHashMap = Q.f5546a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight > 0) {
            return Math.min((minimumHeight * 2) + i9, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f15770p;
    }

    public CharSequence getTitle() {
        if (this.f15767m) {
            return this.f15765k.f24222G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f15780z;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f15765k.f24236V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f15765k.f24221F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f15780z == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = Q.f5546a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.f15778x == null) {
                this.f15778x = new h(this);
            }
            h hVar = this.f15778x;
            if (appBarLayout.f15729h == null) {
                appBarLayout.f15729h = new ArrayList();
            }
            if (hVar != null && !appBarLayout.f15729h.contains(hVar)) {
                appBarLayout.f15729h.add(hVar);
            }
            F.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15765k.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        h hVar = this.f15778x;
        if (hVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f15729h) != null) {
            arrayList.remove(hVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        u0 u0Var = this.f15751A;
        if (u0Var != null) {
            int d9 = u0Var.d();
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                WeakHashMap weakHashMap = Q.f5546a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < d9) {
                    childAt.offsetTopAndBottom(d9);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            n b9 = b(getChildAt(i14));
            View view = b9.f15816a;
            b9.f15817b = view.getTop();
            b9.f15818c = view.getLeft();
        }
        e(false, i9, i10, i11, i12);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i15 = 0; i15 < childCount3; i15++) {
            b(getChildAt(i15)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            r9.a()
            super.onMeasure(r10, r11)
            int r11 = android.view.View.MeasureSpec.getMode(r11)
            P.u0 r0 = r9.f15751A
            if (r0 == 0) goto L13
            int r0 = r0.d()
            goto L14
        L13:
            r0 = 0
        L14:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == 0) goto L1c
            boolean r11 = r9.f15753C
            if (r11 == 0) goto L2c
        L1c:
            if (r0 <= 0) goto L2c
            r9.f15752B = r0
            int r11 = r9.getMeasuredHeight()
            int r11 = r11 + r0
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r1)
            super.onMeasure(r10, r11)
        L2c:
            boolean r11 = r9.f15761f0
            if (r11 == 0) goto L7f
            w5.c r11 = r9.f15765k
            int r0 = r11.f24266n0
            r2 = 1
            if (r0 <= r2) goto L7f
            r9.f()
            int r7 = r9.getMeasuredWidth()
            int r8 = r9.getMeasuredHeight()
            r5 = 0
            r6 = 0
            r4 = 1
            r3 = r9
            r3.e(r4, r5, r6, r7, r8)
            int r0 = r11.f24269p
            if (r0 <= r2) goto L80
            android.text.TextPaint r4 = r11.f24235U
            float r5 = r11.f24261l
            r4.setTextSize(r5)
            android.graphics.Typeface r5 = r11.f24281z
            r4.setTypeface(r5)
            float r11 = r11.f24253g0
            r4.setLetterSpacing(r11)
            float r11 = r4.ascent()
            float r11 = -r11
            float r4 = r4.descent()
            float r4 = r4 + r11
            int r11 = java.lang.Math.round(r4)
            int r0 = r0 - r2
            int r0 = r0 * r11
            r3.f15754D = r0
            int r11 = r9.getMeasuredHeight()
            int r0 = r3.f15754D
            int r11 = r11 + r0
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r1)
            super.onMeasure(r10, r11)
            goto L80
        L7f:
            r3 = r9
        L80:
            android.view.ViewGroup r10 = r3.f15757c
            if (r10 == 0) goto Lc4
            android.view.View r11 = r3.f15758d
            if (r11 == 0) goto La8
            if (r11 != r3) goto L8b
            goto La8
        L8b:
            android.view.ViewGroup$LayoutParams r10 = r11.getLayoutParams()
            boolean r0 = r10 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto La0
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            int r11 = r11.getMeasuredHeight()
            int r0 = r10.topMargin
            int r11 = r11 + r0
            int r10 = r10.bottomMargin
            int r11 = r11 + r10
            goto La4
        La0:
            int r11 = r11.getMeasuredHeight()
        La4:
            r9.setMinimumHeight(r11)
            return
        La8:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            boolean r0 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lbd
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r10 = r10.getMeasuredHeight()
            int r0 = r11.topMargin
            int r10 = r10 + r0
            int r11 = r11.bottomMargin
            int r10 = r10 + r11
            goto Lc1
        Lbd:
            int r10 = r10.getMeasuredHeight()
        Lc1:
            r9.setMinimumHeight(r10)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        Drawable drawable = this.f15769o;
        if (drawable != null) {
            ViewGroup viewGroup = this.f15757c;
            if (this.f15780z == 1 && viewGroup != null && this.f15767m) {
                i10 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i9, i10);
        }
    }

    public void setCollapsedTitleGravity(int i9) {
        this.f15765k.l(i9);
    }

    public void setCollapsedTitleTextAppearance(int i9) {
        this.f15765k.k(i9);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        C2143c c2143c = this.f15765k;
        if (c2143c.f24267o != colorStateList) {
            c2143c.f24267o = colorStateList;
            c2143c.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f9) {
        C2143c c2143c = this.f15765k;
        if (c2143c.f24263m != f9) {
            c2143c.f24263m = f9;
            c2143c.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C2143c c2143c = this.f15765k;
        if (c2143c.m(typeface)) {
            c2143c.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f15769o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f15769o = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f15757c;
                if (this.f15780z == 1 && viewGroup != null && this.f15767m) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.f15769o.setCallback(this);
                this.f15769o.setAlpha(this.f15771q);
            }
            WeakHashMap weakHashMap = Q.f5546a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i9) {
        setContentScrim(new ColorDrawable(i9));
    }

    public void setContentScrimResource(int i9) {
        setContentScrim(getContext().getDrawable(i9));
    }

    public void setExpandedTitleColor(int i9) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i9));
    }

    public void setExpandedTitleGravity(int i9) {
        C2143c c2143c = this.f15765k;
        if (c2143c.j != i9) {
            c2143c.j = i9;
            c2143c.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i9) {
        this.f15764i = i9;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i9) {
        this.f15763h = i9;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i9) {
        this.f15760f = i9;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i9) {
        this.f15762g = i9;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i9) {
        this.f15765k.n(i9);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C2143c c2143c = this.f15765k;
        if (c2143c.f24265n != colorStateList) {
            c2143c.f24265n = colorStateList;
            c2143c.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f9) {
        C2143c c2143c = this.f15765k;
        if (c2143c.f24261l != f9) {
            c2143c.f24261l = f9;
            c2143c.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C2143c c2143c = this.f15765k;
        if (c2143c.o(typeface)) {
            c2143c.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z9) {
        this.f15761f0 = z9;
    }

    public void setForceApplySystemWindowInsetTop(boolean z9) {
        this.f15753C = z9;
    }

    public void setHyphenationFrequency(int i9) {
        this.f15765k.f24272q0 = i9;
    }

    public void setLineSpacingAdd(float f9) {
        this.f15765k.f24268o0 = f9;
    }

    public void setLineSpacingMultiplier(float f9) {
        this.f15765k.f24270p0 = f9;
    }

    public void setMaxLines(int i9) {
        C2143c c2143c = this.f15765k;
        if (i9 != c2143c.f24266n0) {
            c2143c.f24266n0 = i9;
            Bitmap bitmap = c2143c.K;
            if (bitmap != null) {
                bitmap.recycle();
                c2143c.K = null;
            }
            c2143c.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z9) {
        this.f15765k.f24225J = z9;
    }

    public void setScrimAlpha(int i9) {
        ViewGroup viewGroup;
        if (i9 != this.f15771q) {
            if (this.f15769o != null && (viewGroup = this.f15757c) != null) {
                WeakHashMap weakHashMap = Q.f5546a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.f15771q = i9;
            WeakHashMap weakHashMap2 = Q.f5546a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f15774t = j;
    }

    public void setScrimVisibleHeightTrigger(int i9) {
        if (this.f15777w != i9) {
            this.f15777w = i9;
            d();
        }
    }

    public void setScrimsShown(boolean z9) {
        boolean z10;
        TimeInterpolator timeInterpolator;
        WeakHashMap weakHashMap = Q.f5546a;
        int i9 = 0;
        if (isLaidOut() && !isInEditMode()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f15772r != z9) {
            if (z10) {
                if (z9) {
                    i9 = 255;
                }
                a();
                ValueAnimator valueAnimator = this.f15773s;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f15773s = valueAnimator2;
                    if (i9 > this.f15771q) {
                        timeInterpolator = this.f15775u;
                    } else {
                        timeInterpolator = this.f15776v;
                    }
                    valueAnimator2.setInterpolator(timeInterpolator);
                    this.f15773s.addUpdateListener(new C0118w(5, this));
                } else if (valueAnimator.isRunning()) {
                    this.f15773s.cancel();
                }
                this.f15773s.setDuration(this.f15774t);
                this.f15773s.setIntValues(this.f15771q, i9);
                this.f15773s.start();
            } else {
                if (z9) {
                    i9 = 255;
                }
                setScrimAlpha(i9);
            }
            this.f15772r = z9;
        }
    }

    public void setStaticLayoutBuilderConfigurer(i iVar) {
        C2143c c2143c = this.f15765k;
        if (iVar != null) {
            c2143c.i(true);
        } else {
            c2143c.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z9;
        Drawable drawable2 = this.f15770p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f15770p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f15770p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f15770p;
                WeakHashMap weakHashMap = Q.f5546a;
                drawable4.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.f15770p;
                if (getVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                drawable5.setVisible(z9, false);
                this.f15770p.setCallback(this);
                this.f15770p.setAlpha(this.f15771q);
            }
            WeakHashMap weakHashMap2 = Q.f5546a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i9) {
        setStatusBarScrim(new ColorDrawable(i9));
    }

    public void setStatusBarScrimResource(int i9) {
        setStatusBarScrim(getContext().getDrawable(i9));
    }

    public void setTitle(CharSequence charSequence) {
        C2143c c2143c = this.f15765k;
        if (charSequence == null || !TextUtils.equals(c2143c.f24222G, charSequence)) {
            c2143c.f24222G = charSequence;
            c2143c.f24223H = null;
            Bitmap bitmap = c2143c.K;
            if (bitmap != null) {
                bitmap.recycle();
                c2143c.K = null;
            }
            c2143c.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i9) {
        boolean z9;
        this.f15780z = i9;
        if (i9 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f15765k.f24244c = z9;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f15780z == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z9 && this.f15769o == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        C2143c c2143c = this.f15765k;
        c2143c.f24221F = truncateAt;
        c2143c.i(false);
    }

    public void setTitleEnabled(boolean z9) {
        if (z9 != this.f15767m) {
            this.f15767m = z9;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        C2143c c2143c = this.f15765k;
        c2143c.f24236V = timeInterpolator;
        c2143c.i(false);
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
        Drawable drawable = this.f15770p;
        if (drawable != null && drawable.isVisible() != z9) {
            this.f15770p.setVisible(z9, false);
        }
        Drawable drawable2 = this.f15769o;
        if (drawable2 != null && drawable2.isVisible() != z9) {
            this.f15769o.setVisible(z9, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f15769o && drawable != this.f15770p) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.appbar.g, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new FrameLayout.LayoutParams(context, attributeSet);
        layoutParams.f15806a = 0;
        layoutParams.f15807b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.f17748n);
        layoutParams.f15806a = obtainStyledAttributes.getInt(0, 0);
        layoutParams.f15807b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setCollapsedTitleTextColor(int i9) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.appbar.g, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.f15806a = 0;
        layoutParams.f15807b = 0.5f;
        return layoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, com.google.android.material.appbar.g, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.f15806a = 0;
        layoutParams2.f15807b = 0.5f;
        return layoutParams2;
    }
}
