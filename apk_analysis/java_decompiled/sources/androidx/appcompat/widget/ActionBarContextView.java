package androidx.appcompat.widget;

import P.Q;
import P.X;
import Q2.U;
import a.AbstractC0485a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.notix.R;
import h.AbstractC1260a;
import n.AbstractC1595a;
import o.l;
import o.z;
import p.C1783a;
import p.C1795g;
import p.C1805l;
import p.g1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C1783a f9373a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9374b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f9375c;

    /* renamed from: d, reason: collision with root package name */
    public C1805l f9376d;

    /* renamed from: e, reason: collision with root package name */
    public int f9377e;

    /* renamed from: f, reason: collision with root package name */
    public X f9378f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9379g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9380h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f9381i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public View f9382k;

    /* renamed from: l, reason: collision with root package name */
    public View f9383l;

    /* renamed from: m, reason: collision with root package name */
    public View f9384m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f9385n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f9386o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f9387p;

    /* renamed from: q, reason: collision with root package name */
    public final int f9388q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9389r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9390s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9391t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        this.f9373a = new C1783a(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f9374b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f9374b = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1260a.f17808d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = AbstractC0485a.q(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.f9388q = obtainStyledAttributes.getResourceId(5, 0);
        this.f9389r = obtainStyledAttributes.getResourceId(4, 0);
        this.f9377e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f9391t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i9, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE), i10);
        return Math.max(0, i9 - view.getMeasuredWidth());
    }

    public static int g(View view, int i9, int i10, int i11, boolean z9) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z9) {
            view.layout(i9 - measuredWidth, i12, i9, measuredHeight + i12);
        } else {
            view.layout(i9, i12, i9 + measuredWidth, measuredHeight + i12);
        }
        if (z9) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(AbstractC1595a abstractC1595a) {
        View view = this.f9382k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f9391t, (ViewGroup) this, false);
            this.f9382k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f9382k);
        }
        View findViewById = this.f9382k.findViewById(R.id.action_mode_close_button);
        this.f9383l = findViewById;
        findViewById.setOnClickListener(new U(4, abstractC1595a));
        l c3 = abstractC1595a.c();
        C1805l c1805l = this.f9376d;
        if (c1805l != null) {
            c1805l.d();
            C1795g c1795g = c1805l.f22026u;
            if (c1795g != null && c1795g.b()) {
                c1795g.f21449i.dismiss();
            }
        }
        C1805l c1805l2 = new C1805l(getContext());
        this.f9376d = c1805l2;
        c1805l2.f22018m = true;
        c1805l2.f22019n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c3.b(this.f9376d, this.f9374b);
        C1805l c1805l3 = this.f9376d;
        z zVar = c1805l3.f22014h;
        if (zVar == null) {
            z zVar2 = (z) c1805l3.f22010d.inflate(c1805l3.f22012f, (ViewGroup) this, false);
            c1805l3.f22014h = zVar2;
            zVar2.b(c1805l3.f22009c);
            c1805l3.f(true);
        }
        z zVar3 = c1805l3.f22014h;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(c1805l3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f9375c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f9375c, layoutParams);
    }

    public final void d() {
        int i9;
        if (this.f9385n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f9385n = linearLayout;
            this.f9386o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f9387p = (TextView) this.f9385n.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f9388q;
            if (i10 != 0) {
                this.f9386o.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f9389r;
            if (i11 != 0) {
                this.f9387p.setTextAppearance(getContext(), i11);
            }
        }
        this.f9386o.setText(this.f9381i);
        this.f9387p.setText(this.j);
        boolean isEmpty = TextUtils.isEmpty(this.f9381i);
        boolean isEmpty2 = TextUtils.isEmpty(this.j);
        TextView textView = this.f9387p;
        int i12 = 8;
        if (!isEmpty2) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        textView.setVisibility(i9);
        LinearLayout linearLayout2 = this.f9385n;
        if (!isEmpty || !isEmpty2) {
            i12 = 0;
        }
        linearLayout2.setVisibility(i12);
        if (this.f9385n.getParent() == null) {
            addView(this.f9385n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f9384m = null;
        this.f9375c = null;
        this.f9376d = null;
        View view = this.f9383l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f9378f != null) {
            return this.f9373a.f21943b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f9377e;
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.f9381i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i9) {
        if (i9 != getVisibility()) {
            X x5 = this.f9378f;
            if (x5 != null) {
                x5.b();
            }
            super.setVisibility(i9);
        }
    }

    public final X i(long j, int i9) {
        X x5 = this.f9378f;
        if (x5 != null) {
            x5.b();
        }
        C1783a c1783a = this.f9373a;
        if (i9 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            X a5 = Q.a(this);
            a5.a(1.0f);
            a5.c(j);
            c1783a.f21944c.f9378f = a5;
            c1783a.f21943b = i9;
            a5.d(c1783a);
            return a5;
        }
        X a9 = Q.a(this);
        a9.a(0.0f);
        a9.c(j);
        c1783a.f21944c.f9378f = a9;
        c1783a.f21943b = i9;
        a9.d(c1783a);
        return a9;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i9;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1260a.f17805a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C1805l c1805l = this.f9376d;
        if (c1805l != null) {
            Configuration configuration2 = c1805l.f22008b.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
                if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                    if (i10 >= 360) {
                        i9 = 3;
                    } else {
                        i9 = 2;
                    }
                } else {
                    i9 = 4;
                }
            } else {
                i9 = 5;
            }
            c1805l.f22022q = i9;
            l lVar = c1805l.f22009c;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1805l c1805l = this.f9376d;
        if (c1805l != null) {
            c1805l.d();
            C1795g c1795g = this.f9376d.f22026u;
            if (c1795g != null && c1795g.b()) {
                c1795g.f21449i.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9380h = false;
        }
        if (!this.f9380h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f9380h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f9380h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        boolean z10;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11 = g1.f21992a;
        if (getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            paddingLeft = (i11 - i9) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.f9382k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9382k.getLayoutParams();
            if (z10) {
                i13 = marginLayoutParams.rightMargin;
            } else {
                i13 = marginLayoutParams.leftMargin;
            }
            if (z10) {
                i14 = marginLayoutParams.leftMargin;
            } else {
                i14 = marginLayoutParams.rightMargin;
            }
            if (z10) {
                i15 = paddingLeft - i13;
            } else {
                i15 = paddingLeft + i13;
            }
            int g9 = g(this.f9382k, i15, paddingTop, paddingTop2, z10) + i15;
            if (z10) {
                i16 = g9 - i14;
            } else {
                i16 = g9 + i14;
            }
            paddingLeft = i16;
        }
        LinearLayout linearLayout = this.f9385n;
        if (linearLayout != null && this.f9384m == null && linearLayout.getVisibility() != 8) {
            paddingLeft += g(this.f9385n, paddingLeft, paddingTop, paddingTop2, z10);
        }
        View view2 = this.f9384m;
        if (view2 != null) {
            g(view2, paddingLeft, paddingTop, paddingTop2, z10);
        }
        if (z10) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i11 - i9) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f9375c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingRight, paddingTop, paddingTop2, !z10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        boolean z9;
        int i12;
        int i13 = 1073741824;
        if (View.MeasureSpec.getMode(i9) == 1073741824) {
            if (View.MeasureSpec.getMode(i10) != 0) {
                int size = View.MeasureSpec.getSize(i9);
                int i14 = this.f9377e;
                if (i14 <= 0) {
                    i14 = View.MeasureSpec.getSize(i10);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i15 = i14 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
                View view = this.f9382k;
                if (view != null) {
                    int f9 = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9382k.getLayoutParams();
                    paddingLeft = f9 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f9375c;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.f9375c, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.f9385n;
                if (linearLayout != null && this.f9384m == null) {
                    if (this.f9390s) {
                        this.f9385n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f9385n.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f9385n;
                        if (z9) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        linearLayout2.setVisibility(i12);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.f9384m;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i16 = layoutParams.width;
                    if (i16 != -2) {
                        i11 = 1073741824;
                    } else {
                        i11 = Integer.MIN_VALUE;
                    }
                    if (i16 >= 0) {
                        paddingLeft = Math.min(i16, paddingLeft);
                    }
                    int i17 = layoutParams.height;
                    if (i17 == -2) {
                        i13 = Integer.MIN_VALUE;
                    }
                    if (i17 >= 0) {
                        i15 = Math.min(i17, i15);
                    }
                    this.f9384m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i15, i13));
                }
                if (this.f9377e <= 0) {
                    int childCount = getChildCount();
                    int i18 = 0;
                    for (int i19 = 0; i19 < childCount; i19++) {
                        int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i18) {
                            i18 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i18);
                    return;
                }
                setMeasuredDimension(size, i14);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9379g = false;
        }
        if (!this.f9379g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f9379g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f9379g = false;
        return true;
    }

    public void setContentHeight(int i9) {
        this.f9377e = i9;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f9384m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f9384m = view;
        if (view != null && (linearLayout = this.f9385n) != null) {
            removeView(linearLayout);
            this.f9385n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f9381i = charSequence;
        d();
        Q.n(this, charSequence);
    }

    public void setTitleOptional(boolean z9) {
        if (z9 != this.f9390s) {
            requestLayout();
        }
        this.f9390s = z9;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
