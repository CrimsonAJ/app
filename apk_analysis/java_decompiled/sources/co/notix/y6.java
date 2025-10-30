package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import co.notix.appopen.AppOpenActivity;

/* loaded from: classes.dex */
public final class y6 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppOpenActivity f13578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(AppOpenActivity appOpenActivity, E7.d dVar) {
        super(2, dVar);
        this.f13578b = appOpenActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new y6(this.f13578b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y6) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13577a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f13577a = 1;
            if (B.g(2050L, this) == aVar) {
                return aVar;
            }
        }
        AppOpenActivity appOpenActivity = this.f13578b;
        int i10 = AppOpenActivity.f11873u;
        appOpenActivity.getClass();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new k6(appOpenActivity));
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setInterpolator(new AccelerateInterpolator());
        alphaAnimation2.setDuration(300L);
        alphaAnimation2.setAnimationListener(new l6(appOpenActivity, alphaAnimation));
        Object value = appOpenActivity.f11889q.getValue();
        kotlin.jvm.internal.h.d(value, "<get-pbContinue>(...)");
        ((ProgressBar) value).startAnimation(alphaAnimation2);
        return A7.n.f558a;
    }
}
