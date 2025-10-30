package F0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: F0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117v extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2244a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0119x f2245b;

    public C0117v(C0119x c0119x) {
        this.f2245b = c0119x;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2244a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2244a) {
            this.f2244a = false;
            return;
        }
        C0119x c0119x = this.f2245b;
        if (((Float) c0119x.f2284z.getAnimatedValue()).floatValue() == 0.0f) {
            c0119x.f2258A = 0;
            c0119x.f(0);
        } else {
            c0119x.f2258A = 2;
            c0119x.f2277s.invalidate();
        }
    }
}
