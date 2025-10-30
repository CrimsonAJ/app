package o;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class u implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f21440a;

    public u(v vVar) {
        this.f21440a = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f21440a.c();
    }
}
