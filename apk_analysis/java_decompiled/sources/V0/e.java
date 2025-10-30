package V0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import k0.C1478a;
import u0.z;

/* loaded from: classes.dex */
public final class e extends Drawable implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final LinearInterpolator f7603g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    public static final C1478a f7604h = new C1478a(1);

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f7605i = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    public final d f7606a;

    /* renamed from: b, reason: collision with root package name */
    public float f7607b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f7608c;

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f7609d;

    /* renamed from: e, reason: collision with root package name */
    public float f7610e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7611f;

    public e(Context context) {
        context.getClass();
        this.f7608c = context.getResources();
        d dVar = new d();
        this.f7606a = dVar;
        dVar.f7591i = f7605i;
        dVar.a(0);
        dVar.f7590h = 2.5f;
        dVar.f7584b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f7603g);
        ofFloat.addListener(new c(this, dVar));
        this.f7609d = ofFloat;
    }

    public static void d(float f9, d dVar) {
        if (f9 > 0.75f) {
            float f10 = (f9 - 0.75f) / 0.25f;
            int[] iArr = dVar.f7591i;
            int i9 = dVar.j;
            int i10 = iArr[i9];
            int i11 = iArr[(i9 + 1) % iArr.length];
            dVar.f7602u = ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r1) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r3) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r4) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r2))));
            return;
        }
        dVar.f7602u = dVar.f7591i[dVar.j];
    }

    public final void a(float f9, d dVar, boolean z9) {
        float interpolation;
        float f10;
        if (this.f7611f) {
            d(f9, dVar);
            float floor = (float) (Math.floor(dVar.f7594m / 0.8f) + 1.0d);
            float f11 = dVar.f7592k;
            float f12 = dVar.f7593l;
            dVar.f7587e = (((f12 - 0.01f) - f11) * f9) + f11;
            dVar.f7588f = f12;
            float f13 = dVar.f7594m;
            dVar.f7589g = z.b(floor, f13, f9, f13);
            return;
        }
        if (f9 == 1.0f && !z9) {
            return;
        }
        float f14 = dVar.f7594m;
        C1478a c1478a = f7604h;
        if (f9 < 0.5f) {
            interpolation = dVar.f7592k;
            f10 = (c1478a.getInterpolation(f9 / 0.5f) * 0.79f) + 0.01f + interpolation;
        } else {
            float f15 = dVar.f7592k + 0.79f;
            interpolation = f15 - (((1.0f - c1478a.getInterpolation((f9 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            f10 = f15;
        }
        float f16 = (0.20999998f * f9) + f14;
        float f17 = (f9 + this.f7610e) * 216.0f;
        dVar.f7587e = interpolation;
        dVar.f7588f = f10;
        dVar.f7589g = f16;
        this.f7607b = f17;
    }

    public final void b(float f9, float f10, float f11, float f12) {
        float f13 = this.f7608c.getDisplayMetrics().density;
        float f14 = f10 * f13;
        d dVar = this.f7606a;
        dVar.f7590h = f14;
        dVar.f7584b.setStrokeWidth(f14);
        dVar.f7598q = f9 * f13;
        dVar.a(0);
        dVar.f7599r = (int) (f11 * f13);
        dVar.f7600s = (int) (f12 * f13);
    }

    public final void c(int i9) {
        if (i9 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f7607b, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f7606a;
        RectF rectF = dVar.f7583a;
        float f9 = dVar.f7598q;
        float f10 = (dVar.f7590h / 2.0f) + f9;
        if (f9 <= 0.0f) {
            f10 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f7599r * dVar.f7597p) / 2.0f, dVar.f7590h / 2.0f);
        }
        rectF.set(bounds.centerX() - f10, bounds.centerY() - f10, bounds.centerX() + f10, bounds.centerY() + f10);
        float f11 = dVar.f7587e;
        float f12 = dVar.f7589g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((dVar.f7588f + f12) * 360.0f) - f13;
        Paint paint = dVar.f7584b;
        paint.setColor(dVar.f7602u);
        paint.setAlpha(dVar.f7601t);
        float f15 = dVar.f7590h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f7586d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        if (dVar.f7595n) {
            Path path = dVar.f7596o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f7596o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (dVar.f7599r * dVar.f7597p) / 2.0f;
            dVar.f7596o.moveTo(0.0f, 0.0f);
            dVar.f7596o.lineTo(dVar.f7599r * dVar.f7597p, 0.0f);
            Path path3 = dVar.f7596o;
            float f18 = dVar.f7599r;
            float f19 = dVar.f7597p;
            path3.lineTo((f18 * f19) / 2.0f, dVar.f7600s * f19);
            dVar.f7596o.offset((rectF.centerX() + min) - f17, (dVar.f7590h / 2.0f) + rectF.centerY());
            dVar.f7596o.close();
            Paint paint2 = dVar.f7585c;
            paint2.setColor(dVar.f7602u);
            paint2.setAlpha(dVar.f7601t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f7596o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f7606a.f7601t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f7609d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.f7606a.f7601t = i9;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7606a.f7584b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f7609d.cancel();
        d dVar = this.f7606a;
        float f9 = dVar.f7587e;
        dVar.f7592k = f9;
        float f10 = dVar.f7588f;
        dVar.f7593l = f10;
        dVar.f7594m = dVar.f7589g;
        if (f10 != f9) {
            this.f7611f = true;
            this.f7609d.setDuration(666L);
            this.f7609d.start();
            return;
        }
        dVar.a(0);
        dVar.f7592k = 0.0f;
        dVar.f7593l = 0.0f;
        dVar.f7594m = 0.0f;
        dVar.f7587e = 0.0f;
        dVar.f7588f = 0.0f;
        dVar.f7589g = 0.0f;
        this.f7609d.setDuration(1332L);
        this.f7609d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f7609d.cancel();
        this.f7607b = 0.0f;
        d dVar = this.f7606a;
        if (dVar.f7595n) {
            dVar.f7595n = false;
        }
        dVar.a(0);
        dVar.f7592k = 0.0f;
        dVar.f7593l = 0.0f;
        dVar.f7594m = 0.0f;
        dVar.f7587e = 0.0f;
        dVar.f7588f = 0.0f;
        dVar.f7589g = 0.0f;
        invalidateSelf();
    }
}
