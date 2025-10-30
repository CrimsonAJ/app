package X0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class v {
    public static int a(ViewGroup viewGroup, int i9) {
        return viewGroup.getChildDrawingOrder(i9);
    }

    public static void b(ViewGroup viewGroup, boolean z9) {
        viewGroup.suppressLayout(z9);
    }
}
