package androidx.coordinatorlayout.widget;

import A.a;
import B.b;
import B.c;
import B.e;
import B.f;
import B.g;
import B.i;
import B.j;
import B.k;
import F0.Y;
import O.d;
import P.F;
import P.H;
import P.InterfaceC0312m;
import P.InterfaceC0313n;
import P.Q;
import P.u0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b7.C0701c;
import co.notix.R;
import com.google.firebase.messaging.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import s.C1939i;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0312m, InterfaceC0313n {

    /* renamed from: t, reason: collision with root package name */
    public static final String f9542t;

    /* renamed from: u, reason: collision with root package name */
    public static final Class[] f9543u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f9544v;

    /* renamed from: w, reason: collision with root package name */
    public static final j f9545w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f9546x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9547a;

    /* renamed from: b, reason: collision with root package name */
    public final s f9548b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9549c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9550d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f9551e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f9552f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9553g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9554h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f9555i;
    public View j;

    /* renamed from: k, reason: collision with root package name */
    public View f9556k;

    /* renamed from: l, reason: collision with root package name */
    public g f9557l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9558m;

    /* renamed from: n, reason: collision with root package name */
    public u0 f9559n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9560o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f9561p;

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f9562q;

    /* renamed from: r, reason: collision with root package name */
    public C0701c f9563r;

    /* renamed from: s, reason: collision with root package name */
    public final Y f9564s;

    static {
        String str;
        int i9 = 0;
        Package r1 = CoordinatorLayout.class.getPackage();
        if (r1 != null) {
            str = r1.getName();
        } else {
            str = null;
        }
        f9542t = str;
        f9545w = new j(i9);
        f9543u = new Class[]{Context.class, AttributeSet.class};
        f9544v = new ThreadLocal();
        f9546x = new d(12);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [F0.Y, java.lang.Object] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f9547a = new ArrayList();
        this.f9548b = new s(1);
        this.f9549c = new ArrayList();
        this.f9550d = new ArrayList();
        this.f9551e = new int[2];
        this.f9552f = new int[2];
        this.f9564s = new Object();
        int[] iArr = a.f0a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f9555i = intArray;
            float f9 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i9 = 0; i9 < length; i9++) {
                this.f9555i[i9] = (int) (r2[i9] * f9);
            }
        }
        this.f9561p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new e(this));
        WeakHashMap weakHashMap = Q.f5546a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f9546x.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i9, Rect rect, Rect rect2, f fVar, int i10, int i11) {
        int width;
        int height;
        int i12 = fVar.f569c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i9);
        int i13 = fVar.f570d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i9);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        if (i16 != 1) {
            if (i16 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i17 != 16) {
            if (i17 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i14 != 1) {
            if (i14 != 5) {
                width -= i10;
            }
        } else {
            width -= i10 / 2;
        }
        if (i15 != 16) {
            if (i15 != 80) {
                height -= i11;
            }
        } else {
            height -= i11 / 2;
        }
        rect2.set(width, height, i10 + width, i11 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f n(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f568b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
                fVar.f568b = true;
                return fVar;
            }
            B.d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (B.d) cls.getAnnotation(B.d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.b((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e8) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e8);
                }
            }
            fVar.f568b = true;
        }
        return fVar;
    }

    public static void v(View view, int i9) {
        f fVar = (f) view.getLayoutParams();
        int i10 = fVar.f575i;
        if (i10 != i9) {
            WeakHashMap weakHashMap = Q.f5546a;
            view.offsetLeftAndRight(i9 - i10);
            fVar.f575i = i9;
        }
    }

    public static void w(View view, int i9) {
        f fVar = (f) view.getLayoutParams();
        int i10 = fVar.j;
        if (i10 != i9) {
            WeakHashMap weakHashMap = Q.f5546a;
            view.offsetTopAndBottom(i9 - i10);
            fVar.j = i9;
        }
    }

    @Override // P.InterfaceC0312m
    public final void a(View view, View view2, int i9, int i10) {
        Y y9 = this.f9564s;
        if (i10 == 1) {
            y9.f2059b = i9;
        } else {
            y9.f2058a = i9;
        }
        this.f9556k = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    @Override // P.InterfaceC0312m
    public final void b(View view, int i9) {
        Y y9 = this.f9564s;
        if (i9 == 1) {
            y9.f2059b = 0;
        } else {
            y9.f2058a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i9)) {
                c cVar = fVar.f567a;
                if (cVar != null) {
                    cVar.u(this, childAt, view, i9);
                }
                if (i9 != 0) {
                    if (i9 == 1) {
                        fVar.f579n = false;
                    }
                } else {
                    fVar.f578m = false;
                }
                fVar.f580o = false;
            }
        }
        this.f9556k = null;
    }

    @Override // P.InterfaceC0312m
    public final void c(View view, int i9, int i10, int[] iArr, int i11) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z9 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i11) && (cVar = fVar.f567a) != null) {
                    int[] iArr2 = this.f9551e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.o(this, childAt, view, i9, i10, iArr2, i11);
                    if (i9 > 0) {
                        min = Math.max(i12, iArr2[0]);
                    } else {
                        min = Math.min(i12, iArr2[0]);
                    }
                    i12 = min;
                    if (i10 > 0) {
                        min2 = Math.max(i13, iArr2[1]);
                    } else {
                        min2 = Math.min(i13, iArr2[1]);
                    }
                    i13 = min2;
                    z9 = true;
                }
            }
        }
        iArr[0] = i12;
        iArr[1] = i13;
        if (z9) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // P.InterfaceC0313n
    public final void d(View view, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        boolean z9 = false;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i13) && (cVar = fVar.f567a) != null) {
                    int[] iArr2 = this.f9551e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.p(this, childAt, i10, i11, i12, iArr2);
                    if (i11 > 0) {
                        i14 = Math.max(i14, iArr2[0]);
                    } else {
                        i14 = Math.min(i14, iArr2[0]);
                    }
                    if (i12 > 0) {
                        i15 = Math.max(i15, iArr2[1]);
                    } else {
                        i15 = Math.min(i15, iArr2[1]);
                    }
                    z9 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i14;
        iArr[1] = iArr[1] + i15;
        if (z9) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        c cVar = ((f) view.getLayoutParams()).f567a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z9;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9561p;
        if (drawable != null && drawable.isStateful()) {
            z9 = drawable.setState(drawableState);
        } else {
            z9 = false;
        }
        if (z9) {
            invalidate();
        }
    }

    @Override // P.InterfaceC0312m
    public final void e(View view, int i9, int i10, int i11, int i12, int i13) {
        d(view, i9, i10, i11, i12, 0, this.f9552f);
    }

    @Override // P.InterfaceC0312m
    public final boolean f(View view, View view2, int i9, int i10) {
        View view3;
        int i11;
        int i12;
        int childCount = getChildCount();
        int i13 = 0;
        boolean z9 = false;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                view3 = view;
                i11 = i9;
                i12 = i10;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f567a;
                if (cVar != null) {
                    view3 = view;
                    i11 = i9;
                    i12 = i10;
                    boolean t7 = cVar.t(this, childAt, view3, i11, i12);
                    z9 |= t7;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            fVar.f579n = t7;
                        }
                    } else {
                        fVar.f578m = t7;
                    }
                } else {
                    view3 = view;
                    i11 = i9;
                    i12 = i10;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            fVar.f579n = false;
                        }
                    } else {
                        fVar.f578m = false;
                    }
                }
            }
            i13++;
            view = view3;
            i9 = i11;
            i10 = i12;
        }
        return z9;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.f9547a);
    }

    public final u0 getLastWindowInsets() {
        return this.f9559n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Y y9 = this.f9564s;
        return y9.f2059b | y9.f2058a;
    }

    public Drawable getStatusBarBackground() {
        return this.f9561p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(f fVar, Rect rect, int i9, int i10) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i9) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i9 + max, i10 + max2);
    }

    public final void i(View view, Rect rect, boolean z9) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z9) {
                k(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList j(View view) {
        C1939i c1939i = (C1939i) this.f9548b.f16505c;
        int i9 = c1939i.f22660c;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i9; i10++) {
            ArrayList arrayList2 = (ArrayList) c1939i.i(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1939i.f(i10));
            }
        }
        ArrayList arrayList3 = this.f9550d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = k.f586a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = k.f586a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        k.a(this, view, matrix);
        ThreadLocal threadLocal3 = k.f587b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i9) {
        int[] iArr = this.f9555i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i9);
            return 0;
        }
        if (i9 >= 0 && i9 < iArr.length) {
            return iArr[i9];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i9 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i9, int i10) {
        d dVar = f9546x;
        Rect g9 = g();
        k(view, g9);
        try {
            return g9.contains(i9, i10);
        } finally {
            g9.setEmpty();
            dVar.c(g9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.f9558m) {
            if (this.f9557l == null) {
                this.f9557l = new g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f9557l);
        }
        if (this.f9559n == null) {
            WeakHashMap weakHashMap = Q.f5546a;
            if (getFitsSystemWindows()) {
                F.c(this);
            }
        }
        this.f9554h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.f9558m && this.f9557l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f9557l);
        }
        View view = this.f9556k;
        if (view != null) {
            b(view, 0);
        }
        this.f9554h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        super.onDraw(canvas);
        if (this.f9560o && this.f9561p != null) {
            u0 u0Var = this.f9559n;
            if (u0Var != null) {
                i9 = u0Var.d();
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                this.f9561p.setBounds(0, 0, getWidth(), i9);
                this.f9561p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean s9 = s(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return s9;
        }
        u(true);
        return s9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        c cVar;
        WeakHashMap weakHashMap = Q.f5546a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f9547a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f567a) == null || !cVar.l(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f9, float f10, boolean z9) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f567a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        c cVar;
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f567a) != null) {
                    z9 |= cVar.n(view);
                }
            }
        }
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        c(view, i9, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        e(view, i9, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        a(view, view2, i9, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f7246a);
        SparseArray sparseArray = iVar.f584c;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int id = childAt.getId();
            c cVar = n(childAt).f567a;
            if (id != -1 && cVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cVar.r(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, U.b, B.i] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable s9;
        ?? bVar = new U.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f567a;
            if (id != -1 && cVar != null && (s9 = cVar.s(childAt)) != null) {
                sparseArray.append(id, s9);
            }
        }
        bVar.f584c = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        return f(view, view2, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.s(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            B.f r6 = (B.f) r6
            B.c r6 = r6.f567a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.j
            boolean r6 = r6.v(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.u(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0291 A[EDGE_INSN: B:133:0x0291->B:105:0x0291 BREAK  A[LOOP:2: B:110:0x02a9->B:121:0x02e5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r26) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i9) {
        Rect g9;
        Rect g10;
        int i10;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f576k;
        if (view2 == null && fVar.f572f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = f9546x;
        if (view2 != null) {
            g9 = g();
            g10 = g();
            try {
                k(view2, g9);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i9, g9, g10, fVar2, measuredWidth, measuredHeight);
                h(fVar2, g10, measuredWidth, measuredHeight);
                view.layout(g10.left, g10.top, g10.right, g10.bottom);
                return;
            } finally {
                g9.setEmpty();
                dVar.c(g9);
                g10.setEmpty();
                dVar.c(g10);
            }
        }
        int i11 = fVar.f571e;
        if (i11 >= 0) {
            f fVar3 = (f) view.getLayoutParams();
            int i12 = fVar3.f569c;
            if (i12 == 0) {
                i12 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i12, i9);
            int i13 = absoluteGravity & 7;
            int i14 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i9 == 1) {
                i11 = width - i11;
            }
            int m9 = m(i11) - measuredWidth2;
            if (i13 != 1) {
                if (i13 == 5) {
                    m9 += measuredWidth2;
                }
            } else {
                m9 += measuredWidth2 / 2;
            }
            if (i14 != 16) {
                if (i14 != 80) {
                    i10 = 0;
                } else {
                    i10 = measuredHeight2;
                }
            } else {
                i10 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, Math.min(m9, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        g9 = g();
        g9.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
        if (this.f9559n != null) {
            WeakHashMap weakHashMap = Q.f5546a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                g9.left = this.f9559n.b() + g9.left;
                g9.top = this.f9559n.d() + g9.top;
                g9.right -= this.f9559n.c();
                g9.bottom -= this.f9559n.a();
            }
        }
        g10 = g();
        int i15 = fVar4.f569c;
        if ((i15 & 7) == 0) {
            i15 |= 8388611;
        }
        if ((i15 & 112) == 0) {
            i15 |= 48;
        }
        Gravity.apply(i15, view.getMeasuredWidth(), view.getMeasuredHeight(), g9, g10, i9);
        view.layout(g10.left, g10.top, g10.right, g10.bottom);
    }

    public final void r(int i9, int i10, int i11, View view) {
        measureChildWithMargins(view, i9, i10, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        c cVar = ((f) view.getLayoutParams()).f567a;
        if (cVar != null && cVar.q(this, view, rect, z9)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (z9 && !this.f9553g) {
            u(false);
            this.f9553g = true;
        }
    }

    public final boolean s(MotionEvent motionEvent, int i9) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f9549c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            if (isChildrenDrawingOrderEnabled) {
                i10 = getChildDrawingOrder(childCount, i11);
            } else {
                i10 = i11;
            }
            arrayList.add(getChildAt(i10));
        }
        j jVar = f9545w;
        if (jVar != null) {
            Collections.sort(arrayList, jVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z9 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            c cVar = ((f) view.getLayoutParams()).f567a;
            if (z9 && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i9 != 0) {
                        if (i9 == 1) {
                            cVar.v(this, view, motionEvent2);
                        }
                    } else {
                        cVar.k(this, view, motionEvent2);
                    }
                }
            } else if (!z9 && cVar != null) {
                if (i9 != 0) {
                    if (i9 == 1) {
                        z9 = cVar.v(this, view, motionEvent);
                    }
                } else {
                    z9 = cVar.k(this, view, motionEvent);
                }
                if (z9) {
                    this.j = view;
                }
            }
        }
        arrayList.clear();
        return z9;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z9) {
        super.setFitsSystemWindows(z9);
        x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9562q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z9;
        Drawable drawable2 = this.f9561p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f9561p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f9561p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f9561p;
                WeakHashMap weakHashMap = Q.f5546a;
                drawable4.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.f9561p;
                if (getVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                drawable5.setVisible(z9, false);
                this.f9561p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = Q.f5546a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i9) {
        setStatusBarBackground(new ColorDrawable(i9));
    }

    public void setStatusBarBackgroundResource(int i9) {
        Drawable drawable;
        if (i9 != 0) {
            drawable = getContext().getDrawable(i9);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
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
        Drawable drawable = this.f9561p;
        if (drawable != null && drawable.isVisible() != z9) {
            this.f9561p.setVisible(z9, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r8.f574h, r12) & r13) == r13) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0146, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    public final void u(boolean z9) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            c cVar = ((f) childAt.getLayoutParams()).f567a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z9) {
                    cVar.k(this, childAt, obtain);
                } else {
                    cVar.v(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).getClass();
        }
        this.j = null;
        this.f9553g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f9561p) {
            return false;
        }
        return true;
    }

    public final void x() {
        WeakHashMap weakHashMap = Q.f5546a;
        if (getFitsSystemWindows()) {
            if (this.f9563r == null) {
                this.f9563r = new C0701c(2, this);
            }
            H.l(this, this.f9563r);
            setSystemUiVisibility(1280);
            return;
        }
        H.l(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }
}
