package x8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class C implements InterfaceC2189i, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final I f24602a;

    /* renamed from: b, reason: collision with root package name */
    public final C2187g f24603b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24604c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, x8.g] */
    public C(I source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f24602a = source;
        this.f24603b = new Object();
    }

    @Override // x8.InterfaceC2189i
    public final long C(C2190j bytes) {
        kotlin.jvm.internal.h.e(bytes, "bytes");
        if (!this.f24604c) {
            long j = 0;
            while (true) {
                C2187g c2187g = this.f24603b;
                long S8 = c2187g.S(bytes, j);
                if (S8 != -1) {
                    return S8;
                }
                long j4 = c2187g.f24644b;
                if (this.f24602a.b0(c2187g, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, (j4 - bytes.f24646a.length) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final int F() {
        g0(4L);
        int m02 = this.f24603b.m0();
        return ((m02 & 255) << 24) | (((-16777216) & m02) >>> 24) | ((16711680 & m02) >>> 8) | ((65280 & m02) << 8);
    }

    public final long I() {
        char c3;
        char c9;
        char c10;
        char c11;
        long j;
        g0(8L);
        C2187g c2187g = this.f24603b;
        if (c2187g.f24644b >= 8) {
            D d9 = c2187g.f24643a;
            kotlin.jvm.internal.h.b(d9);
            int i9 = d9.f24606b;
            int i10 = d9.f24607c;
            if (i10 - i9 < 8) {
                j = ((c2187g.m0() & 4294967295L) << 32) | (4294967295L & c2187g.m0());
                c10 = '(';
                c11 = '8';
                c3 = '\b';
                c9 = 24;
            } else {
                byte[] bArr = d9.f24605a;
                c3 = '\b';
                c9 = 24;
                c10 = '(';
                c11 = '8';
                int i11 = i9 + 7;
                long j4 = ((bArr[i9] & 255) << 56) | ((bArr[i9 + 1] & 255) << 48) | ((bArr[i9 + 2] & 255) << 40) | ((bArr[i9 + 3] & 255) << 32) | ((bArr[i9 + 4] & 255) << 24) | ((bArr[i9 + 5] & 255) << 16) | ((bArr[i9 + 6] & 255) << 8);
                int i12 = i9 + 8;
                long j9 = j4 | (bArr[i11] & 255);
                c2187g.f24644b -= 8;
                if (i12 == i10) {
                    c2187g.f24643a = d9.a();
                    E.a(d9);
                } else {
                    d9.f24606b = i12;
                }
                j = j9;
            }
            return ((j & 255) << c11) | (((-72057594037927936L) & j) >>> c11) | ((71776119061217280L & j) >>> c10) | ((280375465082880L & j) >>> c9) | ((1095216660480L & j) >>> c3) | ((4278190080L & j) << c3) | ((16711680 & j) << c9) | ((65280 & j) << c10);
        }
        throw new EOFException();
    }

    public final short N() {
        g0(2L);
        return this.f24603b.n0();
    }

    public final short O() {
        g0(2L);
        return this.f24603b.o0();
    }

    @Override // x8.InterfaceC2189i
    public final int Q(x options) {
        kotlin.jvm.internal.h.e(options, "options");
        if (this.f24604c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C2187g c2187g = this.f24603b;
            int c3 = y8.a.c(c2187g, options, true);
            if (c3 != -2) {
                if (c3 != -1) {
                    c2187g.n(options.f24683a[c3].d());
                    return c3;
                }
            } else if (this.f24602a.b0(c2187g, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    public final String S(long j) {
        g0(j);
        C2187g c2187g = this.f24603b;
        c2187g.getClass();
        return c2187g.p0(j, W7.a.f7934a);
    }

    public final boolean a() {
        if (!this.f24604c) {
            C2187g c2187g = this.f24603b;
            if (c2187g.N() && this.f24602a.b0(c2187g, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, x8.g] */
    public final String a0(long j) {
        long j4;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j4 = Long.MAX_VALUE;
            } else {
                j4 = j + 1;
            }
            long d9 = d((byte) 10, 0L, j4);
            C2187g c2187g = this.f24603b;
            if (d9 != -1) {
                return y8.a.b(c2187g, d9);
            }
            if (j4 < Long.MAX_VALUE && o(j4) && c2187g.O(j4 - 1) == 13 && o(j4 + 1) && c2187g.O(j4) == 10) {
                return y8.a.b(c2187g, j4);
            }
            ?? obj = new Object();
            c2187g.I(obj, 0L, Math.min(32, c2187g.f24644b));
            throw new EOFException("\\n not found: limit=" + Math.min(c2187g.f24644b, j) + " content=" + obj.j0(obj.f24644b).e() + (char) 8230);
        }
        throw new IllegalArgumentException(AbstractC0953k1.k(j, "limit < 0: ").toString());
    }

    @Override // x8.InterfaceC2189i
    public final C2187g b() {
        return this.f24603b;
    }

    @Override // x8.I
    public final long b0(C2187g sink, long j) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (j >= 0) {
            if (!this.f24604c) {
                C2187g c2187g = this.f24603b;
                if (c2187g.f24644b == 0 && this.f24602a.b0(c2187g, 8192L) == -1) {
                    return -1L;
                }
                return c2187g.b0(sink, Math.min(j, c2187g.f24644b));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(AbstractC0953k1.k(j, "byteCount < 0: ").toString());
    }

    @Override // x8.I
    public final K c() {
        return this.f24602a.c();
    }

    @Override // x8.InterfaceC2189i
    public final String c0(Charset charset) {
        C2187g c2187g = this.f24603b;
        c2187g.v0(this.f24602a);
        return c2187g.p0(c2187g.f24644b, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f24604c) {
            this.f24604c = true;
            this.f24602a.close();
            this.f24603b.x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(byte r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.C.d(byte, long, long):long");
    }

    @Override // x8.InterfaceC2189i
    public final InputStream e0() {
        return new C2186f(this, 1);
    }

    @Override // x8.InterfaceC2189i
    public final boolean f0(C2190j bytes) {
        kotlin.jvm.internal.h.e(bytes, "bytes");
        byte[] bArr = bytes.f24646a;
        int length = bArr.length;
        if (!this.f24604c) {
            if (length >= 0 && bArr.length >= length) {
                for (int i9 = 0; i9 < length; i9++) {
                    long j = i9;
                    if (o(1 + j) && this.f24603b.O(j) == bArr[i9]) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    public final byte g() {
        g0(1L);
        return this.f24603b.h0();
    }

    public final void g0(long j) {
        if (o(j)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // x8.InterfaceC2189i
    public final long h(C2190j targetBytes) {
        kotlin.jvm.internal.h.e(targetBytes, "targetBytes");
        if (!this.f24604c) {
            long j = 0;
            while (true) {
                C2187g c2187g = this.f24603b;
                long a02 = c2187g.a0(targetBytes, j);
                if (a02 != -1) {
                    return a02;
                }
                long j4 = c2187g.f24644b;
                if (this.f24602a.b0(c2187g, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, j4);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f24604c;
    }

    @Override // x8.InterfaceC2189i
    public final C2190j k() {
        C2187g c2187g = this.f24603b;
        c2187g.v0(this.f24602a);
        return c2187g.j0(c2187g.f24644b);
    }

    @Override // x8.InterfaceC2189i
    public final void n(long j) {
        if (!this.f24604c) {
            while (j > 0) {
                C2187g c2187g = this.f24603b;
                if (c2187g.f24644b == 0 && this.f24602a.b0(c2187g, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, c2187g.f24644b);
                c2187g.n(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.InterfaceC2189i
    public final boolean o(long j) {
        C2187g c2187g;
        if (j >= 0) {
            if (this.f24604c) {
                throw new IllegalStateException("closed");
            }
            do {
                c2187g = this.f24603b;
                if (c2187g.f24644b >= j) {
                    return true;
                }
            } while (this.f24602a.b0(c2187g, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(AbstractC0953k1.k(j, "byteCount < 0: ").toString());
    }

    @Override // x8.InterfaceC2189i
    public final long p(InterfaceC2188h interfaceC2188h) {
        C2187g c2187g;
        long j = 0;
        while (true) {
            c2187g = this.f24603b;
            if (this.f24602a.b0(c2187g, 8192L) == -1) {
                break;
            }
            long F2 = c2187g.F();
            if (F2 > 0) {
                j += F2;
                interfaceC2188h.G(c2187g, F2);
            }
        }
        long j4 = c2187g.f24644b;
        if (j4 > 0) {
            long j9 = j + j4;
            interfaceC2188h.G(c2187g, j4);
            return j9;
        }
        return j;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        C2187g c2187g = this.f24603b;
        if (c2187g.f24644b == 0 && this.f24602a.b0(c2187g, 8192L) == -1) {
            return -1;
        }
        return c2187g.read(sink);
    }

    public final C2190j s(long j) {
        g0(j);
        return this.f24603b.j0(j);
    }

    public final String toString() {
        return "buffer(" + this.f24602a + ')';
    }

    @Override // x8.InterfaceC2189i
    public final byte[] v() {
        C2187g c2187g = this.f24603b;
        c2187g.v0(this.f24602a);
        return c2187g.i0(c2187g.f24644b);
    }

    public final int x() {
        g0(4L);
        return this.f24603b.m0();
    }
}
