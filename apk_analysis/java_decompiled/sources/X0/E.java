package X0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import co.notix.R;

/* loaded from: classes.dex */
public final class E extends AnimatorListenerAdapter implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f8146a;

    /* renamed from: b, reason: collision with root package name */
    public final View f8147b;

    /* renamed from: c, reason: collision with root package name */
    public final View f8148c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8149d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f8150e;

    public E(g gVar, ViewGroup viewGroup, View view, View view2) {
        this.f8150e = gVar;
        this.f8146a = viewGroup;
        this.f8147b = view;
        this.f8148c = view2;
    }

    @Override // X0.j
    public final void a(m mVar) {
        if (this.f8149d) {
            h();
        }
    }

    @Override // X0.j
    public final void b(m mVar) {
        mVar.A(this);
    }

    @Override // X0.j
    public final void c(m mVar) {
    }

    @Override // X0.j
    public final void f(m mVar) {
        throw null;
    }

    @Override // X0.j
    public final void g(m mVar) {
        mVar.A(this);
    }

    public final void h() {
        this.f8148c.setTag(R.id.save_overlay_view, null);
        this.f8146a.getOverlay().remove(this.f8147b);
        this.f8149d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f8146a.getOverlay().remove(this.f8147b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f8147b;
        if (view.getParent() == null) {
            this.f8146a.getOverlay().add(view);
        } else {
            this.f8150e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z9) {
        if (z9) {
            View view = this.f8148c;
            View view2 = this.f8147b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f8146a.getOverlay().add(view2);
            this.f8149d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z9) {
        if (z9) {
            return;
        }
        h();
    }

    @Override // X0.j
    public final void d() {
    }

    @Override // X0.j
    public final void e() {
    }
}
