package androidx.swiperefreshlayout.widget;

import F0.Y;
import P.C0311l;
import P.H;
import P.InterfaceC0310k;
import P.InterfaceC0312m;
import P.InterfaceC0313n;
import P.Q;
import V0.a;
import V0.d;
import V0.e;
import V0.f;
import V0.g;
import V0.h;
import V0.i;
import V0.j;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.mediarouter.app.C0575k;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC0313n, InterfaceC0312m, InterfaceC0310k {

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f10355l0 = {R.attr.enabled};

    /* renamed from: A, reason: collision with root package name */
    public g f10356A;

    /* renamed from: B, reason: collision with root package name */
    public g f10357B;

    /* renamed from: C, reason: collision with root package name */
    public C0575k f10358C;

    /* renamed from: D, reason: collision with root package name */
    public C0575k f10359D;

    /* renamed from: a, reason: collision with root package name */
    public View f10360a;

    /* renamed from: b, reason: collision with root package name */
    public i f10361b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10362c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10363d;

    /* renamed from: e, reason: collision with root package name */
    public float f10364e;

    /* renamed from: f, reason: collision with root package name */
    public float f10365f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f10366f0;

    /* renamed from: g, reason: collision with root package name */
    public final Y f10367g;

    /* renamed from: g0, reason: collision with root package name */
    public int f10368g0;

    /* renamed from: h, reason: collision with root package name */
    public final C0311l f10369h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f10370h0;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f10371i;

    /* renamed from: i0, reason: collision with root package name */
    public final f f10372i0;
    public final int[] j;

    /* renamed from: j0, reason: collision with root package name */
    public final g f10373j0;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f10374k;

    /* renamed from: k0, reason: collision with root package name */
    public final g f10375k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10376l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10377m;

    /* renamed from: n, reason: collision with root package name */
    public int f10378n;

    /* renamed from: o, reason: collision with root package name */
    public float f10379o;

    /* renamed from: p, reason: collision with root package name */
    public float f10380p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10381q;

    /* renamed from: r, reason: collision with root package name */
    public int f10382r;

    /* renamed from: s, reason: collision with root package name */
    public final DecelerateInterpolator f10383s;

    /* renamed from: t, reason: collision with root package name */
    public final a f10384t;

    /* renamed from: u, reason: collision with root package name */
    public int f10385u;

    /* renamed from: v, reason: collision with root package name */
    public int f10386v;

    /* renamed from: w, reason: collision with root package name */
    public final int f10387w;

    /* renamed from: x, reason: collision with root package name */
    public final int f10388x;

    /* renamed from: y, reason: collision with root package name */
    public int f10389y;

    /* renamed from: z, reason: collision with root package name */
    public final e f10390z;

    /* JADX WARN: Type inference failed for: r1v14, types: [F0.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.widget.ImageView, android.view.View, V0.a] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10362c = false;
        this.f10364e = -1.0f;
        this.f10371i = new int[2];
        this.j = new int[2];
        this.f10374k = new int[2];
        this.f10382r = -1;
        this.f10385u = -1;
        this.f10372i0 = new f(this, 0);
        this.f10373j0 = new g(this, 2);
        this.f10375k0 = new g(this, 3);
        this.f10363d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f10377m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f10383s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f10368g0 = (int) (displayMetrics.density * 40.0f);
        ?? imageView = new ImageView(getContext());
        float f9 = imageView.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(U0.a.f7247a);
        imageView.f7578b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = Q.f5546a;
        H.k(imageView, f9 * 4.0f);
        shapeDrawable.getPaint().setColor(imageView.f7578b);
        imageView.setBackground(shapeDrawable);
        this.f10384t = imageView;
        e eVar = new e(getContext());
        this.f10390z = eVar;
        eVar.c(1);
        this.f10384t.setImageDrawable(this.f10390z);
        this.f10384t.setVisibility(8);
        addView(this.f10384t);
        setChildrenDrawingOrderEnabled(true);
        int i9 = (int) (displayMetrics.density * 64.0f);
        this.f10388x = i9;
        this.f10364e = i9;
        this.f10367g = new Object();
        this.f10369h = new C0311l(this);
        setNestedScrollingEnabled(true);
        int i10 = -this.f10368g0;
        this.f10378n = i10;
        this.f10387w = i10;
        k(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f10355l0);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i9) {
        this.f10384t.getBackground().setAlpha(i9);
        this.f10390z.setAlpha(i9);
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
        if (i11 == 0) {
            onNestedPreScroll(view, i9, i10, iArr);
        }
    }

    @Override // P.InterfaceC0313n
    public final void d(View view, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        if (i13 == 0) {
            int i15 = iArr[1];
            if (i13 == 0) {
                this.f10369h.d(i9, i10, i11, i12, this.j, i13, iArr);
            }
            int i16 = i12 - (iArr[1] - i15);
            if (i16 == 0) {
                i14 = i12 + this.j[1];
            } else {
                i14 = i16;
            }
            if (i14 < 0 && !g()) {
                float abs = this.f10365f + Math.abs(i14);
                this.f10365f = abs;
                j(abs);
                iArr[1] = iArr[1] + i16;
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f9, float f10, boolean z9) {
        return this.f10369h.a(f9, f10, z9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f9, float f10) {
        return this.f10369h.b(f9, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2) {
        return this.f10369h.c(i9, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr) {
        return this.f10369h.d(i9, i10, i11, i12, iArr, 0, null);
    }

    @Override // P.InterfaceC0312m
    public final void e(View view, int i9, int i10, int i11, int i12, int i13) {
        d(view, i9, i10, i11, i12, i13, this.f10374k);
    }

    @Override // P.InterfaceC0312m
    public final boolean f(View view, View view2, int i9, int i10) {
        if (i10 == 0) {
            return onStartNestedScroll(view, view2, i9);
        }
        return false;
    }

    public final boolean g() {
        View view = this.f10360a;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i9, int i10) {
        int i11 = this.f10385u;
        if (i11 >= 0) {
            if (i10 == i9 - 1) {
                return i11;
            }
            if (i10 >= i11) {
                return i10 + 1;
            }
            return i10;
        }
        return i10;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Y y9 = this.f10367g;
        return y9.f2059b | y9.f2058a;
    }

    public int getProgressCircleDiameter() {
        return this.f10368g0;
    }

    public int getProgressViewEndOffset() {
        return this.f10388x;
    }

    public int getProgressViewStartOffset() {
        return this.f10387w;
    }

    public final void h() {
        if (this.f10360a == null) {
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (!childAt.equals(this.f10384t)) {
                    this.f10360a = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f10369h.f(0);
    }

    public final void i(float f9) {
        if (f9 > this.f10364e) {
            m(true, true);
            return;
        }
        this.f10362c = false;
        e eVar = this.f10390z;
        d dVar = eVar.f7606a;
        dVar.f7587e = 0.0f;
        dVar.f7588f = 0.0f;
        eVar.invalidateSelf();
        f fVar = new f(this, 1);
        this.f10386v = this.f10378n;
        g gVar = this.f10375k0;
        gVar.reset();
        gVar.setDuration(200L);
        gVar.setInterpolator(this.f10383s);
        a aVar = this.f10384t;
        aVar.f7577a = fVar;
        aVar.clearAnimation();
        this.f10384t.startAnimation(gVar);
        e eVar2 = this.f10390z;
        d dVar2 = eVar2.f7606a;
        if (dVar2.f7595n) {
            dVar2.f7595n = false;
        }
        eVar2.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f10369h.f5617d;
    }

    public final void j(float f9) {
        C0575k c0575k;
        C0575k c0575k2;
        e eVar = this.f10390z;
        d dVar = eVar.f7606a;
        if (!dVar.f7595n) {
            dVar.f7595n = true;
        }
        eVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f9 / this.f10364e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f9) - this.f10364e;
        int i9 = this.f10389y;
        if (i9 <= 0) {
            i9 = this.f10388x;
        }
        float f10 = i9;
        double max2 = Math.max(0.0f, Math.min(abs, f10 * 2.0f) / f10) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i10 = this.f10387w + ((int) ((f10 * min) + (f10 * pow * 2.0f)));
        if (this.f10384t.getVisibility() != 0) {
            this.f10384t.setVisibility(0);
        }
        this.f10384t.setScaleX(1.0f);
        this.f10384t.setScaleY(1.0f);
        if (f9 < this.f10364e) {
            if (this.f10390z.f7606a.f7601t > 76 && ((c0575k2 = this.f10358C) == null || !c0575k2.hasStarted() || c0575k2.hasEnded())) {
                C0575k c0575k3 = new C0575k(this, this.f10390z.f7606a.f7601t, 76);
                c0575k3.setDuration(300L);
                a aVar = this.f10384t;
                aVar.f7577a = null;
                aVar.clearAnimation();
                this.f10384t.startAnimation(c0575k3);
                this.f10358C = c0575k3;
            }
        } else if (this.f10390z.f7606a.f7601t < 255 && ((c0575k = this.f10359D) == null || !c0575k.hasStarted() || c0575k.hasEnded())) {
            C0575k c0575k4 = new C0575k(this, this.f10390z.f7606a.f7601t, 255);
            c0575k4.setDuration(300L);
            a aVar2 = this.f10384t;
            aVar2.f7577a = null;
            aVar2.clearAnimation();
            this.f10384t.startAnimation(c0575k4);
            this.f10359D = c0575k4;
        }
        e eVar2 = this.f10390z;
        float min2 = Math.min(0.8f, max * 0.8f);
        d dVar2 = eVar2.f7606a;
        dVar2.f7587e = 0.0f;
        dVar2.f7588f = min2;
        eVar2.invalidateSelf();
        e eVar3 = this.f10390z;
        float min3 = Math.min(1.0f, max);
        d dVar3 = eVar3.f7606a;
        if (min3 != dVar3.f7597p) {
            dVar3.f7597p = min3;
        }
        eVar3.invalidateSelf();
        e eVar4 = this.f10390z;
        eVar4.f7606a.f7589g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i10 - this.f10378n);
    }

    public final void k(float f9) {
        setTargetOffsetTopAndBottom((this.f10386v + ((int) ((this.f10387w - r0) * f9))) - this.f10384t.getTop());
    }

    public final void l() {
        this.f10384t.clearAnimation();
        this.f10390z.stop();
        this.f10384t.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f10387w - this.f10378n);
        this.f10378n = this.f10384t.getTop();
    }

    public final void m(boolean z9, boolean z10) {
        if (this.f10362c != z9) {
            this.f10366f0 = z10;
            h();
            this.f10362c = z9;
            f fVar = this.f10372i0;
            if (z9) {
                this.f10386v = this.f10378n;
                g gVar = this.f10373j0;
                gVar.reset();
                gVar.setDuration(200L);
                gVar.setInterpolator(this.f10383s);
                if (fVar != null) {
                    this.f10384t.f7577a = fVar;
                }
                this.f10384t.clearAnimation();
                this.f10384t.startAnimation(gVar);
                return;
            }
            g gVar2 = new g(this, 1);
            this.f10357B = gVar2;
            gVar2.setDuration(150L);
            a aVar = this.f10384t;
            aVar.f7577a = fVar;
            aVar.clearAnimation();
            this.f10384t.startAnimation(this.f10357B);
        }
    }

    public final void n(float f9) {
        float f10 = this.f10380p;
        float f11 = f9 - f10;
        float f12 = this.f10363d;
        if (f11 > f12 && !this.f10381q) {
            this.f10379o = f10 + f12;
            this.f10381q = true;
            this.f10390z.setAlpha(76);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h();
        int actionMasked = motionEvent.getActionMasked();
        int i9 = 0;
        if (isEnabled() && !g() && !this.f10362c && !this.f10376l) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.f10382r) {
                                    if (actionIndex == 0) {
                                        i9 = 1;
                                    }
                                    this.f10382r = motionEvent.getPointerId(i9);
                                }
                            }
                        }
                    } else {
                        int i10 = this.f10382r;
                        if (i10 == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex >= 0) {
                            n(motionEvent.getY(findPointerIndex));
                        }
                    }
                    return this.f10381q;
                }
                this.f10381q = false;
                this.f10382r = -1;
                return this.f10381q;
            }
            setTargetOffsetTopAndBottom(this.f10387w - this.f10384t.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f10382r = pointerId;
            this.f10381q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.f10380p = motionEvent.getY(findPointerIndex2);
                return this.f10381q;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f10360a == null) {
                h();
            }
            View view = this.f10360a;
            if (view == null) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.f10384t.getMeasuredWidth();
            int measuredHeight2 = this.f10384t.getMeasuredHeight();
            int i13 = measuredWidth / 2;
            int i14 = measuredWidth2 / 2;
            int i15 = this.f10378n;
            this.f10384t.layout(i13 - i14, i15, i13 + i14, measuredHeight2 + i15);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f10360a == null) {
            h();
        }
        View view = this.f10360a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f10384t.measure(View.MeasureSpec.makeMeasureSpec(this.f10368g0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f10368g0, 1073741824));
            this.f10385u = -1;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                if (getChildAt(i11) == this.f10384t) {
                    this.f10385u = i11;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f9, float f10, boolean z9) {
        return this.f10369h.a(f9, f10, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return this.f10369h.b(f9, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        if (i10 > 0) {
            float f9 = this.f10365f;
            if (f9 > 0.0f) {
                float f10 = i10;
                if (f10 > f9) {
                    iArr[1] = (int) f9;
                    this.f10365f = 0.0f;
                } else {
                    this.f10365f = f9 - f10;
                    iArr[1] = i10;
                }
                j(this.f10365f);
            }
        }
        int i11 = i9 - iArr[0];
        int i12 = i10 - iArr[1];
        int[] iArr2 = this.f10371i;
        if (dispatchNestedPreScroll(i11, i12, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        d(view, i9, i10, i11, i12, 0, this.f10374k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i9) {
        this.f10367g.f2058a = i9;
        startNestedScroll(i9 & 2);
        this.f10365f = 0.0f;
        this.f10376l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        setRefreshing(jVar.f7616a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new j(super.onSaveInstanceState(), this.f10362c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i9) {
        if (isEnabled() && !this.f10362c && (i9 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f10367g.f2058a = 0;
        this.f10376l = false;
        float f9 = this.f10365f;
        if (f9 > 0.0f) {
            i(f9);
            this.f10365f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i9 = 0;
        if (isEnabled() && !g() && !this.f10362c && !this.f10376l) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == this.f10382r) {
                                        if (actionIndex == 0) {
                                            i9 = 1;
                                        }
                                        this.f10382r = motionEvent.getPointerId(i9);
                                        return true;
                                    }
                                }
                                return true;
                            }
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (actionIndex2 < 0) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.f10382r = motionEvent.getPointerId(actionIndex2);
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f10382r);
                        if (findPointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        float y9 = motionEvent.getY(findPointerIndex);
                        n(y9);
                        if (this.f10381q) {
                            float f9 = (y9 - this.f10379o) * 0.5f;
                            if (f9 > 0.0f) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                j(f9);
                            }
                        }
                        return true;
                    }
                } else {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.f10382r);
                    if (findPointerIndex2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.f10381q) {
                        float y10 = (motionEvent.getY(findPointerIndex2) - this.f10379o) * 0.5f;
                        this.f10381q = false;
                        i(y10);
                    }
                    this.f10382r = -1;
                    return false;
                }
            } else {
                this.f10382r = motionEvent.getPointerId(0);
                this.f10381q = false;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        ViewParent parent;
        View view = this.f10360a;
        if (view != null) {
            WeakHashMap weakHashMap = Q.f5546a;
            if (!H.h(view)) {
                if (!this.f10370h0 && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(z9);
                    return;
                }
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    public void setAnimationProgress(float f9) {
        this.f10384t.setScaleX(f9);
        this.f10384t.setScaleY(f9);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        h();
        e eVar = this.f10390z;
        d dVar = eVar.f7606a;
        dVar.f7591i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            iArr2[i9] = context.getColor(iArr[i9]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i9) {
        this.f10364e = i9;
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        if (!z9) {
            l();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z9) {
        this.f10370h0 = z9;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        C0311l c0311l = this.f10369h;
        if (c0311l.f5617d) {
            WeakHashMap weakHashMap = Q.f5546a;
            H.m(c0311l.f5616c);
        }
        c0311l.f5617d = z9;
    }

    public void setOnRefreshListener(i iVar) {
        this.f10361b = iVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i9) {
        setProgressBackgroundColorSchemeResource(i9);
    }

    public void setProgressBackgroundColorSchemeColor(int i9) {
        this.f10384t.setBackgroundColor(i9);
    }

    public void setProgressBackgroundColorSchemeResource(int i9) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i9));
    }

    public void setRefreshing(boolean z9) {
        if (z9 && this.f10362c != z9) {
            this.f10362c = z9;
            setTargetOffsetTopAndBottom((this.f10388x + this.f10387w) - this.f10378n);
            this.f10366f0 = false;
            f fVar = this.f10372i0;
            this.f10384t.setVisibility(0);
            this.f10390z.setAlpha(255);
            g gVar = new g(this, 0);
            this.f10356A = gVar;
            gVar.setDuration(this.f10377m);
            if (fVar != null) {
                this.f10384t.f7577a = fVar;
            }
            this.f10384t.clearAnimation();
            this.f10384t.startAnimation(this.f10356A);
            return;
        }
        m(z9, false);
    }

    public void setSize(int i9) {
        if (i9 != 0 && i9 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i9 == 0) {
            this.f10368g0 = (int) (displayMetrics.density * 56.0f);
        } else {
            this.f10368g0 = (int) (displayMetrics.density * 40.0f);
        }
        this.f10384t.setImageDrawable(null);
        this.f10390z.c(i9);
        this.f10384t.setImageDrawable(this.f10390z);
    }

    public void setSlingshotDistance(int i9) {
        this.f10389y = i9;
    }

    public void setTargetOffsetTopAndBottom(int i9) {
        a aVar = this.f10384t;
        aVar.bringToFront();
        WeakHashMap weakHashMap = Q.f5546a;
        aVar.offsetTopAndBottom(i9);
        this.f10378n = aVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i9) {
        return this.f10369h.g(i9, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f10369h.h(0);
    }

    public void setOnChildScrollUpCallback(h hVar) {
    }
}
