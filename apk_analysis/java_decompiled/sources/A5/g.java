package A5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f413b;

    public /* synthetic */ g(i iVar, int i9) {
        this.f412a = i9;
        this.f413b = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f412a) {
            case 1:
                super.onAnimationEnd(animator);
                i iVar = this.f413b;
                iVar.c();
                c cVar = iVar.j;
                if (cVar != null) {
                    cVar.a((r) iVar.f452a);
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
        switch (this.f412a) {
            case 0:
                super.onAnimationRepeat(animator);
                i iVar = this.f413b;
                iVar.f424g = (iVar.f424g + 4) % iVar.f423f.f402c.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
