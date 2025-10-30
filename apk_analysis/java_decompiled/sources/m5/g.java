package m5;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import co.notix.R;
import i.y;
import i.z;

/* loaded from: classes.dex */
public class g extends z {
    @Override // i0.DialogInterfaceOnCancelListenerC1358n
    public final void e0() {
        Dialog dialog = this.f18349G0;
        if (dialog instanceof f) {
            f fVar = (f) dialog;
            if (fVar.f20846f == null) {
                fVar.f();
            }
            boolean z9 = fVar.f20846f.f15846I;
        }
        f0(false, false);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [m5.f, i.y, android.app.Dialog] */
    @Override // i.z, i0.DialogInterfaceOnCancelListenerC1358n
    public Dialog g0(Bundle bundle) {
        Context m9 = m();
        int i9 = this.f18343A0;
        if (i9 == 0) {
            TypedValue typedValue = new TypedValue();
            if (m9.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                i9 = typedValue.resourceId;
            } else {
                i9 = R.style.Theme_Design_Light_BottomSheetDialog;
            }
        }
        ?? yVar = new y(m9, i9);
        yVar.j = true;
        yVar.f20850k = true;
        yVar.f20855p = new d(yVar);
        yVar.d().f(1);
        yVar.f20853n = yVar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        return yVar;
    }

    public final void l0() {
        Dialog dialog = this.f18349G0;
        if (dialog instanceof f) {
            f fVar = (f) dialog;
            if (fVar.f20846f == null) {
                fVar.f();
            }
            boolean z9 = fVar.f20846f.f15846I;
        }
        f0(true, false);
    }
}
