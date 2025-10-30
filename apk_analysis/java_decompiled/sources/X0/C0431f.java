package X0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import co.notix.R;

/* renamed from: X0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431f extends AnimatorListenerAdapter implements j {

    /* renamed from: a, reason: collision with root package name */
    public final View f8176a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8177b = false;

    public C0431f(View view) {
        this.f8176a = view;
    }

    @Override // X0.j
    public final void b(m mVar) {
    }

    @Override // X0.j
    public final void d() {
        float f9;
        View view = this.f8176a;
        if (view.getVisibility() == 0) {
            f9 = w.f8229a.z(view);
        } else {
            f9 = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f9));
    }

    @Override // X0.j
    public final void e() {
        this.f8176a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // X0.j
    public final void f(m mVar) {
        throw null;
    }

    @Override // X0.j
    public final void g(m mVar) {
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f8229a.I(this.f8176a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f8176a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f8177b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z9) {
        boolean z10 = this.f8177b;
        View view = this.f8176a;
        if (z10) {
            view.setLayerType(0, null);
        }
        if (z9) {
            return;
        }
        B b9 = w.f8229a;
        b9.I(view, 1.0f);
        b9.getClass();
    }

    @Override // X0.j
    public final void a(m mVar) {
    }

    @Override // X0.j
    public final void c(m mVar) {
    }
}
