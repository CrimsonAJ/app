package R3;

import java.util.List;

/* loaded from: classes.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j, long j4, long j9, long j10, List list, long j11, List list2, long j12, long j13) {
        super(jVar, j, j4, j9, j10, list, j11, j12, j13);
        this.j = list2;
    }

    @Override // R3.n
    public final long d(long j) {
        return this.j.size();
    }

    @Override // R3.n
    public final j h(k kVar, long j) {
        return (j) this.j.get((int) (j - this.f6636d));
    }

    @Override // R3.n
    public final boolean i() {
        return true;
    }
}
