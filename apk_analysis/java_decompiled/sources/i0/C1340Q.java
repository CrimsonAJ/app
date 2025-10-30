package i0;

import android.util.Log;
import androidx.lifecycle.e0;
import androidx.lifecycle.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: i0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1340Q extends e0 {
    public static final C1339P j = new C1339P(0);

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18233g;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f18230d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f18231e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f18232f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f18234h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18235i = false;

    public C1340Q(boolean z9) {
        this.f18233g = z9;
    }

    @Override // androidx.lifecycle.e0
    public final void b() {
        if (AbstractC1336M.H(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f18234h = true;
    }

    public final void d(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, boolean z9) {
        if (AbstractC1336M.H(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC1366v);
        }
        f(abstractComponentCallbacksC1366v.f18389e, z9);
    }

    public final void e(String str, boolean z9) {
        if (AbstractC1336M.H(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        f(str, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1340Q.class == obj.getClass()) {
            C1340Q c1340q = (C1340Q) obj;
            if (this.f18230d.equals(c1340q.f18230d) && this.f18231e.equals(c1340q.f18231e) && this.f18232f.equals(c1340q.f18232f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z9) {
        HashMap hashMap = this.f18231e;
        C1340Q c1340q = (C1340Q) hashMap.get(str);
        if (c1340q != null) {
            if (z9) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c1340q.f18231e.keySet());
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    c1340q.e((String) obj, true);
                }
            }
            c1340q.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f18232f;
        j0 j0Var = (j0) hashMap2.get(str);
        if (j0Var != null) {
            j0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void g(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        if (this.f18235i) {
            if (AbstractC1336M.H(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f18230d.remove(abstractComponentCallbacksC1366v.f18389e) != null && AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC1366v);
        }
    }

    public final int hashCode() {
        return this.f18232f.hashCode() + ((this.f18231e.hashCode() + (this.f18230d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f18230d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f18231e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f18232f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
