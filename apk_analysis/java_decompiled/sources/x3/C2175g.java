package x3;

import l4.y;
import q3.q;
import q3.s;

/* renamed from: x3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2175g implements InterfaceC2174f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f24588a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f24589b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24590c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24591d;

    public C2175g(long[] jArr, long[] jArr2, long j, long j4) {
        this.f24588a = jArr;
        this.f24589b = jArr2;
        this.f24590c = j;
        this.f24591d = j4;
    }

    @Override // x3.InterfaceC2174f
    public final long c(long j) {
        return this.f24588a[y.e(this.f24589b, j, true)];
    }

    @Override // x3.InterfaceC2174f
    public final long d() {
        return this.f24591d;
    }

    @Override // q3.r
    public final boolean e() {
        return true;
    }

    @Override // q3.r
    public final q g(long j) {
        long[] jArr = this.f24588a;
        int e8 = y.e(jArr, j, true);
        long j4 = jArr[e8];
        long[] jArr2 = this.f24589b;
        s sVar = new s(j4, jArr2[e8]);
        if (j4 < j && e8 != jArr.length - 1) {
            int i9 = e8 + 1;
            return new q(sVar, new s(jArr[i9], jArr2[i9]));
        }
        return new q(sVar, sVar);
    }

    @Override // q3.r
    public final long h() {
        return this.f24590c;
    }
}
