package S5;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ boolean a(Unsafe unsafe, n nVar, long j, d dVar, d dVar2) {
        while (!unsafe.compareAndSwapObject(nVar, j, dVar, dVar2)) {
            if (unsafe.getObject(nVar, j) != dVar) {
                return false;
            }
        }
        return true;
    }
}
