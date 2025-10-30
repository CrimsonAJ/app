package F5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class r extends v {

    /* renamed from: c, reason: collision with root package name */
    public final t f2545c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2546d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2547e;

    public r(t tVar, float f9, float f10) {
        this.f2545c = tVar;
        this.f2546d = f9;
        this.f2547e = f10;
    }

    @Override // F5.v
    public final void a(Matrix matrix, E5.a aVar, int i9, Canvas canvas) {
        t tVar = this.f2545c;
        float f9 = tVar.f2556c;
        float f10 = this.f2547e;
        float f11 = tVar.f2555b;
        float f12 = this.f2546d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f9 - f10, f11 - f12), 0.0f);
        Matrix matrix2 = this.f2559a;
        matrix2.set(matrix);
        matrix2.preTranslate(f12, f10);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i9;
        rectF.offset(0.0f, -i9);
        int[] iArr = E5.a.f1944i;
        iArr[0] = aVar.f1952f;
        iArr[1] = aVar.f1951e;
        iArr[2] = aVar.f1950d;
        Paint paint = aVar.f1949c;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, E5.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        t tVar = this.f2545c;
        return (float) Math.toDegrees(Math.atan((tVar.f2556c - this.f2547e) / (tVar.f2555b - this.f2546d)));
    }
}
