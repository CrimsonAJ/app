package i;

import android.app.Dialog;
import android.os.Bundle;
import i0.DialogInterfaceOnCancelListenerC1358n;

/* loaded from: classes.dex */
public class z extends DialogInterfaceOnCancelListenerC1358n {
    @Override // i0.DialogInterfaceOnCancelListenerC1358n
    public Dialog g0(Bundle bundle) {
        return new y(m(), this.f18343A0);
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n
    public final void j0(Dialog dialog, int i9) {
        if (dialog instanceof y) {
            y yVar = (y) dialog;
            if (i9 != 1 && i9 != 2) {
                if (i9 != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            yVar.d().f(1);
            return;
        }
        super.j0(dialog, i9);
    }
}
