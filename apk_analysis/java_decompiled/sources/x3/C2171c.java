package x3;

import android.util.Pair;
import l4.y;
import q3.q;
import q3.s;

/* renamed from: x3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2171c implements InterfaceC2174f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f24567a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f24568b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24569c;

    public C2171c(long j, long[] jArr, long[] jArr2) {
        this.f24567a = jArr;
        this.f24568b = jArr2;
        this.f24569c = j == -9223372036854775807L ? y.H(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        double d9;
        int e8 = y.e(jArr, j, true);
        long j4 = jArr[e8];
        long j9 = jArr2[e8];
        int i9 = e8 + 1;
        if (i9 == jArr.length) {
            return Pair.create(Long.valueOf(j4), Long.valueOf(j9));
        }
        long j10 = jArr[i9];
        long j11 = jArr2[i9];
        if (j10 == j4) {
            d9 = 0.0d;
        } else {
            d9 = (j - j4) / (j10 - j4);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d9 * (j11 - j9))) + j9));
    }

    @Override // x3.InterfaceC2174f
    public final long c(long j) {
        return y.H(((Long) a(j, this.f24567a, this.f24568b).second).longValue());
    }

    @Override // x3.InterfaceC2174f
    public final long d() {
        return -1L;
    }

    @Override // q3.r
    public final boolean e() {
        return true;
    }

    @Override // q3.r
    public final q g(long j) {
        Pair a5 = a(y.T(y.j(j, 0L, this.f24569c)), this.f24568b, this.f24567a);
        s sVar = new s(y.H(((Long) a5.first).longValue()), ((Long) a5.second).longValue());
        return new q(sVar, sVar);
    }

    @Override // q3.r
    public final long h() {
        return this.f24569c;
    }
}
