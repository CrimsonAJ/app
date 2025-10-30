package R3;

import java.util.List;
import l4.y;

/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f6636d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6637e;

    /* renamed from: f, reason: collision with root package name */
    public final List f6638f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6639g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6640h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6641i;

    public n(j jVar, long j, long j4, long j9, long j10, List list, long j11, long j12, long j13) {
        super(jVar, j, j4);
        this.f6636d = j9;
        this.f6637e = j10;
        this.f6638f = list;
        this.f6641i = j11;
        this.f6639g = j12;
        this.f6640h = j13;
    }

    public final long b(long j, long j4) {
        long d9 = d(j);
        if (d9 != -1) {
            return d9;
        }
        return (int) (f((j4 - this.f6640h) + this.f6641i, j) - c(j, j4));
    }

    public final long c(long j, long j4) {
        long d9 = d(j);
        long j9 = this.f6636d;
        if (d9 == -1) {
            long j10 = this.f6639g;
            if (j10 != -9223372036854775807L) {
                return Math.max(j9, f((j4 - this.f6640h) - j10, j));
            }
        }
        return j9;
    }

    public abstract long d(long j);

    public final long e(long j, long j4) {
        long j9 = this.f6649b;
        long j10 = this.f6636d;
        List list = this.f6638f;
        if (list != null) {
            return (((q) list.get((int) (j - j10))).f6645b * 1000000) / j9;
        }
        long d9 = d(j4);
        if (d9 != -1 && j == (j10 + d9) - 1) {
            return j4 - g(j);
        }
        return (this.f6637e * 1000000) / j9;
    }

    public final long f(long j, long j4) {
        long d9 = d(j4);
        long j9 = this.f6636d;
        if (d9 != 0) {
            if (this.f6638f == null) {
                long j10 = (j / ((this.f6637e * 1000000) / this.f6649b)) + j9;
                if (j10 >= j9) {
                    if (d9 == -1) {
                        return j10;
                    }
                    return Math.min(j10, (j9 + d9) - 1);
                }
            } else {
                long j11 = (d9 + j9) - 1;
                long j12 = j9;
                while (j12 <= j11) {
                    long j13 = ((j11 - j12) / 2) + j12;
                    long g9 = g(j13);
                    if (g9 < j) {
                        j12 = j13 + 1;
                    } else if (g9 > j) {
                        j11 = j13 - 1;
                    } else {
                        return j13;
                    }
                }
                if (j12 == j9) {
                    return j12;
                }
                return j11;
            }
        }
        return j9;
    }

    public final long g(long j) {
        long j4;
        long j9 = this.f6636d;
        List list = this.f6638f;
        if (list != null) {
            j4 = ((q) list.get((int) (j - j9))).f6644a - this.f6650c;
        } else {
            j4 = (j - j9) * this.f6637e;
        }
        return y.O(j4, 1000000L, this.f6649b);
    }

    public abstract j h(k kVar, long j);

    public boolean i() {
        if (this.f6638f != null) {
            return true;
        }
        return false;
    }
}
