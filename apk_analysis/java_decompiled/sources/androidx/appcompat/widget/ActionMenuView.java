package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import d0.w;
import f5.C1183o;
import o.k;
import o.l;
import o.n;
import o.z;
import p.C1795g;
import p.C1801j;
import p.C1805l;
import p.C1809n;
import p.C1820s0;
import p.InterfaceC1807m;
import p.InterfaceC1811o;
import p.g1;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements k, z {

    /* renamed from: p, reason: collision with root package name */
    public l f9422p;

    /* renamed from: q, reason: collision with root package name */
    public Context f9423q;

    /* renamed from: r, reason: collision with root package name */
    public int f9424r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9425s;

    /* renamed from: t, reason: collision with root package name */
    public C1805l f9426t;

    /* renamed from: u, reason: collision with root package name */
    public C1183o f9427u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9428v;

    /* renamed from: w, reason: collision with root package name */
    public int f9429w;

    /* renamed from: x, reason: collision with root package name */
    public final int f9430x;

    /* renamed from: y, reason: collision with root package name */
    public final int f9431y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC1811o f9432z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f9 = context.getResources().getDisplayMetrics().density;
        this.f9430x = (int) (56.0f * f9);
        this.f9431y = (int) (f9 * 4.0f);
        this.f9423q = context;
        this.f9424r = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.n, android.widget.LinearLayout$LayoutParams] */
    public static C1809n j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f22033a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.n, android.widget.LinearLayout$LayoutParams] */
    public static C1809n k(ViewGroup.LayoutParams layoutParams) {
        C1809n c1809n;
        if (layoutParams != null) {
            if (layoutParams instanceof C1809n) {
                C1809n c1809n2 = (C1809n) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c1809n2);
                layoutParams2.f22033a = c1809n2.f22033a;
                c1809n = layoutParams2;
            } else {
                c1809n = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c1809n).gravity <= 0) {
                ((LinearLayout.LayoutParams) c1809n).gravity = 16;
            }
            return c1809n;
        }
        return j();
    }

    @Override // o.z
    public final void b(l lVar) {
        this.f9422p = lVar;
    }

    @Override // o.k
    public final boolean c(n nVar) {
        return this.f9422p.q(nVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1809n;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C1820s0 generateDefaultLayoutParams() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.s0, android.widget.LinearLayout$LayoutParams] */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public final C1820s0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f9422p == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.f9422p = lVar;
            lVar.f21379e = new C1183o(12, this);
            C1805l c1805l = new C1805l(context);
            this.f9426t = c1805l;
            c1805l.f22018m = true;
            c1805l.f22019n = true;
            c1805l.f22011e = new w(10);
            this.f9422p.b(c1805l, this.f9423q);
            C1805l c1805l2 = this.f9426t;
            c1805l2.f22014h = this;
            this.f9422p = c1805l2.f22009c;
        }
        return this.f9422p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1805l c1805l = this.f9426t;
        C1801j c1801j = c1805l.j;
        if (c1801j != null) {
            return c1801j.getDrawable();
        }
        if (c1805l.f22017l) {
            return c1805l.f22016k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f9424r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1820s0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i9) {
        boolean z9 = false;
        if (i9 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i9 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i9);
        if (i9 < getChildCount() && (childAt instanceof InterfaceC1807m)) {
            z9 = ((InterfaceC1807m) childAt).b();
        }
        if (i9 > 0 && (childAt2 instanceof InterfaceC1807m)) {
            return ((InterfaceC1807m) childAt2).c() | z9;
        }
        return z9;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1805l c1805l = this.f9426t;
        if (c1805l != null) {
            c1805l.f(false);
            if (this.f9426t.e()) {
                this.f9426t.d();
                this.f9426t.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1805l c1805l = this.f9426t;
        if (c1805l != null) {
            c1805l.d();
            C1795g c1795g = c1805l.f22026u;
            if (c1795g != null && c1795g.b()) {
                c1795g.f21449i.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        boolean z10;
        int i13;
        int width;
        int i14;
        if (!this.f9428v) {
            super.onLayout(z9, i9, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i11 - i9;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = g1.f21992a;
        if (getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                C1809n c1809n = (C1809n) childAt.getLayoutParams();
                if (c1809n.f22033a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) c1809n).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1809n).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1809n).leftMargin) + ((LinearLayout.LayoutParams) c1809n).rightMargin;
                    l(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        if (i23 > 0) {
            i13 = paddingRight / i23;
        } else {
            i13 = 0;
        }
        int max = Math.max(0, i13);
        if (z10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                C1809n c1809n2 = (C1809n) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1809n2.f22033a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) c1809n2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1809n2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            C1809n c1809n3 = (C1809n) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1809n3.f22033a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) c1809n3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c1809n3).rightMargin + max + i28;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z9;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        ?? r11;
        boolean z12;
        int i15;
        int i16;
        ActionMenuItemView actionMenuItemView;
        boolean z13;
        int i17;
        boolean z14;
        l lVar;
        boolean z15 = this.f9428v;
        if (View.MeasureSpec.getMode(i9) == 1073741824) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9428v = z9;
        if (z15 != z9) {
            this.f9429w = 0;
        }
        int size = View.MeasureSpec.getSize(i9);
        if (this.f9428v && (lVar = this.f9422p) != null && size != this.f9429w) {
            this.f9429w = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (this.f9428v && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i10);
            int size2 = View.MeasureSpec.getSize(i9);
            int size3 = View.MeasureSpec.getSize(i10);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
            int i18 = size2 - paddingRight;
            int i19 = this.f9430x;
            int i20 = i18 / i19;
            int i21 = i18 % i19;
            if (i20 == 0) {
                setMeasuredDimension(i18, 0);
                return;
            }
            int i22 = (i21 / i20) + i19;
            int childCount2 = getChildCount();
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            boolean z16 = false;
            int i27 = 0;
            long j = 0;
            while (true) {
                i11 = this.f9431y;
                if (i26 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i26);
                int i28 = size3;
                int i29 = paddingBottom;
                if (childAt.getVisibility() == 8) {
                    i16 = i22;
                } else {
                    boolean z17 = childAt instanceof ActionMenuItemView;
                    i24++;
                    if (z17) {
                        childAt.setPadding(i11, 0, i11, 0);
                    }
                    C1809n c1809n = (C1809n) childAt.getLayoutParams();
                    c1809n.f22038f = false;
                    c1809n.f22035c = 0;
                    c1809n.f22034b = 0;
                    c1809n.f22036d = false;
                    ((LinearLayout.LayoutParams) c1809n).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c1809n).rightMargin = 0;
                    if (z17 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c1809n.f22037e = z12;
                    if (c1809n.f22033a) {
                        i15 = 1;
                    } else {
                        i15 = i20;
                    }
                    C1809n c1809n2 = (C1809n) childAt.getLayoutParams();
                    int i30 = i20;
                    i16 = i22;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i29, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z17) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && !TextUtils.isEmpty(actionMenuItemView.getText())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z18 = z13;
                    if (i15 > 0 && (!z13 || i15 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i15, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i17 = measuredWidth / i16;
                        if (measuredWidth % i16 != 0) {
                            i17++;
                        }
                        if (z18 && i17 < 2) {
                            i17 = 2;
                        }
                    } else {
                        i17 = 0;
                    }
                    if (!c1809n2.f22033a && z18) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    c1809n2.f22036d = z14;
                    c1809n2.f22034b = i17;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i16, 1073741824), makeMeasureSpec);
                    i25 = Math.max(i25, i17);
                    if (c1809n.f22036d) {
                        i27++;
                    }
                    if (c1809n.f22033a) {
                        z16 = true;
                    }
                    i20 = i30 - i17;
                    i23 = Math.max(i23, childAt.getMeasuredHeight());
                    if (i17 == 1) {
                        j |= 1 << i26;
                    }
                }
                i26++;
                size3 = i28;
                paddingBottom = i29;
                i22 = i16;
            }
            int i31 = size3;
            int i32 = i20;
            int i33 = i22;
            if (z16 && i24 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i34 = i32;
            boolean z19 = false;
            while (i27 > 0 && i34 > 0) {
                int i35 = Integer.MAX_VALUE;
                long j4 = 0;
                int i36 = 0;
                int i37 = 0;
                while (i37 < childCount2) {
                    boolean z20 = z10;
                    C1809n c1809n3 = (C1809n) getChildAt(i37).getLayoutParams();
                    int i38 = i23;
                    if (c1809n3.f22036d) {
                        int i39 = c1809n3.f22034b;
                        if (i39 < i35) {
                            j4 = 1 << i37;
                            i35 = i39;
                            i36 = 1;
                        } else if (i39 == i35) {
                            j4 |= 1 << i37;
                            i36++;
                        }
                    }
                    i37++;
                    i23 = i38;
                    z10 = z20;
                }
                boolean z21 = z10;
                i12 = i23;
                j |= j4;
                if (i36 > i34) {
                    break;
                }
                int i40 = i35 + 1;
                int i41 = 0;
                while (i41 < childCount2) {
                    View childAt2 = getChildAt(i41);
                    C1809n c1809n4 = (C1809n) childAt2.getLayoutParams();
                    boolean z22 = z16;
                    long j9 = 1 << i41;
                    if ((j4 & j9) == 0) {
                        if (c1809n4.f22034b == i40) {
                            j |= j9;
                        }
                    } else {
                        if (z21 && c1809n4.f22037e) {
                            r11 = 1;
                            r11 = 1;
                            if (i34 == 1) {
                                childAt2.setPadding(i11 + i33, 0, i11, 0);
                            }
                        } else {
                            r11 = 1;
                        }
                        c1809n4.f22034b += r11;
                        c1809n4.f22038f = r11;
                        i34--;
                    }
                    i41++;
                    z16 = z22;
                }
                i23 = i12;
                z10 = z21;
                z19 = true;
            }
            i12 = i23;
            if (!z16 && i24 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i34 > 0 && j != 0 && (i34 < i24 - 1 || z11 || i25 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z11) {
                    if ((j & 1) != 0 && !((C1809n) getChildAt(0).getLayoutParams()).f22037e) {
                        bitCount -= 0.5f;
                    }
                    int i42 = childCount2 - 1;
                    if ((j & (1 << i42)) != 0 && !((C1809n) getChildAt(i42).getLayoutParams()).f22037e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i14 = (int) ((i34 * i33) / bitCount);
                } else {
                    i14 = 0;
                }
                boolean z23 = z19;
                for (int i43 = 0; i43 < childCount2; i43++) {
                    if ((j & (1 << i43)) != 0) {
                        View childAt3 = getChildAt(i43);
                        C1809n c1809n5 = (C1809n) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c1809n5.f22035c = i14;
                            c1809n5.f22038f = true;
                            if (i43 == 0 && !c1809n5.f22037e) {
                                ((LinearLayout.LayoutParams) c1809n5).leftMargin = (-i14) / 2;
                            }
                            z23 = true;
                        } else if (c1809n5.f22033a) {
                            c1809n5.f22035c = i14;
                            c1809n5.f22038f = true;
                            ((LinearLayout.LayoutParams) c1809n5).rightMargin = (-i14) / 2;
                            z23 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) c1809n5).leftMargin = i14 / 2;
                            }
                            if (i43 != childCount2 - 1) {
                                ((LinearLayout.LayoutParams) c1809n5).rightMargin = i14 / 2;
                            }
                        }
                    }
                }
                z19 = z23;
            }
            if (z19) {
                for (int i44 = 0; i44 < childCount2; i44++) {
                    View childAt4 = getChildAt(i44);
                    C1809n c1809n6 = (C1809n) childAt4.getLayoutParams();
                    if (c1809n6.f22038f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1809n6.f22034b * i33) + c1809n6.f22035c, 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode != 1073741824) {
                i13 = i12;
            } else {
                i13 = i31;
            }
            setMeasuredDimension(i18, i13);
            return;
        }
        for (int i45 = 0; i45 < childCount; i45++) {
            C1809n c1809n7 = (C1809n) getChildAt(i45).getLayoutParams();
            ((LinearLayout.LayoutParams) c1809n7).rightMargin = 0;
            ((LinearLayout.LayoutParams) c1809n7).leftMargin = 0;
        }
        super.onMeasure(i9, i10);
    }

    public void setExpandedActionViewsExclusive(boolean z9) {
        this.f9426t.f22023r = z9;
    }

    public void setOnMenuItemClickListener(InterfaceC1811o interfaceC1811o) {
        this.f9432z = interfaceC1811o;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1805l c1805l = this.f9426t;
        C1801j c1801j = c1805l.j;
        if (c1801j != null) {
            c1801j.setImageDrawable(drawable);
        } else {
            c1805l.f22017l = true;
            c1805l.f22016k = drawable;
        }
    }

    public void setOverflowReserved(boolean z9) {
        this.f9425s = z9;
    }

    public void setPopupTheme(int i9) {
        if (this.f9424r != i9) {
            this.f9424r = i9;
            if (i9 == 0) {
                this.f9423q = getContext();
            } else {
                this.f9423q = new ContextThemeWrapper(getContext(), i9);
            }
        }
    }

    public void setPresenter(C1805l c1805l) {
        this.f9426t = c1805l;
        c1805l.f22014h = this;
        this.f9422p = c1805l.f22009c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
