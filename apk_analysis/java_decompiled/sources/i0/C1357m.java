package i0;

import B6.u0;
import android.app.Dialog;
import android.view.View;

/* renamed from: i0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357m extends u0 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1361q f18341n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1358n f18342o;

    public C1357m(DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n, C1361q c1361q) {
        this.f18342o = dialogInterfaceOnCancelListenerC1358n;
        this.f18341n = c1361q;
    }

    @Override // B6.u0
    public final View G(int i9) {
        C1361q c1361q = this.f18341n;
        if (c1361q.H()) {
            return c1361q.G(i9);
        }
        Dialog dialog = this.f18342o.f18349G0;
        if (dialog != null) {
            return dialog.findViewById(i9);
        }
        return null;
    }

    @Override // B6.u0
    public final boolean H() {
        if (!this.f18341n.H() && !this.f18342o.f18353K0) {
            return false;
        }
        return true;
    }
}
