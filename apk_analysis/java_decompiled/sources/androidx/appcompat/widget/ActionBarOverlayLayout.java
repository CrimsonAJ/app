package androidx.appcompat.widget;

import A5.t;
import F0.Y;
import H.c;
import P.F;
import P.H;
import P.InterfaceC0312m;
import P.InterfaceC0313n;
import P.Q;
import P.g0;
import P.h0;
import P.i0;
import P.j0;
import P.k0;
import P.r0;
import P.u0;
import a.AbstractC0485a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import co.notix.R;
import i.I;
import java.util.WeakHashMap;
import n.j;
import o.l;
import o.w;
import p.C1770T0;
import p.C1780Y0;
import p.C1791e;
import p.C1793f;
import p.C1805l;
import p.InterfaceC1789d;
import p.InterfaceC1792e0;
import p.InterfaceC1794f0;
import p.RunnableC1787c;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1792e0, InterfaceC0312m, InterfaceC0313n {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f9392C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final u0 f9393D;

    /* renamed from: f0, reason: collision with root package name */
    public static final Rect f9394f0;

    /* renamed from: A, reason: collision with root package name */
    public final Y f9395A;

    /* renamed from: B, reason: collision with root package name */
    public final C1793f f9396B;

    /* renamed from: a, reason: collision with root package name */
    public int f9397a;

    /* renamed from: b, reason: collision with root package name */
    public int f9398b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f9399c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f9400d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1794f0 f9401e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f9402f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9403g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9404h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9405i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f9406k;

    /* renamed from: l, reason: collision with root package name */
    public int f9407l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f9408m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f9409n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f9410o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f9411p;

    /* renamed from: q, reason: collision with root package name */
    public u0 f9412q;

    /* renamed from: r, reason: collision with root package name */
    public u0 f9413r;

    /* renamed from: s, reason: collision with root package name */
    public u0 f9414s;

    /* renamed from: t, reason: collision with root package name */
    public u0 f9415t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1789d f9416u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f9417v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f9418w;

    /* renamed from: x, reason: collision with root package name */
    public final t f9419x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC1787c f9420y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC1787c f9421z;

    static {
        k0 g0Var;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            g0Var = new j0();
        } else if (i9 >= 30) {
            g0Var = new i0();
        } else if (i9 >= 29) {
            g0Var = new h0();
        } else {
            g0Var = new g0();
        }
        g0Var.g(c.b(0, 1, 0, 1));
        f9393D = g0Var.b();
        f9394f0 = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [F0.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View, p.f] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9398b = 0;
        this.f9408m = new Rect();
        this.f9409n = new Rect();
        this.f9410o = new Rect();
        this.f9411p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        u0 u0Var = u0.f5644b;
        this.f9412q = u0Var;
        this.f9413r = u0Var;
        this.f9414s = u0Var;
        this.f9415t = u0Var;
        this.f9419x = new t(8, this);
        this.f9420y = new RunnableC1787c(this, 0);
        this.f9421z = new RunnableC1787c(this, 1);
        i(context);
        this.f9395A = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.f9396B = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z9) {
        boolean z10;
        C1791e c1791e = (C1791e) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) c1791e).leftMargin;
        int i10 = rect.left;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c1791e).leftMargin = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c1791e).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c1791e).topMargin = i12;
            z10 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) c1791e).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) c1791e).rightMargin = i14;
            z10 = true;
        }
        if (z9) {
            int i15 = ((ViewGroup.MarginLayoutParams) c1791e).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) c1791e).bottomMargin = i16;
                return true;
            }
        }
        return z10;
    }

    @Override // P.InterfaceC0312m
    public final void a(View view, View view2, int i9, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i9);
        }
    }

    @Override // P.InterfaceC0312m
    public final void b(View view, int i9) {
        if (i9 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // P.InterfaceC0312m
    public final void c(View view, int i9, int i10, int[] iArr, int i11) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1791e;
    }

    @Override // P.InterfaceC0313n
    public final void d(View view, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        e(view, i9, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i9;
        super.draw(canvas);
        if (this.f9402f != null) {
            if (this.f9400d.getVisibility() == 0) {
                i9 = (int) (this.f9400d.getTranslationY() + this.f9400d.getBottom() + 0.5f);
            } else {
                i9 = 0;
            }
            this.f9402f.setBounds(0, i9, getWidth(), this.f9402f.getIntrinsicHeight() + i9);
            this.f9402f.draw(canvas);
        }
    }

    @Override // P.InterfaceC0312m
    public final void e(View view, int i9, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i9, i10, i11, i12);
        }
    }

    @Override // P.InterfaceC0312m
    public final boolean f(View view, View view2, int i9, int i10) {
        if (i10 == 0 && onStartNestedScroll(view, view2, i9)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f9400d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Y y9 = this.f9395A;
        return y9.f2059b | y9.f2058a;
    }

    public CharSequence getTitle() {
        k();
        return ((C1780Y0) this.f9401e).f21928a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f9420y);
        removeCallbacks(this.f9421z);
        ViewPropertyAnimator viewPropertyAnimator = this.f9418w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f9392C);
        boolean z9 = false;
        this.f9397a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f9402f = drawable;
        if (drawable == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        obtainStyledAttributes.recycle();
        this.f9417v = new OverScroller(context);
    }

    public final void j(int i9) {
        k();
        if (i9 != 2) {
            if (i9 != 5) {
                if (i9 != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            } else {
                ((C1780Y0) this.f9401e).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
        }
        ((C1780Y0) this.f9401e).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void k() {
        InterfaceC1794f0 wrapper;
        if (this.f9399c == null) {
            this.f9399c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f9400d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC1794f0) {
                wrapper = (InterfaceC1794f0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f9401e = wrapper;
        }
    }

    public final void l(l lVar, w wVar) {
        k();
        C1780Y0 c1780y0 = (C1780Y0) this.f9401e;
        C1805l c1805l = c1780y0.f21939m;
        Toolbar toolbar = c1780y0.f21928a;
        if (c1805l == null) {
            C1805l c1805l2 = new C1805l(toolbar.getContext());
            c1780y0.f21939m = c1805l2;
            c1805l2.f22015i = R.id.action_menu_presenter;
        }
        C1805l c1805l3 = c1780y0.f21939m;
        c1805l3.f22011e = wVar;
        if (lVar != null || toolbar.f9486a != null) {
            toolbar.f();
            l lVar2 = toolbar.f9486a.f9422p;
            if (lVar2 == lVar) {
                return;
            }
            if (lVar2 != null) {
                lVar2.r(toolbar.f9503l0);
                lVar2.r(toolbar.f9505m0);
            }
            if (toolbar.f9505m0 == null) {
                toolbar.f9505m0 = new C1770T0(toolbar);
            }
            c1805l3.f22023r = true;
            if (lVar != null) {
                lVar.b(c1805l3, toolbar.j);
                lVar.b(toolbar.f9505m0, toolbar.j);
            } else {
                c1805l3.i(toolbar.j, null);
                toolbar.f9505m0.i(toolbar.j, null);
                c1805l3.f(true);
                toolbar.f9505m0.f(true);
            }
            toolbar.f9486a.setPopupTheme(toolbar.f9500k);
            toolbar.f9486a.setPresenter(c1805l3);
            toolbar.f9503l0 = c1805l3;
            toolbar.u();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        u0 g9 = u0.g(this, windowInsets);
        boolean g10 = g(this.f9400d, new Rect(g9.b(), g9.d(), g9.c(), g9.a()), false);
        WeakHashMap weakHashMap = Q.f5546a;
        Rect rect = this.f9408m;
        H.b(this, g9, rect);
        int i9 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        r0 r0Var = g9.f5645a;
        u0 l9 = r0Var.l(i9, i10, i11, i12);
        this.f9412q = l9;
        boolean z9 = true;
        if (!this.f9413r.equals(l9)) {
            this.f9413r = this.f9412q;
            g10 = true;
        }
        Rect rect2 = this.f9409n;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z9 = g10;
        }
        if (z9) {
            requestLayout();
        }
        return r0Var.a().f5645a.c().f5645a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = Q.f5546a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C1791e c1791e = (C1791e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) c1791e).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) c1791e).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f9, float f10, boolean z9) {
        if (this.f9405i && z9) {
            this.f9417v.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.f9417v.getFinalY() > this.f9400d.getHeight()) {
                h();
                this.f9421z.run();
            } else {
                h();
                this.f9420y.run();
            }
            this.j = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        int i13 = this.f9406k + i10;
        this.f9406k = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        I i10;
        j jVar;
        this.f9395A.f2058a = i9;
        this.f9406k = getActionBarHideOffset();
        h();
        InterfaceC1789d interfaceC1789d = this.f9416u;
        if (interfaceC1789d != null && (jVar = (i10 = (I) interfaceC1789d).f18019y) != null) {
            jVar.a();
            i10.f18019y = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        if ((i9 & 2) != 0 && this.f9400d.getVisibility() == 0) {
            return this.f9405i;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f9405i && !this.j) {
            if (this.f9406k <= this.f9400d.getHeight()) {
                h();
                postDelayed(this.f9420y, 600L);
            } else {
                h();
                postDelayed(this.f9421z, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i9) {
        boolean z9;
        boolean z10;
        super.onWindowSystemUiVisibilityChanged(i9);
        k();
        int i10 = this.f9407l ^ i9;
        this.f9407l = i9;
        if ((i9 & 4) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((i9 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        InterfaceC1789d interfaceC1789d = this.f9416u;
        if (interfaceC1789d != null) {
            I i11 = (I) interfaceC1789d;
            i11.f18015u = !z10;
            if (!z9 && z10) {
                if (!i11.f18016v) {
                    i11.f18016v = true;
                    i11.H(true);
                }
            } else if (i11.f18016v) {
                i11.f18016v = false;
                i11.H(true);
            }
        }
        if ((i10 & 256) != 0 && this.f9416u != null) {
            WeakHashMap weakHashMap = Q.f5546a;
            F.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i9) {
        super.onWindowVisibilityChanged(i9);
        this.f9398b = i9;
        InterfaceC1789d interfaceC1789d = this.f9416u;
        if (interfaceC1789d != null) {
            ((I) interfaceC1789d).f18014t = i9;
        }
    }

    public void setActionBarHideOffset(int i9) {
        h();
        this.f9400d.setTranslationY(-Math.max(0, Math.min(i9, this.f9400d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1789d interfaceC1789d) {
        this.f9416u = interfaceC1789d;
        if (getWindowToken() != null) {
            ((I) this.f9416u).f18014t = this.f9398b;
            int i9 = this.f9407l;
            if (i9 != 0) {
                onWindowSystemUiVisibilityChanged(i9);
                WeakHashMap weakHashMap = Q.f5546a;
                F.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z9) {
        this.f9404h = z9;
    }

    public void setHideOnContentScrollEnabled(boolean z9) {
        if (z9 != this.f9405i) {
            this.f9405i = z9;
            if (!z9) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i9) {
        k();
        C1780Y0 c1780y0 = (C1780Y0) this.f9401e;
        c1780y0.f21931d = i9 != 0 ? AbstractC0485a.q(c1780y0.f21928a.getContext(), i9) : null;
        c1780y0.c();
    }

    public void setLogo(int i9) {
        Drawable drawable;
        k();
        C1780Y0 c1780y0 = (C1780Y0) this.f9401e;
        if (i9 != 0) {
            drawable = AbstractC0485a.q(c1780y0.f21928a.getContext(), i9);
        } else {
            drawable = null;
        }
        c1780y0.f21932e = drawable;
        c1780y0.c();
    }

    public void setOverlayMode(boolean z9) {
        this.f9403g = z9;
    }

    public void setShowingForActionMode(boolean z9) {
    }

    public void setUiOptions(int i9) {
    }

    @Override // p.InterfaceC1792e0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((C1780Y0) this.f9401e).f21937k = callback;
    }

    @Override // p.InterfaceC1792e0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        C1780Y0 c1780y0 = (C1780Y0) this.f9401e;
        if (!c1780y0.f21934g) {
            c1780y0.f21935h = charSequence;
            if ((c1780y0.f21929b & 8) != 0) {
                Toolbar toolbar = c1780y0.f21928a;
                toolbar.setTitle(charSequence);
                if (c1780y0.f21934g) {
                    Q.n(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        C1780Y0 c1780y0 = (C1780Y0) this.f9401e;
        c1780y0.f21931d = drawable;
        c1780y0.c();
    }
}
