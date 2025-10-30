package q3;

import k4.C1499E;
import l4.AbstractC1566a;
import l4.y;
import s3.C1947b;
import s3.C1950e;

/* renamed from: q3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1908m implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22321a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22322b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22323c;

    public /* synthetic */ C1908m(int i9, long j, Object obj) {
        this.f22321a = i9;
        this.f22323c = obj;
        this.f22322b = j;
    }

    @Override // q3.r
    public final boolean e() {
        switch (this.f22321a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // q3.r
    public final q g(long j) {
        long j4;
        switch (this.f22321a) {
            case 0:
                C1909n c1909n = (C1909n) this.f22323c;
                AbstractC1566a.n(c1909n.f22333k);
                C1499E c1499e = c1909n.f22333k;
                long[] jArr = (long[]) c1499e.f19985b;
                int e8 = y.e(jArr, y.j((c1909n.f22328e * j) / 1000000, 0L, c1909n.j - 1), false);
                long j9 = 0;
                if (e8 == -1) {
                    j4 = 0;
                } else {
                    j4 = jArr[e8];
                }
                long[] jArr2 = (long[]) c1499e.f19986c;
                if (e8 != -1) {
                    j9 = jArr2[e8];
                }
                int i9 = c1909n.f22328e;
                long j10 = (j4 * 1000000) / i9;
                long j11 = this.f22322b;
                s sVar = new s(j10, j9 + j11);
                if (j10 != j && e8 != jArr.length - 1) {
                    int i10 = e8 + 1;
                    return new q(sVar, new s((jArr[i10] * 1000000) / i9, j11 + jArr2[i10]));
                }
                return new q(sVar, sVar);
            case 1:
                return (q) this.f22323c;
            default:
                C1947b c1947b = (C1947b) this.f22323c;
                q b9 = c1947b.f22679g[0].b(j);
                int i11 = 1;
                while (true) {
                    C1950e[] c1950eArr = c1947b.f22679g;
                    if (i11 < c1950eArr.length) {
                        q b10 = c1950eArr[i11].b(j);
                        if (b10.f22342a.f22346b < b9.f22342a.f22346b) {
                            b9 = b10;
                        }
                        i11++;
                    } else {
                        return b9;
                    }
                }
        }
    }

    @Override // q3.r
    public final long h() {
        switch (this.f22321a) {
            case 0:
                return ((C1909n) this.f22323c).b();
            case 1:
                return this.f22322b;
            default:
                return this.f22322b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1908m(long j) {
        this(j, 0L);
        this.f22321a = 1;
    }

    public C1908m(long j, long j4) {
        this.f22321a = 1;
        this.f22322b = j;
        s sVar = j4 == 0 ? s.f22344c : new s(0L, j4);
        this.f22323c = new q(sVar, sVar);
    }
}
