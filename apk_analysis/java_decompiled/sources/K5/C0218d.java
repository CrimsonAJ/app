package K5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: K5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4319b;

    public /* synthetic */ C0218d(e eVar, int i9) {
        this.f4318a = i9;
        this.f4319b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f4318a) {
            case 1:
                this.f4319b.f4379b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4318a) {
            case 0:
                this.f4319b.f4379b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
