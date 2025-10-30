package P;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5563a;

    public X(View view) {
        this.f5563a = new WeakReference(view);
    }

    public final void a(float f9) {
        View view = (View) this.f5563a.get();
        if (view != null) {
            view.animate().alpha(f9);
        }
    }

    public final void b() {
        View view = (View) this.f5563a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f5563a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(Y y9) {
        View view = (View) this.f5563a.get();
        if (view != null) {
            if (y9 != null) {
                view.animate().setListener(new W(y9, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f9) {
        View view = (View) this.f5563a.get();
        if (view != null) {
            view.animate().translationY(f9);
        }
    }
}
