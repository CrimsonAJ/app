package q3;

import j3.K;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import k4.InterfaceC1510j;
import l4.y;

/* renamed from: q3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1902g implements InterfaceC1906k {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1510j f22310b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22311c;

    /* renamed from: d, reason: collision with root package name */
    public long f22312d;

    /* renamed from: f, reason: collision with root package name */
    public int f22314f;

    /* renamed from: g, reason: collision with root package name */
    public int f22315g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f22313e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22309a = new byte[4096];

    static {
        K.a("goog.exo.extractor");
    }

    public C1902g(InterfaceC1510j interfaceC1510j, long j, long j4) {
        this.f22310b = interfaceC1510j;
        this.f22312d = j;
        this.f22311c = j4;
    }

    @Override // q3.InterfaceC1906k
    public final void B(byte[] bArr, int i9, int i10) {
        t(bArr, i9, i10, false);
    }

    @Override // q3.InterfaceC1906k
    public final void C(int i9) {
        c(i9, false);
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        C1902g c1902g;
        int i11 = this.f22315g;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.f22313e, 0, bArr, i9, min);
            k(min);
            i12 = min;
        }
        if (i12 == 0) {
            c1902g = this;
            i12 = c1902g.i(bArr, i9, i10, 0, true);
        } else {
            c1902g = this;
        }
        if (i12 != -1) {
            c1902g.f22312d += i12;
        }
        return i12;
    }

    @Override // q3.InterfaceC1906k
    public final long E() {
        return this.f22312d;
    }

    public final boolean c(int i9, boolean z9) {
        d(i9);
        int i10 = this.f22315g - this.f22314f;
        while (i10 < i9) {
            int i11 = i9;
            boolean z10 = z9;
            i10 = i(this.f22313e, this.f22314f, i11, i10, z10);
            if (i10 == -1) {
                return false;
            }
            this.f22315g = this.f22314f + i10;
            i9 = i11;
            z9 = z10;
        }
        this.f22314f += i9;
        return true;
    }

    public final void d(int i9) {
        int i10 = this.f22314f + i9;
        byte[] bArr = this.f22313e;
        if (i10 > bArr.length) {
            this.f22313e = Arrays.copyOf(this.f22313e, y.i(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    @Override // q3.InterfaceC1906k
    public final boolean e(byte[] bArr, int i9, int i10, boolean z9) {
        int min;
        int i11 = this.f22315g;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.f22313e, 0, bArr, i9, min);
            k(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = i(bArr, i9, i10, i12, z9);
        }
        if (i12 != -1) {
            this.f22312d += i12;
        }
        if (i12 == -1) {
            return false;
        }
        return true;
    }

    public final int h(byte[] bArr, int i9, int i10) {
        C1902g c1902g;
        int min;
        d(i10);
        int i11 = this.f22315g;
        int i12 = this.f22314f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            c1902g = this;
            min = c1902g.i(this.f22313e, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            c1902g.f22315g += min;
        } else {
            c1902g = this;
            min = Math.min(i10, i13);
        }
        System.arraycopy(c1902g.f22313e, c1902g.f22314f, bArr, i9, min);
        c1902g.f22314f += min;
        return min;
    }

    public final int i(byte[] bArr, int i9, int i10, int i11, boolean z9) {
        if (!Thread.interrupted()) {
            int D8 = this.f22310b.D(bArr, i9 + i11, i10 - i11);
            if (D8 == -1) {
                if (i11 == 0 && z9) {
                    return -1;
                }
                throw new EOFException();
            }
            return i11 + D8;
        }
        throw new InterruptedIOException();
    }

    @Override // q3.InterfaceC1906k
    public final long j() {
        return this.f22311c;
    }

    public final void k(int i9) {
        byte[] bArr;
        int i10 = this.f22315g - i9;
        this.f22315g = i10;
        this.f22314f = 0;
        byte[] bArr2 = this.f22313e;
        if (i10 < bArr2.length - 524288) {
            bArr = new byte[65536 + i10];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i9, bArr, 0, i10);
        this.f22313e = bArr;
    }

    @Override // q3.InterfaceC1906k
    public final void m() {
        this.f22314f = 0;
    }

    @Override // q3.InterfaceC1906k
    public final void n(int i9) {
        int min = Math.min(this.f22315g, i9);
        k(min);
        int i10 = min;
        while (i10 < i9 && i10 != -1) {
            byte[] bArr = this.f22309a;
            i10 = i(bArr, -i10, Math.min(i9, bArr.length + i10), i10, false);
        }
        if (i10 != -1) {
            this.f22312d += i10;
        }
    }

    @Override // q3.InterfaceC1906k
    public final void readFully(byte[] bArr, int i9, int i10) {
        e(bArr, i9, i10, false);
    }

    @Override // q3.InterfaceC1906k
    public final boolean t(byte[] bArr, int i9, int i10, boolean z9) {
        if (!c(i10, z9)) {
            return false;
        }
        System.arraycopy(this.f22313e, this.f22314f - i10, bArr, i9, i10);
        return true;
    }

    @Override // q3.InterfaceC1906k
    public final long w() {
        return this.f22312d + this.f22314f;
    }
}
