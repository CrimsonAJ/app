package x8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class r implements I, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public byte f24668a;

    /* renamed from: b, reason: collision with root package name */
    public final C f24669b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f24670c;

    /* renamed from: d, reason: collision with root package name */
    public final s f24671d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f24672e;

    public r(I source) {
        kotlin.jvm.internal.h.e(source, "source");
        C c3 = new C(source);
        this.f24669b = c3;
        Inflater inflater = new Inflater(true);
        this.f24670c = inflater;
        this.f24671d = new s(c3, inflater);
        this.f24672e = new CRC32();
    }

    public static void a(String str, int i9, int i10) {
        if (i10 == i9) {
            return;
        }
        throw new IOException(str + ": actual 0x" + W7.d.W(8, s8.n.B(i10)) + " != expected 0x" + W7.d.W(8, s8.n.B(i9)));
    }

    @Override // x8.I
    public final long b0(C2187g sink, long j) {
        boolean z9;
        r rVar = this;
        kotlin.jvm.internal.h.e(sink, "sink");
        if (j >= 0) {
            if (j == 0) {
                return 0L;
            }
            byte b9 = rVar.f24668a;
            CRC32 crc32 = rVar.f24672e;
            C c3 = rVar.f24669b;
            if (b9 == 0) {
                c3.g0(10L);
                C2187g c2187g = c3.f24603b;
                byte O8 = c2187g.O(3L);
                if (((O8 >> 1) & 1) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    rVar.d(c2187g, 0L, 10L);
                }
                a("ID1ID2", 8075, c3.N());
                c3.n(8L);
                if (((O8 >> 2) & 1) == 1) {
                    c3.g0(2L);
                    if (z9) {
                        d(c2187g, 0L, 2L);
                    }
                    long o02 = c2187g.o0() & 65535;
                    c3.g0(o02);
                    if (z9) {
                        d(c2187g, 0L, o02);
                    }
                    c3.n(o02);
                }
                if (((O8 >> 3) & 1) == 1) {
                    long d9 = c3.d((byte) 0, 0L, Long.MAX_VALUE);
                    if (d9 != -1) {
                        if (z9) {
                            d(c2187g, 0L, d9 + 1);
                        }
                        c3.n(d9 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((O8 >> 4) & 1) == 1) {
                    long d10 = c3.d((byte) 0, 0L, Long.MAX_VALUE);
                    if (d10 != -1) {
                        if (z9) {
                            rVar = this;
                            rVar.d(c2187g, 0L, d10 + 1);
                        } else {
                            rVar = this;
                        }
                        c3.n(d10 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    rVar = this;
                }
                if (z9) {
                    a("FHCRC", c3.O(), (short) crc32.getValue());
                    crc32.reset();
                }
                rVar.f24668a = (byte) 1;
            }
            if (rVar.f24668a == 1) {
                long j4 = sink.f24644b;
                long b02 = rVar.f24671d.b0(sink, j);
                if (b02 != -1) {
                    rVar.d(sink, j4, b02);
                    return b02;
                }
                rVar.f24668a = (byte) 2;
            }
            if (rVar.f24668a == 2) {
                a("CRC", c3.F(), (int) crc32.getValue());
                a("ISIZE", c3.F(), (int) rVar.f24670c.getBytesWritten());
                rVar.f24668a = (byte) 3;
                if (!c3.a()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(AbstractC0953k1.k(j, "byteCount < 0: ").toString());
    }

    @Override // x8.I
    public final K c() {
        return this.f24669b.f24602a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24671d.close();
    }

    public final void d(C2187g c2187g, long j, long j4) {
        D d9 = c2187g.f24643a;
        kotlin.jvm.internal.h.b(d9);
        while (true) {
            int i9 = d9.f24607c;
            int i10 = d9.f24606b;
            if (j < i9 - i10) {
                break;
            }
            j -= i9 - i10;
            d9 = d9.f24610f;
            kotlin.jvm.internal.h.b(d9);
        }
        while (j4 > 0) {
            int min = (int) Math.min(d9.f24607c - r6, j4);
            this.f24672e.update(d9.f24605a, (int) (d9.f24606b + j), min);
            j4 -= min;
            d9 = d9.f24610f;
            kotlin.jvm.internal.h.b(d9);
            j = 0;
        }
    }
}
