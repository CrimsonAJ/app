package z5;

import android.animation.ValueAnimator;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2248a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f25419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2250c f25420b;

    public C2248a(AbstractC2250c abstractC2250c, float f9) {
        this.f25420b = abstractC2250c;
        this.f25419a = f9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f25420b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f25419a);
    }
}
