package V0;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f7579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f7580b;

    public b(e eVar, d dVar) {
        this.f7580b = eVar;
        this.f7579a = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e eVar = this.f7580b;
        eVar.getClass();
        d dVar = this.f7579a;
        e.d(floatValue, dVar);
        eVar.a(floatValue, dVar, false);
        eVar.invalidateSelf();
    }
}
