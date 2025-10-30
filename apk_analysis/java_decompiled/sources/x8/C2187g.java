package x8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: x8.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2187g implements InterfaceC2189i, InterfaceC2188h, Cloneable, ByteChannel, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public D f24643a;

    /* renamed from: b, reason: collision with root package name */
    public long f24644b;

    @Override // x8.InterfaceC2188h
    public final /* bridge */ /* synthetic */ InterfaceC2188h A(C2190j c2190j) {
        t0(c2190j);
        return this;
    }

    public final void A0(int i9) {
        D s02 = s0(2);
        int i10 = s02.f24607c;
        byte[] bArr = s02.f24605a;
        bArr[i10] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i9 & 255);
        s02.f24607c = i10 + 2;
        this.f24644b += 2;
    }

    public final void B0(String string) {
        kotlin.jvm.internal.h.e(string, "string");
        C0(string, 0, string.length());
    }

    @Override // x8.InterfaceC2189i
    public final long C(C2190j bytes) {
        kotlin.jvm.internal.h.e(bytes, "bytes");
        return S(bytes, 0L);
    }

    public final void C0(String string, int i9, int i10) {
        char charAt;
        char c3;
        kotlin.jvm.internal.h.e(string, "string");
        if (i9 >= 0) {
            if (i10 >= i9) {
                if (i10 <= string.length()) {
                    while (i9 < i10) {
                        char charAt2 = string.charAt(i9);
                        if (charAt2 < 128) {
                            D s02 = s0(1);
                            int i11 = s02.f24607c - i9;
                            int min = Math.min(i10, 8192 - i11);
                            int i12 = i9 + 1;
                            byte[] bArr = s02.f24605a;
                            bArr[i9 + i11] = (byte) charAt2;
                            while (true) {
                                i9 = i12;
                                if (i9 >= min || (charAt = string.charAt(i9)) >= 128) {
                                    break;
                                }
                                i12 = i9 + 1;
                                bArr[i9 + i11] = (byte) charAt;
                            }
                            int i13 = s02.f24607c;
                            int i14 = (i11 + i9) - i13;
                            s02.f24607c = i13 + i14;
                            this.f24644b += i14;
                        } else {
                            if (charAt2 < 2048) {
                                D s03 = s0(2);
                                int i15 = s03.f24607c;
                                byte[] bArr2 = s03.f24605a;
                                bArr2[i15] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                                s03.f24607c = i15 + 2;
                                this.f24644b += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i16 = i9 + 1;
                                if (i16 < i10) {
                                    c3 = string.charAt(i16);
                                } else {
                                    c3 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c3 && c3 < 57344) {
                                    int i17 = (((charAt2 & 1023) << 10) | (c3 & 1023)) + 65536;
                                    D s04 = s0(4);
                                    int i18 = s04.f24607c;
                                    byte[] bArr3 = s04.f24605a;
                                    bArr3[i18] = (byte) ((i17 >> 18) | 240);
                                    bArr3[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                                    bArr3[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                                    bArr3[i18 + 3] = (byte) ((i17 & 63) | 128);
                                    s04.f24607c = i18 + 4;
                                    this.f24644b += 4;
                                    i9 += 2;
                                } else {
                                    w0(63);
                                    i9 = i16;
                                }
                            } else {
                                D s05 = s0(3);
                                int i19 = s05.f24607c;
                                byte[] bArr4 = s05.f24605a;
                                bArr4[i19] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i19 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i19 + 2] = (byte) ((charAt2 & '?') | 128);
                                s05.f24607c = i19 + 3;
                                this.f24644b += 3;
                            }
                            i9++;
                        }
                    }
                    return;
                }
                StringBuilder p9 = A0.a.p("endIndex > string.length: ", i10, " > ");
                p9.append(string.length());
                throw new IllegalArgumentException(p9.toString().toString());
            }
            throw new IllegalArgumentException(A0.a.l("endIndex < beginIndex: ", i10, i9, " < ").toString());
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "beginIndex < 0: ").toString());
    }

    @Override // x8.InterfaceC2188h
    public final InterfaceC2188h D(byte[] source) {
        kotlin.jvm.internal.h.e(source, "source");
        u0(source, 0, source.length);
        return this;
    }

    public final void D0(int i9) {
        if (i9 < 128) {
            w0(i9);
            return;
        }
        if (i9 < 2048) {
            D s02 = s0(2);
            int i10 = s02.f24607c;
            byte[] bArr = s02.f24605a;
            bArr[i10] = (byte) ((i9 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i9 & 63) | 128);
            s02.f24607c = i10 + 2;
            this.f24644b += 2;
            return;
        }
        if (55296 <= i9 && i9 < 57344) {
            w0(63);
            return;
        }
        if (i9 < 65536) {
            D s03 = s0(3);
            int i11 = s03.f24607c;
            byte[] bArr2 = s03.f24605a;
            bArr2[i11] = (byte) ((i9 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i9 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i9 & 63) | 128);
            s03.f24607c = i11 + 3;
            this.f24644b += 3;
            return;
        }
        if (i9 <= 1114111) {
            D s04 = s0(4);
            int i12 = s04.f24607c;
            byte[] bArr3 = s04.f24605a;
            bArr3[i12] = (byte) ((i9 >> 18) | 240);
            bArr3[i12 + 1] = (byte) (((i9 >> 12) & 63) | 128);
            bArr3[i12 + 2] = (byte) (((i9 >> 6) & 63) | 128);
            bArr3[i12 + 3] = (byte) ((i9 & 63) | 128);
            s04.f24607c = i12 + 4;
            this.f24644b += 4;
            return;
        }
        throw new IllegalArgumentException("Unexpected code point: 0x".concat(s8.n.B(i9)));
    }

    public final long F() {
        long j = this.f24644b;
        if (j == 0) {
            return 0L;
        }
        D d9 = this.f24643a;
        kotlin.jvm.internal.h.b(d9);
        D d10 = d9.f24611g;
        kotlin.jvm.internal.h.b(d10);
        if (d10.f24607c < 8192 && d10.f24609e) {
            return j - (r3 - d10.f24606b);
        }
        return j;
    }

    @Override // x8.G
    public final void G(C2187g source, long j) {
        D d9;
        D b9;
        int i9;
        kotlin.jvm.internal.h.e(source, "source");
        if (source != this) {
            s8.n.f(source.f24644b, 0L, j);
            while (j > 0) {
                D d10 = source.f24643a;
                kotlin.jvm.internal.h.b(d10);
                int i10 = d10.f24607c;
                D d11 = source.f24643a;
                kotlin.jvm.internal.h.b(d11);
                long j4 = i10 - d11.f24606b;
                int i11 = 0;
                if (j < j4) {
                    D d12 = this.f24643a;
                    if (d12 != null) {
                        d9 = d12.f24611g;
                    } else {
                        d9 = null;
                    }
                    if (d9 != null && d9.f24609e) {
                        long j9 = d9.f24607c + j;
                        if (d9.f24608d) {
                            i9 = 0;
                        } else {
                            i9 = d9.f24606b;
                        }
                        if (j9 - i9 <= 8192) {
                            D d13 = source.f24643a;
                            kotlin.jvm.internal.h.b(d13);
                            d13.d(d9, (int) j);
                            source.f24644b -= j;
                            this.f24644b += j;
                            return;
                        }
                    }
                    D d14 = source.f24643a;
                    kotlin.jvm.internal.h.b(d14);
                    int i12 = (int) j;
                    if (i12 > 0 && i12 <= d14.f24607c - d14.f24606b) {
                        if (i12 >= 1024) {
                            b9 = d14.c();
                        } else {
                            b9 = E.b();
                            int i13 = d14.f24606b;
                            B7.j.c0(0, i13, i13 + i12, d14.f24605a, b9.f24605a);
                        }
                        b9.f24607c = b9.f24606b + i12;
                        d14.f24606b += i12;
                        D d15 = d14.f24611g;
                        kotlin.jvm.internal.h.b(d15);
                        d15.b(b9);
                        source.f24643a = b9;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                D d16 = source.f24643a;
                kotlin.jvm.internal.h.b(d16);
                long j10 = d16.f24607c - d16.f24606b;
                source.f24643a = d16.a();
                D d17 = this.f24643a;
                if (d17 == null) {
                    this.f24643a = d16;
                    d16.f24611g = d16;
                    d16.f24610f = d16;
                } else {
                    D d18 = d17.f24611g;
                    kotlin.jvm.internal.h.b(d18);
                    d18.b(d16);
                    D d19 = d16.f24611g;
                    if (d19 != d16) {
                        kotlin.jvm.internal.h.b(d19);
                        if (d19.f24609e) {
                            int i14 = d16.f24607c - d16.f24606b;
                            D d20 = d16.f24611g;
                            kotlin.jvm.internal.h.b(d20);
                            int i15 = 8192 - d20.f24607c;
                            D d21 = d16.f24611g;
                            kotlin.jvm.internal.h.b(d21);
                            if (!d21.f24608d) {
                                D d22 = d16.f24611g;
                                kotlin.jvm.internal.h.b(d22);
                                i11 = d22.f24606b;
                            }
                            if (i14 <= i15 + i11) {
                                D d23 = d16.f24611g;
                                kotlin.jvm.internal.h.b(d23);
                                d16.d(d23, i14);
                                d16.a();
                                E.a(d16);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                source.f24644b -= j10;
                this.f24644b += j10;
                j -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final void I(C2187g out, long j, long j4) {
        kotlin.jvm.internal.h.e(out, "out");
        long j9 = j;
        s8.n.f(this.f24644b, j9, j4);
        if (j4 != 0) {
            out.f24644b += j4;
            D d9 = this.f24643a;
            while (true) {
                kotlin.jvm.internal.h.b(d9);
                long j10 = d9.f24607c - d9.f24606b;
                if (j9 < j10) {
                    break;
                }
                j9 -= j10;
                d9 = d9.f24610f;
            }
            D d10 = d9;
            long j11 = j4;
            while (j11 > 0) {
                kotlin.jvm.internal.h.b(d10);
                D c3 = d10.c();
                int i9 = c3.f24606b + ((int) j9);
                c3.f24606b = i9;
                c3.f24607c = Math.min(i9 + ((int) j11), c3.f24607c);
                D d11 = out.f24643a;
                if (d11 == null) {
                    c3.f24611g = c3;
                    c3.f24610f = c3;
                    out.f24643a = c3;
                } else {
                    D d12 = d11.f24611g;
                    kotlin.jvm.internal.h.b(d12);
                    d12.b(c3);
                }
                j11 -= c3.f24607c - c3.f24606b;
                d10 = d10.f24610f;
                j9 = 0;
            }
        }
    }

    public final boolean N() {
        if (this.f24644b == 0) {
            return true;
        }
        return false;
    }

    public final byte O(long j) {
        s8.n.f(this.f24644b, j, 1L);
        D d9 = this.f24643a;
        if (d9 != null) {
            long j4 = this.f24644b;
            if (j4 - j < j) {
                while (j4 > j) {
                    d9 = d9.f24611g;
                    kotlin.jvm.internal.h.b(d9);
                    j4 -= d9.f24607c - d9.f24606b;
                }
                return d9.f24605a[(int) ((d9.f24606b + j) - j4)];
            }
            long j9 = 0;
            while (true) {
                int i9 = d9.f24607c;
                int i10 = d9.f24606b;
                long j10 = (i9 - i10) + j9;
                if (j10 <= j) {
                    d9 = d9.f24610f;
                    kotlin.jvm.internal.h.b(d9);
                    j9 = j10;
                } else {
                    return d9.f24605a[(int) ((i10 + j) - j9)];
                }
            }
        } else {
            kotlin.jvm.internal.h.b(null);
            throw null;
        }
    }

    @Override // x8.InterfaceC2189i
    public final int Q(x options) {
        kotlin.jvm.internal.h.e(options, "options");
        int c3 = y8.a.c(this, options, false);
        if (c3 == -1) {
            return -1;
        }
        n(options.f24683a[c3].d());
        return c3;
    }

    public final long S(C2190j bytes, long j) {
        kotlin.jvm.internal.h.e(bytes, "bytes");
        byte[] bArr = bytes.f24646a;
        if (bArr.length > 0) {
            long j4 = 0;
            if (j >= 0) {
                D d9 = this.f24643a;
                if (d9 != null) {
                    long j9 = this.f24644b;
                    if (j9 - j < j) {
                        while (j9 > j) {
                            d9 = d9.f24611g;
                            kotlin.jvm.internal.h.b(d9);
                            j9 -= d9.f24607c - d9.f24606b;
                        }
                        byte b9 = bArr[0];
                        int length = bArr.length;
                        long j10 = (this.f24644b - length) + 1;
                        while (j9 < j10) {
                            int min = (int) Math.min(d9.f24607c, (d9.f24606b + j10) - j9);
                            for (int i9 = (int) ((d9.f24606b + j) - j9); i9 < min; i9++) {
                                if (d9.f24605a[i9] == b9 && y8.a.a(d9, i9 + 1, bArr, length)) {
                                    return (i9 - d9.f24606b) + j9;
                                }
                            }
                            j9 += d9.f24607c - d9.f24606b;
                            d9 = d9.f24610f;
                            kotlin.jvm.internal.h.b(d9);
                            j = j9;
                        }
                        return -1L;
                    }
                    while (true) {
                        long j11 = (d9.f24607c - d9.f24606b) + j4;
                        if (j11 > j) {
                            break;
                        }
                        d9 = d9.f24610f;
                        kotlin.jvm.internal.h.b(d9);
                        j4 = j11;
                    }
                    byte b10 = bArr[0];
                    int length2 = bArr.length;
                    long j12 = (this.f24644b - length2) + 1;
                    while (j4 < j12) {
                        int min2 = (int) Math.min(d9.f24607c, (d9.f24606b + j12) - j4);
                        for (int i10 = (int) ((d9.f24606b + j) - j4); i10 < min2; i10++) {
                            if (d9.f24605a[i10] == b10 && y8.a.a(d9, i10 + 1, bArr, length2)) {
                                return (i10 - d9.f24606b) + j4;
                            }
                        }
                        j4 += d9.f24607c - d9.f24606b;
                        d9 = d9.f24610f;
                        kotlin.jvm.internal.h.b(d9);
                        j = j4;
                    }
                    return -1L;
                }
                return -1L;
            }
            throw new IllegalArgumentException(AbstractC0953k1.k(j, "fromIndex < 0: ").toString());
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    @Override // x8.InterfaceC2188h
    public final /* bridge */ /* synthetic */ InterfaceC2188h V(int i9, byte[] bArr) {
        u0(bArr, 0, i9);
        return this;
    }

    @Override // x8.InterfaceC2188h
    public final /* bridge */ /* synthetic */ InterfaceC2188h X(String str) {
        B0(str);
        return this;
    }

    @Override // x8.InterfaceC2188h
    public final /* bridge */ /* synthetic */ InterfaceC2188h Y(long j) {
        x0(j);
        return this;
    }

    public final long a0(C2190j targetBytes, long j) {
        kotlin.jvm.internal.h.e(targetBytes, "targetBytes");
        long j4 = 0;
        if (j >= 0) {
            D d9 = this.f24643a;
            if (d9 != null) {
                long j9 = this.f24644b;
                long j10 = j9 - j;
                byte[] bArr = targetBytes.f24646a;
                if (j10 < j) {
                    while (j9 > j) {
                        d9 = d9.f24611g;
                        kotlin.jvm.internal.h.b(d9);
                        j9 -= d9.f24607c - d9.f24606b;
                    }
                    if (bArr.length == 2) {
                        byte b9 = bArr[0];
                        byte b10 = bArr[1];
                        while (j9 < this.f24644b) {
                            int i9 = d9.f24607c;
                            for (int i10 = (int) ((d9.f24606b + j) - j9); i10 < i9; i10++) {
                                byte b11 = d9.f24605a[i10];
                                if (b11 == b9 || b11 == b10) {
                                    return (i10 - d9.f24606b) + j9;
                                }
                            }
                            j9 += d9.f24607c - d9.f24606b;
                            d9 = d9.f24610f;
                            kotlin.jvm.internal.h.b(d9);
                            j = j9;
                        }
                        return -1L;
                    }
                    while (j9 < this.f24644b) {
                        int i11 = d9.f24607c;
                        for (int i12 = (int) ((d9.f24606b + j) - j9); i12 < i11; i12++) {
                            byte b12 = d9.f24605a[i12];
                            for (byte b13 : bArr) {
                                if (b12 == b13) {
                                    return (i12 - d9.f24606b) + j9;
                                }
                            }
                        }
                        j9 += d9.f24607c - d9.f24606b;
                        d9 = d9.f24610f;
                        kotlin.jvm.internal.h.b(d9);
                        j = j9;
                    }
                    return -1L;
                }
                while (true) {
                    long j11 = (d9.f24607c - d9.f24606b) + j4;
                    if (j11 > j) {
                        break;
                    }
                    d9 = d9.f24610f;
                    kotlin.jvm.internal.h.b(d9);
                    j4 = j11;
                }
                if (bArr.length == 2) {
                    byte b14 = bArr[0];
                    byte b15 = bArr[1];
                    while (j4 < this.f24644b) {
                        int i13 = d9.f24607c;
                        for (int i14 = (int) ((d9.f24606b + j) - j4); i14 < i13; i14++) {
                            byte b16 = d9.f24605a[i14];
                            if (b16 == b14 || b16 == b15) {
                                return (i14 - d9.f24606b) + j4;
                            }
                        }
                        j4 += d9.f24607c - d9.f24606b;
                        d9 = d9.f24610f;
                        kotlin.jvm.internal.h.b(d9);
                        j = j4;
                    }
                    return -1L;
                }
                while (j4 < this.f24644b) {
                    int i15 = d9.f24607c;
                    for (int i16 = (int) ((d9.f24606b + j) - j4); i16 < i15; i16++) {
                        byte b17 = d9.f24605a[i16];
                        for (byte b18 : bArr) {
                            if (b17 == b18) {
                                return (i16 - d9.f24606b) + j4;
                            }
                        }
                    }
                    j4 += d9.f24607c - d9.f24606b;
                    d9 = d9.f24610f;
                    kotlin.jvm.internal.h.b(d9);
                    j = j4;
                }
                return -1L;
            }
            return -1L;
        }
        throw new IllegalArgumentException(AbstractC0953k1.k(j, "fromIndex < 0: ").toString());
    }

    @Override // x8.I
    public final long b0(C2187g sink, long j) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (j >= 0) {
            long j4 = this.f24644b;
            if (j4 == 0) {
                return -1L;
            }
            if (j > j4) {
                j = j4;
            }
            sink.G(this, j);
            return j;
        }
        throw new IllegalArgumentException(AbstractC0953k1.k(j, "byteCount < 0: ").toString());
    }

    @Override // x8.I
    public final K c() {
        return K.f24618d;
    }

    @Override // x8.InterfaceC2189i
    public final String c0(Charset charset) {
        return p0(this.f24644b, charset);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x8.g] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.f24644b == 0) {
            return obj;
        }
        D d9 = this.f24643a;
        kotlin.jvm.internal.h.b(d9);
        D c3 = d9.c();
        obj.f24643a = c3;
        c3.f24611g = c3;
        c3.f24610f = c3;
        for (D d10 = d9.f24610f; d10 != d9; d10 = d10.f24610f) {
            D d11 = c3.f24611g;
            kotlin.jvm.internal.h.b(d11);
            kotlin.jvm.internal.h.b(d10);
            d11.b(d10.c());
        }
        obj.f24644b = this.f24644b;
        return obj;
    }

    @Override // x8.InterfaceC2189i
    public final InputStream e0() {
        return new C2186f(this, 0);
    }

    public final boolean equals(Object obj) {
        boolean z9 = true;
        if (this == obj) {
            return true;
        }
        boolean z10 = false;
        if (!(obj instanceof C2187g)) {
            return false;
        }
        long j = this.f24644b;
        C2187g c2187g = (C2187g) obj;
        if (j != c2187g.f24644b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        D d9 = this.f24643a;
        kotlin.jvm.internal.h.b(d9);
        D d10 = c2187g.f24643a;
        kotlin.jvm.internal.h.b(d10);
        int i9 = d9.f24606b;
        int i10 = d10.f24606b;
        long j4 = 0;
        while (j4 < this.f24644b) {
            long min = Math.min(d9.f24607c - i9, d10.f24607c - i10);
            long j9 = 0;
            while (j9 < min) {
                int i11 = i9 + 1;
                boolean z11 = z9;
                byte b9 = d9.f24605a[i9];
                int i12 = i10 + 1;
                boolean z12 = z10;
                if (b9 != d10.f24605a[i10]) {
                    return z12;
                }
                j9++;
                i10 = i12;
                i9 = i11;
                z9 = z11;
                z10 = z12;
            }
            boolean z13 = z9;
            boolean z14 = z10;
            if (i9 == d9.f24607c) {
                D d11 = d9.f24610f;
                kotlin.jvm.internal.h.b(d11);
                i9 = d11.f24606b;
                d9 = d11;
            }
            if (i10 == d10.f24607c) {
                d10 = d10.f24610f;
                kotlin.jvm.internal.h.b(d10);
                i10 = d10.f24606b;
            }
            j4 += min;
            z9 = z13;
            z10 = z14;
        }
        return z9;
    }

    @Override // x8.InterfaceC2189i
    public final boolean f0(C2190j bytes) {
        kotlin.jvm.internal.h.e(bytes, "bytes");
        byte[] bArr = bytes.f24646a;
        int length = bArr.length;
        if (length >= 0 && this.f24644b >= length && bArr.length >= length) {
            for (int i9 = 0; i9 < length; i9++) {
                if (O(i9) == bArr[i9]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g0(byte[] bArr, int i9, int i10) {
        s8.n.f(bArr.length, i9, i10);
        D d9 = this.f24643a;
        if (d9 == null) {
            return -1;
        }
        int min = Math.min(i10, d9.f24607c - d9.f24606b);
        int i11 = d9.f24606b;
        B7.j.c0(i9, i11, i11 + min, d9.f24605a, bArr);
        int i12 = d9.f24606b + min;
        d9.f24606b = i12;
        this.f24644b -= min;
        if (i12 == d9.f24607c) {
            this.f24643a = d9.a();
            E.a(d9);
        }
        return min;
    }

    @Override // x8.InterfaceC2189i
    public final long h(C2190j targetBytes) {
        kotlin.jvm.internal.h.e(targetBytes, "targetBytes");
        return a0(targetBytes, 0L);
    }

    public final byte h0() {
        if (this.f24644b != 0) {
            D d9 = this.f24643a;
            kotlin.jvm.internal.h.b(d9);
            int i9 = d9.f24606b;
            int i10 = d9.f24607c;
            int i11 = i9 + 1;
            byte b9 = d9.f24605a[i9];
            this.f24644b--;
            if (i11 == i10) {
                this.f24643a = d9.a();
                E.a(d9);
                return b9;
            }
            d9.f24606b = i11;
            return b9;
        }
        throw new EOFException();
    }

    public final int hashCode() {
        D d9 = this.f24643a;
        if (d9 == null) {
            return 0;
        }
        int i9 = 1;
        do {
            int i10 = d9.f24607c;
            for (int i11 = d9.f24606b; i11 < i10; i11++) {
                i9 = (i9 * 31) + d9.f24605a[i11];
            }
            d9 = d9.f24610f;
            kotlin.jvm.internal.h.b(d9);
        } while (d9 != this.f24643a);
        return i9;
    }

    public final byte[] i0(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.f24644b >= j) {
                int i9 = (int) j;
                byte[] bArr = new byte[i9];
                int i10 = 0;
                while (i10 < i9) {
                    int g02 = g0(bArr, i10, i9 - i10);
                    if (g02 != -1) {
                        i10 += g02;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC0953k1.k(j, "byteCount: ").toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final C2190j j0(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.f24644b >= j) {
                if (j >= 4096) {
                    C2190j r0 = r0((int) j);
                    n(j);
                    return r0;
                }
                return new C2190j(i0(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC0953k1.k(j, "byteCount: ").toString());
    }

    @Override // x8.InterfaceC2189i
    public final C2190j k() {
        return j0(this.f24644b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        r2 = r21.f24644b - r11;
        r21.f24644b = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r12 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        if (r11 >= r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r2 == r19) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        if (r12 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
    
        r2 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        r4 = new java.lang.StringBuilder();
        r4.append(r2);
        r4.append(" but was 0x");
        r2 = O(r19);
        r5 = y8.b.f25133a;
        r6 = r5[(r2 >> 4) & 15];
        r2 = r5[r2 & 15];
        r1 = new char[2];
        r1[0] = r6;
        r1[r17] = r2;
        r4.append(new java.lang.String(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        throw new java.lang.NumberFormatException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bc, code lost:
    
        r2 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fb, code lost:
    
        if (r12 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fd, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ff, code lost:
    
        return -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00af, code lost:
    
        r4 = r17;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, x8.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k0() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.C2187g.k0():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[EDGE_INSN: B:40:0x00a4->B:37:0x00a4 BREAK  A[LOOP:0: B:4:0x0012->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, x8.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l0() {
        /*
            r18 = this;
            r0 = r18
            r1 = 4
            r2 = 48
            r3 = 0
            r4 = 1
            long r5 = r0.f24644b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto Lab
            r9 = r3
            r10 = r9
            r5 = r7
        L12:
            x8.D r11 = r0.f24643a
            kotlin.jvm.internal.h.b(r11)
            int r12 = r11.f24606b
            int r13 = r11.f24607c
        L1b:
            if (r12 >= r13) goto L90
            byte[] r14 = r11.f24605a
            r14 = r14[r12]
            if (r14 < r2) goto L2a
            r15 = 57
            if (r14 > r15) goto L2a
            int r15 = r14 + (-48)
            goto L3f
        L2a:
            r15 = 97
            if (r14 < r15) goto L35
            r15 = 102(0x66, float:1.43E-43)
            if (r14 > r15) goto L35
            int r15 = r14 + (-87)
            goto L3f
        L35:
            r15 = 65
            if (r14 < r15) goto L68
            r15 = 70
            if (r14 > r15) goto L68
            int r15 = r14 + (-55)
        L3f:
            r16 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r16 = r5 & r16
            int r16 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r16 != 0) goto L4d
            long r5 = r5 << r1
            long r14 = (long) r15
            long r5 = r5 | r14
            int r12 = r12 + r4
            int r9 = r9 + r4
            goto L1b
        L4d:
            x8.g r1 = new x8.g
            r1.<init>()
            r1.y0(r5)
            r1.w0(r14)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.q0()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L68:
            if (r9 == 0) goto L6c
            r10 = r4
            goto L90
        L6c:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            char[] r5 = y8.b.f25133a
            int r1 = r14 >> 4
            r1 = r1 & 15
            char r1 = r5[r1]
            r6 = r14 & 15
            char r5 = r5[r6]
            r6 = 2
            char[] r6 = new char[r6]
            r6[r3] = r1
            r6[r4] = r5
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L90:
            if (r12 != r13) goto L9c
            x8.D r12 = r11.a()
            r0.f24643a = r12
            x8.E.a(r11)
            goto L9e
        L9c:
            r11.f24606b = r12
        L9e:
            if (r10 != 0) goto La4
            x8.D r11 = r0.f24643a
            if (r11 != 0) goto L12
        La4:
            long r1 = r0.f24644b
            long r3 = (long) r9
            long r1 = r1 - r3
            r0.f24644b = r1
            return r5
        Lab:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.C2187g.l0():long");
    }

    public final int m0() {
        if (this.f24644b >= 4) {
            D d9 = this.f24643a;
            kotlin.jvm.internal.h.b(d9);
            int i9 = d9.f24606b;
            int i10 = d9.f24607c;
            if (i10 - i9 < 4) {
                return ((h0() & 255) << 24) | ((h0() & 255) << 16) | ((h0() & 255) << 8) | (h0() & 255);
            }
            byte[] bArr = d9.f24605a;
            int i11 = i9 + 3;
            int i12 = ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 2] & 255) << 8);
            int i13 = i9 + 4;
            int i14 = i12 | (bArr[i11] & 255);
            this.f24644b -= 4;
            if (i13 == i10) {
                this.f24643a = d9.a();
                E.a(d9);
                return i14;
            }
            d9.f24606b = i13;
            return i14;
        }
        throw new EOFException();
    }

    @Override // x8.InterfaceC2189i
    public final void n(long j) {
        while (j > 0) {
            D d9 = this.f24643a;
            if (d9 != null) {
                int min = (int) Math.min(j, d9.f24607c - d9.f24606b);
                long j4 = min;
                this.f24644b -= j4;
                j -= j4;
                int i9 = d9.f24606b + min;
                d9.f24606b = i9;
                if (i9 == d9.f24607c) {
                    this.f24643a = d9.a();
                    E.a(d9);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final short n0() {
        if (this.f24644b >= 2) {
            D d9 = this.f24643a;
            kotlin.jvm.internal.h.b(d9);
            int i9 = d9.f24606b;
            int i10 = d9.f24607c;
            if (i10 - i9 < 2) {
                return (short) (((h0() & 255) << 8) | (h0() & 255));
            }
            int i11 = i9 + 1;
            byte[] bArr = d9.f24605a;
            int i12 = (bArr[i9] & 255) << 8;
            int i13 = i9 + 2;
            int i14 = (bArr[i11] & 255) | i12;
            this.f24644b -= 2;
            if (i13 == i10) {
                this.f24643a = d9.a();
                E.a(d9);
            } else {
                d9.f24606b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    @Override // x8.InterfaceC2189i
    public final boolean o(long j) {
        if (this.f24644b >= j) {
            return true;
        }
        return false;
    }

    public final short o0() {
        short n02 = n0();
        return (short) (((n02 & 255) << 8) | ((65280 & n02) >>> 8));
    }

    @Override // x8.InterfaceC2189i
    public final long p(InterfaceC2188h interfaceC2188h) {
        long j = this.f24644b;
        if (j > 0) {
            interfaceC2188h.G(this, j);
        }
        return j;
    }

    public final String p0(long j, Charset charset) {
        kotlin.jvm.internal.h.e(charset, "charset");
        if (j >= 0 && j <= 2147483647L) {
            if (this.f24644b >= j) {
                if (j == 0) {
                    return "";
                }
                D d9 = this.f24643a;
                kotlin.jvm.internal.h.b(d9);
                int i9 = d9.f24606b;
                if (i9 + j > d9.f24607c) {
                    return new String(i0(j), charset);
                }
                int i10 = (int) j;
                String str = new String(d9.f24605a, i9, i10, charset);
                int i11 = d9.f24606b + i10;
                d9.f24606b = i11;
                this.f24644b -= j;
                if (i11 == d9.f24607c) {
                    this.f24643a = d9.a();
                    E.a(d9);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC0953k1.k(j, "byteCount: ").toString());
    }

    public final String q0() {
        return p0(this.f24644b, W7.a.f7934a);
    }

    public final C2190j r0(int i9) {
        if (i9 == 0) {
            return C2190j.f24645d;
        }
        s8.n.f(this.f24644b, 0L, i9);
        D d9 = this.f24643a;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            kotlin.jvm.internal.h.b(d9);
            int i13 = d9.f24607c;
            int i14 = d9.f24606b;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                d9 = d9.f24610f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12];
        int[] iArr = new int[i12 * 2];
        D d10 = this.f24643a;
        int i15 = 0;
        while (i10 < i9) {
            kotlin.jvm.internal.h.b(d10);
            bArr[i15] = d10.f24605a;
            i10 += d10.f24607c - d10.f24606b;
            iArr[i15] = Math.min(i10, i9);
            iArr[i15 + i12] = d10.f24606b;
            d10.f24608d = true;
            i15++;
            d10 = d10.f24610f;
        }
        return new F(bArr, iArr);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        D d9 = this.f24643a;
        if (d9 == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), d9.f24607c - d9.f24606b);
        sink.put(d9.f24605a, d9.f24606b, min);
        int i9 = d9.f24606b + min;
        d9.f24606b = i9;
        this.f24644b -= min;
        if (i9 == d9.f24607c) {
            this.f24643a = d9.a();
            E.a(d9);
        }
        return min;
    }

    public final D s0(int i9) {
        if (i9 >= 1 && i9 <= 8192) {
            D d9 = this.f24643a;
            if (d9 == null) {
                D b9 = E.b();
                this.f24643a = b9;
                b9.f24611g = b9;
                b9.f24610f = b9;
                return b9;
            }
            D d10 = d9.f24611g;
            kotlin.jvm.internal.h.b(d10);
            if (d10.f24607c + i9 <= 8192 && d10.f24609e) {
                return d10;
            }
            D b10 = E.b();
            d10.b(b10);
            return b10;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    public final void t0(C2190j byteString) {
        kotlin.jvm.internal.h.e(byteString, "byteString");
        byteString.r(this, byteString.d());
    }

    public final String toString() {
        long j = this.f24644b;
        if (j <= 2147483647L) {
            return r0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f24644b).toString());
    }

    public final void u0(byte[] source, int i9, int i10) {
        kotlin.jvm.internal.h.e(source, "source");
        long j = i10;
        s8.n.f(source.length, i9, j);
        int i11 = i10 + i9;
        while (i9 < i11) {
            D s02 = s0(1);
            int min = Math.min(i11 - i9, 8192 - s02.f24607c);
            int i12 = i9 + min;
            B7.j.c0(s02.f24607c, i9, i12, source, s02.f24605a);
            s02.f24607c += min;
            i9 = i12;
        }
        this.f24644b += j;
    }

    @Override // x8.InterfaceC2189i
    public final byte[] v() {
        return i0(this.f24644b);
    }

    public final void v0(I source) {
        kotlin.jvm.internal.h.e(source, "source");
        do {
        } while (source.b0(this, 8192L) != -1);
    }

    public final void w0(int i9) {
        D s02 = s0(1);
        int i10 = s02.f24607c;
        s02.f24607c = i10 + 1;
        s02.f24605a[i10] = (byte) i9;
        this.f24644b++;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.h.e(source, "source");
        int remaining = source.remaining();
        int i9 = remaining;
        while (i9 > 0) {
            D s02 = s0(1);
            int min = Math.min(i9, 8192 - s02.f24607c);
            source.get(s02.f24605a, s02.f24607c, min);
            i9 -= min;
            s02.f24607c += min;
        }
        this.f24644b += remaining;
        return remaining;
    }

    public final void x() {
        n(this.f24644b);
    }

    public final void x0(long j) {
        boolean z9;
        byte[] bArr;
        if (j == 0) {
            w0(48);
            return;
        }
        int i9 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                B0("-9223372036854775808");
                return;
            }
            z9 = true;
        } else {
            z9 = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i9 = 2;
                    }
                } else if (j < 1000) {
                    i9 = 3;
                } else {
                    i9 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i9 = 5;
                } else {
                    i9 = 6;
                }
            } else if (j < 10000000) {
                i9 = 7;
            } else {
                i9 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i9 = 9;
                } else {
                    i9 = 10;
                }
            } else if (j < 100000000000L) {
                i9 = 11;
            } else {
                i9 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i9 = 13;
            } else if (j < 100000000000000L) {
                i9 = 14;
            } else {
                i9 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i9 = 16;
            } else {
                i9 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i9 = 18;
        } else {
            i9 = 19;
        }
        if (z9) {
            i9++;
        }
        D s02 = s0(i9);
        int i10 = s02.f24607c + i9;
        while (true) {
            bArr = s02.f24605a;
            if (j == 0) {
                break;
            }
            long j4 = 10;
            i10--;
            bArr[i10] = y8.a.f25132a[(int) (j % j4)];
            j /= j4;
        }
        if (z9) {
            bArr[i10 - 1] = 45;
        }
        s02.f24607c += i9;
        this.f24644b += i9;
    }

    @Override // x8.InterfaceC2188h
    public final /* bridge */ /* synthetic */ InterfaceC2188h y(int i9) {
        w0(i9);
        return this;
    }

    public final void y0(long j) {
        if (j == 0) {
            w0(48);
            return;
        }
        long j4 = (j >>> 1) | j;
        long j9 = j4 | (j4 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i9 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + 3) / 4);
        D s02 = s0(i9);
        int i10 = s02.f24607c;
        for (int i11 = (i10 + i9) - 1; i11 >= i10; i11--) {
            s02.f24605a[i11] = y8.a.f25132a[(int) (15 & j)];
            j >>>= 4;
        }
        s02.f24607c += i9;
        this.f24644b += i9;
    }

    public final void z0(int i9) {
        D s02 = s0(4);
        int i10 = s02.f24607c;
        byte[] bArr = s02.f24605a;
        bArr[i10] = (byte) ((i9 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i9 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i9 & 255);
        s02.f24607c = i10 + 4;
        this.f24644b += 4;
    }

    @Override // x8.InterfaceC2189i
    public final C2187g b() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, x8.G
    public final void close() {
    }

    @Override // x8.G, java.io.Flushable
    public final void flush() {
    }
}
