package p;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import o.ViewTreeObserverOnGlobalLayoutListenerC1663d;

/* renamed from: p.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1746H implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1663d f21815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1748I f21816b;

    public C1746H(C1748I c1748i, ViewTreeObserverOnGlobalLayoutListenerC1663d viewTreeObserverOnGlobalLayoutListenerC1663d) {
        this.f21816b = c1748i;
        this.f21815a = viewTreeObserverOnGlobalLayoutListenerC1663d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f21816b.f21821f0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f21815a);
        }
    }
}
