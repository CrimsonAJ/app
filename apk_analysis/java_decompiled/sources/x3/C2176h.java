package x3;

import l4.AbstractC1566a;
import l4.y;
import q3.q;
import q3.s;

/* renamed from: x3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2176h implements InterfaceC2174f {

    /* renamed from: a, reason: collision with root package name */
    public final long f24592a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24593b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24594c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24595d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24596e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f24597f;

    public C2176h(long j, int i9, long j4, long j9, long[] jArr) {
        this.f24592a = j;
        this.f24593b = i9;
        this.f24594c = j4;
        this.f24597f = jArr;
        this.f24595d = j9;
        this.f24596e = j9 != -1 ? j + j9 : -1L;
    }

    @Override // x3.InterfaceC2174f
    public final long c(long j) {
        long j4;
        double d9;
        long j9 = j - this.f24592a;
        if (e() && j9 > this.f24593b) {
            long[] jArr = this.f24597f;
            AbstractC1566a.n(jArr);
            double d10 = (j9 * 256.0d) / this.f24595d;
            int e8 = y.e(jArr, (long) d10, true);
            long j10 = this.f24594c;
            long j11 = (e8 * j10) / 100;
            long j12 = jArr[e8];
            int i9 = e8 + 1;
            long j13 = (j10 * i9) / 100;
            if (e8 == 99) {
                j4 = 256;
            } else {
                j4 = jArr[i9];
            }
            if (j12 == j4) {
                d9 = 0.0d;
            } else {
                d9 = (d10 - j12) / (j4 - j12);
            }
            return Math.round(d9 * (j13 - j11)) + j11;
        }
        return 0L;
    }

    @Override // x3.InterfaceC2174f
    public final long d() {
        return this.f24596e;
    }

    @Override // q3.r
    public final boolean e() {
        if (this.f24597f != null) {
            return true;
        }
        return false;
    }

    @Override // q3.r
    public final q g(long j) {
        double d9;
        double d10;
        boolean e8 = e();
        int i9 = this.f24593b;
        long j4 = this.f24592a;
        if (!e8) {
            s sVar = new s(0L, j4 + i9);
            return new q(sVar, sVar);
        }
        long j9 = y.j(j, 0L, this.f24594c);
        double d11 = (j9 * 100.0d) / this.f24594c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d9 = 256.0d;
        } else if (d11 >= 100.0d) {
            d9 = 256.0d;
            d12 = 256.0d;
        } else {
            int i10 = (int) d11;
            long[] jArr = this.f24597f;
            AbstractC1566a.n(jArr);
            double d13 = jArr[i10];
            if (i10 == 99) {
                d9 = 256.0d;
                d10 = 256.0d;
            } else {
                d9 = 256.0d;
                d10 = jArr[i10 + 1];
            }
            d12 = ((d10 - d13) * (d11 - i10)) + d13;
        }
        long j10 = this.f24595d;
        s sVar2 = new s(j9, j4 + y.j(Math.round((d12 / d9) * j10), i9, j10 - 1));
        return new q(sVar2, sVar2);
    }

    @Override // q3.r
    public final long h() {
        return this.f24594c;
    }
}
