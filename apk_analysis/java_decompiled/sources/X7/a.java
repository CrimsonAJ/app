package X7;

import B6.u0;
import W7.d;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final long f8472b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f8473c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8474d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f8475a;

    static {
        int i9 = b.f8476a;
        f8472b = Z0.a.f(4611686018427387903L);
        f8473c = Z0.a.f(-4611686018427387903L);
    }

    public static final long a(long j, long j4) {
        long j9 = 1000000;
        long j10 = j4 / j9;
        long j11 = j + j10;
        if (-4611686018426L <= j11 && j11 < 4611686018427L) {
            long j12 = ((j11 * j9) + (j4 - (j10 * j9))) << 1;
            int i9 = b.f8476a;
            return j12;
        }
        return Z0.a.f(u0.l(j11, -4611686018427387903L, 4611686018427387903L));
    }

    public static final void b(StringBuilder sb, int i9, int i10, int i11, String str, boolean z9) {
        sb.append(i9);
        if (i10 != 0) {
            sb.append('.');
            String W6 = d.W(i11, String.valueOf(i10));
            int i12 = -1;
            int length = W6.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (W6.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (!z9 && i14 < 3) {
                sb.append((CharSequence) W6, 0, i14);
            } else {
                sb.append((CharSequence) W6, 0, ((i12 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    public static final boolean c(long j) {
        if (j != f8472b && j != f8473c) {
            return false;
        }
        return true;
    }

    public static final long d(long j, c unit) {
        c sourceUnit;
        h.e(unit, "unit");
        if (j == f8472b) {
            return Long.MAX_VALUE;
        }
        if (j == f8473c) {
            return Long.MIN_VALUE;
        }
        long j4 = j >> 1;
        if ((((int) j) & 1) == 0) {
            sourceUnit = c.NANOSECONDS;
        } else {
            sourceUnit = c.MILLISECONDS;
        }
        h.e(sourceUnit, "sourceUnit");
        return unit.f8484a.convert(j4, sourceUnit.f8484a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((a) obj).f8475a;
        long j4 = this.f8475a;
        long j9 = j4 ^ j;
        if (j9 >= 0 && (((int) j9) & 1) != 0) {
            int i9 = (((int) j4) & 1) - (((int) j) & 1);
            if (j4 < 0) {
                return -i9;
            }
            return i9;
        }
        if (j4 < j) {
            return -1;
        }
        if (j4 != j) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f8475a != ((a) obj).f8475a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f8475a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        boolean z9;
        long j;
        int d9;
        int d10;
        int d11;
        boolean z10;
        long j4;
        int i9;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        long j9 = this.f8475a;
        if (j9 == 0) {
            return "0s";
        }
        if (j9 == f8472b) {
            return "Infinity";
        }
        if (j9 == f8473c) {
            return "-Infinity";
        }
        if (j9 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z9) {
            sb.append('-');
        }
        if (j9 < 0) {
            j9 = (((int) j9) & 1) + ((-(j9 >> 1)) << 1);
            int i12 = b.f8476a;
        }
        long d12 = d(j9, c.DAYS);
        if (c(j9)) {
            j = 0;
            d9 = 0;
        } else {
            j = 0;
            d9 = (int) (d(j9, c.HOURS) % 24);
        }
        if (c(j9)) {
            d10 = 0;
        } else {
            d10 = (int) (d(j9, c.MINUTES) % 60);
        }
        if (c(j9)) {
            d11 = 0;
        } else {
            d11 = (int) (d(j9, c.SECONDS) % 60);
        }
        if (c(j9)) {
            i9 = 0;
        } else {
            if ((((int) j9) & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j4 = ((j9 >> 1) % 1000) * 1000000;
            } else {
                j4 = (j9 >> 1) % 1000000000;
            }
            i9 = (int) j4;
        }
        if (d12 != j) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (d9 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (d10 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (d11 == 0 && i9 == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z11) {
            sb.append(d12);
            sb.append('d');
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(d9);
            sb.append('h');
            i10 = i13;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i14 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(d10);
            sb.append('m');
            i10 = i14;
        }
        if (z14) {
            i11 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (d11 == 0 && !z11 && !z12 && !z13) {
                if (i9 >= 1000000) {
                    b(sb, i9 / 1000000, i9 % 1000000, 6, "ms", false);
                } else if (i9 >= 1000) {
                    b(sb, i9 / 1000, i9 % 1000, 3, "us", false);
                } else {
                    sb.append(i9);
                    sb.append("ns");
                }
            } else {
                b(sb, d11, i9, 9, "s", false);
            }
        } else {
            i11 = i10;
        }
        if (z9 && i11 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
