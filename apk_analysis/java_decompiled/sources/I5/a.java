package I5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f3525b;

    public /* synthetic */ a(j jVar, int i9) {
        this.f3524a = i9;
        this.f3525b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3524a) {
            case 0:
                this.f3525b.c();
                return;
            case 1:
                this.f3525b.d();
                return;
            case 2:
                this.f3525b.c();
                return;
            default:
                this.f3525b.d();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3524a) {
            case 1:
                j jVar = this.f3525b;
                SnackbarContentLayout snackbarContentLayout = jVar.j;
                int i9 = jVar.f3555c;
                int i10 = jVar.f3553a;
                int i11 = i9 - i10;
                snackbarContentLayout.f16114a.setAlpha(0.0f);
                long j = i10;
                ViewPropertyAnimator duration = snackbarContentLayout.f16114a.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f16116c;
                long j4 = i11;
                duration.setInterpolator(timeInterpolator).setStartDelay(j4).start();
                if (snackbarContentLayout.f16115b.getVisibility() == 0) {
                    snackbarContentLayout.f16115b.setAlpha(0.0f);
                    snackbarContentLayout.f16115b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j4).start();
                    return;
                }
                return;
            case 2:
                j jVar2 = this.f3525b;
                SnackbarContentLayout snackbarContentLayout2 = jVar2.j;
                snackbarContentLayout2.f16114a.setAlpha(1.0f);
                ViewPropertyAnimator alpha = snackbarContentLayout2.f16114a.animate().alpha(0.0f);
                long j9 = jVar2.f3554b;
                ViewPropertyAnimator duration2 = alpha.setDuration(j9);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.f16116c;
                long j10 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j10).start();
                if (snackbarContentLayout2.f16115b.getVisibility() == 0) {
                    snackbarContentLayout2.f16115b.setAlpha(1.0f);
                    snackbarContentLayout2.f16115b.animate().alpha(0.0f).setDuration(j9).setInterpolator(timeInterpolator2).setStartDelay(j10).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ a(j jVar, int i9, int i10) {
        this.f3524a = i10;
        this.f3525b = jVar;
    }
}
