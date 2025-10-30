package V0;

import android.animation.Animator;

/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f7581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f7582b;

    public c(e eVar, d dVar) {
        this.f7582b = eVar;
        this.f7581a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f7582b;
        d dVar = this.f7581a;
        eVar.a(1.0f, dVar, true);
        dVar.f7592k = dVar.f7587e;
        dVar.f7593l = dVar.f7588f;
        dVar.f7594m = dVar.f7589g;
        dVar.a((dVar.j + 1) % dVar.f7591i.length);
        if (eVar.f7611f) {
            eVar.f7611f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (dVar.f7595n) {
                dVar.f7595n = false;
                return;
            }
            return;
        }
        eVar.f7610e += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7582b.f7610e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
