package P;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import s.C1935e;

/* loaded from: classes.dex */
public final class W extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5562c;

    public /* synthetic */ W(Object obj, View view, int i9) {
        this.f5560a = i9;
        this.f5562c = obj;
        this.f5561b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f5560a) {
            case 0:
                ((Y) this.f5562c).b();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5560a) {
            case 0:
                ((Y) this.f5562c).a();
                return;
            case 1:
                ((f0) this.f5562c).f5595a.d(1.0f);
                b0.e((View) this.f5561b);
                return;
            default:
                ((C1935e) this.f5562c).remove(animator);
                ((X0.m) this.f5561b).f8207n.remove(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f5560a) {
            case 0:
                ((Y) this.f5562c).c();
                return;
            case 1:
            default:
                super.onAnimationStart(animator);
                return;
            case 2:
                ((X0.m) this.f5561b).f8207n.add(animator);
                return;
        }
    }

    public W(X0.m mVar, C1935e c1935e) {
        this.f5560a = 2;
        this.f5561b = mVar;
        this.f5562c = c1935e;
    }
}
