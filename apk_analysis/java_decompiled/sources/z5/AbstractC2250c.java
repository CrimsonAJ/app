package z5;

import D4.s;
import P.Q;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b7.C0701c;
import com.google.android.gms.internal.measurement.D1;
import d0.o;
import h5.AbstractC1281a;
import i5.C1380a;
import java.util.WeakHashMap;
import l5.C1568a;
import o.n;
import o.y;
import o1.C1671f;

/* renamed from: z5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2250c extends FrameLayout implements y {

    /* renamed from: h0, reason: collision with root package name */
    public static final int[] f25421h0 = {R.attr.state_checked};

    /* renamed from: i0, reason: collision with root package name */
    public static final o f25422i0 = new o(18);

    /* renamed from: j0, reason: collision with root package name */
    public static final C2249b f25423j0 = new o(18);

    /* renamed from: A, reason: collision with root package name */
    public boolean f25424A;

    /* renamed from: B, reason: collision with root package name */
    public int f25425B;

    /* renamed from: C, reason: collision with root package name */
    public int f25426C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f25427D;

    /* renamed from: a, reason: collision with root package name */
    public boolean f25428a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f25429b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f25430c;

    /* renamed from: d, reason: collision with root package name */
    public int f25431d;

    /* renamed from: e, reason: collision with root package name */
    public int f25432e;

    /* renamed from: f, reason: collision with root package name */
    public int f25433f;

    /* renamed from: f0, reason: collision with root package name */
    public int f25434f0;

    /* renamed from: g, reason: collision with root package name */
    public float f25435g;

    /* renamed from: g0, reason: collision with root package name */
    public C1380a f25436g0;

    /* renamed from: h, reason: collision with root package name */
    public float f25437h;

    /* renamed from: i, reason: collision with root package name */
    public float f25438i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25439k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f25440l;

    /* renamed from: m, reason: collision with root package name */
    public final View f25441m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f25442n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewGroup f25443o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f25444p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f25445q;

    /* renamed from: r, reason: collision with root package name */
    public int f25446r;

    /* renamed from: s, reason: collision with root package name */
    public int f25447s;

    /* renamed from: t, reason: collision with root package name */
    public n f25448t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f25449u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f25450v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f25451w;

    /* renamed from: x, reason: collision with root package name */
    public ValueAnimator f25452x;

    /* renamed from: y, reason: collision with root package name */
    public o f25453y;

    /* renamed from: z, reason: collision with root package name */
    public float f25454z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2250c(Context context) {
        super(context);
        int i9 = 2;
        this.f25428a = false;
        this.f25446r = -1;
        this.f25447s = 0;
        this.f25453y = f25422i0;
        this.f25454z = 0.0f;
        this.f25424A = false;
        this.f25425B = 0;
        this.f25426C = 0;
        this.f25427D = false;
        this.f25434f0 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f25440l = (FrameLayout) findViewById(co.notix.R.id.navigation_bar_item_icon_container);
        this.f25441m = findViewById(co.notix.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(co.notix.R.id.navigation_bar_item_icon_view);
        this.f25442n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(co.notix.R.id.navigation_bar_item_labels_group);
        this.f25443o = viewGroup;
        TextView textView = (TextView) findViewById(co.notix.R.id.navigation_bar_item_small_label_view);
        this.f25444p = textView;
        TextView textView2 = (TextView) findViewById(co.notix.R.id.navigation_bar_item_large_label_view);
        this.f25445q = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f25431d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f25432e = viewGroup.getPaddingBottom();
        this.f25433f = getResources().getDimensionPixelSize(co.notix.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = Q.f5546a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        b(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new N5.a(i9, (C1568a) this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lb
            goto L1f
        Lb:
            int[] r2 = g5.AbstractC1254a.f17731Q
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
        L1f:
            r5 = r1
            goto L4c
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.AbstractC2250c.f(android.widget.TextView, int):void");
    }

    public static void g(View view, float f9, float f10, int i9) {
        view.setScaleX(f9);
        view.setScaleY(f10);
        view.setVisibility(i9);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f25440l;
        if (frameLayout != null) {
            return frameLayout;
        }
        return this.f25442n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i9 = 0;
        for (int i10 = 0; i10 < indexOfChild; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof AbstractC2250c) && childAt.getVisibility() == 0) {
                i9++;
            }
        }
        return i9;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        C1380a c1380a = this.f25436g0;
        if (c1380a == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = c1380a.getMinimumWidth() - this.f25436g0.f18659e.f18698b.f18693w.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f25442n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i9, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i9;
        layoutParams.bottomMargin = i9;
        layoutParams.gravity = i10;
        view.setLayoutParams(layoutParams);
    }

    public static void j(View view, int i9) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i9);
    }

    @Override // o.y
    public final void a(n nVar) {
        CharSequence charSequence;
        int i9;
        this.f25448t = nVar;
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setIcon(nVar.getIcon());
        setTitle(nVar.f21408e);
        setId(nVar.f21404a);
        if (!TextUtils.isEmpty(nVar.f21419q)) {
            setContentDescription(nVar.f21419q);
        }
        if (!TextUtils.isEmpty(nVar.f21420r)) {
            charSequence = nVar.f21420r;
        } else {
            charSequence = nVar.f21408e;
        }
        if (Build.VERSION.SDK_INT > 23) {
            D1.J(this, charSequence);
        }
        if (nVar.isVisible()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        setVisibility(i9);
        this.f25428a = true;
    }

    public final void b(float f9, float f10) {
        this.f25435g = f9 - f10;
        this.f25437h = (f10 * 1.0f) / f9;
        this.f25438i = (f9 * 1.0f) / f10;
    }

    public final void c() {
        n nVar = this.f25448t;
        if (nVar != null) {
            setChecked(nVar.isChecked());
        }
    }

    public final void d() {
        Drawable drawable = this.f25430c;
        ColorStateList colorStateList = this.f25429b;
        FrameLayout frameLayout = this.f25440l;
        RippleDrawable rippleDrawable = null;
        boolean z9 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f25424A && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(D5.a.c(this.f25429b), null, activeIndicatorDrawable);
                z9 = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(D5.a.a(this.f25429b), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable);
        }
        WeakHashMap weakHashMap = Q.f5546a;
        setBackground(drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f25440l;
        if (frameLayout != null && this.f25424A) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f9, float f10) {
        float f11;
        float f12;
        View view = this.f25441m;
        if (view != null) {
            o oVar = this.f25453y;
            oVar.getClass();
            view.setScaleX(AbstractC1281a.a(0.4f, 1.0f, f9));
            view.setScaleY(oVar.d(f9, f10));
            if (f10 == 0.0f) {
                f11 = 0.8f;
            } else {
                f11 = 0.0f;
            }
            if (f10 == 0.0f) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            view.setAlpha(AbstractC1281a.b(0.0f, 1.0f, f11, f12, f9));
        }
        this.f25454z = f9;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f25441m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C1380a getBadge() {
        return this.f25436g0;
    }

    public int getItemBackgroundResId() {
        return co.notix.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // o.y
    public n getItemData() {
        return this.f25448t;
    }

    public int getItemDefaultMarginResId() {
        return co.notix.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f25446r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        int i9;
        ViewGroup viewGroup = this.f25443o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        int suggestedIconHeight = getSuggestedIconHeight();
        if (viewGroup.getVisibility() == 0) {
            i9 = this.f25433f;
        } else {
            i9 = 0;
        }
        return viewGroup.getMeasuredHeight() + suggestedIconHeight + i9 + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f25443o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(int i9) {
        int i10;
        View view = this.f25441m;
        if (view != null && i9 > 0) {
            int min = Math.min(this.f25425B, i9 - (this.f25434f0 * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f25427D && this.j == 2) {
                i10 = min;
            } else {
                i10 = this.f25426C;
            }
            layoutParams.height = i10;
            layoutParams.width = min;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 1);
        n nVar = this.f25448t;
        if (nVar != null && nVar.isCheckable() && this.f25448t.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f25421h0);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1380a c1380a = this.f25436g0;
        if (c1380a != null && c1380a.isVisible()) {
            n nVar = this.f25448t;
            CharSequence charSequence = nVar.f21408e;
            if (!TextUtils.isEmpty(nVar.f21419q)) {
                charSequence = this.f25448t.f21419q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f25436g0.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0701c.I(isSelected(), 0, 1, getItemVisiblePosition(), 1).f11404b);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) Q.e.f6020e.f6030a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(co.notix.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        post(new s(i9, 8, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f25441m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z9) {
        int i9;
        this.f25424A = z9;
        d();
        View view = this.f25441m;
        if (view != null) {
            if (z9) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            view.setVisibility(i9);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i9) {
        this.f25426C = i9;
        i(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i9) {
        if (this.f25433f != i9) {
            this.f25433f = i9;
            c();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i9) {
        this.f25434f0 = i9;
        i(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z9) {
        this.f25427D = z9;
    }

    public void setActiveIndicatorWidth(int i9) {
        this.f25425B = i9;
        i(getWidth());
    }

    public void setBadge(C1380a c1380a) {
        boolean z9;
        C1380a c1380a2 = this.f25436g0;
        if (c1380a2 != c1380a) {
            if (c1380a2 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ImageView imageView = this.f25442n;
            if (z9 && imageView != null) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                if (this.f25436g0 != null) {
                    setClipChildren(true);
                    setClipToPadding(true);
                    C1380a c1380a3 = this.f25436g0;
                    if (c1380a3 != null) {
                        if (c1380a3.d() != null) {
                            c1380a3.d().setForeground(null);
                        } else {
                            imageView.getOverlay().remove(c1380a3);
                        }
                    }
                    this.f25436g0 = null;
                }
            }
            this.f25436g0 = c1380a;
            if (imageView != null && c1380a != null) {
                setClipChildren(false);
                setClipToPadding(false);
                C1380a c1380a4 = this.f25436g0;
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                c1380a4.setBounds(rect);
                c1380a4.i(imageView, null);
                if (c1380a4.d() != null) {
                    c1380a4.d().setForeground(c1380a4);
                } else {
                    imageView.getOverlay().add(c1380a4);
                }
            }
        }
    }

    public void setCheckable(boolean z9) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.AbstractC2250c.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        C1671f c1671f;
        super.setEnabled(z9);
        this.f25444p.setEnabled(z9);
        this.f25445q.setEnabled(z9);
        this.f25442n.setEnabled(z9);
        Object obj = null;
        if (z9) {
            Context context = getContext();
            if (Build.VERSION.SDK_INT >= 24) {
                c1671f = new C1671f(14, L.d.e(context));
            } else {
                c1671f = new C1671f(14, obj);
            }
            Q.o(this, c1671f);
            return;
        }
        Q.o(this, null);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f25450v) {
            return;
        }
        this.f25450v = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f25451w = drawable;
            ColorStateList colorStateList = this.f25449u;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f25442n.setImageDrawable(drawable);
    }

    public void setIconSize(int i9) {
        ImageView imageView = this.f25442n;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i9;
        layoutParams.height = i9;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f25449u = colorStateList;
        if (this.f25448t != null && (drawable = this.f25451w) != null) {
            drawable.setTintList(colorStateList);
            this.f25451w.invalidateSelf();
        }
    }

    public void setItemBackground(int i9) {
        setItemBackground(i9 == 0 ? null : getContext().getDrawable(i9));
    }

    public void setItemPaddingBottom(int i9) {
        if (this.f25432e != i9) {
            this.f25432e = i9;
            c();
        }
    }

    public void setItemPaddingTop(int i9) {
        if (this.f25431d != i9) {
            this.f25431d = i9;
            c();
        }
    }

    public void setItemPosition(int i9) {
        this.f25446r = i9;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f25429b = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i9) {
        if (this.j != i9) {
            this.j = i9;
            if (this.f25427D && i9 == 2) {
                this.f25453y = f25423j0;
            } else {
                this.f25453y = f25422i0;
            }
            i(getWidth());
            c();
        }
    }

    public void setShifting(boolean z9) {
        if (this.f25439k != z9) {
            this.f25439k = z9;
            c();
        }
    }

    public void setTextAppearanceActive(int i9) {
        this.f25447s = i9;
        TextView textView = this.f25445q;
        f(textView, i9);
        b(this.f25444p.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z9) {
        setTextAppearanceActive(this.f25447s);
        TextView textView = this.f25445q;
        textView.setTypeface(textView.getTypeface(), z9 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i9) {
        TextView textView = this.f25444p;
        f(textView, i9);
        b(textView.getTextSize(), this.f25445q.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f25444p.setTextColor(colorStateList);
            this.f25445q.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f25444p.setText(charSequence);
        this.f25445q.setText(charSequence);
        n nVar = this.f25448t;
        if (nVar == null || TextUtils.isEmpty(nVar.f21419q)) {
            setContentDescription(charSequence);
        }
        n nVar2 = this.f25448t;
        if (nVar2 != null && !TextUtils.isEmpty(nVar2.f21420r)) {
            charSequence = this.f25448t.f21420r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            D1.J(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f25430c = drawable;
        d();
    }
}
