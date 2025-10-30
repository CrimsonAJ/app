package X0;

import android.view.ViewGroup;
import co.notix.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import s.C1935e;
import s.C1939i;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0426a f8220a = new C0426a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f8221b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f8222c = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X0.p, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, m mVar) {
        ArrayList arrayList = f8222c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (mVar == null) {
                mVar = f8220a;
            }
            m clone = mVar.clone();
            ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    ((m) obj).z(viewGroup);
                }
            }
            clone.j(viewGroup, true);
            if (viewGroup.getTag(R.id.transition_current_scene) == null) {
                viewGroup.setTag(R.id.transition_current_scene, null);
                ?? obj2 = new Object();
                obj2.f8218a = clone;
                obj2.f8219b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(obj2);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(obj2);
                return;
            }
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, s.e, s.i] */
    public static C1935e b() {
        C1935e c1935e;
        ThreadLocal threadLocal = f8221b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1935e = (C1935e) weakReference.get()) != null) {
            return c1935e;
        }
        ?? c1939i = new C1939i(0);
        threadLocal.set(new WeakReference(c1939i));
        return c1939i;
    }
}
