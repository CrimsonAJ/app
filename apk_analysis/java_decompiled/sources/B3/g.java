package B3;

import l4.y;
import q3.q;
import q3.r;
import q3.s;

/* loaded from: classes.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    public final e f676a;

    /* renamed from: b, reason: collision with root package name */
    public final int f677b;

    /* renamed from: c, reason: collision with root package name */
    public final long f678c;

    /* renamed from: d, reason: collision with root package name */
    public final long f679d;

    /* renamed from: e, reason: collision with root package name */
    public final long f680e;

    public g(e eVar, int i9, long j, long j4) {
        this.f676a = eVar;
        this.f677b = i9;
        this.f678c = j;
        long j9 = (j4 - j) / eVar.f671c;
        this.f679d = j9;
        this.f680e = y.O(j9 * i9, 1000000L, eVar.f670b);
    }

    @Override // q3.r
    public final boolean e() {
        return true;
    }

    @Override // q3.r
    public final q g(long j) {
        e eVar = this.f676a;
        int i9 = this.f677b;
        long j4 = this.f679d - 1;
        long j9 = y.j((eVar.f670b * j) / (i9 * 1000000), 0L, j4);
        int i10 = eVar.f671c;
        long j10 = this.f678c;
        long O8 = y.O(j9 * i9, 1000000L, eVar.f670b);
        s sVar = new s(O8, (i10 * j9) + j10);
        if (O8 < j && j9 != j4) {
            long j11 = j9 + 1;
            return new q(sVar, new s(y.O(j11 * i9, 1000000L, eVar.f670b), (i10 * j11) + j10));
        }
        return new q(sVar, sVar);
    }

    @Override // q3.r
    public final long h() {
        return this.f680e;
    }
}
