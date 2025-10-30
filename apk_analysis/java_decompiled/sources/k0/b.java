package k0;

import android.view.animation.Interpolator;
import u0.z;

/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f19868a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19869b;

    public b(float[] fArr) {
        this.f19868a = fArr;
        this.f19869b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        if (f9 >= 1.0f) {
            return 1.0f;
        }
        if (f9 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f19868a;
        int min = Math.min((int) ((fArr.length - 1) * f9), fArr.length - 2);
        float f10 = this.f19869b;
        float f11 = (f9 - (min * f10)) / f10;
        float f12 = fArr[min];
        return z.b(fArr[min + 1], f12, f11, f12);
    }
}
