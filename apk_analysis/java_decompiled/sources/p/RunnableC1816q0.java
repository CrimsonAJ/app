package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: p.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1816q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC1818r0 f22059b;

    public /* synthetic */ RunnableC1816q0(AbstractViewOnTouchListenerC1818r0 abstractViewOnTouchListenerC1818r0, int i9) {
        this.f22058a = i9;
        this.f22059b = abstractViewOnTouchListenerC1818r0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22058a) {
            case 0:
                ViewParent parent = this.f22059b.f22067d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                AbstractViewOnTouchListenerC1818r0 abstractViewOnTouchListenerC1818r0 = this.f22059b;
                abstractViewOnTouchListenerC1818r0.a();
                View view = abstractViewOnTouchListenerC1818r0.f22067d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1818r0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC1818r0.f22070g = true;
                    return;
                }
                return;
        }
    }
}
