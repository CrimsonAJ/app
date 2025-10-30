package x8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: x8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2183c implements I, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24631a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24632b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24633c;

    public C2183c(InputStream input, K k5) {
        kotlin.jvm.internal.h.e(input, "input");
        this.f24632b = input;
        this.f24633c = k5;
    }

    @Override // x8.I
    public final long b0(C2187g sink, long j) {
        switch (this.f24631a) {
            case 0:
                kotlin.jvm.internal.h.e(sink, "sink");
                C2183c c2183c = (C2183c) this.f24633c;
                H h7 = (H) this.f24632b;
                h7.h();
                try {
                    long b02 = c2183c.b0(sink, j);
                    if (!h7.i()) {
                        return b02;
                    }
                    throw h7.k(null);
                } catch (IOException e8) {
                    if (!h7.i()) {
                        throw e8;
                    }
                    throw h7.k(e8);
                } finally {
                    h7.i();
                }
            default:
                kotlin.jvm.internal.h.e(sink, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j >= 0) {
                    try {
                        ((K) this.f24633c).f();
                        D s02 = sink.s0(1);
                        int read = ((InputStream) this.f24632b).read(s02.f24605a, s02.f24607c, (int) Math.min(j, 8192 - s02.f24607c));
                        if (read == -1) {
                            if (s02.f24606b == s02.f24607c) {
                                sink.f24643a = s02.a();
                                E.a(s02);
                            }
                            return -1L;
                        }
                        s02.f24607c += read;
                        long j4 = read;
                        sink.f24644b += j4;
                        return j4;
                    } catch (AssertionError e9) {
                        if (v4.e.D(e9)) {
                            throw new IOException(e9);
                        }
                        throw e9;
                    }
                }
                throw new IllegalArgumentException(AbstractC0953k1.k(j, "byteCount < 0: ").toString());
        }
    }

    @Override // x8.I
    public final K c() {
        switch (this.f24631a) {
            case 0:
                return (H) this.f24632b;
            default:
                return (K) this.f24633c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f24631a) {
            case 0:
                C2183c c2183c = (C2183c) this.f24633c;
                H h7 = (H) this.f24632b;
                h7.h();
                try {
                    c2183c.close();
                    if (!h7.i()) {
                        return;
                    } else {
                        throw h7.k(null);
                    }
                } catch (IOException e8) {
                    if (!h7.i()) {
                        throw e8;
                    }
                    throw h7.k(e8);
                } finally {
                    h7.i();
                }
            default:
                ((InputStream) this.f24632b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f24631a) {
            case 0:
                return "AsyncTimeout.source(" + ((C2183c) this.f24633c) + ')';
            default:
                return "source(" + ((InputStream) this.f24632b) + ')';
        }
    }

    public C2183c(H h7, C2183c c2183c) {
        this.f24632b = h7;
        this.f24633c = c2183c;
    }
}
