package j0;

import android.util.Log;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import kotlin.jvm.internal.h;

/* renamed from: j0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1430d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1429c f19185a = C1429c.f19184a;

    public static C1429c a(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        while (abstractComponentCallbacksC1366v != null) {
            if (abstractComponentCallbacksC1366v.y()) {
                abstractComponentCallbacksC1366v.o();
            }
            abstractComponentCallbacksC1366v = abstractComponentCallbacksC1366v.f18419v;
        }
        return f19185a;
    }

    public static void b(C1427a c1427a) {
        if (AbstractC1336M.H(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c1427a.f19178a.getClass().getName()), c1427a);
        }
    }

    public static final void c(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, String previousFragmentId) {
        h.e(previousFragmentId, "previousFragmentId");
        b(new C1427a(abstractComponentCallbacksC1366v, "Attempting to reuse fragment " + abstractComponentCallbacksC1366v + " with previous ID " + previousFragmentId));
        a(abstractComponentCallbacksC1366v).getClass();
    }
}
