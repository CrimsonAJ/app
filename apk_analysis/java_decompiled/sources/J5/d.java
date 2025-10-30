package J5;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f4192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f4194c;

    public d(e eVar, View view, View view2) {
        this.f4194c = eVar;
        this.f4192a = view;
        this.f4193b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4194c.c(this.f4192a, this.f4193b, valueAnimator.getAnimatedFraction());
    }
}
