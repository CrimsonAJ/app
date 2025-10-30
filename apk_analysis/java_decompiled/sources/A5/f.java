package A5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class f extends p {

    /* renamed from: b, reason: collision with root package name */
    public float f407b;

    /* renamed from: c, reason: collision with root package name */
    public float f408c;

    /* renamed from: d, reason: collision with root package name */
    public float f409d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f410e;

    /* renamed from: f, reason: collision with root package name */
    public float f411f;

    @Override // A5.p
    public final void a(Canvas canvas, Rect rect, float f9, boolean z9, boolean z10) {
        boolean z11;
        float width = rect.width() / i();
        float height = rect.height() / i();
        j jVar = (j) this.f451a;
        float f10 = (jVar.f427h / 2.0f) + jVar.f428i;
        canvas.translate((f10 * width) + rect.left, (f10 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (jVar.j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f11 = -f10;
        canvas.clipRect(f11, f11, f10, f10);
        int i9 = jVar.f400a;
        if (i9 / 2 <= jVar.f401b) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f410e = z11;
        this.f407b = i9 * f9;
        this.f408c = Math.min(i9 / 2, r1) * f9;
        int i10 = jVar.f427h;
        int i11 = jVar.f400a;
        float f12 = (i10 - i11) / 2.0f;
        this.f409d = f12;
        if (z9 || z10) {
            if ((z9 && jVar.f404e == 2) || (z10 && jVar.f405f == 1)) {
                this.f409d = (((1.0f - f9) * i11) / 2.0f) + f12;
            } else if ((z9 && jVar.f404e == 1) || (z10 && jVar.f405f == 2)) {
                this.f409d = f12 - (((1.0f - f9) * i11) / 2.0f);
            }
        }
        if (z10 && jVar.f405f == 3) {
            this.f411f = f9;
        } else {
            this.f411f = 1.0f;
        }
    }

    @Override // A5.p
    public final void c(Canvas canvas, Paint paint, o oVar, int i9) {
        int j = s8.n.j(oVar.f449c, i9);
        float f9 = oVar.f447a;
        float f10 = oVar.f448b;
        int i10 = oVar.f450d;
        g(canvas, paint, f9, f10, j, i10, i10);
    }

    @Override // A5.p
    public final void d(Canvas canvas, Paint paint, float f9, float f10, int i9, int i10, int i11) {
        g(canvas, paint, f9, f10, s8.n.j(i9, i10), i11, i11);
    }

    @Override // A5.p
    public final int e() {
        return i();
    }

    @Override // A5.p
    public final int f() {
        return i();
    }

    public final void g(Canvas canvas, Paint paint, float f9, float f10, int i9, int i10, int i11) {
        float f11;
        Paint.Cap cap;
        if (f10 >= f9) {
            f11 = f10 - f9;
        } else {
            f11 = (f10 + 1.0f) - f9;
        }
        float f12 = f9 % 1.0f;
        if (this.f411f < 1.0f) {
            float f13 = f12 + f11;
            if (f13 > 1.0f) {
                g(canvas, paint, f12, 1.0f, i9, i10, 0);
                g(canvas, paint, 1.0f, f13, i9, 0, i11);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f408c / this.f409d);
        if (f12 == 0.0f && f11 >= 0.99f) {
            f11 += (((degrees * 2.0f) / 360.0f) * (f11 - 0.99f)) / 0.01f;
        }
        float p9 = AbstractC1570b.p(1.0f - this.f411f, 1.0f, f12);
        float p10 = AbstractC1570b.p(0.0f, this.f411f, f11);
        float degrees2 = (float) Math.toDegrees(i10 / this.f409d);
        float degrees3 = ((p10 * 360.0f) - degrees2) - ((float) Math.toDegrees(i11 / this.f409d));
        float f14 = (p9 * 360.0f) + degrees2;
        if (degrees3 > 0.0f) {
            paint.setAntiAlias(true);
            paint.setColor(i9);
            paint.setStrokeWidth(this.f407b);
            float f15 = degrees * 2.0f;
            if (degrees3 < f15) {
                float f16 = degrees3 / f15;
                paint.setStyle(Paint.Style.FILL);
                h(canvas, paint, (degrees * f16) + f14, this.f408c * 2.0f, this.f407b, f16);
                return;
            }
            float f17 = this.f409d;
            float f18 = -f17;
            RectF rectF = new RectF(f18, f18, f17, f17);
            paint.setStyle(Paint.Style.STROKE);
            if (this.f410e) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            float f19 = f14 + degrees;
            canvas.drawArc(rectF, f19, degrees3 - f15, false, paint);
            if (!this.f410e && this.f408c > 0.0f) {
                paint.setStyle(Paint.Style.FILL);
                h(canvas, paint, f19, this.f408c * 2.0f, this.f407b, 1.0f);
                h(canvas, paint, (f14 + degrees3) - degrees, this.f408c * 2.0f, this.f407b, 1.0f);
            }
        }
    }

    public final void h(Canvas canvas, Paint paint, float f9, float f10, float f11, float f12) {
        float min = (int) Math.min(f11, this.f407b);
        float f13 = f10 / 2.0f;
        float min2 = Math.min(f13, (this.f408c * min) / this.f407b);
        RectF rectF = new RectF((-min) / 2.0f, (-f10) / 2.0f, min / 2.0f, f13);
        canvas.save();
        double d9 = f9;
        canvas.translate((float) (Math.cos(Math.toRadians(d9)) * this.f409d), (float) (Math.sin(Math.toRadians(d9)) * this.f409d));
        canvas.rotate(f9);
        canvas.scale(f12, f12);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int i() {
        e eVar = this.f451a;
        return (((j) eVar).f428i * 2) + ((j) eVar).f427h;
    }

    @Override // A5.p
    public final void b(Canvas canvas, Paint paint, int i9, int i10) {
    }
}
