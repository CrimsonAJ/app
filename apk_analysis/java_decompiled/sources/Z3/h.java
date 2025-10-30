package Z3;

import Y3.k;

/* loaded from: classes.dex */
public final class h extends k implements Comparable {
    public long j;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (e(4) != hVar.e(4)) {
            if (e(4)) {
                return 1;
            }
            return -1;
        }
        long j = this.f20706f - hVar.f20706f;
        if (j == 0) {
            j = this.j - hVar.j;
            if (j == 0) {
                return 0;
            }
        }
        if (j > 0) {
            return 1;
        }
        return -1;
    }
}
