package F0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class O implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2052a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        switch (this.f2052a) {
            case 0:
                float f10 = f9 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            default:
                float f11 = f9 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
