package i0;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC0561w;

/* renamed from: i0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1356l implements androidx.lifecycle.F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1358n f18340a;

    public C1356l(DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n) {
        this.f18340a = dialogInterfaceOnCancelListenerC1358n;
    }

    @Override // androidx.lifecycle.F
    public final void a(Object obj) {
        if (((InterfaceC0561w) obj) != null) {
            DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n = this.f18340a;
            if (dialogInterfaceOnCancelListenerC1358n.f18345C0) {
                View Z6 = dialogInterfaceOnCancelListenerC1358n.Z();
                if (Z6.getParent() == null) {
                    if (dialogInterfaceOnCancelListenerC1358n.f18349G0 != null) {
                        if (AbstractC1336M.H(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC1358n.f18349G0);
                        }
                        dialogInterfaceOnCancelListenerC1358n.f18349G0.setContentView(Z6);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
