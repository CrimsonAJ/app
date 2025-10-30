package N3;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k4.C1499E;
import k4.C1501a;
import k4.C1517q;
import m3.C1589b;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final C1517q f5025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5026b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.r f5027c;

    /* renamed from: d, reason: collision with root package name */
    public X f5028d;

    /* renamed from: e, reason: collision with root package name */
    public X f5029e;

    /* renamed from: f, reason: collision with root package name */
    public X f5030f;

    /* renamed from: g, reason: collision with root package name */
    public long f5031g;

    public Y(C1517q c1517q) {
        this.f5025a = c1517q;
        int i9 = c1517q.f20086b;
        this.f5026b = i9;
        this.f5027c = new A4.r(32);
        X x5 = new X(0L, i9);
        this.f5028d = x5;
        this.f5029e = x5;
        this.f5030f = x5;
    }

    public static X d(X x5, long j, ByteBuffer byteBuffer, int i9) {
        while (j >= x5.f5022b) {
            x5 = (X) x5.f5024d;
        }
        while (i9 > 0) {
            int min = Math.min(i9, (int) (x5.f5022b - j));
            C1501a c1501a = (C1501a) x5.f5023c;
            byteBuffer.put(c1501a.f20043a, ((int) (j - x5.f5021a)) + c1501a.f20044b, min);
            i9 -= min;
            j += min;
            if (j == x5.f5022b) {
                x5 = (X) x5.f5024d;
            }
        }
        return x5;
    }

    public static X e(X x5, long j, byte[] bArr, int i9) {
        while (j >= x5.f5022b) {
            x5 = (X) x5.f5024d;
        }
        int i10 = i9;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (x5.f5022b - j));
            C1501a c1501a = (C1501a) x5.f5023c;
            System.arraycopy(c1501a.f20043a, ((int) (j - x5.f5021a)) + c1501a.f20044b, bArr, i9 - i10, min);
            i10 -= min;
            j += min;
            if (j == x5.f5022b) {
                x5 = (X) x5.f5024d;
            }
        }
        return x5;
    }

    public static X f(X x5, m3.f fVar, Z z9, A4.r rVar) {
        boolean z10;
        int i9;
        if (fVar.e(1073741824)) {
            long j = z9.f5033b;
            rVar.E(1);
            X e8 = e(x5, j, (byte[]) rVar.f384c, 1);
            long j4 = j + 1;
            byte b9 = ((byte[]) rVar.f384c)[0];
            if ((b9 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = b9 & Byte.MAX_VALUE;
            C1589b c1589b = fVar.f20703c;
            byte[] bArr = c1589b.f20683a;
            if (bArr == null) {
                c1589b.f20683a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            x5 = e(e8, j4, c1589b.f20683a, i10);
            long j9 = j4 + i10;
            if (z10) {
                rVar.E(2);
                x5 = e(x5, j9, (byte[]) rVar.f384c, 2);
                j9 += 2;
                i9 = rVar.C();
            } else {
                i9 = 1;
            }
            int[] iArr = c1589b.f20686d;
            if (iArr == null || iArr.length < i9) {
                iArr = new int[i9];
            }
            int[] iArr2 = c1589b.f20687e;
            if (iArr2 == null || iArr2.length < i9) {
                iArr2 = new int[i9];
            }
            if (z10) {
                int i11 = i9 * 6;
                rVar.E(i11);
                x5 = e(x5, j9, (byte[]) rVar.f384c, i11);
                j9 += i11;
                rVar.H(0);
                for (int i12 = 0; i12 < i9; i12++) {
                    iArr[i12] = rVar.C();
                    iArr2[i12] = rVar.A();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = z9.f5032a - ((int) (j9 - z9.f5033b));
            }
            q3.t tVar = (q3.t) z9.f5034c;
            int i13 = l4.y.f20553a;
            byte[] bArr2 = tVar.f22348b;
            byte[] bArr3 = c1589b.f20683a;
            c1589b.f20688f = i9;
            c1589b.f20686d = iArr;
            c1589b.f20687e = iArr2;
            c1589b.f20684b = bArr2;
            c1589b.f20683a = bArr3;
            int i14 = tVar.f22347a;
            c1589b.f20685c = i14;
            int i15 = tVar.f22349c;
            c1589b.f20689g = i15;
            int i16 = tVar.f22350d;
            c1589b.f20690h = i16;
            MediaCodec.CryptoInfo cryptoInfo = c1589b.f20691i;
            cryptoInfo.numSubSamples = i9;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (l4.y.f20553a >= 24) {
                C1499E c1499e = c1589b.j;
                c1499e.getClass();
                ((MediaCodec.CryptoInfo.Pattern) c1499e.f19986c).set(i15, i16);
                ((MediaCodec.CryptoInfo) c1499e.f19985b).setPattern((MediaCodec.CryptoInfo.Pattern) c1499e.f19986c);
            }
            long j10 = z9.f5033b;
            int i17 = (int) (j9 - j10);
            z9.f5033b = j10 + i17;
            z9.f5032a -= i17;
        }
        if (fVar.e(268435456)) {
            rVar.E(4);
            X e9 = e(x5, z9.f5033b, (byte[]) rVar.f384c, 4);
            int A2 = rVar.A();
            z9.f5033b += 4;
            z9.f5032a -= 4;
            fVar.t(A2);
            X d9 = d(e9, z9.f5033b, fVar.f20704d, A2);
            z9.f5033b += A2;
            int i18 = z9.f5032a - A2;
            z9.f5032a = i18;
            ByteBuffer byteBuffer = fVar.f20707g;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                fVar.f20707g.clear();
            } else {
                fVar.f20707g = ByteBuffer.allocate(i18);
            }
            return d(d9, z9.f5033b, fVar.f20707g, z9.f5032a);
        }
        fVar.t(z9.f5032a);
        return d(x5, z9.f5033b, fVar.f20704d, z9.f5032a);
    }

    public final void a(X x5) {
        if (((C1501a) x5.f5023c) == null) {
            return;
        }
        C1517q c1517q = this.f5025a;
        synchronized (c1517q) {
            X x9 = x5;
            while (x9 != null) {
                try {
                    C1501a[] c1501aArr = c1517q.f20090f;
                    int i9 = c1517q.f20089e;
                    c1517q.f20089e = i9 + 1;
                    C1501a c1501a = (C1501a) x9.f5023c;
                    c1501a.getClass();
                    c1501aArr[i9] = c1501a;
                    c1517q.f20088d--;
                    x9 = (X) x9.f5024d;
                    if (x9 == null || ((C1501a) x9.f5023c) == null) {
                        x9 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c1517q.notifyAll();
        }
        x5.f5023c = null;
        x5.f5024d = null;
    }

    public final void b(long j) {
        X x5;
        if (j != -1) {
            while (true) {
                x5 = this.f5028d;
                if (j < x5.f5022b) {
                    break;
                }
                C1517q c1517q = this.f5025a;
                C1501a c1501a = (C1501a) x5.f5023c;
                synchronized (c1517q) {
                    C1501a[] c1501aArr = c1517q.f20090f;
                    int i9 = c1517q.f20089e;
                    c1517q.f20089e = i9 + 1;
                    c1501aArr[i9] = c1501a;
                    c1517q.f20088d--;
                    c1517q.notifyAll();
                }
                X x9 = this.f5028d;
                x9.f5023c = null;
                X x10 = (X) x9.f5024d;
                x9.f5024d = null;
                this.f5028d = x10;
            }
            if (this.f5029e.f5021a < x5.f5021a) {
                this.f5029e = x5;
            }
        }
    }

    public final int c(int i9) {
        C1501a c1501a;
        X x5 = this.f5030f;
        if (((C1501a) x5.f5023c) == null) {
            C1517q c1517q = this.f5025a;
            synchronized (c1517q) {
                try {
                    int i10 = c1517q.f20088d + 1;
                    c1517q.f20088d = i10;
                    int i11 = c1517q.f20089e;
                    if (i11 > 0) {
                        C1501a[] c1501aArr = c1517q.f20090f;
                        int i12 = i11 - 1;
                        c1517q.f20089e = i12;
                        c1501a = c1501aArr[i12];
                        c1501a.getClass();
                        c1517q.f20090f[c1517q.f20089e] = null;
                    } else {
                        C1501a c1501a2 = new C1501a(0, new byte[c1517q.f20086b]);
                        C1501a[] c1501aArr2 = c1517q.f20090f;
                        if (i10 > c1501aArr2.length) {
                            c1517q.f20090f = (C1501a[]) Arrays.copyOf(c1501aArr2, c1501aArr2.length * 2);
                        }
                        c1501a = c1501a2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            X x9 = new X(this.f5030f.f5022b, this.f5026b);
            x5.f5023c = c1501a;
            x5.f5024d = x9;
        }
        return Math.min(i9, (int) (this.f5030f.f5022b - this.f5031g));
    }
}
