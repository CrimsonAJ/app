package F0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* renamed from: F0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2127a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2129c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2131e;

    public C0106j(U2.d dVar, View view, FrameLayout frameLayout, View view2) {
        this.f2131e = dVar;
        this.f2129c = view;
        this.f2128b = frameLayout;
        this.f2130d = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2127a) {
            case 1:
                this.f2129c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2127a) {
            case 0:
                ((ViewPropertyAnimator) this.f2130d).setListener(null);
                this.f2129c.setAlpha(1.0f);
                C0111o c0111o = (C0111o) this.f2131e;
                r0 r0Var = (r0) this.f2128b;
                c0111o.c(r0Var);
                c0111o.f2187q.remove(r0Var);
                c0111o.i();
                return;
            case 1:
                ((ViewPropertyAnimator) this.f2130d).setListener(null);
                C0111o c0111o2 = (C0111o) this.f2131e;
                r0 r0Var2 = (r0) this.f2128b;
                c0111o2.c(r0Var2);
                c0111o2.f2185o.remove(r0Var2);
                c0111o2.i();
                return;
            default:
                super.onAnimationEnd(animator);
                U2.d dVar = (U2.d) this.f2131e;
                dVar.f7292c = false;
                View view = this.f2129c;
                view.setAlpha(1.0f);
                FrameLayout frameLayout = (FrameLayout) this.f2128b;
                if (frameLayout.isAttachedToWindow()) {
                    dVar.h(frameLayout, view, (View) this.f2130d);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2127a) {
            case 0:
                ((C0111o) this.f2131e).getClass();
                return;
            case 1:
                ((C0111o) this.f2131e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C0106j(C0111o c0111o, r0 r0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2131e = c0111o;
        this.f2128b = r0Var;
        this.f2130d = viewPropertyAnimator;
        this.f2129c = view;
    }

    public C0106j(C0111o c0111o, r0 r0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2131e = c0111o;
        this.f2128b = r0Var;
        this.f2129c = view;
        this.f2130d = viewPropertyAnimator;
    }
}
