package P3;

import j3.M;
import k4.C1516p;
import k4.InterfaceC1513m;

/* loaded from: classes.dex */
public abstract class k extends e {
    public final long j;

    public k(InterfaceC1513m interfaceC1513m, C1516p c1516p, M m9, int i9, Object obj, long j, long j4, long j9) {
        super(interfaceC1513m, c1516p, 1, m9, i9, obj, j, j4);
        m9.getClass();
        this.j = j9;
    }

    public long b() {
        long j = this.j;
        if (j == -1) {
            return -1L;
        }
        return j + 1;
    }

    public abstract boolean d();
}
