package q3;

import java.util.Arrays;
import l4.y;

/* renamed from: q3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1901f implements r {

    /* renamed from: a, reason: collision with root package name */
    public final int f22303a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f22304b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f22305c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f22306d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f22307e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22308f;

    public C1901f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f22304b = iArr;
        this.f22305c = jArr;
        this.f22306d = jArr2;
        this.f22307e = jArr3;
        int length = iArr.length;
        this.f22303a = length;
        if (length > 0) {
            this.f22308f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f22308f = 0L;
        }
    }

    @Override // q3.r
    public final boolean e() {
        return true;
    }

    @Override // q3.r
    public final q g(long j) {
        long[] jArr = this.f22307e;
        int e8 = y.e(jArr, j, true);
        long j4 = jArr[e8];
        long[] jArr2 = this.f22305c;
        s sVar = new s(j4, jArr2[e8]);
        if (j4 < j && e8 != this.f22303a - 1) {
            int i9 = e8 + 1;
            return new q(sVar, new s(jArr[i9], jArr2[i9]));
        }
        return new q(sVar, sVar);
    }

    @Override // q3.r
    public final long h() {
        return this.f22308f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f22303a + ", sizes=" + Arrays.toString(this.f22304b) + ", offsets=" + Arrays.toString(this.f22305c) + ", timeUs=" + Arrays.toString(this.f22307e) + ", durationsUs=" + Arrays.toString(this.f22306d) + ")";
    }
}
