package u0;

import androidx.lifecycle.e0;
import androidx.lifecycle.j0;
import i0.C1339P;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: u0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2049u extends e0 {

    /* renamed from: e, reason: collision with root package name */
    public static final C1339P f23537e = new C1339P(2);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f23538d = new LinkedHashMap();

    @Override // androidx.lifecycle.e0
    public final void b() {
        LinkedHashMap linkedHashMap = this.f23538d;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((j0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f23538d.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "sb.toString()");
        return sb2;
    }
}
