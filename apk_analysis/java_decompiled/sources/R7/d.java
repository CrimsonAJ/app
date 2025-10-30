package R7;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6666a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [R7.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        ?? r0;
        Integer num = K7.a.f4440a;
        if (num != null && num.intValue() < 34) {
            r0 = new b();
        } else {
            r0 = new Object();
        }
        f6666a = r0;
    }

    public abstract int a(int i9);

    public abstract int b();

    public abstract long c();

    public long d(long j) {
        long c3;
        long j4;
        if (j > 0) {
            if (j > 0) {
                if (((-j) & j) == j) {
                    int i9 = (int) j;
                    int i10 = (int) (j >>> 32);
                    if (i9 != 0) {
                        return a(31 - Integer.numberOfLeadingZeros(i9)) & 4294967295L;
                    }
                    if (i10 == 1) {
                        return b() & 4294967295L;
                    }
                    return (a(31 - Integer.numberOfLeadingZeros(i10)) << 32) + (b() & 4294967295L);
                }
                do {
                    c3 = c() >>> 1;
                    j4 = c3 % j;
                } while ((j - 1) + (c3 - j4) < 0);
                return j4;
            }
            while (true) {
                long c9 = c();
                if (0 <= c9 && c9 < j) {
                    return c9;
                }
            }
        } else {
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0L) + ", " + Long.valueOf(j) + ").").toString());
        }
    }
}
