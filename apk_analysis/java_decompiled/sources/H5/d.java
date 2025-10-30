package H5;

import A5.t;
import B6.u0;
import D4.s;
import F0.C0118w;
import F5.h;
import F5.l;
import P.Q;
import Y7.y0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.slider.Slider;
import g2.C1205G;
import g5.AbstractC1254a;
import h5.AbstractC1281a;
import i.G;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o2.C1686m;
import u0.z;
import w.AbstractC2128h;
import w5.AbstractC2144d;
import w5.m;
import w5.p;

/* loaded from: classes.dex */
public abstract class d extends View {

    /* renamed from: A, reason: collision with root package name */
    public int f3119A;

    /* renamed from: A0, reason: collision with root package name */
    public int f3120A0;

    /* renamed from: B, reason: collision with root package name */
    public int f3121B;

    /* renamed from: B0, reason: collision with root package name */
    public int f3122B0;

    /* renamed from: C, reason: collision with root package name */
    public int f3123C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f3124C0;

    /* renamed from: D, reason: collision with root package name */
    public int f3125D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f3126D0;

    /* renamed from: E0, reason: collision with root package name */
    public ColorStateList f3127E0;

    /* renamed from: F0, reason: collision with root package name */
    public ColorStateList f3128F0;

    /* renamed from: G0, reason: collision with root package name */
    public ColorStateList f3129G0;

    /* renamed from: H0, reason: collision with root package name */
    public ColorStateList f3130H0;

    /* renamed from: I0, reason: collision with root package name */
    public ColorStateList f3131I0;

    /* renamed from: J0, reason: collision with root package name */
    public final Path f3132J0;

    /* renamed from: K0, reason: collision with root package name */
    public final RectF f3133K0;

    /* renamed from: L0, reason: collision with root package name */
    public final RectF f3134L0;

    /* renamed from: M0, reason: collision with root package name */
    public final h f3135M0;

    /* renamed from: N0, reason: collision with root package name */
    public Drawable f3136N0;

    /* renamed from: O0, reason: collision with root package name */
    public List f3137O0;

    /* renamed from: P0, reason: collision with root package name */
    public float f3138P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3139Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final a f3140R0;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3141a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3142b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f3143c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f3144d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f3145e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f3146f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3147f0;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f3148g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3149g0;

    /* renamed from: h, reason: collision with root package name */
    public final b f3150h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3151h0;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManager f3152i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3153i0;
    public s j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3154j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f3155k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3156k0;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3157l;

    /* renamed from: l0, reason: collision with root package name */
    public int f3158l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3159m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3160m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3161n;

    /* renamed from: n0, reason: collision with root package name */
    public final int f3162n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3163o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3164o0;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f3165p;

    /* renamed from: p0, reason: collision with root package name */
    public MotionEvent f3166p0;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f3167q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f3168q0;

    /* renamed from: r, reason: collision with root package name */
    public final int f3169r;
    public float r0;

    /* renamed from: s, reason: collision with root package name */
    public final int f3170s;

    /* renamed from: s0, reason: collision with root package name */
    public float f3171s0;

    /* renamed from: t, reason: collision with root package name */
    public final int f3172t;

    /* renamed from: t0, reason: collision with root package name */
    public ArrayList f3173t0;

    /* renamed from: u, reason: collision with root package name */
    public final int f3174u;

    /* renamed from: u0, reason: collision with root package name */
    public int f3175u0;

    /* renamed from: v, reason: collision with root package name */
    public final int f3176v;

    /* renamed from: v0, reason: collision with root package name */
    public int f3177v0;

    /* renamed from: w, reason: collision with root package name */
    public final int f3178w;

    /* renamed from: w0, reason: collision with root package name */
    public float f3179w0;

    /* renamed from: x, reason: collision with root package name */
    public final int f3180x;

    /* renamed from: x0, reason: collision with root package name */
    public float[] f3181x0;

    /* renamed from: y, reason: collision with root package name */
    public final int f3182y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3183y0;

    /* renamed from: z, reason: collision with root package name */
    public final int f3184z;

    /* renamed from: z0, reason: collision with root package name */
    public int f3185z0;

    /* JADX WARN: Type inference failed for: r1v5, types: [H5.a] */
    public d(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider), attributeSet, R.attr.sliderStyle);
        int i9;
        int i10;
        this.f3157l = new ArrayList();
        this.f3159m = new ArrayList();
        this.f3161n = new ArrayList();
        this.f3163o = false;
        this.f3154j0 = -1;
        this.f3156k0 = -1;
        this.f3168q0 = false;
        this.f3173t0 = new ArrayList();
        this.f3175u0 = -1;
        this.f3177v0 = -1;
        this.f3179w0 = 0.0f;
        this.f3183y0 = true;
        this.f3124C0 = false;
        this.f3132J0 = new Path();
        this.f3133K0 = new RectF();
        this.f3134L0 = new RectF();
        h hVar = new h();
        this.f3135M0 = hVar;
        this.f3137O0 = Collections.EMPTY_LIST;
        this.f3139Q0 = 0;
        final Slider slider = (Slider) this;
        this.f3140R0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: H5.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Slider.this.x();
            }
        };
        Context context2 = getContext();
        this.f3141a = new Paint();
        this.f3142b = new Paint();
        Paint paint = new Paint(1);
        this.f3143c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f3144d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f3145e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f3146f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f3148g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.f3184z = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f3170s = dimensionPixelOffset;
        this.f3125D = dimensionPixelOffset;
        this.f3172t = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f3174u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f3176v = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f3178w = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f3180x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.f3162n0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        int[] iArr = AbstractC1254a.f17726L;
        p.a(context2, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        p.b(context2, attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        this.f3155k = obtainStyledAttributes.getResourceId(8, R.style.Widget_MaterialComponents_Tooltip);
        this.r0 = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f3171s0 = obtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.r0));
        this.f3179w0 = obtainStyledAttributes.getFloat(2, 0.0f);
        this.f3182y = (int) Math.ceil(obtainStyledAttributes.getDimension(9, (float) Math.ceil(p.e(getContext(), 48))));
        boolean hasValue = obtainStyledAttributes.hasValue(24);
        if (hasValue) {
            i9 = 24;
        } else {
            i9 = 26;
        }
        int i11 = hasValue ? 24 : 25;
        ColorStateList p9 = D1.p(context2, obtainStyledAttributes, i9);
        setTrackInactiveTintList(p9 == null ? E.d.c(context2, R.color.material_slider_inactive_track_color) : p9);
        ColorStateList p10 = D1.p(context2, obtainStyledAttributes, i11);
        setTrackActiveTintList(p10 == null ? E.d.c(context2, R.color.material_slider_active_track_color) : p10);
        hVar.k(D1.p(context2, obtainStyledAttributes, 10));
        if (obtainStyledAttributes.hasValue(14)) {
            setThumbStrokeColor(D1.p(context2, obtainStyledAttributes, 14));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(15, 0.0f));
        ColorStateList p11 = D1.p(context2, obtainStyledAttributes, 5);
        setHaloTintList(p11 == null ? E.d.c(context2, R.color.material_slider_halo_color) : p11);
        this.f3183y0 = obtainStyledAttributes.getBoolean(23, true);
        boolean hasValue2 = obtainStyledAttributes.hasValue(18);
        if (hasValue2) {
            i10 = 18;
        } else {
            i10 = 20;
        }
        int i12 = hasValue2 ? 18 : 19;
        ColorStateList p12 = D1.p(context2, obtainStyledAttributes, i10);
        setTickInactiveTintList(p12 == null ? E.d.c(context2, R.color.material_slider_inactive_tick_marks_color) : p12);
        ColorStateList p13 = D1.p(context2, obtainStyledAttributes, i12);
        setTickActiveTintList(p13 == null ? E.d.c(context2, R.color.material_slider_active_tick_marks_color) : p13);
        setThumbTrackGapSize(obtainStyledAttributes.getDimensionPixelSize(16, 0));
        setTrackStopIndicatorSize(obtainStyledAttributes.getDimensionPixelSize(29, 0));
        setTrackInsideCornerSize(obtainStyledAttributes.getDimensionPixelSize(28, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(13, 0) * 2;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(11, 0.0f));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(27, 0));
        setTickActiveRadius(obtainStyledAttributes.getDimensionPixelSize(21, this.f3158l0 / 2));
        setTickInactiveRadius(obtainStyledAttributes.getDimensionPixelSize(22, this.f3158l0 / 2));
        setLabelBehavior(obtainStyledAttributes.getInt(7, 0));
        if (!obtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        hVar.l();
        this.f3169r = ViewConfiguration.get(context2).getScaledTouchSlop();
        b bVar = new b(slider);
        this.f3150h = bVar;
        Q.m(this, bVar);
        this.f3152i = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public final void A() {
        if (this.f3126D0) {
            float f9 = this.r0;
            float f10 = this.f3171s0;
            if (f9 < f10) {
                if (f10 > f9) {
                    if (this.f3179w0 > 0.0f && !B(f10)) {
                        throw new IllegalStateException("The stepSize(" + this.f3179w0 + ") must be 0, or a factor of the valueFrom(" + this.r0 + ")-valueTo(" + this.f3171s0 + ") range");
                    }
                    ArrayList arrayList = this.f3173t0;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        Float f11 = (Float) obj;
                        if (f11.floatValue() >= this.r0 && f11.floatValue() <= this.f3171s0) {
                            if (this.f3179w0 > 0.0f && !B(f11.floatValue())) {
                                float f12 = this.r0;
                                float f13 = this.f3179w0;
                                throw new IllegalStateException("Value(" + f11 + ") must be equal to valueFrom(" + f12 + ") plus a multiple of stepSize(" + f13 + ") when using stepSize(" + f13 + ")");
                            }
                        } else {
                            throw new IllegalStateException("Slider value(" + f11 + ") must be greater or equal to valueFrom(" + this.r0 + "), and lower or equal to valueTo(" + this.f3171s0 + ")");
                        }
                    }
                    float minSeparation = getMinSeparation();
                    if (minSeparation >= 0.0f) {
                        float f14 = this.f3179w0;
                        if (f14 > 0.0f && minSeparation > 0.0f) {
                            if (this.f3139Q0 == 1) {
                                if (minSeparation < f14 || !j(minSeparation)) {
                                    float f15 = this.f3179w0;
                                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f15 + ") when using stepSize(" + f15 + ")");
                                }
                            } else {
                                throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f3179w0 + ")");
                            }
                        }
                        float f16 = this.f3179w0;
                        if (f16 != 0.0f) {
                            if (((int) f16) != f16) {
                                Log.w("d", "Floating point value used for stepSize(" + f16 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                            }
                            float f17 = this.r0;
                            if (((int) f17) != f17) {
                                Log.w("d", "Floating point value used for valueFrom(" + f17 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                            }
                            float f18 = this.f3171s0;
                            if (((int) f18) != f18) {
                                Log.w("d", "Floating point value used for valueTo(" + f18 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                            }
                        }
                        this.f3126D0 = false;
                        return;
                    }
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
                }
                throw new IllegalStateException("valueTo(" + this.f3171s0 + ") must be greater than valueFrom(" + this.r0 + ")");
            }
            throw new IllegalStateException("valueFrom(" + this.r0 + ") must be smaller than valueTo(" + this.f3171s0 + ")");
        }
    }

    public final boolean B(float f9) {
        return j(new BigDecimal(Float.toString(f9)).subtract(new BigDecimal(Float.toString(this.r0)), MathContext.DECIMAL64).doubleValue());
    }

    public final float C(float f9) {
        return (p(f9) * this.f3122B0) + this.f3125D;
    }

    public final void a(C1686m c1686m) {
        this.f3159m.add(c1686m);
    }

    public final void b(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f3147f0, this.f3149g0);
        } else {
            float max = Math.max(this.f3147f0, this.f3149g0) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    public final int c() {
        int i9 = this.f3119A / 2;
        int i10 = this.f3121B;
        int i11 = 0;
        if (i10 == 1 || i10 == 3) {
            i11 = ((N5.b) this.f3157l.get(0)).getIntrinsicHeight();
        }
        return i9 + i11;
    }

    public final ValueAnimator d(boolean z9) {
        float f9;
        ValueAnimator valueAnimator;
        int y9;
        TimeInterpolator z10;
        float f10 = 1.0f;
        if (z9) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        if (z9) {
            valueAnimator = this.f3167q;
        } else {
            valueAnimator = this.f3165p;
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        if (!z9) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
        if (z9) {
            y9 = Z0.a.y(getContext(), R.attr.motionDurationMedium4, 83);
            z10 = Z0.a.z(getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1281a.f17929e);
        } else {
            y9 = Z0.a.y(getContext(), R.attr.motionDurationShort3, 117);
            z10 = Z0.a.z(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, AbstractC1281a.f17927c);
        }
        ofFloat.setDuration(y9);
        ofFloat.setInterpolator(z10);
        ofFloat.addUpdateListener(new C0118w(1, this));
        return ofFloat;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f3150h.m(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f3141a.setColor(i(this.f3131I0));
        this.f3142b.setColor(i(this.f3130H0));
        this.f3145e.setColor(i(this.f3129G0));
        this.f3146f.setColor(i(this.f3128F0));
        this.f3148g.setColor(i(this.f3130H0));
        ArrayList arrayList = this.f3157l;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            N5.b bVar = (N5.b) obj;
            if (bVar.isStateful()) {
                bVar.setState(getDrawableState());
            }
        }
        h hVar = this.f3135M0;
        if (hVar.isStateful()) {
            hVar.setState(getDrawableState());
        }
        Paint paint = this.f3144d;
        paint.setColor(i(this.f3127E0));
        paint.setAlpha(63);
    }

    public final void e(Canvas canvas, int i9, int i10, float f9, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f3125D + ((int) (p(f9) * i9))) - (drawable.getBounds().width() / 2.0f), i10 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void f() {
        if (!this.f3163o) {
            this.f3163o = true;
            ValueAnimator d9 = d(true);
            this.f3165p = d9;
            this.f3167q = null;
            d9.start();
        }
        ArrayList arrayList = this.f3157l;
        Iterator it = arrayList.iterator();
        for (int i9 = 0; i9 < this.f3173t0.size() && it.hasNext(); i9++) {
            if (i9 != this.f3177v0) {
                r((N5.b) it.next(), ((Float) this.f3173t0.get(i9)).floatValue());
            }
        }
        if (it.hasNext()) {
            r((N5.b) it.next(), ((Float) this.f3173t0.get(this.f3177v0)).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f3173t0.size())));
    }

    public final void g() {
        if (this.f3163o) {
            this.f3163o = false;
            ValueAnimator d9 = d(false);
            this.f3167q = d9;
            this.f3165p = null;
            d9.addListener(new t(2, this));
            this.f3167q.start();
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f3150h.f7549k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public List<Float> getValues() {
        return new ArrayList(this.f3173t0);
    }

    public final float[] h() {
        float floatValue = ((Float) this.f3173t0.get(0)).floatValue();
        ArrayList arrayList = this.f3173t0;
        float floatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.f3173t0.size() == 1) {
            floatValue = this.r0;
        }
        float p9 = p(floatValue);
        float p10 = p(floatValue2);
        if (l()) {
            return new float[]{p10, p9};
        }
        return new float[]{p9, p10};
    }

    public final int i(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean j(double d9) {
        if (Math.abs(Math.round(r3) - new BigDecimal(Double.toString(d9)).divide(new BigDecimal(Float.toString(this.f3179w0)), MathContext.DECIMAL64).doubleValue()) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    public final boolean k(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean l() {
        WeakHashMap weakHashMap = Q.f5546a;
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void m() {
        if (this.f3179w0 > 0.0f) {
            A();
            int min = Math.min((int) (((this.f3171s0 - this.r0) / this.f3179w0) + 1.0f), (this.f3122B0 / this.f3180x) + 1);
            float[] fArr = this.f3181x0;
            if (fArr == null || fArr.length != min * 2) {
                this.f3181x0 = new float[min * 2];
            }
            float f9 = this.f3122B0 / (min - 1);
            for (int i9 = 0; i9 < min * 2; i9 += 2) {
                float[] fArr2 = this.f3181x0;
                fArr2[i9] = ((i9 / 2.0f) * f9) + this.f3125D;
                fArr2[i9 + 1] = c();
            }
        }
    }

    public final boolean n(int i9) {
        int i10 = this.f3177v0;
        long j = i10 + i9;
        long size = this.f3173t0.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i11 = (int) j;
        this.f3177v0 = i11;
        if (i11 == i10) {
            return false;
        }
        if (this.f3175u0 != -1) {
            this.f3175u0 = i11;
        }
        w();
        postInvalidate();
        return true;
    }

    public final void o(int i9) {
        if (l()) {
            if (i9 == Integer.MIN_VALUE) {
                i9 = Integer.MAX_VALUE;
            } else {
                i9 = -i9;
            }
        }
        n(i9);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f3140R0);
        ArrayList arrayList = this.f3157l;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            N5.b bVar = (N5.b) obj;
            ViewGroup f9 = p.f(this);
            if (f9 == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                int[] iArr = new int[2];
                f9.getLocationOnScreen(iArr);
                bVar.f5224i0 = iArr[0];
                f9.getWindowVisibleDisplayFrame(bVar.f5218D);
                f9.addOnLayoutChangeListener(bVar.f5217C);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        G g9;
        s sVar = this.j;
        if (sVar != null) {
            removeCallbacks(sVar);
        }
        int i9 = 0;
        this.f3163o = false;
        ArrayList arrayList = this.f3157l;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            N5.b bVar = (N5.b) obj;
            ViewGroup f9 = p.f(this);
            if (f9 == null) {
                g9 = null;
            } else {
                g9 = new G(f9);
            }
            if (g9 != null) {
                ((ViewOverlay) g9.f17990b).remove(bVar);
                ViewGroup f10 = p.f(this);
                if (f10 == null) {
                    bVar.getClass();
                } else {
                    f10.removeOnLayoutChangeListener(bVar.f5217C);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f3140R0);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0269  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.d.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z9, int i9, Rect rect) {
        super.onFocusChanged(z9, i9, rect);
        b bVar = this.f3150h;
        if (!z9) {
            this.f3175u0 = -1;
            bVar.j(this.f3177v0);
            return;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 17) {
                    if (i9 == 66) {
                        o(Integer.MIN_VALUE);
                    }
                } else {
                    o(Integer.MAX_VALUE);
                }
            } else {
                n(Integer.MIN_VALUE);
            }
        } else {
            n(Integer.MAX_VALUE);
        }
        bVar.w(this.f3177v0);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i9, keyEvent);
        }
        if (this.f3173t0.size() == 1) {
            this.f3175u0 = 0;
        }
        Float f9 = null;
        Boolean bool = null;
        if (this.f3175u0 == -1) {
            if (i9 != 61) {
                if (i9 != 66) {
                    if (i9 != 81) {
                        if (i9 != 69) {
                            if (i9 != 70) {
                                switch (i9) {
                                    case 21:
                                        o(-1);
                                        bool = Boolean.TRUE;
                                        break;
                                    case 22:
                                        o(1);
                                        bool = Boolean.TRUE;
                                        break;
                                }
                            }
                        } else {
                            n(-1);
                            bool = Boolean.TRUE;
                        }
                    }
                    n(1);
                    bool = Boolean.TRUE;
                }
                this.f3175u0 = this.f3177v0;
                postInvalidate();
                bool = Boolean.TRUE;
            } else if (keyEvent.hasNoModifiers()) {
                bool = Boolean.valueOf(n(1));
            } else if (keyEvent.isShiftPressed()) {
                bool = Boolean.valueOf(n(-1));
            } else {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return super.onKeyDown(i9, keyEvent);
        }
        boolean isLongPress = this.f3124C0 | keyEvent.isLongPress();
        this.f3124C0 = isLongPress;
        float f10 = 1.0f;
        if (isLongPress) {
            float f11 = this.f3179w0;
            if (f11 != 0.0f) {
                f10 = f11;
            }
            if ((this.f3171s0 - this.r0) / f10 > 20) {
                f10 *= Math.round(r0 / r11);
            }
        } else {
            float f12 = this.f3179w0;
            if (f12 != 0.0f) {
                f10 = f12;
            }
        }
        if (i9 != 21) {
            if (i9 != 22) {
                if (i9 != 69) {
                    if (i9 == 70 || i9 == 81) {
                        f9 = Float.valueOf(f10);
                    }
                } else {
                    f9 = Float.valueOf(-f10);
                }
            } else {
                if (l()) {
                    f10 = -f10;
                }
                f9 = Float.valueOf(f10);
            }
        } else {
            if (!l()) {
                f10 = -f10;
            }
            f9 = Float.valueOf(f10);
        }
        if (f9 != null) {
            if (t(this.f3175u0, f9.floatValue() + ((Float) this.f3173t0.get(this.f3175u0)).floatValue())) {
                w();
                postInvalidate();
            }
            return true;
        }
        if (i9 != 23) {
            if (i9 != 61) {
                if (i9 != 66) {
                    return super.onKeyDown(i9, keyEvent);
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return n(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return n(-1);
            }
        }
        this.f3175u0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i9, KeyEvent keyEvent) {
        this.f3124C0 = false;
        return super.onKeyUp(i9, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = this.f3119A;
        int i12 = this.f3121B;
        int i13 = 0;
        if (i12 == 1 || i12 == 3) {
            i13 = ((N5.b) this.f3157l.get(0)).getIntrinsicHeight();
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(i11 + i13, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.r0 = cVar.f3114a;
        this.f3171s0 = cVar.f3115b;
        s(cVar.f3116c);
        this.f3179w0 = cVar.f3117d;
        if (cVar.f3118e) {
            requestFocus();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, H5.c, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f3114a = this.r0;
        baseSavedState.f3115b = this.f3171s0;
        baseSavedState.f3116c = new ArrayList(this.f3173t0);
        baseSavedState.f3117d = this.f3179w0;
        baseSavedState.f3118e = hasFocus();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        this.f3122B0 = Math.max(i9 - (this.f3125D * 2), 0);
        m();
        w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r3 != 3) goto L65;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i9) {
        G g9;
        super.onVisibilityChanged(view, i9);
        if (i9 != 0) {
            ViewGroup f9 = p.f(this);
            if (f9 == null) {
                g9 = null;
            } else {
                g9 = new G(f9);
            }
            if (g9 != null) {
                ArrayList arrayList = this.f3157l;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ViewOverlay) g9.f17990b).remove((N5.b) obj);
                }
            }
        }
    }

    public final float p(float f9) {
        float f10 = this.r0;
        float f11 = (f9 - f10) / (this.f3171s0 - f10);
        if (l()) {
            return 1.0f - f11;
        }
        return f11;
    }

    public final void q() {
        ArrayList arrayList = this.f3161n;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            C1205G c1205g = (C1205G) obj;
            c1205g.getClass();
            ((Slider) this).setVisibility(0);
            y0 y0Var = c1205g.f17571a.f13813q0;
            if (y0Var != null) {
                y0Var.d(null);
            }
        }
    }

    public final void r(N5.b bVar, float f9) {
        String str;
        G g9;
        if (((int) f9) == f9) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        String format = String.format(str, Float.valueOf(f9));
        if (!TextUtils.equals(bVar.f5229y, format)) {
            bVar.f5229y = format;
            bVar.f5216B.f24309e = true;
            bVar.invalidateSelf();
        }
        int p9 = (this.f3125D + ((int) (p(f9) * this.f3122B0))) - (bVar.getIntrinsicWidth() / 2);
        int c3 = c() - ((this.f3149g0 / 2) + this.f3162n0);
        bVar.setBounds(p9, c3 - bVar.getIntrinsicHeight(), bVar.getIntrinsicWidth() + p9, c3);
        Rect rect = new Rect(bVar.getBounds());
        AbstractC2144d.b(p.f(this), this, rect);
        bVar.setBounds(rect);
        ViewGroup f10 = p.f(this);
        if (f10 == null) {
            g9 = null;
        } else {
            g9 = new G(f10);
        }
        ((ViewOverlay) g9.f17990b).add(bVar);
    }

    public final void s(ArrayList arrayList) {
        int i9;
        C5.e eVar;
        int i10;
        int i11;
        int i12;
        ViewGroup f9;
        int resourceId;
        G g9;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f3173t0.size() == arrayList.size() && this.f3173t0.equals(arrayList)) {
                return;
            }
            this.f3173t0 = arrayList;
            this.f3126D0 = true;
            this.f3177v0 = 0;
            w();
            ArrayList arrayList2 = this.f3157l;
            if (arrayList2.size() > this.f3173t0.size()) {
                List<N5.b> subList = arrayList2.subList(this.f3173t0.size(), arrayList2.size());
                for (N5.b bVar : subList) {
                    WeakHashMap weakHashMap = Q.f5546a;
                    if (isAttachedToWindow()) {
                        ViewGroup f10 = p.f(this);
                        if (f10 == null) {
                            g9 = null;
                        } else {
                            g9 = new G(f10);
                        }
                        if (g9 != null) {
                            ((ViewOverlay) g9.f17990b).remove(bVar);
                            ViewGroup f11 = p.f(this);
                            if (f11 == null) {
                                bVar.getClass();
                            } else {
                                f11.removeOnLayoutChangeListener(bVar.f5217C);
                            }
                        }
                    }
                }
                subList.clear();
            }
            while (arrayList2.size() < this.f3173t0.size()) {
                Context context = getContext();
                int i13 = this.f3155k;
                N5.b bVar2 = new N5.b(context, i13);
                TypedArray i14 = p.i(bVar2.f5230z, null, AbstractC1254a.f17735U, 0, i13, new int[0]);
                Context context2 = bVar2.f5230z;
                bVar2.f5223h0 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
                boolean z9 = i14.getBoolean(8, true);
                bVar2.f5222g0 = z9;
                if (z9) {
                    l e8 = bVar2.f2483a.f2466a.e();
                    e8.f2517k = bVar2.r();
                    bVar2.setShapeAppearanceModel(e8.a());
                } else {
                    bVar2.f5223h0 = 0;
                }
                CharSequence text = i14.getText(6);
                boolean equals = TextUtils.equals(bVar2.f5229y, text);
                m mVar = bVar2.f5216B;
                if (!equals) {
                    bVar2.f5229y = text;
                    mVar.f24309e = true;
                    bVar2.invalidateSelf();
                }
                if (i14.hasValue(0) && (resourceId = i14.getResourceId(0, 0)) != 0) {
                    eVar = new C5.e(context2, resourceId);
                } else {
                    eVar = null;
                }
                if (eVar != null && i14.hasValue(1)) {
                    eVar.j = D1.p(context2, i14, 1);
                }
                mVar.c(eVar, context2);
                TypedValue Z6 = AbstractC1002u1.Z(R.attr.colorOnBackground, context2, N5.b.class.getCanonicalName());
                int i15 = Z6.resourceId;
                if (i15 != 0) {
                    i10 = context2.getColor(i15);
                } else {
                    i10 = Z6.data;
                }
                TypedValue Z8 = AbstractC1002u1.Z(android.R.attr.colorBackground, context2, N5.b.class.getCanonicalName());
                int i16 = Z8.resourceId;
                if (i16 != 0) {
                    i11 = context2.getColor(i16);
                } else {
                    i11 = Z8.data;
                }
                bVar2.k(ColorStateList.valueOf(i14.getColor(7, H.a.f(H.a.h(i10, 153), H.a.h(i11, 229)))));
                TypedValue Z9 = AbstractC1002u1.Z(R.attr.colorSurface, context2, N5.b.class.getCanonicalName());
                int i17 = Z9.resourceId;
                if (i17 != 0) {
                    i12 = context2.getColor(i17);
                } else {
                    i12 = Z9.data;
                }
                bVar2.m(ColorStateList.valueOf(i12));
                bVar2.f5219X = i14.getDimensionPixelSize(2, 0);
                bVar2.Y = i14.getDimensionPixelSize(4, 0);
                bVar2.f5220Z = i14.getDimensionPixelSize(5, 0);
                bVar2.f5221f0 = i14.getDimensionPixelSize(3, 0);
                i14.recycle();
                arrayList2.add(bVar2);
                WeakHashMap weakHashMap2 = Q.f5546a;
                if (isAttachedToWindow() && (f9 = p.f(this)) != null) {
                    int[] iArr = new int[2];
                    f9.getLocationOnScreen(iArr);
                    bVar2.f5224i0 = iArr[0];
                    f9.getWindowVisibleDisplayFrame(bVar2.f5218D);
                    f9.addOnLayoutChangeListener(bVar2.f5217C);
                }
            }
            if (arrayList2.size() == 1) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            int size = arrayList2.size();
            int i18 = 0;
            while (i18 < size) {
                Object obj = arrayList2.get(i18);
                i18++;
                N5.b bVar3 = (N5.b) obj;
                bVar3.f2483a.j = i9;
                bVar3.invalidateSelf();
            }
            ArrayList arrayList3 = this.f3159m;
            int size2 = arrayList3.size();
            int i19 = 0;
            while (i19 < size2) {
                Object obj2 = arrayList3.get(i19);
                i19++;
                C1686m c1686m = (C1686m) obj2;
                ArrayList arrayList4 = this.f3173t0;
                int size3 = arrayList4.size();
                int i20 = 0;
                while (i20 < size3) {
                    Object obj3 = arrayList4.get(i20);
                    i20++;
                    c1686m.a(this, ((Float) obj3).floatValue());
                }
            }
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    public void setActiveThumbIndex(int i9) {
        this.f3175u0 = i9;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            drawableArr[i9] = getResources().getDrawable(iArr[i9]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        int i9;
        super.setEnabled(z9);
        if (z9) {
            i9 = 0;
        } else {
            i9 = 2;
        }
        setLayerType(i9, null);
    }

    public abstract void setHaloRadius(int i9);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i9);

    public void setSeparationUnit(int i9) {
        this.f3139Q0 = i9;
        this.f3126D0 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f9);

    public abstract void setThumbHeight(int i9);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f9);

    public abstract void setThumbTrackGapSize(int i9);

    public abstract void setThumbWidth(int i9);

    public abstract void setTickActiveRadius(int i9);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i9);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i9);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i9);

    public abstract void setTrackStopIndicatorSize(int i9);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        s(arrayList);
    }

    public final boolean t(int i9, float f9) {
        float floatValue;
        float floatValue2;
        this.f3177v0 = i9;
        int i10 = 0;
        if (Math.abs(f9 - ((Float) this.f3173t0.get(i9)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f3139Q0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f10 = this.r0;
                minSeparation = z.b(f10, this.f3171s0, (minSeparation - this.f3125D) / this.f3122B0, f10);
            }
        }
        if (l()) {
            minSeparation = -minSeparation;
        }
        int i11 = i9 + 1;
        if (i11 >= this.f3173t0.size()) {
            floatValue = this.f3171s0;
        } else {
            floatValue = ((Float) this.f3173t0.get(i11)).floatValue() - minSeparation;
        }
        int i12 = i9 - 1;
        if (i12 < 0) {
            floatValue2 = this.r0;
        } else {
            floatValue2 = minSeparation + ((Float) this.f3173t0.get(i12)).floatValue();
        }
        this.f3173t0.set(i9, Float.valueOf(u0.j(f9, floatValue2, floatValue)));
        ArrayList arrayList = this.f3159m;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((C1686m) obj).a(this, ((Float) this.f3173t0.get(i9)).floatValue());
        }
        AccessibilityManager accessibilityManager = this.f3152i;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.j;
            if (runnable == null) {
                this.j = new s(this);
            } else {
                removeCallbacks(runnable);
            }
            s sVar = this.j;
            sVar.f1879b = i9;
            postDelayed(sVar, 200L);
        }
        return true;
    }

    public final void u() {
        double d9;
        float f9 = this.f3138P0;
        float f10 = this.f3179w0;
        if (f10 > 0.0f) {
            d9 = Math.round(f9 * r1) / ((int) ((this.f3171s0 - this.r0) / f10));
        } else {
            d9 = f9;
        }
        if (l()) {
            d9 = 1.0d - d9;
        }
        float f11 = this.f3171s0;
        t(this.f3175u0, (float) ((d9 * (f11 - r1)) + this.r0));
    }

    public final void v(int i9, Rect rect) {
        int p9 = this.f3125D + ((int) (p(getValues().get(i9).floatValue()) * this.f3122B0));
        int c3 = c();
        int max = Math.max(this.f3147f0 / 2, this.f3182y / 2);
        int max2 = Math.max(this.f3149g0 / 2, this.f3182y / 2);
        rect.set(p9 - max, c3 - max2, p9 + max, c3 + max2);
    }

    public final void w() {
        if ((getBackground() instanceof RippleDrawable) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int p9 = (int) ((p(((Float) this.f3173t0.get(this.f3177v0)).floatValue()) * this.f3122B0) + this.f3125D);
                int c3 = c();
                int i9 = this.f3151h0;
                background.setHotspotBounds(p9 - i9, c3 - i9, p9 + i9, c3 + i9);
            }
        }
    }

    public final void x() {
        int i9 = this.f3121B;
        if (i9 != 0 && i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    if (isEnabled()) {
                        Rect rect = new Rect();
                        p.f(this).getHitRect(rect);
                        if (getLocalVisibleRect(rect)) {
                            f();
                            return;
                        }
                    }
                    g();
                    return;
                }
                throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f3121B);
            }
            g();
            return;
        }
        if (this.f3175u0 != -1 && isEnabled()) {
            f();
        } else {
            g();
        }
    }

    public final void y(Canvas canvas, Paint paint, RectF rectF, int i9) {
        float f9;
        float f10 = this.f3123C / 2.0f;
        int b9 = AbstractC2128h.b(i9);
        if (b9 != 1) {
            if (b9 != 2) {
                if (b9 == 3) {
                    f10 = this.f3160m0;
                }
                f9 = f10;
            } else {
                f9 = f10;
                f10 = this.f3160m0;
            }
        } else {
            f9 = this.f3160m0;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path = this.f3132J0;
        path.reset();
        if (rectF.width() >= f10 + f9) {
            path.addRoundRect(rectF, new float[]{f10, f10, f9, f9, f9, f9, f10, f10}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float min = Math.min(f10, f9);
        float max = Math.max(f10, f9);
        canvas.save();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        canvas.clipPath(path);
        int b10 = AbstractC2128h.b(i9);
        RectF rectF2 = this.f3134L0;
        if (b10 != 1) {
            if (b10 != 2) {
                rectF2.set(rectF.centerX() - max, rectF.top, rectF.centerX() + max, rectF.bottom);
            } else {
                float f11 = rectF.right;
                rectF2.set(f11 - (2.0f * max), rectF.top, f11, rectF.bottom);
            }
        } else {
            float f12 = rectF.left;
            rectF2.set(f12, rectF.top, (2.0f * max) + f12, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, max, max, paint);
        canvas.restore();
    }

    public final void z() {
        boolean z9;
        int max = Math.max(this.f3184z, Math.max(this.f3123C + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.f3149g0));
        boolean z10 = false;
        if (max == this.f3119A) {
            z9 = false;
        } else {
            this.f3119A = max;
            z9 = true;
        }
        int max2 = Math.max(Math.max(Math.max((this.f3147f0 / 2) - this.f3172t, 0), Math.max((this.f3123C - this.f3174u) / 2, 0)), Math.max(Math.max(this.f3185z0 - this.f3176v, 0), Math.max(this.f3120A0 - this.f3178w, 0))) + this.f3170s;
        if (this.f3125D != max2) {
            this.f3125D = max2;
            WeakHashMap weakHashMap = Q.f5546a;
            if (isLaidOut()) {
                this.f3122B0 = Math.max(getWidth() - (this.f3125D * 2), 0);
                m();
            }
            z10 = true;
        }
        if (z9) {
            requestLayout();
        } else if (z10) {
            postInvalidate();
        }
    }

    public void setValues(List<Float> list) {
        s(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f3136N0 = null;
        this.f3137O0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f3137O0;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            b(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }
}
