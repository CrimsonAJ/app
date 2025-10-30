package F5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class s extends u {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f2548h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f2549b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2550c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2551d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2552e;

    /* renamed from: f, reason: collision with root package name */
    public float f2553f;

    /* renamed from: g, reason: collision with root package name */
    public float f2554g;

    public s(float f9, float f10, float f11, float f12) {
        this.f2549b = f9;
        this.f2550c = f10;
        this.f2551d = f11;
        this.f2552e = f12;
    }

    @Override // F5.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2557a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f2548h;
        rectF.set(this.f2549b, this.f2550c, this.f2551d, this.f2552e);
        path.arcTo(rectF, this.f2553f, this.f2554g, false);
        path.transform(matrix);
    }
}
