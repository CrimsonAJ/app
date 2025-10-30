package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.HashSet;

/* renamed from: androidx.mediarouter.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0571g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f10093a;

    public ViewTreeObserverOnGlobalLayoutListenerC0571g(s sVar) {
        this.f10093a = sVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        s sVar = this.f10093a;
        sVar.f10141X.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = sVar.f10143f0;
        if (hashSet != null && hashSet.size() != 0) {
            AnimationAnimationListenerC0577m animationAnimationListenerC0577m = new AnimationAnimationListenerC0577m(1, sVar);
            int firstVisiblePosition = sVar.f10141X.getFirstVisiblePosition();
            boolean z9 = false;
            for (int i9 = 0; i9 < sVar.f10141X.getChildCount(); i9++) {
                View childAt = sVar.f10141X.getChildAt(i9);
                if (sVar.f10143f0.contains((t0.C) sVar.Y.getItem(firstVisiblePosition + i9))) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(sVar.f10134G0);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    if (!z9) {
                        alphaAnimation.setAnimationListener(animationAnimationListenerC0577m);
                        z9 = true;
                    }
                    childAt.clearAnimation();
                    childAt.startAnimation(alphaAnimation);
                }
            }
            return;
        }
        sVar.j(true);
    }
}
