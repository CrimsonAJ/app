package i0;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: i0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC1352h implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f18329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1353i f18330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f18331c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1349e f18332d;

    public AnimationAnimationListenerC1352h(View view, C1349e c1349e, C1353i c1353i, Z z9) {
        this.f18329a = z9;
        this.f18330b = c1353i;
        this.f18331c = view;
        this.f18332d = c1349e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.h.e(animation, "animation");
        C1353i c1353i = this.f18330b;
        c1353i.f18333a.post(new N3.E(c1353i, this.f18331c, this.f18332d, 7));
        if (AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f18329a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.h.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.h.e(animation, "animation");
        if (AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f18329a + " has reached onAnimationStart.");
        }
    }
}
