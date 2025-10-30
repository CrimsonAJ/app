package P;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class Z implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f5564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f5565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f5566c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f5568e;

    public Z(f0 f0Var, u0 u0Var, u0 u0Var2, int i9, View view) {
        this.f5564a = f0Var;
        this.f5565b = u0Var;
        this.f5566c = u0Var2;
        this.f5567d = i9;
        this.f5568e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        k0 g0Var;
        float f9;
        int i9;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        f0 f0Var = this.f5564a;
        f0Var.f5595a.d(animatedFraction);
        float b9 = f0Var.f5595a.b();
        PathInterpolator pathInterpolator = b0.f5575e;
        int i10 = Build.VERSION.SDK_INT;
        u0 u0Var = this.f5565b;
        if (i10 >= 34) {
            g0Var = new j0(u0Var);
        } else if (i10 >= 30) {
            g0Var = new i0(u0Var);
        } else if (i10 >= 29) {
            g0Var = new h0(u0Var);
        } else {
            g0Var = new g0(u0Var);
        }
        int i11 = 1;
        while (i11 <= 512) {
            int i12 = this.f5567d & i11;
            r0 r0Var = u0Var.f5645a;
            if (i12 == 0) {
                g0Var.c(i11, r0Var.f(i11));
                f9 = b9;
                i9 = 1;
            } else {
                H.c f10 = r0Var.f(i11);
                H.c f11 = this.f5566c.f5645a.f(i11);
                float f12 = 1.0f - b9;
                f9 = b9;
                i9 = 1;
                g0Var.c(i11, u0.e(f10, (int) (((f10.f2914a - f11.f2914a) * f12) + 0.5d), (int) (((f10.f2915b - f11.f2915b) * f12) + 0.5d), (int) (((f10.f2916c - f11.f2916c) * f12) + 0.5d), (int) (((f10.f2917d - f11.f2917d) * f12) + 0.5d)));
            }
            i11 <<= i9;
            b9 = f9;
        }
        b0.g(this.f5568e, g0Var.b(), Collections.singletonList(f0Var));
    }
}
