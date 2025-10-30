package k;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f19843a;

    /* renamed from: b, reason: collision with root package name */
    public int f19844b;

    /* renamed from: c, reason: collision with root package name */
    public int f19845c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        float f10;
        int i9 = (int) ((f9 * this.f19845c) + 0.5f);
        int i10 = this.f19844b;
        int[] iArr = this.f19843a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i9 < i12) {
                break;
            }
            i9 -= i12;
            i11++;
        }
        if (i11 < i10) {
            f10 = i9 / this.f19845c;
        } else {
            f10 = 0.0f;
        }
        return (i11 / i10) + f10;
    }
}
