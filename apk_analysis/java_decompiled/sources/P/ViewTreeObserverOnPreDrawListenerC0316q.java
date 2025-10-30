package P;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: P.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0316q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f5634a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f5635b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f5636c;

    public ViewTreeObserverOnPreDrawListenerC0316q(View view, Runnable runnable) {
        this.f5634a = view;
        this.f5635b = view.getViewTreeObserver();
        this.f5636c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            ViewTreeObserverOnPreDrawListenerC0316q viewTreeObserverOnPreDrawListenerC0316q = new ViewTreeObserverOnPreDrawListenerC0316q(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0316q);
            view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0316q);
            return;
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f5635b.isAlive();
        View view = this.f5634a;
        if (isAlive) {
            this.f5635b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f5636c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f5635b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f5635b.isAlive();
        View view2 = this.f5634a;
        if (isAlive) {
            this.f5635b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
