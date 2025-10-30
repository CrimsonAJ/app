package androidx.appcompat.widget;

import P.Q;
import Q2.U;
import U.b;
import a.AbstractC0485a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.y;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b5.G1;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import f5.C1183o;
import h.AbstractC1260a;
import i.G;
import i0.C1328E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m5.c;
import n.h;
import o.l;
import o.n;
import p.AbstractC1768S0;
import p.C1753K0;
import p.C1770T0;
import p.C1772U0;
import p.C1776W0;
import p.C1780Y0;
import p.C1805l;
import p.InterfaceC1774V0;
import p.InterfaceC1794f0;
import p.RunnableC1766R0;
import p.ViewOnClickListenerC1778X0;
import p.g1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f9482A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9483B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f9484C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f9485D;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f9486a;

    /* renamed from: b, reason: collision with root package name */
    public AppCompatTextView f9487b;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f9488c;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatImageButton f9489d;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatImageView f9490e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f9491f;

    /* renamed from: f0, reason: collision with root package name */
    public final ArrayList f9492f0;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f9493g;

    /* renamed from: g0, reason: collision with root package name */
    public final int[] f9494g0;

    /* renamed from: h, reason: collision with root package name */
    public AppCompatImageButton f9495h;

    /* renamed from: h0, reason: collision with root package name */
    public final y f9496h0;

    /* renamed from: i, reason: collision with root package name */
    public View f9497i;

    /* renamed from: i0, reason: collision with root package name */
    public ArrayList f9498i0;
    public Context j;

    /* renamed from: j0, reason: collision with root package name */
    public final G f9499j0;

    /* renamed from: k, reason: collision with root package name */
    public int f9500k;

    /* renamed from: k0, reason: collision with root package name */
    public C1780Y0 f9501k0;

    /* renamed from: l, reason: collision with root package name */
    public int f9502l;

    /* renamed from: l0, reason: collision with root package name */
    public C1805l f9503l0;

    /* renamed from: m, reason: collision with root package name */
    public int f9504m;

    /* renamed from: m0, reason: collision with root package name */
    public C1770T0 f9505m0;

    /* renamed from: n, reason: collision with root package name */
    public final int f9506n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f9507n0;

    /* renamed from: o, reason: collision with root package name */
    public final int f9508o;

    /* renamed from: o0, reason: collision with root package name */
    public OnBackInvokedCallback f9509o0;

    /* renamed from: p, reason: collision with root package name */
    public int f9510p;

    /* renamed from: p0, reason: collision with root package name */
    public OnBackInvokedDispatcher f9511p0;

    /* renamed from: q, reason: collision with root package name */
    public int f9512q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f9513q0;

    /* renamed from: r, reason: collision with root package name */
    public int f9514r;
    public final c r0;

    /* renamed from: s, reason: collision with root package name */
    public int f9515s;

    /* renamed from: t, reason: collision with root package name */
    public C1753K0 f9516t;

    /* renamed from: u, reason: collision with root package name */
    public int f9517u;

    /* renamed from: v, reason: collision with root package name */
    public int f9518v;

    /* renamed from: w, reason: collision with root package name */
    public final int f9519w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f9520x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f9521y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f9522z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i9 = 0; i9 < menu.size(); i9++) {
            arrayList.add(menu.getItem(i9));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, p.U0] */
    public static C1772U0 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f21921b = 0;
        marginLayoutParams.f21920a = 8388627;
        return marginLayoutParams;
    }

    public static C1772U0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z9 = layoutParams instanceof C1772U0;
        if (z9) {
            C1772U0 c1772u0 = (C1772U0) layoutParams;
            C1772U0 c1772u02 = new C1772U0(c1772u0);
            c1772u02.f21921b = 0;
            c1772u02.f21921b = c1772u0.f21921b;
            return c1772u02;
        }
        if (z9) {
            C1772U0 c1772u03 = new C1772U0((C1772U0) layoutParams);
            c1772u03.f21921b = 0;
            return c1772u03;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C1772U0 c1772u04 = new C1772U0(marginLayoutParams);
            c1772u04.f21921b = 0;
            ((ViewGroup.MarginLayoutParams) c1772u04).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c1772u04).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c1772u04).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c1772u04).bottomMargin = marginLayoutParams.bottomMargin;
            return c1772u04;
        }
        C1772U0 c1772u05 = new C1772U0(layoutParams);
        c1772u05.f21921b = 0;
        return c1772u05;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i9, ArrayList arrayList) {
        boolean z9;
        if (getLayoutDirection() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, getLayoutDirection());
        arrayList.clear();
        if (z9) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                C1772U0 c1772u0 = (C1772U0) childAt.getLayoutParams();
                if (c1772u0.f21921b == 0 && t(childAt)) {
                    int i11 = c1772u0.f21920a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            C1772U0 c1772u02 = (C1772U0) childAt2.getLayoutParams();
            if (c1772u02.f21921b == 0 && t(childAt2)) {
                int i13 = c1772u02.f21920a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z9) {
        C1772U0 c1772u0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c1772u0 = h();
        } else if (!checkLayoutParams(layoutParams)) {
            c1772u0 = i(layoutParams);
        } else {
            c1772u0 = (C1772U0) layoutParams;
        }
        c1772u0.f21921b = 1;
        if (z9 && this.f9497i != null) {
            view.setLayoutParams(c1772u0);
            this.f9492f0.add(view);
        } else {
            addView(view, c1772u0);
        }
    }

    public final void c() {
        if (this.f9495h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f9495h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f9491f);
            this.f9495h.setContentDescription(this.f9493g);
            C1772U0 h7 = h();
            h7.f21920a = (this.f9506n & 112) | 8388611;
            h7.f21921b = 2;
            this.f9495h.setLayoutParams(h7);
            this.f9495h.setOnClickListener(new U(5, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1772U0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.K0, java.lang.Object] */
    public final void d() {
        if (this.f9516t == null) {
            ?? obj = new Object();
            obj.f21832a = 0;
            obj.f21833b = 0;
            obj.f21834c = Integer.MIN_VALUE;
            obj.f21835d = Integer.MIN_VALUE;
            obj.f21836e = 0;
            obj.f21837f = 0;
            obj.f21838g = false;
            obj.f21839h = false;
            this.f9516t = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f9486a;
        if (actionMenuView.f9422p == null) {
            l lVar = (l) actionMenuView.getMenu();
            if (this.f9505m0 == null) {
                this.f9505m0 = new C1770T0(this);
            }
            this.f9486a.setExpandedActionViewsExclusive(true);
            lVar.b(this.f9505m0, this.j);
            u();
        }
    }

    public final void f() {
        if (this.f9486a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f9486a = actionMenuView;
            actionMenuView.setPopupTheme(this.f9500k);
            this.f9486a.setOnMenuItemClickListener(this.f9499j0);
            ActionMenuView actionMenuView2 = this.f9486a;
            C1183o c1183o = new C1183o(13, this);
            actionMenuView2.getClass();
            actionMenuView2.f9427u = c1183o;
            C1772U0 h7 = h();
            h7.f21920a = (this.f9506n & 112) | 8388613;
            this.f9486a.setLayoutParams(h7);
            b(this.f9486a, false);
        }
    }

    public final void g() {
        if (this.f9489d == null) {
            this.f9489d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1772U0 h7 = h();
            h7.f21920a = (this.f9506n & 112) | 8388611;
            this.f9489d.setLayoutParams(h7);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f9495h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f9495h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1753K0 c1753k0 = this.f9516t;
        if (c1753k0 != null) {
            if (c1753k0.f21838g) {
                return c1753k0.f21832a;
            }
            return c1753k0.f21833b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i9 = this.f9518v;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1753K0 c1753k0 = this.f9516t;
        if (c1753k0 != null) {
            return c1753k0.f21832a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1753K0 c1753k0 = this.f9516t;
        if (c1753k0 != null) {
            return c1753k0.f21833b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1753K0 c1753k0 = this.f9516t;
        if (c1753k0 != null) {
            if (c1753k0.f21838g) {
                return c1753k0.f21833b;
            }
            return c1753k0.f21832a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i9 = this.f9517u;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.f9486a;
        if (actionMenuView != null && (lVar = actionMenuView.f9422p) != null && lVar.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f9518v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f9517u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f9490e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f9490e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f9486a.getMenu();
    }

    public View getNavButtonView() {
        return this.f9489d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f9489d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f9489d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public C1805l getOuterActionMenuPresenter() {
        return this.f9503l0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f9486a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.f9500k;
    }

    public CharSequence getSubtitle() {
        return this.f9521y;
    }

    public final TextView getSubtitleTextView() {
        return this.f9488c;
    }

    public CharSequence getTitle() {
        return this.f9520x;
    }

    public int getTitleMarginBottom() {
        return this.f9515s;
    }

    public int getTitleMarginEnd() {
        return this.f9512q;
    }

    public int getTitleMarginStart() {
        return this.f9510p;
    }

    public int getTitleMarginTop() {
        return this.f9514r;
    }

    public final TextView getTitleTextView() {
        return this.f9487b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.Y0, java.lang.Object] */
    public InterfaceC1794f0 getWrapper() {
        boolean z9;
        Drawable drawable;
        if (this.f9501k0 == null) {
            ?? obj = new Object();
            obj.f21940n = 0;
            obj.f21928a = this;
            obj.f21935h = getTitle();
            obj.f21936i = getSubtitle();
            if (obj.f21935h != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            obj.f21934g = z9;
            obj.f21933f = getNavigationIcon();
            String str = null;
            G1 w7 = G1.w(getContext(), null, AbstractC1260a.f17805a, R.attr.actionBarStyle);
            obj.f21941o = w7.o(15);
            TypedArray typedArray = (TypedArray) w7.f10718c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f21934g = true;
                obj.f21935h = text;
                if ((obj.f21929b & 8) != 0) {
                    Toolbar toolbar = obj.f21928a;
                    toolbar.setTitle(text);
                    if (obj.f21934g) {
                        Q.n(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f21936i = text2;
                if ((obj.f21929b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable o9 = w7.o(20);
            if (o9 != null) {
                obj.f21932e = o9;
                obj.c();
            }
            Drawable o10 = w7.o(17);
            if (o10 != null) {
                obj.f21931d = o10;
                obj.c();
            }
            if (obj.f21933f == null && (drawable = obj.f21941o) != null) {
                obj.f21933f = drawable;
                int i9 = obj.f21929b & 4;
                Toolbar toolbar2 = obj.f21928a;
                if (i9 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.f21930c;
                if (view != null && (obj.f21929b & 16) != 0) {
                    removeView(view);
                }
                obj.f21930c = inflate;
                if (inflate != null && (obj.f21929b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f21929b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f9516t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f9502l = resourceId2;
                AppCompatTextView appCompatTextView = this.f9487b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f9504m = resourceId3;
                AppCompatTextView appCompatTextView2 = this.f9488c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            w7.y();
            if (R.string.abc_action_bar_up_description != obj.f21940n) {
                obj.f21940n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i10 = obj.f21940n;
                    if (i10 != 0) {
                        str = getContext().getString(i10);
                    }
                    obj.j = str;
                    obj.b();
                }
            }
            obj.j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC1778X0(obj));
            this.f9501k0 = obj;
        }
        return this.f9501k0;
    }

    public final int j(View view, int i9) {
        int i10;
        C1772U0 c1772u0 = (C1772U0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i9 > 0) {
            i10 = (measuredHeight - i9) / 2;
        } else {
            i10 = 0;
        }
        int i11 = c1772u0.f21920a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.f9519w & 112;
        }
        if (i11 != 48) {
            if (i11 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i13 = ((ViewGroup.MarginLayoutParams) c1772u0).topMargin;
                if (i12 < i13) {
                    i12 = i13;
                } else {
                    int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                    int i15 = ((ViewGroup.MarginLayoutParams) c1772u0).bottomMargin;
                    if (i14 < i15) {
                        i12 = Math.max(0, i12 - (i15 - i14));
                    }
                }
                return paddingTop + i12;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1772u0).bottomMargin) - i10;
        }
        return getPaddingTop() - i10;
    }

    public void m(int i9) {
        getMenuInflater().inflate(i9, getMenu());
    }

    public final void n() {
        ArrayList arrayList = this.f9498i0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f9496h0.f9332c).iterator();
        while (it.hasNext()) {
            ((C1328E) it.next()).f18170a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f9498i0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        if (view.getParent() != this && !this.f9492f0.contains(view)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.r0);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9484C = false;
        }
        if (!this.f9484C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f9484C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f9484C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c8 A[LOOP:2: B:47:0x02c6->B:48:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0318 A[LOOP:3: B:56:0x0316->B:57:0x0318, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        char c3;
        Object[] objArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z9 = g1.f21992a;
        int i18 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c3 = 0;
        } else {
            c3 = 1;
            objArr = false;
        }
        if (t(this.f9489d)) {
            s(this.f9489d, i9, 0, i10, this.f9508o);
            i11 = k(this.f9489d) + this.f9489d.getMeasuredWidth();
            i12 = Math.max(0, l(this.f9489d) + this.f9489d.getMeasuredHeight());
            i13 = View.combineMeasuredStates(0, this.f9489d.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (t(this.f9495h)) {
            s(this.f9495h, i9, 0, i10, this.f9508o);
            i11 = k(this.f9495h) + this.f9495h.getMeasuredWidth();
            i12 = Math.max(i12, l(this.f9495h) + this.f9495h.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f9495h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11);
        int max2 = Math.max(0, currentContentInsetStart - i11);
        Object[] objArr2 = objArr;
        int[] iArr = this.f9494g0;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (t(this.f9486a)) {
            s(this.f9486a, i9, max, i10, this.f9508o);
            i14 = k(this.f9486a) + this.f9486a.getMeasuredWidth();
            i12 = Math.max(i12, l(this.f9486a) + this.f9486a.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f9486a.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i14);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i14);
        if (t(this.f9497i)) {
            max3 += r(this.f9497i, i9, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.f9497i) + this.f9497i.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f9497i.getMeasuredState());
        }
        if (t(this.f9490e)) {
            max3 += r(this.f9490e, i9, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.f9490e) + this.f9490e.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f9490e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (((C1772U0) childAt.getLayoutParams()).f21921b == 0 && t(childAt)) {
                max3 += r(childAt, i9, max3, i10, 0, iArr);
                int max4 = Math.max(i12, l(childAt) + childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
                i12 = max4;
            } else {
                max3 = max3;
            }
        }
        int i20 = max3;
        int i21 = this.f9514r + this.f9515s;
        int i22 = this.f9510p + this.f9512q;
        if (t(this.f9487b)) {
            r(this.f9487b, i9, i20 + i22, i10, i21, iArr);
            int k5 = k(this.f9487b) + this.f9487b.getMeasuredWidth();
            i15 = l(this.f9487b) + this.f9487b.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i13, this.f9487b.getMeasuredState());
            i17 = k5;
        } else {
            i15 = 0;
            i16 = i13;
            i17 = 0;
        }
        if (t(this.f9488c)) {
            i17 = Math.max(i17, r(this.f9488c, i9, i20 + i22, i10, i21 + i15, iArr));
            i15 += l(this.f9488c) + this.f9488c.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i16, this.f9488c.getMeasuredState());
        }
        int max5 = Math.max(i12, i15);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i20 + i17;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i9, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i16 << 16);
        if (this.f9507n0) {
            int childCount2 = getChildCount();
            for (int i23 = 0; i23 < childCount2; i23++) {
                View childAt2 = getChildAt(i23);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i18);
        }
        i18 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i18);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        l lVar;
        MenuItem findItem;
        if (!(parcelable instanceof C1776W0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1776W0 c1776w0 = (C1776W0) parcelable;
        super.onRestoreInstanceState(c1776w0.f7246a);
        ActionMenuView actionMenuView = this.f9486a;
        if (actionMenuView != null) {
            lVar = actionMenuView.f9422p;
        } else {
            lVar = null;
        }
        int i9 = c1776w0.f21924c;
        if (i9 != 0 && this.f9505m0 != null && lVar != null && (findItem = lVar.findItem(i9)) != null) {
            findItem.expandActionView();
        }
        if (c1776w0.f21925d) {
            c cVar = this.r0;
            removeCallbacks(cVar);
            post(cVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i9) {
        super.onRtlPropertiesChanged(i9);
        d();
        C1753K0 c1753k0 = this.f9516t;
        boolean z9 = true;
        if (i9 != 1) {
            z9 = false;
        }
        if (z9 == c1753k0.f21838g) {
            return;
        }
        c1753k0.f21838g = z9;
        if (c1753k0.f21839h) {
            if (z9) {
                int i10 = c1753k0.f21835d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = c1753k0.f21836e;
                }
                c1753k0.f21832a = i10;
                int i11 = c1753k0.f21834c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = c1753k0.f21837f;
                }
                c1753k0.f21833b = i11;
                return;
            }
            int i12 = c1753k0.f21834c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = c1753k0.f21836e;
            }
            c1753k0.f21832a = i12;
            int i13 = c1753k0.f21835d;
            if (i13 == Integer.MIN_VALUE) {
                i13 = c1753k0.f21837f;
            }
            c1753k0.f21833b = i13;
            return;
        }
        c1753k0.f21832a = c1753k0.f21836e;
        c1753k0.f21833b = c1753k0.f21837f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, p.W0, U.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z9;
        C1805l c1805l;
        n nVar;
        ?? bVar = new b(super.onSaveInstanceState());
        C1770T0 c1770t0 = this.f9505m0;
        if (c1770t0 != null && (nVar = c1770t0.f21918b) != null) {
            bVar.f21924c = nVar.f21404a;
        }
        ActionMenuView actionMenuView = this.f9486a;
        if (actionMenuView != null && (c1805l = actionMenuView.f9426t) != null && c1805l.e()) {
            z9 = true;
        } else {
            z9 = false;
        }
        bVar.f21925d = z9;
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9483B = false;
        }
        if (!this.f9483B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f9483B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f9483B = false;
        return true;
    }

    public final int p(View view, int i9, int i10, int[] iArr) {
        C1772U0 c1772u0 = (C1772U0) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) c1772u0).leftMargin - iArr[0];
        int max = Math.max(0, i11) + i9;
        iArr[0] = Math.max(0, -i11);
        int j = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1772u0).rightMargin + max;
    }

    public final int q(View view, int i9, int i10, int[] iArr) {
        C1772U0 c1772u0 = (C1772U0) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) c1772u0).rightMargin - iArr[1];
        int max = i9 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int j = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1772u0).leftMargin);
    }

    public final int r(View view, int i9, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z9) {
        if (this.f9513q0 != z9) {
            this.f9513q0 = z9;
            u();
        }
    }

    public void setCollapseContentDescription(int i9) {
        setCollapseContentDescription(i9 != 0 ? getContext().getText(i9) : null);
    }

    public void setCollapseIcon(int i9) {
        setCollapseIcon(AbstractC0485a.q(getContext(), i9));
    }

    public void setCollapsible(boolean z9) {
        this.f9507n0 = z9;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i9) {
        if (i9 < 0) {
            i9 = Integer.MIN_VALUE;
        }
        if (i9 != this.f9518v) {
            this.f9518v = i9;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i9) {
        if (i9 < 0) {
            i9 = Integer.MIN_VALUE;
        }
        if (i9 != this.f9517u) {
            this.f9517u = i9;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i9) {
        setLogo(AbstractC0485a.q(getContext(), i9));
    }

    public void setLogoDescription(int i9) {
        setLogoDescription(getContext().getText(i9));
    }

    public void setNavigationContentDescription(int i9) {
        setNavigationContentDescription(i9 != 0 ? getContext().getText(i9) : null);
    }

    public void setNavigationIcon(int i9) {
        setNavigationIcon(AbstractC0485a.q(getContext(), i9));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f9489d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f9486a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i9) {
        if (this.f9500k != i9) {
            this.f9500k = i9;
            if (i9 == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i9);
            }
        }
    }

    public void setSubtitle(int i9) {
        setSubtitle(getContext().getText(i9));
    }

    public void setSubtitleTextColor(int i9) {
        setSubtitleTextColor(ColorStateList.valueOf(i9));
    }

    public void setTitle(int i9) {
        setTitle(getContext().getText(i9));
    }

    public void setTitleMarginBottom(int i9) {
        this.f9515s = i9;
        requestLayout();
    }

    public void setTitleMarginEnd(int i9) {
        this.f9512q = i9;
        requestLayout();
    }

    public void setTitleMarginStart(int i9) {
        this.f9510p = i9;
        requestLayout();
    }

    public void setTitleMarginTop(int i9) {
        this.f9514r = i9;
        requestLayout();
    }

    public void setTitleTextColor(int i9) {
        setTitleTextColor(ColorStateList.valueOf(i9));
    }

    public final boolean t(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void u() {
        boolean z9;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a5 = AbstractC1768S0.a(this);
            C1770T0 c1770t0 = this.f9505m0;
            if (c1770t0 != null && c1770t0.f21918b != null && a5 != null && isAttachedToWindow() && this.f9513q0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && this.f9511p0 == null) {
                if (this.f9509o0 == null) {
                    this.f9509o0 = AbstractC1768S0.b(new RunnableC1766R0(this, 0));
                }
                AbstractC1768S0.c(a5, this.f9509o0);
                this.f9511p0 = a5;
                return;
            }
            if (!z9 && (onBackInvokedDispatcher = this.f9511p0) != null) {
                AbstractC1768S0.d(onBackInvokedDispatcher, this.f9509o0);
                this.f9511p0 = null;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f9519w = 8388627;
        this.f9485D = new ArrayList();
        this.f9492f0 = new ArrayList();
        this.f9494g0 = new int[2];
        this.f9496h0 = new y(new RunnableC1766R0(this, 1));
        this.f9498i0 = new ArrayList();
        this.f9499j0 = new G(11, this);
        this.r0 = new c(4, this);
        Context context2 = getContext();
        int[] iArr = AbstractC1260a.f17827x;
        G1 w7 = G1.w(context2, attributeSet, iArr, R.attr.toolbarStyle);
        Q.l(this, context, iArr, attributeSet, (TypedArray) w7.f10718c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) w7.f10718c;
        this.f9502l = typedArray.getResourceId(28, 0);
        this.f9504m = typedArray.getResourceId(19, 0);
        this.f9519w = typedArray.getInteger(0, 8388627);
        this.f9506n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f9515s = dimensionPixelOffset;
        this.f9514r = dimensionPixelOffset;
        this.f9512q = dimensionPixelOffset;
        this.f9510p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f9510p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f9512q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f9514r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f9515s = dimensionPixelOffset5;
        }
        this.f9508o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C1753K0 c1753k0 = this.f9516t;
        c1753k0.f21839h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1753k0.f21836e = dimensionPixelSize;
            c1753k0.f21832a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1753k0.f21837f = dimensionPixelSize2;
            c1753k0.f21833b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1753k0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f9517u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f9518v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f9491f = w7.o(4);
        this.f9493g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable o9 = w7.o(16);
        if (o9 != null) {
            setNavigationIcon(o9);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable o10 = w7.o(11);
        if (o10 != null) {
            setLogo(o10);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(w7.n(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(w7.n(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        w7.y();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, p.U0] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f21920a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1260a.f17806b);
        marginLayoutParams.f21920a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f21921b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.f9495h;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f9495h.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f9495h;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f9491f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f9490e == null) {
                this.f9490e = new AppCompatImageView(getContext(), null);
            }
            if (!o(this.f9490e)) {
                b(this.f9490e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f9490e;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.f9490e);
                this.f9492f0.remove(this.f9490e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f9490e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f9490e == null) {
            this.f9490e = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f9490e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.f9489d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            D1.J(this.f9489d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f9489d)) {
                b(this.f9489d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f9489d;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.f9489d);
                this.f9492f0.remove(this.f9489d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f9489d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f9488c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f9488c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f9488c.setEllipsize(TextUtils.TruncateAt.END);
                int i9 = this.f9504m;
                if (i9 != 0) {
                    this.f9488c.setTextAppearance(context, i9);
                }
                ColorStateList colorStateList = this.f9482A;
                if (colorStateList != null) {
                    this.f9488c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f9488c)) {
                b(this.f9488c, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f9488c;
            if (appCompatTextView2 != null && o(appCompatTextView2)) {
                removeView(this.f9488c);
                this.f9492f0.remove(this.f9488c);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f9488c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f9521y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f9482A = colorStateList;
        AppCompatTextView appCompatTextView = this.f9488c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f9487b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f9487b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f9487b.setEllipsize(TextUtils.TruncateAt.END);
                int i9 = this.f9502l;
                if (i9 != 0) {
                    this.f9487b.setTextAppearance(context, i9);
                }
                ColorStateList colorStateList = this.f9522z;
                if (colorStateList != null) {
                    this.f9487b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f9487b)) {
                b(this.f9487b, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f9487b;
            if (appCompatTextView2 != null && o(appCompatTextView2)) {
                removeView(this.f9487b);
                this.f9492f0.remove(this.f9487b);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f9487b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f9520x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f9522z = colorStateList;
        AppCompatTextView appCompatTextView = this.f9487b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC1774V0 interfaceC1774V0) {
    }
}
