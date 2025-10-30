package U2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f7285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T2.d f7286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f7288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f7289e;

    public c(d dVar, FrameLayout frameLayout, T2.d dVar2, View view, View view2) {
        this.f7289e = dVar;
        this.f7285a = frameLayout;
        this.f7286b = dVar2;
        this.f7287c = view;
        this.f7288d = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        d dVar = this.f7289e;
        dVar.f7295f = false;
        dVar.i(this.f7285a, this.f7286b, this.f7287c, this.f7288d);
    }
}
