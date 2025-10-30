package X0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class D extends AnimatorListenerAdapter implements j {

    /* renamed from: a, reason: collision with root package name */
    public final View f8140a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8141b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f8142c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8144e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8145f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8143d = true;

    public D(View view, int i9) {
        this.f8140a = view;
        this.f8141b = i9;
        this.f8142c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // X0.j
    public final void b(m mVar) {
        mVar.A(this);
    }

    @Override // X0.j
    public final void c(m mVar) {
    }

    @Override // X0.j
    public final void d() {
        h(false);
        if (!this.f8145f) {
            w.b(this.f8140a, this.f8141b);
        }
    }

    @Override // X0.j
    public final void e() {
        h(true);
        if (!this.f8145f) {
            w.b(this.f8140a, 0);
        }
    }

    @Override // X0.j
    public final void f(m mVar) {
        throw null;
    }

    @Override // X0.j
    public final void g(m mVar) {
        mVar.A(this);
    }

    public final void h(boolean z9) {
        ViewGroup viewGroup;
        if (this.f8143d && this.f8144e != z9 && (viewGroup = this.f8142c) != null) {
            this.f8144e = z9;
            v4.e.R(viewGroup, z9);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f8145f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f8145f) {
            w.b(this.f8140a, this.f8141b);
            ViewGroup viewGroup = this.f8142c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z9) {
        if (z9) {
            w.b(this.f8140a, 0);
            ViewGroup viewGroup = this.f8142c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z9) {
        if (z9) {
            return;
        }
        if (!this.f8145f) {
            w.b(this.f8140a, this.f8141b);
            ViewGroup viewGroup = this.f8142c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // X0.j
    public final void a(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
