package B4;

import F4.y;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import i0.DialogInterfaceOnCancelListenerC1358n;

/* loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC1358n {

    /* renamed from: L0, reason: collision with root package name */
    public AlertDialog f706L0;

    /* renamed from: M0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f707M0;

    /* renamed from: N0, reason: collision with root package name */
    public AlertDialog f708N0;

    @Override // i0.DialogInterfaceOnCancelListenerC1358n
    public final Dialog g0(Bundle bundle) {
        AlertDialog alertDialog = this.f706L0;
        if (alertDialog == null) {
            this.f18345C0 = false;
            if (this.f708N0 == null) {
                Context m9 = m();
                y.h(m9);
                this.f708N0 = new AlertDialog.Builder(m9).create();
            }
            return this.f708N0;
        }
        return alertDialog;
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f707M0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
