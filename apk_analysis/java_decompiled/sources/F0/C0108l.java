package F0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: F0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0109m f2142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2143c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0111o f2145e;

    public /* synthetic */ C0108l(C0111o c0111o, C0109m c0109m, ViewPropertyAnimator viewPropertyAnimator, View view, int i9) {
        this.f2141a = i9;
        this.f2145e = c0111o;
        this.f2142b = c0109m;
        this.f2143c = viewPropertyAnimator;
        this.f2144d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2141a) {
            case 0:
                this.f2143c.setListener(null);
                View view = this.f2144d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0109m c0109m = this.f2142b;
                r0 r0Var = c0109m.f2153a;
                C0111o c0111o = this.f2145e;
                c0111o.c(r0Var);
                c0111o.f2188r.remove(c0109m.f2153a);
                c0111o.i();
                return;
            default:
                this.f2143c.setListener(null);
                View view2 = this.f2144d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0109m c0109m2 = this.f2142b;
                r0 r0Var2 = c0109m2.f2154b;
                C0111o c0111o2 = this.f2145e;
                c0111o2.c(r0Var2);
                c0111o2.f2188r.remove(c0109m2.f2154b);
                c0111o2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2141a) {
            case 0:
                r0 r0Var = this.f2142b.f2153a;
                this.f2145e.getClass();
                return;
            default:
                r0 r0Var2 = this.f2142b.f2154b;
                this.f2145e.getClass();
                return;
        }
    }
}
