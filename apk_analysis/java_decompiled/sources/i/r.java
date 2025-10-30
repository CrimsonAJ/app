package i;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import d.C1076q;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class r {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, w wVar) {
        Objects.requireNonNull(wVar);
        C1076q c1076q = new C1076q(1, wVar);
        Q.d.i(obj).registerOnBackInvokedCallback(1000000, c1076q);
        return c1076q;
    }

    public static void c(Object obj, Object obj2) {
        Q.d.i(obj).unregisterOnBackInvokedCallback(Q.d.e(obj2));
    }
}
