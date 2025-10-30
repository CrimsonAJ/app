package l4;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public long f20549a;

    /* renamed from: b, reason: collision with root package name */
    public long f20550b;

    /* renamed from: c, reason: collision with root package name */
    public long f20551c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f20552d = new ThreadLocal();

    public x(long j) {
        e(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f20550b == -9223372036854775807L) {
                long j4 = this.f20549a;
                if (j4 == 9223372036854775806L) {
                    Long l9 = (Long) this.f20552d.get();
                    l9.getClass();
                    j4 = l9.longValue();
                }
                this.f20550b = j4 - j;
                notifyAll();
            }
            this.f20551c = j;
            return j + this.f20550b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j4 = this.f20551c;
            if (j4 != -9223372036854775807L) {
                long j9 = (j4 * 90000) / 1000000;
                long j10 = (4294967296L + j9) / 8589934592L;
                long j11 = ((j10 - 1) * 8589934592L) + j;
                long j12 = (j10 * 8589934592L) + j;
                if (Math.abs(j11 - j9) < Math.abs(j12 - j9)) {
                    j = j11;
                } else {
                    j = j12;
                }
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        long j;
        j = this.f20549a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long d() {
        return this.f20550b;
    }

    public final synchronized void e(long j) {
        long j4;
        this.f20549a = j;
        if (j == Long.MAX_VALUE) {
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        this.f20550b = j4;
        this.f20551c = -9223372036854775807L;
    }
}
