package F5;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class t extends u {

    /* renamed from: b, reason: collision with root package name */
    public float f2555b;

    /* renamed from: c, reason: collision with root package name */
    public float f2556c;

    @Override // F5.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2557a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f2555b, this.f2556c);
        path.transform(matrix);
    }
}
