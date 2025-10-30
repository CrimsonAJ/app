package A5;

import B6.u0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class s extends p {

    /* renamed from: b, reason: collision with root package name */
    public float f457b;

    /* renamed from: c, reason: collision with root package name */
    public float f458c;

    /* renamed from: d, reason: collision with root package name */
    public float f459d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f460e;

    /* renamed from: f, reason: collision with root package name */
    public float f461f;

    @Override // A5.p
    public final void a(Canvas canvas, Rect rect, float f9, boolean z9, boolean z10) {
        boolean z11;
        this.f457b = rect.width();
        x xVar = (x) this.f451a;
        float f10 = xVar.f400a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f10) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (xVar.j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f11 = this.f457b / 2.0f;
        float f12 = f10 / 2.0f;
        canvas.clipRect(-f11, -f12, f11, f12);
        int i9 = xVar.f400a;
        if (i9 / 2 == xVar.f401b) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f460e = z11;
        this.f458c = i9 * f9;
        this.f459d = Math.min(i9 / 2, r6) * f9;
        if (z9 || z10) {
            if ((z9 && xVar.f404e == 2) || (z10 && xVar.f405f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z9 || (z10 && xVar.f405f != 3)) {
                canvas.translate(0.0f, ((1.0f - f9) * xVar.f400a) / 2.0f);
            }
        }
        if (z10 && xVar.f405f == 3) {
            this.f461f = f9;
        } else {
            this.f461f = 1.0f;
        }
    }

    @Override // A5.p
    public final void b(Canvas canvas, Paint paint, int i9, int i10) {
        int j = s8.n.j(i9, i10);
        x xVar = (x) this.f451a;
        if (xVar.f485k > 0 && j != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(j);
            PointF pointF = new PointF((this.f457b / 2.0f) - (this.f458c / 2.0f), 0.0f);
            int i11 = xVar.f485k;
            h(canvas, paint, pointF, null, i11, i11);
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
        return ((x) this.f451a).f400a;
    }

    @Override // A5.p
    public final int f() {
        return -1;
    }

    public final void g(Canvas canvas, Paint paint, float f9, float f10, int i9, int i10, int i11) {
        Paint.Cap cap;
        float f11;
        float j = u0.j(f9, 0.0f, 1.0f);
        float j4 = u0.j(f10, 0.0f, 1.0f);
        float p9 = AbstractC1570b.p(1.0f - this.f461f, 1.0f, j);
        float p10 = AbstractC1570b.p(1.0f - this.f461f, 1.0f, j4);
        int j9 = (int) ((u0.j(p9, 0.0f, 0.01f) * i10) / 0.01f);
        float j10 = 1.0f - u0.j(p10, 0.99f, 1.0f);
        float f12 = this.f457b;
        int i12 = (int) ((p9 * f12) + j9);
        int i13 = (int) ((p10 * f12) - ((int) ((j10 * i11) / 0.01f)));
        float f13 = (-f12) / 2.0f;
        if (i12 <= i13) {
            float f14 = this.f459d;
            float f15 = i12 + f14;
            float f16 = i13 - f14;
            float f17 = f14 * 2.0f;
            paint.setColor(i9);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f458c);
            if (f15 >= f16) {
                h(canvas, paint, new PointF(f15 + f13, 0.0f), new PointF(f16 + f13, 0.0f), f17, this.f458c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            if (this.f460e) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            float f18 = f15 + f13;
            float f19 = f16 + f13;
            canvas.drawLine(f18, 0.0f, f19, 0.0f, paint);
            if (!this.f460e && this.f459d > 0.0f) {
                paint.setStyle(Paint.Style.FILL);
                if (f15 > 0.0f) {
                    f11 = f17;
                    h(canvas, paint, new PointF(f18, 0.0f), null, f11, this.f458c);
                } else {
                    f11 = f17;
                }
                if (f16 < this.f457b) {
                    h(canvas, paint, new PointF(f19, 0.0f), null, f11, this.f458c);
                }
            }
        }
    }

    public final void h(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f9, float f10) {
        float min = Math.min(f10, this.f458c);
        float f11 = f9 / 2.0f;
        float min2 = Math.min(f11, (this.f459d * min) / this.f458c);
        RectF rectF = new RectF((-f9) / 2.0f, (-min) / 2.0f, f11, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
