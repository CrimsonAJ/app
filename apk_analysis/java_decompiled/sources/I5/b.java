package I5;

import android.animation.ValueAnimator;
import k0.C1478a;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f3527b;

    public /* synthetic */ b(j jVar, int i9, byte b9) {
        this.f3526a = i9;
        this.f3527b = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        j jVar = this.f3527b;
        switch (this.f3526a) {
            case 0:
                jVar.f3561i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.f3561i.setScaleX(floatValue);
                jVar.f3561i.setScaleY(floatValue);
                return;
            case 2:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C1478a c1478a = j.f3548v;
                jVar.f3561i.setTranslationY(intValue);
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C1478a c1478a2 = j.f3548v;
                jVar.f3561i.setTranslationY(intValue2);
                return;
        }
    }

    public b(j jVar, int i9) {
        this.f3526a = 2;
        this.f3527b = jVar;
    }
}
