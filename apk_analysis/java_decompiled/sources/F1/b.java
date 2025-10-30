package F1;

import D1.g;
import D1.h;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.internal.measurement.Y1;
import s8.n;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f2316a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2317b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2318c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2319d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2320e;

    public b(float f9) {
        this.f2316a = f9;
        this.f2317b = f9;
        this.f2318c = f9;
        this.f2319d = f9;
        if (f9 >= 0.0f && f9 >= 0.0f && f9 >= 0.0f && f9 >= 0.0f) {
            this.f2320e = b.class.getName() + '-' + f9 + ',' + f9 + ',' + f9 + ',' + f9;
            return;
        }
        throw new IllegalArgumentException("All radii must be >= 0.");
    }

    @Override // F1.c
    public final Bitmap a(Bitmap bitmap, h hVar) {
        int i9;
        A7.h hVar2;
        Paint paint = new Paint(3);
        boolean a5 = kotlin.jvm.internal.h.a(hVar, h.f1776c);
        g gVar = g.f1773a;
        if (a5) {
            hVar2 = new A7.h(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        } else {
            n nVar = hVar.f1777a;
            boolean z9 = nVar instanceof D1.a;
            n nVar2 = hVar.f1778b;
            if (z9 && (nVar2 instanceof D1.a)) {
                hVar2 = new A7.h(Integer.valueOf(((D1.a) nVar).f1767m), Integer.valueOf(((D1.a) nVar2).f1767m));
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                n nVar3 = hVar.f1777a;
                int i10 = Integer.MIN_VALUE;
                if (nVar3 instanceof D1.a) {
                    i9 = ((D1.a) nVar3).f1767m;
                } else {
                    i9 = Integer.MIN_VALUE;
                }
                if (nVar2 instanceof D1.a) {
                    i10 = ((D1.a) nVar2).f1767m;
                }
                double b9 = M4.a.b(width, height, i9, i10, gVar);
                hVar2 = new A7.h(Integer.valueOf(Y1.D(bitmap.getWidth() * b9)), Integer.valueOf(Y1.D(b9 * bitmap.getHeight())));
            }
        }
        int intValue = ((Number) hVar2.f547a).intValue();
        int intValue2 = ((Number) hVar2.f548b).intValue();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float b10 = (float) M4.a.b(bitmap.getWidth(), bitmap.getHeight(), intValue, intValue2, gVar);
        float f9 = 2;
        matrix.setTranslate((intValue - (bitmap.getWidth() * b10)) / f9, (intValue2 - (bitmap.getHeight() * b10)) / f9);
        matrix.preScale(b10, b10);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f10 = this.f2316a;
        float f11 = this.f2317b;
        float f12 = this.f2319d;
        float f13 = this.f2318c;
        float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    @Override // F1.c
    public final String b() {
        return this.f2320e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f2316a == bVar.f2316a && this.f2317b == bVar.f2317b && this.f2318c == bVar.f2318c && this.f2319d == bVar.f2319d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2319d) + ((Float.floatToIntBits(this.f2318c) + ((Float.floatToIntBits(this.f2317b) + (Float.floatToIntBits(this.f2316a) * 31)) * 31)) * 31);
    }
}
