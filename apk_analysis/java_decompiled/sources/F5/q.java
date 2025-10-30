package F5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class q extends v {

    /* renamed from: c, reason: collision with root package name */
    public final s f2544c;

    public q(s sVar) {
        this.f2544c = sVar;
    }

    @Override // F5.v
    public final void a(Matrix matrix, E5.a aVar, int i9, Canvas canvas) {
        boolean z9;
        s sVar = this.f2544c;
        float f9 = sVar.f2553f;
        float f10 = sVar.f2554g;
        RectF rectF = new RectF(sVar.f2549b, sVar.f2550c, sVar.f2551d, sVar.f2552e);
        aVar.getClass();
        if (f10 < 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Path path = aVar.f1953g;
        int[] iArr = E5.a.f1945k;
        if (z9) {
            iArr[0] = 0;
            iArr[1] = aVar.f1952f;
            iArr[2] = aVar.f1951e;
            iArr[3] = aVar.f1950d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f9, f10);
            path.close();
            float f11 = -i9;
            rectF.inset(f11, f11);
            iArr[0] = 0;
            iArr[1] = aVar.f1950d;
            iArr[2] = aVar.f1951e;
            iArr[3] = aVar.f1952f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f12 = 1.0f - (i9 / width);
        float[] fArr = E5.a.f1946l;
        fArr[1] = f12;
        fArr[2] = ((1.0f - f12) / 2.0f) + f12;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f1948b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z9) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f1954h);
        }
        canvas.drawArc(rectF, f9, f10, true, paint);
        canvas.restore();
    }
}
