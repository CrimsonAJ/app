package S5;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ boolean a(Unsafe unsafe, n nVar, long j, m mVar, m mVar2) {
        while (!unsafe.compareAndSwapObject(nVar, j, mVar, mVar2)) {
            if (unsafe.getObject(nVar, j) != mVar) {
                return false;
            }
        }
        return true;
    }
}
