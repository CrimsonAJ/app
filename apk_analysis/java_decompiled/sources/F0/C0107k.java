package F0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: F0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f2134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0111o f2139f;

    public C0107k(C0111o c0111o, r0 r0Var, int i9, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2139f = c0111o;
        this.f2134a = r0Var;
        this.f2135b = i9;
        this.f2136c = view;
        this.f2137d = i10;
        this.f2138e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i9 = this.f2135b;
        View view = this.f2136c;
        if (i9 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2137d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2138e.setListener(null);
        C0111o c0111o = this.f2139f;
        r0 r0Var = this.f2134a;
        c0111o.c(r0Var);
        c0111o.f2186p.remove(r0Var);
        c0111o.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2139f.getClass();
    }
}
