package B4;

import F4.y;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f688a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f689b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f690c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f689b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f688a;
        if (alertDialog == null) {
            setShowsDialog(false);
            if (this.f690c == null) {
                Activity activity = getActivity();
                y.h(activity);
                this.f690c = new AlertDialog.Builder(activity).create();
            }
            return this.f690c;
        }
        return alertDialog;
    }
}
