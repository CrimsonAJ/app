package A5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class v extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f472b;

    public /* synthetic */ v(w wVar, int i9) {
        this.f471a = i9;
        this.f472b = wVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f471a) {
            case 1:
                super.onAnimationEnd(animator);
                w wVar = this.f472b;
                wVar.c();
                c cVar = wVar.j;
                if (cVar != null) {
                    cVar.a((r) wVar.f452a);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f471a) {
            case 0:
                super.onAnimationRepeat(animator);
                w wVar = this.f472b;
                wVar.f480g = (wVar.f480g + 1) % wVar.f479f.f402c.length;
                wVar.f481h = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
