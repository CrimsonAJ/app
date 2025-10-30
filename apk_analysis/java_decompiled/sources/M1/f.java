package M1;

import a.AbstractC0485a;
import android.content.DialogInterface;
import android.widget.FrameLayout;
import co.notix.R;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4712a;

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Object h7;
        Object h9;
        switch (this.f4712a) {
            case 0:
                try {
                    kotlin.jvm.internal.h.c(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                    Object findViewById = ((m5.f) dialogInterface).findViewById(R.id.design_bottom_sheet);
                    kotlin.jvm.internal.h.c(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
                    h9 = (FrameLayout) findViewById;
                } catch (Throwable th) {
                    h9 = AbstractC0485a.h(th);
                }
                if (!(h9 instanceof A7.i)) {
                    FrameLayout frameLayout = (FrameLayout) h9;
                    frameLayout.setFitsSystemWindows(true);
                    frameLayout.setBackgroundColor(0);
                    return;
                }
                return;
            default:
                try {
                    kotlin.jvm.internal.h.c(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                    Object findViewById2 = ((m5.f) dialogInterface).findViewById(R.id.design_bottom_sheet);
                    kotlin.jvm.internal.h.c(findViewById2, "null cannot be cast to non-null type android.widget.FrameLayout");
                    h7 = (FrameLayout) findViewById2;
                } catch (Throwable th2) {
                    h7 = AbstractC0485a.h(th2);
                }
                if (!(h7 instanceof A7.i)) {
                    FrameLayout frameLayout2 = (FrameLayout) h7;
                    frameLayout2.setFitsSystemWindows(true);
                    frameLayout2.setBackgroundColor(0);
                    return;
                }
                return;
        }
    }
}
