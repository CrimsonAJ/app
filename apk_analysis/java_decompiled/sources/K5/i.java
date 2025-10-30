package K5;

import Q2.AbstractC0364g;
import android.animation.ValueAnimator;
import com.anilab.android.ui.views.FreakLoading;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4333b;

    public /* synthetic */ i(int i9, Object obj) {
        this.f4332a = i9;
        this.f4333b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        Object obj = this.f4333b;
        switch (this.f4332a) {
            case 0:
                l lVar = (l) obj;
                lVar.getClass();
                lVar.f4381d.setAlpha(((Float) it.getAnimatedValue()).floatValue());
                return;
            case 1:
                AbstractC0364g abstractC0364g = (AbstractC0364g) obj;
                abstractC0364g.getClass();
                abstractC0364g.f6236g0 = ((Float) it.getAnimatedValue()).floatValue();
                abstractC0364g.invalidate(abstractC0364g.f6228a);
                return;
            default:
                int i9 = FreakLoading.f13853e;
                kotlin.jvm.internal.h.e(it, "it");
                Object animatedValue = it.getAnimatedValue();
                kotlin.jvm.internal.h.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                FreakLoading freakLoading = (FreakLoading) obj;
                freakLoading.f13857d = ((Float) animatedValue).floatValue();
                if (freakLoading.getVisibility() == 0) {
                    freakLoading.invalidate();
                    return;
                }
                return;
        }
    }
}
