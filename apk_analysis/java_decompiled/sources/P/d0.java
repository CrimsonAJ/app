package P;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class d0 extends e0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f5589e;

    public d0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f5589e = windowInsetsAnimation;
    }

    @Override // P.e0
    public final long a() {
        long durationMillis;
        durationMillis = this.f5589e.getDurationMillis();
        return durationMillis;
    }

    @Override // P.e0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f5589e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // P.e0
    public final int c() {
        int typeMask;
        typeMask = this.f5589e.getTypeMask();
        return typeMask;
    }

    @Override // P.e0
    public final void d(float f9) {
        this.f5589e.setFraction(f9);
    }
}
