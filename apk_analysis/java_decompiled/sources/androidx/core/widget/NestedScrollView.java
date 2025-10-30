package androidx.core.widget;

import F0.Y;
import M4.a;
import P.C0306g;
import P.C0311l;
import P.C0318t;
import P.H;
import P.InterfaceC0310k;
import P.InterfaceC0313n;
import P.Q;
import S.c;
import S.e;
import S.f;
import S.g;
import S.h;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s4.i;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0313n, InterfaceC0310k {

    /* renamed from: C, reason: collision with root package name */
    public static final float f9587C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: D, reason: collision with root package name */
    public static final e f9588D = new e(0);

    /* renamed from: f0, reason: collision with root package name */
    public static final int[] f9589f0 = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public float f9590A;

    /* renamed from: B, reason: collision with root package name */
    public final C0306g f9591B;

    /* renamed from: a, reason: collision with root package name */
    public final float f9592a;

    /* renamed from: b, reason: collision with root package name */
    public long f9593b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f9594c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f9595d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f9596e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f9597f;

    /* renamed from: g, reason: collision with root package name */
    public C0318t f9598g;

    /* renamed from: h, reason: collision with root package name */
    public int f9599h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9600i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public View f9601k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9602l;

    /* renamed from: m, reason: collision with root package name */
    public VelocityTracker f9603m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9604n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9605o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9606p;

    /* renamed from: q, reason: collision with root package name */
    public final int f9607q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9608r;

    /* renamed from: s, reason: collision with root package name */
    public int f9609s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f9610t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f9611u;

    /* renamed from: v, reason: collision with root package name */
    public int f9612v;

    /* renamed from: w, reason: collision with root package name */
    public int f9613w;

    /* renamed from: x, reason: collision with root package name */
    public h f9614x;

    /* renamed from: y, reason: collision with root package name */
    public final Y f9615y;

    /* renamed from: z, reason: collision with root package name */
    public final C0311l f9616z;

    /* JADX WARN: Type inference failed for: r7v2, types: [F0.Y, java.lang.Object] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, co.notix.R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f9594c = new Rect();
        this.f9600i = true;
        this.j = false;
        this.f9601k = null;
        this.f9602l = false;
        this.f9605o = true;
        this.f9609s = -1;
        this.f9610t = new int[2];
        this.f9611u = new int[2];
        this.f9591B = new C0306g(getContext(), new i(this));
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            edgeEffect = c.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f9596e = edgeEffect;
        if (i9 >= 31) {
            edgeEffect2 = c.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f9597f = edgeEffect2;
        this.f9592a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f9595d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f9606p = viewConfiguration.getScaledTouchSlop();
        this.f9607q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9608r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9589f0, co.notix.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f9615y = new Object();
        this.f9616z = new C0311l(this);
        setNestedScrollingEnabled(true);
        Q.m(this, f9588D);
    }

    private C0318t getScrollFeedbackProvider() {
        if (this.f9598g == null) {
            this.f9598g = new C0318t(this);
        }
        return this.f9598g;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view != nestedScrollView) {
            Object parent = view.getParent();
            if ((parent instanceof ViewGroup) && l((View) parent, nestedScrollView)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // P.InterfaceC0312m
    public final void a(View view, View view2, int i9, int i10) {
        Y y9 = this.f9615y;
        if (i10 == 1) {
            y9.f2059b = i9;
        } else {
            y9.f2058a = i9;
        }
        this.f9616z.g(2, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // P.InterfaceC0312m
    public final void b(View view, int i9) {
        Y y9 = this.f9615y;
        if (i9 == 1) {
            y9.f2059b = 0;
        } else {
            y9.f2058a = 0;
        }
        w(i9);
    }

    @Override // P.InterfaceC0312m
    public final void c(View view, int i9, int i10, int[] iArr, int i11) {
        this.f9616z.c(i9, i10, i11, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return (scrollY - max) + bottom;
        }
        return bottom;
    }

    @Override // P.InterfaceC0313n
    public final void d(View view, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        n(i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !i(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f9, float f10, boolean z9) {
        return this.f9616z.a(f9, f10, z9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f9, float f10) {
        return this.f9616z.b(f9, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2) {
        return this.f9616z.c(i9, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr) {
        return this.f9616z.d(i9, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i9;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f9596e;
        int i10 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i9 = getPaddingLeft();
            } else {
                i9 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i9, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f9597f;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i10 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // P.InterfaceC0312m
    public final void e(View view, int i9, int i10, int i11, int i12, int i13) {
        n(i12, i13, null);
    }

    @Override // P.InterfaceC0312m
    public final boolean f(View view, View view2, int i9, int i10) {
        return (i9 & 2) != 0;
    }

    public final boolean g(int i9) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i9);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f9594c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i9);
        } else {
            if (i9 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i9 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i9 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Y y9 = this.f9615y;
        return y9.f2059b | y9.f2058a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f9590A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.f9590A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f9590A;
    }

    public final int h(Rect rect) {
        int i9;
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i9 = i12 - verticalFadingEdgeLength;
        } else {
            i9 = i12;
        }
        int i13 = rect.bottom;
        if (i13 > i9 && rect.top > scrollY) {
            if (rect.height() > height) {
                i11 = rect.top - scrollY;
            } else {
                i11 = rect.bottom - i9;
            }
            return Math.min(i11, (childAt.getBottom() + layoutParams.bottomMargin) - i12);
        }
        if (rect.top >= scrollY || i13 >= i9) {
            return 0;
        }
        if (rect.height() > height) {
            i10 = 0 - (i9 - rect.bottom);
        } else {
            i10 = 0 - (scrollY - rect.top);
        }
        return Math.max(i10, -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f9616z.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f9594c.setEmpty();
        int i9 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode != 62) {
                                if (keyCode != 92) {
                                    if (keyCode != 93) {
                                        if (keyCode != 122) {
                                            if (keyCode == 123) {
                                                q(130);
                                                return false;
                                            }
                                        } else {
                                            q(33);
                                            return false;
                                        }
                                    } else {
                                        return k(130);
                                    }
                                } else {
                                    return k(33);
                                }
                            } else {
                                if (keyEvent.isShiftPressed()) {
                                    i9 = 33;
                                }
                                q(i9);
                                return false;
                            }
                        } else {
                            if (keyEvent.isAltPressed()) {
                                return k(130);
                            }
                            return g(130);
                        }
                    } else {
                        if (keyEvent.isAltPressed()) {
                            return k(33);
                        }
                        return g(33);
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f9616z.f5617d;
    }

    public final void j(int i9) {
        if (getChildCount() > 0) {
            this.f9595d.fling(getScrollX(), getScrollY(), 0, i9, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f9616z.g(2, 1);
            this.f9613w = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.f9595d.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i9) {
        boolean z9;
        int childCount;
        if (i9 == 130) {
            z9 = true;
        } else {
            z9 = false;
        }
        int height = getHeight();
        Rect rect = this.f9594c;
        rect.top = 0;
        rect.bottom = height;
        if (z9 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i9, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i9, int i10) {
        Rect rect = this.f9594c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i9 >= getScrollY() && rect.top - i9 <= getScrollY() + i10) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i9, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i9, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i9);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f9616z.d(0, scrollY2, 0, i9 - scrollY2, null, i10, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int i9;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9609s) {
            if (actionIndex == 0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            this.f9599h = (int) motionEvent.getY(i9);
            this.f9609s = motionEvent.getPointerId(i9);
            VelocityTracker velocityTracker = this.f9603m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i9;
        int i10;
        float f9;
        if (motionEvent.getAction() == 8 && !this.f9602l) {
            if (AbstractC1002u1.J(motionEvent, 2)) {
                f9 = motionEvent.getAxisValue(9);
                i9 = 9;
                i10 = (int) motionEvent.getX();
            } else if (AbstractC1002u1.J(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i10 = getWidth() / 2;
                i9 = 26;
                f9 = axisValue;
            } else {
                i9 = 0;
                i10 = 0;
                f9 = 0.0f;
            }
            if (f9 != 0.0f) {
                s(-((int) (getVerticalScrollFactorCompat() * f9)), i9, motionEvent, i10, 1, AbstractC1002u1.J(motionEvent, 8194));
                if (i9 != 0) {
                    this.f9591B.a(motionEvent, i9);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z9 = true;
        if (action == 2 && this.f9602l) {
            return true;
        }
        int i9 = action & 255;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 6) {
                            o(motionEvent);
                        }
                    }
                } else {
                    int i10 = this.f9609s;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i10 + " in onInterceptTouchEvent");
                        } else {
                            int y9 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y9 - this.f9599h) > this.f9606p && (2 & getNestedScrollAxes()) == 0) {
                                this.f9602l = true;
                                this.f9599h = y9;
                                if (this.f9603m == null) {
                                    this.f9603m = VelocityTracker.obtain();
                                }
                                this.f9603m.addMovement(motionEvent);
                                this.f9612v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f9602l = false;
            this.f9609s = -1;
            VelocityTracker velocityTracker = this.f9603m;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9603m = null;
            }
            if (this.f9595d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y10 = (int) motionEvent.getY();
            int x5 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 >= childAt.getTop() - scrollY && y10 < childAt.getBottom() - scrollY && x5 >= childAt.getLeft() && x5 < childAt.getRight()) {
                    this.f9599h = y10;
                    this.f9609s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f9603m;
                    if (velocityTracker2 == null) {
                        this.f9603m = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f9603m.addMovement(motionEvent);
                    this.f9595d.computeScrollOffset();
                    if (!v(motionEvent) && this.f9595d.isFinished()) {
                        z9 = false;
                    }
                    this.f9602l = z9;
                    this.f9616z.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.f9595d.isFinished()) {
                z9 = false;
            }
            this.f9602l = z9;
            VelocityTracker velocityTracker3 = this.f9603m;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f9603m = null;
            }
        }
        return this.f9602l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i9, i10, i11, i12);
        int i14 = 0;
        this.f9600i = false;
        View view = this.f9601k;
        if (view != null && l(view, this)) {
            View view2 = this.f9601k;
            Rect rect = this.f9594c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h7 = h(rect);
            if (h7 != 0) {
                scrollBy(0, h7);
            }
        }
        this.f9601k = null;
        if (!this.j) {
            if (this.f9614x != null) {
                scrollTo(getScrollX(), this.f9614x.f6694a);
                this.f9614x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i13 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i13 = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i13 && scrollY >= 0) {
                i14 = paddingTop + scrollY > i13 ? i13 - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f9604n && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f9, float f10, boolean z9) {
        if (!z9) {
            dispatchNestedFling(0.0f, f10, true);
            j((int) f10);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return this.f9616z.b(f9, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        this.f9616z.c(i9, i10, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        n(i12, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        a(view, view2, i9, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i9, int i10, boolean z9, boolean z10) {
        super.scrollTo(i9, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i9, Rect rect) {
        View findNextFocusFromRect;
        if (i9 == 2) {
            i9 = 130;
        } else if (i9 == 1) {
            i9 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i9);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i9);
        }
        if (findNextFocusFromRect == null || !m(findNextFocusFromRect, 0, getHeight())) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i9, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        this.f9614x = hVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, S.h] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f6694a = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m(findFocus, 0, i12)) {
            Rect rect = this.f9594c;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h7 = h(rect);
            if (h7 != 0) {
                if (this.f9605o) {
                    u(0, h7, false);
                } else {
                    scrollBy(0, h7);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        return f(view, view2, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i9, int i10, int i11, int i12) {
        int i13;
        boolean z9;
        int i14;
        boolean z10;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i15 = i11 + i9;
        if (i10 > 0 || i10 < 0) {
            i13 = 0;
            z9 = true;
        } else {
            i13 = i10;
            z9 = false;
        }
        if (i15 > i12) {
            i14 = i12;
        } else if (i15 < 0) {
            i14 = 0;
        } else {
            i14 = i15;
            z10 = false;
            if (z10 && !this.f9616z.f(1)) {
                this.f9595d.springBack(i13, i14, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i13, i14);
            if (!z9 || z10) {
                return true;
            }
            return false;
        }
        z10 = true;
        if (z10) {
            this.f9595d.springBack(i13, i14, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i13, i14);
        if (!z9) {
        }
        return true;
    }

    public final void q(int i9) {
        boolean z9;
        if (i9 == 130) {
            z9 = true;
        } else {
            z9 = false;
        }
        int height = getHeight();
        Rect rect = this.f9594c;
        if (z9) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i10 = rect.top;
        int i11 = height + i10;
        rect.bottom = i11;
        r(i9, i10, i11);
    }

    public final boolean r(int i9, int i10, int i11) {
        boolean z9;
        View view;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        if (i9 == 33) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view2 = null;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view3 = focusables.get(i14);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i10 < bottom && top < i11) {
                if (i10 < top && bottom < i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (view2 == null) {
                    view2 = view3;
                    z13 = z11;
                } else {
                    if ((z9 && top < view2.getTop()) || (!z9 && bottom > view2.getBottom())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z13) {
                        if (z11) {
                            if (!z12) {
                            }
                            view2 = view3;
                        }
                    } else if (z11) {
                        view2 = view3;
                        z13 = true;
                    } else {
                        if (!z12) {
                        }
                        view2 = view3;
                    }
                }
            }
        }
        if (view2 == null) {
            view = this;
        } else {
            view = view2;
        }
        if (i10 >= scrollY && i11 <= i13) {
            z10 = false;
        } else {
            if (z9) {
                i12 = i10 - scrollY;
            } else {
                i12 = i11 - i13;
            }
            s(i12, -1, null, 0, 1, true);
            z10 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i9);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f9600i) {
            Rect rect = this.f9594c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h7 = h(rect);
            if (h7 != 0) {
                scrollBy(0, h7);
            }
        } else {
            this.f9601k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        boolean z10;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h7 = h(rect);
        if (h7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (z9) {
                scrollBy(0, h7);
                return z10;
            }
            u(0, h7, false);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        VelocityTracker velocityTracker;
        if (z9 && (velocityTracker = this.f9603m) != null) {
            velocityTracker.recycle();
            this.f9603m = null;
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f9600i = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(int r21, int r22, android.view.MotionEvent r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.s(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    @Override // android.view.View
    public final void scrollTo(int i9, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i9 >= 0) {
                if (width + i9 > width2) {
                    i9 = width2 - width;
                }
            } else {
                i9 = 0;
            }
            if (height < height2 && i10 >= 0) {
                if (height + i10 > height2) {
                    i10 = height2 - height;
                }
            } else {
                i10 = 0;
            }
            if (i9 != getScrollX() || i10 != getScrollY()) {
                super.scrollTo(i9, i10);
            }
        }
    }

    public void setFillViewport(boolean z9) {
        if (z9 != this.f9604n) {
            this.f9604n = z9;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        C0311l c0311l = this.f9616z;
        if (c0311l.f5617d) {
            WeakHashMap weakHashMap = Q.f5546a;
            H.m(c0311l.f5616c);
        }
        c0311l.f5617d = z9;
    }

    public void setSmoothScrollingEnabled(boolean z9) {
        this.f9605o = z9;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i9) {
        return this.f9616z.g(i9, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i9) {
        if (i9 > 0) {
            return true;
        }
        float p9 = a.p(edgeEffect) * getHeight();
        float abs = Math.abs(-i9) * 0.35f;
        float f9 = this.f9592a * 0.015f;
        double log = Math.log(abs / f9);
        double d9 = f9587C;
        if (((float) (Math.exp((d9 / (d9 - 1.0d)) * log) * f9)) < p9) {
            return true;
        }
        return false;
    }

    public final void u(int i9, int i10, boolean z9) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f9593b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f9595d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z9) {
                this.f9616z.g(2, 1);
            } else {
                w(1);
            }
            this.f9613w = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f9595d.isFinished()) {
                this.f9595d.abortAnimation();
                w(1);
            }
            scrollBy(i9, i10);
        }
        this.f9593b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z9;
        EdgeEffect edgeEffect = this.f9596e;
        if (a.p(edgeEffect) != 0.0f) {
            a.v(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z9 = true;
        } else {
            z9 = false;
        }
        EdgeEffect edgeEffect2 = this.f9597f;
        if (a.p(edgeEffect2) != 0.0f) {
            a.v(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z9;
    }

    public final void w(int i9) {
        this.f9616z.h(i9);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9) {
        if (getChildCount() <= 0) {
            super.addView(view, i9);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i9, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(g gVar) {
    }
}
