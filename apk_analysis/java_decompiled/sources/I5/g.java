package I5;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import k0.C1478a;

/* loaded from: classes.dex */
public final class g implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3533a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f3534b;

    public g(l lVar, RelativeLayout relativeLayout) {
        this.f3533a = new WeakReference(lVar);
        this.f3534b = new WeakReference(relativeLayout);
    }

    public final void a() {
        WeakReference weakReference = this.f3534b;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            View view = (View) weakReference.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        weakReference.clear();
        this.f3533a.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference weakReference = this.f3533a;
        if (weakReference.get() == null) {
            a();
            return;
        }
        j jVar = (j) weakReference.get();
        C1478a c1478a = j.f3548v;
        jVar.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f3533a.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f3533a.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
