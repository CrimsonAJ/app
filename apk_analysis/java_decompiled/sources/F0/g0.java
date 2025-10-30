package F0;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f2110a;

    /* renamed from: b, reason: collision with root package name */
    public int f2111b;

    /* renamed from: c, reason: collision with root package name */
    public Set f2112c;

    public final f0 a(int i9) {
        SparseArray sparseArray = this.f2110a;
        f0 f0Var = (f0) sparseArray.get(i9);
        if (f0Var == null) {
            f0 f0Var2 = new f0();
            sparseArray.put(i9, f0Var2);
            return f0Var2;
        }
        return f0Var;
    }
}
