package Q3;

import j3.C0;
import j3.D0;
import j3.E0;
import j3.T;
import j3.Y;
import java.util.List;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class e extends E0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f6348b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6349c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6350d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6351e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6352f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6353g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6354h;

    /* renamed from: i, reason: collision with root package name */
    public final R3.c f6355i;
    public final Y j;

    /* renamed from: k, reason: collision with root package name */
    public final T f6356k;

    public e(long j, long j4, long j9, int i9, long j10, long j11, long j12, R3.c cVar, Y y9, T t7) {
        boolean z9;
        boolean z10 = cVar.f6588d;
        if (t7 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z10 == z9);
        this.f6348b = j;
        this.f6349c = j4;
        this.f6350d = j9;
        this.f6351e = i9;
        this.f6352f = j10;
        this.f6353g = j11;
        this.f6354h = j12;
        this.f6355i = cVar;
        this.j = y9;
        this.f6356k = t7;
    }

    @Override // j3.E0
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f6351e) < 0 || intValue >= h()) {
            return -1;
        }
        return intValue;
    }

    @Override // j3.E0
    public final C0 f(int i9, C0 c02, boolean z9) {
        String str;
        AbstractC1566a.k(i9, h());
        Integer num = null;
        R3.c cVar = this.f6355i;
        if (z9) {
            str = cVar.b(i9).f6615a;
        } else {
            str = null;
        }
        if (z9) {
            num = Integer.valueOf(this.f6351e + i9);
        }
        long d9 = cVar.d(i9);
        long H8 = y.H(cVar.b(i9).f6616b - cVar.b(0).f6616b) - this.f6352f;
        c02.getClass();
        c02.h(str, num, 0, d9, H8, O3.b.f5451f, false);
        return c02;
    }

    @Override // j3.E0
    public final int h() {
        return this.f6355i.f6596m.size();
    }

    @Override // j3.E0
    public final Object l(int i9) {
        AbstractC1566a.k(i9, h());
        return Integer.valueOf(this.f6351e + i9);
    }

    @Override // j3.E0
    public final D0 m(int i9, D0 d02, long j) {
        boolean z9;
        boolean z10;
        long j4;
        long j9;
        i b9;
        boolean z11;
        AbstractC1566a.k(i9, 1);
        R3.c cVar = this.f6355i;
        if (cVar.f6588d && cVar.f6589e != -9223372036854775807L && cVar.f6586b == -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        long j10 = this.f6354h;
        if (!z9) {
            z10 = true;
            j4 = -9223372036854775807L;
        } else {
            long j11 = 0;
            if (j > 0) {
                j10 += j;
                if (j10 > this.f6353g) {
                    z10 = true;
                    j10 = -9223372036854775807L;
                    j4 = -9223372036854775807L;
                }
            }
            long j12 = this.f6352f + j10;
            long d9 = cVar.d(0);
            int i10 = 0;
            while (i10 < cVar.f6596m.size() - 1 && j12 >= d9) {
                j12 -= d9;
                i10++;
                d9 = cVar.d(i10);
            }
            R3.h b10 = cVar.b(i10);
            List list = b10.f6617c;
            z10 = true;
            int size = list.size();
            j4 = -9223372036854775807L;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    j9 = j11;
                    if (((R3.a) list.get(i11)).f6576b == 2) {
                        break;
                    }
                    i11++;
                    j11 = j9;
                } else {
                    j9 = j11;
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1 && (b9 = ((R3.m) ((R3.a) b10.f6617c.get(i11)).f6577c.get(0)).b()) != null && b9.z(d9) != j9) {
                j10 = (b9.c(b9.d(j12, d9)) + j10) - j12;
            }
        }
        Object obj = D0.f19300r;
        if (cVar.f6588d && cVar.f6589e != j4 && cVar.f6586b == j4) {
            z11 = z10;
        } else {
            z11 = false;
        }
        boolean z12 = z11;
        d02.b(obj, this.j, cVar, this.f6348b, this.f6349c, this.f6350d, true, z12, this.f6356k, j10, this.f6353g, 0, h() - 1, this.f6352f);
        return d02;
    }

    @Override // j3.E0
    public final int o() {
        return 1;
    }
}
