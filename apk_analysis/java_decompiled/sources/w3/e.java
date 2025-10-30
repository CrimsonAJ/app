package w3;

import q3.C1902g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f24152d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24153a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f24154b;

    /* renamed from: c, reason: collision with root package name */
    public int f24155c;

    public static long a(int i9, boolean z9, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z9) {
            j &= ~f24152d[i9 - 1];
        }
        for (int i10 = 1; i10 < i9; i10++) {
            j = (j << 8) | (bArr[i10] & 255);
        }
        return j;
    }

    public static int b(int i9) {
        for (int i10 = 0; i10 < 8; i10++) {
            if ((f24152d[i10] & i9) != 0) {
                return i10 + 1;
            }
        }
        return -1;
    }

    public final long c(C1902g c1902g, boolean z9, boolean z10, int i9) {
        int i10 = this.f24154b;
        byte[] bArr = this.f24153a;
        if (i10 == 0) {
            if (!c1902g.e(bArr, 0, 1, z9)) {
                return -1L;
            }
            int b9 = b(bArr[0] & 255);
            this.f24155c = b9;
            if (b9 != -1) {
                this.f24154b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f24155c;
        if (i11 > i9) {
            this.f24154b = 0;
            return -2L;
        }
        if (i11 != 1) {
            c1902g.e(bArr, 1, i11 - 1, false);
        }
        this.f24154b = 0;
        return a(this.f24155c, z10, bArr);
    }
}
