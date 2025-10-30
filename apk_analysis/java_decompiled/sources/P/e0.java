package P;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5590a;

    /* renamed from: b, reason: collision with root package name */
    public float f5591b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f5592c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5593d;

    public e0(int i9, Interpolator interpolator, long j) {
        this.f5590a = i9;
        this.f5592c = interpolator;
        this.f5593d = j;
    }

    public long a() {
        return this.f5593d;
    }

    public float b() {
        Interpolator interpolator = this.f5592c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f5591b);
        }
        return this.f5591b;
    }

    public int c() {
        return this.f5590a;
    }

    public void d(float f9) {
        this.f5591b = f9;
    }
}
