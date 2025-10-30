package i0;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: i0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC1355k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1358n f18339a;

    public DialogInterfaceOnDismissListenerC1355k(DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n) {
        this.f18339a = dialogInterfaceOnCancelListenerC1358n;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n = this.f18339a;
        Dialog dialog = dialogInterfaceOnCancelListenerC1358n.f18349G0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC1358n.onDismiss(dialog);
        }
    }
}
