package i0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: i0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1324A implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1343U f18164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C1325B f18165b;

    public ViewOnAttachStateChangeListenerC1324A(LayoutInflaterFactory2C1325B layoutInflaterFactory2C1325B, C1343U c1343u) {
        this.f18165b = layoutInflaterFactory2C1325B;
        this.f18164a = c1343u;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C1343U c1343u = this.f18164a;
        c1343u.k();
        C1353i.f((ViewGroup) c1343u.f18251c.Y.getParent(), this.f18165b.f18166a).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
