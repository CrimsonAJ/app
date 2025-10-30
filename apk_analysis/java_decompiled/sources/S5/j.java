package S5;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ boolean a(Unsafe unsafe, n nVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(nVar, j, obj, obj2)) {
            if (unsafe.getObject(nVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
