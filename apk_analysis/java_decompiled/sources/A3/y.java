package A3;

import q3.C1902g;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.x f316b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.r f317c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320f;

    /* renamed from: g, reason: collision with root package name */
    public long f321g;

    /* renamed from: h, reason: collision with root package name */
    public long f322h;

    /* renamed from: i, reason: collision with root package name */
    public long f323i;

    public y(int i9) {
        this.f315a = i9;
        switch (i9) {
            case 1:
                this.f316b = new l4.x(0L);
                this.f321g = -9223372036854775807L;
                this.f322h = -9223372036854775807L;
                this.f323i = -9223372036854775807L;
                this.f317c = new A4.r(5, false);
                return;
            default:
                this.f316b = new l4.x(0L);
                this.f321g = -9223372036854775807L;
                this.f322h = -9223372036854775807L;
                this.f323i = -9223372036854775807L;
                this.f317c = new A4.r(5, false);
                return;
        }
    }

    public static int b(int i9, byte[] bArr) {
        return (bArr[i9 + 3] & 255) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9 + 2] & 255) << 8);
    }

    public static long c(A4.r rVar) {
        int i9 = rVar.f382a;
        if (rVar.e() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        rVar.h(bArr, 0, 9);
        rVar.H(i9);
        byte b9 = bArr[0];
        if ((b9 & 196) == 68) {
            byte b10 = bArr[2];
            if ((b10 & 4) == 4) {
                byte b11 = bArr[4];
                if ((b11 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b9;
                    long j4 = b10;
                    return ((j4 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j4 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b11 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(C1902g c1902g) {
        switch (this.f315a) {
            case 0:
                byte[] bArr = l4.y.f20558f;
                A4.r rVar = this.f317c;
                rVar.getClass();
                rVar.F(bArr.length, bArr);
                this.f318d = true;
                c1902g.f22314f = 0;
                return;
            default:
                byte[] bArr2 = l4.y.f20558f;
                A4.r rVar2 = this.f317c;
                rVar2.getClass();
                rVar2.F(bArr2.length, bArr2);
                this.f318d = true;
                c1902g.f22314f = 0;
                return;
        }
    }
}
