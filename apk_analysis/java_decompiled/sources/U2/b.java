package U2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f7284c;

    public /* synthetic */ b(d dVar, View view, int i9) {
        this.f7282a = i9;
        this.f7284c = dVar;
        this.f7283b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7282a) {
            case 0:
                super.onAnimationEnd(animator);
                d dVar = this.f7284c;
                dVar.f7294e = false;
                dVar.f7290a = false;
                View view = this.f7283b;
                view.setAlpha(0.0f);
                view.setVisibility(4);
                return;
            default:
                super.onAnimationEnd(animator);
                d dVar2 = this.f7284c;
                dVar2.f7293d = false;
                dVar2.f7291b = false;
                this.f7283b.setVisibility(4);
                return;
        }
    }
}
