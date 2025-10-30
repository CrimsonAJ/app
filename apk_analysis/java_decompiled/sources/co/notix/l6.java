package co.notix;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import co.notix.appopen.AppOpenActivity;

/* loaded from: classes.dex */
public final class l6 implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppOpenActivity f12682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlphaAnimation f12683b;

    public l6(AppOpenActivity appOpenActivity, AlphaAnimation alphaAnimation) {
        this.f12682a = appOpenActivity;
        this.f12683b = alphaAnimation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AppOpenActivity appOpenActivity = this.f12682a;
        int i9 = AppOpenActivity.f11873u;
        Object value = appOpenActivity.f11889q.getValue();
        kotlin.jvm.internal.h.d(value, "<get-pbContinue>(...)");
        ((ProgressBar) value).setAlpha(0.0f);
        Object value2 = this.f12682a.f11890r.getValue();
        kotlin.jvm.internal.h.d(value2, "<get-ivContinue>(...)");
        ((ImageView) value2).startAnimation(this.f12683b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
