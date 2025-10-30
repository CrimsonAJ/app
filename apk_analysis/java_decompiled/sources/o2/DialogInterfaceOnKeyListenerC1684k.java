package o2;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: o2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnKeyListenerC1684k implements DialogInterface.OnKeyListener {
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i9, KeyEvent keyEvent) {
        String str = C1685l.f21533M0;
        kotlin.jvm.internal.h.e(dialogInterface, "<unused var>");
        kotlin.jvm.internal.h.e(keyEvent, "keyEvent");
        if (i9 == 4 && keyEvent.getAction() == 1) {
            return true;
        }
        return false;
    }
}
