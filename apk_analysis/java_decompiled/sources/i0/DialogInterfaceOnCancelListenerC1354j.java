package i0;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: i0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC1354j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1358n f18338a;

    public DialogInterfaceOnCancelListenerC1354j(DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n) {
        this.f18338a = dialogInterfaceOnCancelListenerC1358n;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n = this.f18338a;
        Dialog dialog = dialogInterfaceOnCancelListenerC1358n.f18349G0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC1358n.onCancel(dialog);
        }
    }
}
