package Q2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f6124b;

    public /* synthetic */ G(I i9, int i10) {
        this.f6123a = i10;
        this.f6124b = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f6123a) {
            case 0:
                I i9 = this.f6124b;
                View view = i9.f6132b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = i9.f6133c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = i9.f6135e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    return;
                }
                return;
            case 1:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                this.f6124b.i(0);
                return;
            case 3:
                this.f6124b.i(0);
                return;
            case 4:
                ViewGroup viewGroup3 = this.f6124b.f6136f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    return;
                }
                return;
            case 5:
                ViewGroup viewGroup4 = this.f6124b.f6138h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i9 = 4;
        I i10 = this.f6124b;
        switch (this.f6123a) {
            case 0:
                View view = i10.j;
                if ((view instanceof AbstractC0364g) && !i10.f6128A) {
                    AbstractC0364g abstractC0364g = (AbstractC0364g) view;
                    ValueAnimator valueAnimator = abstractC0364g.f6234f0;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(abstractC0364g.f6236g0, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    return;
                }
                return;
            case 1:
                View view2 = i10.f6132b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = i10.f6133c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = i10.f6135e;
                if (viewGroup2 != null) {
                    if (i10.f6128A) {
                        i9 = 0;
                    }
                    viewGroup2.setVisibility(i9);
                }
                View view3 = i10.j;
                if ((view3 instanceof AbstractC0364g) && !i10.f6128A) {
                    AbstractC0364g abstractC0364g2 = (AbstractC0364g) view3;
                    ValueAnimator valueAnimator2 = abstractC0364g2.f6234f0;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    abstractC0364g2.f6238h0 = false;
                    valueAnimator2.setFloatValues(abstractC0364g2.f6236g0, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    return;
                }
                return;
            case 2:
                i10.i(4);
                return;
            case 3:
                i10.i(4);
                return;
            case 4:
                ViewGroup viewGroup3 = i10.f6138h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    i10.f6138h.setTranslationX(r9.getWidth());
                    ViewGroup viewGroup4 = i10.f6138h;
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    return;
                }
                return;
            default:
                ViewGroup viewGroup5 = i10.f6136f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
