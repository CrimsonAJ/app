package com.google.android.material.timepicker;

import P.Q;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import co.notix.R;
import g5.AbstractC1254a;
import h5.AbstractC1281a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w5.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f16262a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16263b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16264c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16265d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16266e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f16267f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f16268g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16269h;

    /* renamed from: i, reason: collision with root package name */
    public float f16270i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public double f16271k;

    /* renamed from: l, reason: collision with root package name */
    public int f16272l;

    /* renamed from: m, reason: collision with root package name */
    public int f16273m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f16262a = new ValueAnimator();
        this.f16264c = new ArrayList();
        Paint paint = new Paint();
        this.f16267f = paint;
        this.f16268g = new RectF();
        this.f16273m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.f17746l, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Z0.a.y(context, R.attr.motionDurationLong2, 200);
        Z0.a.z(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1281a.f17926b);
        this.f16272l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f16265d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f16269h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f16266e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = Q.f5546a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i9) {
        if (i9 == 2) {
            return Math.round(this.f16272l * 0.66f);
        }
        return this.f16272l;
    }

    public final void b(float f9) {
        ValueAnimator valueAnimator = this.f16262a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = f9 % 360.0f;
        this.f16270i = f10;
        this.f16271k = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a5 = a(this.f16273m);
        float cos = (((float) Math.cos(this.f16271k)) * a5) + width;
        float sin = (a5 * ((float) Math.sin(this.f16271k))) + height;
        float f11 = this.f16265d;
        this.f16268g.set(cos - f11, sin - f11, cos + f11, sin + f11);
        ArrayList arrayList = this.f16264c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ClockFaceView clockFaceView = (ClockFaceView) ((d) obj);
            if (Math.abs(clockFaceView.f16252g0 - f10) > 0.001f) {
                clockFaceView.f16252g0 = f10;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f9 = width;
        float a5 = a(this.f16273m);
        float cos = (((float) Math.cos(this.f16271k)) * a5) + f9;
        float f10 = height;
        float sin = (a5 * ((float) Math.sin(this.f16271k))) + f10;
        Paint paint = this.f16267f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f16265d, paint);
        double sin2 = Math.sin(this.f16271k);
        paint.setStrokeWidth(this.f16269h);
        canvas.drawLine(f9, f10, width + ((int) (Math.cos(this.f16271k) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f9, f10, this.f16266e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        if (!this.f16262a.isRunning()) {
            b(this.f16270i);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i9;
        int actionMasked = motionEvent.getActionMasked();
        float x5 = motionEvent.getX();
        float y9 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z10 = false;
                z9 = false;
            } else {
                z10 = this.j;
                if (this.f16263b) {
                    if (((float) Math.hypot(x5 - (getWidth() / 2), y9 - (getHeight() / 2))) <= a(2) + p.e(getContext(), 12)) {
                        i9 = 2;
                    } else {
                        i9 = 1;
                    }
                    this.f16273m = i9;
                }
                z9 = false;
            }
        } else {
            this.j = false;
            z9 = true;
            z10 = false;
        }
        boolean z13 = this.j;
        int degrees = (int) Math.toDegrees(Math.atan2(y9 - (getHeight() / 2), x5 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f9 = i10;
        if (this.f16270i != f9) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z9 || !z11) {
            if (z11 || z10) {
                b(f9);
            }
            this.j = z13 | z12;
            return true;
        }
        z12 = true;
        this.j = z13 | z12;
        return true;
    }
}
