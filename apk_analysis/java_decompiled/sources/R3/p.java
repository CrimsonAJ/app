package R3;

import j3.M;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends n {
    public final A4.q j;

    /* renamed from: k, reason: collision with root package name */
    public final A4.q f6642k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6643l;

    public p(j jVar, long j, long j4, long j9, long j10, long j11, List list, long j12, A4.q qVar, A4.q qVar2, long j13, long j14) {
        super(jVar, j, j4, j9, j11, list, j12, j13, j14);
        this.j = qVar;
        this.f6642k = qVar2;
        this.f6643l = j10;
    }

    @Override // R3.s
    public final j a(m mVar) {
        A4.q qVar = this.j;
        if (qVar != null) {
            M m9 = mVar.f6631a;
            return new j(0L, qVar.a(0L, m9.f19425a, 0L, m9.f19432h), -1L);
        }
        return this.f6648a;
    }

    @Override // R3.n
    public final long d(long j) {
        if (this.f6638f != null) {
            return r0.size();
        }
        long j4 = this.f6643l;
        if (j4 != -1) {
            return (j4 - this.f6636d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f6649b));
        BigInteger multiply2 = BigInteger.valueOf(this.f6637e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i9 = Q5.a.f6442a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // R3.n
    public final j h(k kVar, long j) {
        long j4;
        long j9 = this.f6636d;
        List list = this.f6638f;
        if (list != null) {
            j4 = ((q) list.get((int) (j - j9))).f6644a;
        } else {
            j4 = (j - j9) * this.f6637e;
        }
        long j10 = j4;
        M m9 = kVar.f6631a;
        return new j(0L, this.f6642k.a(j, m9.f19425a, j10, m9.f19432h), -1L);
    }
}
