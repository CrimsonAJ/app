package P;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class I {
    public static u0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        u0 g9 = u0.g(null, rootWindowInsets);
        r0 r0Var = g9.f5645a;
        r0Var.q(g9);
        r0Var.d(view.getRootView());
        return g9;
    }

    public static void b(View view, int i9, int i10) {
        view.setScrollIndicators(i9, i10);
    }
}
