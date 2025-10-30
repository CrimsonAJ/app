package q8;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import x8.C;
import x8.C2187g;
import x8.C2190j;
import x8.I;
import x8.K;

/* loaded from: classes.dex */
public final class q implements I, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final C f22528a;

    /* renamed from: b, reason: collision with root package name */
    public int f22529b;

    /* renamed from: c, reason: collision with root package name */
    public int f22530c;

    /* renamed from: d, reason: collision with root package name */
    public int f22531d;

    /* renamed from: e, reason: collision with root package name */
    public int f22532e;

    /* renamed from: f, reason: collision with root package name */
    public int f22533f;

    public q(C source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f22528a = source;
    }

    @Override // x8.I
    public final long b0(C2187g sink, long j) {
        int i9;
        int x5;
        kotlin.jvm.internal.h.e(sink, "sink");
        do {
            int i10 = this.f22532e;
            C c3 = this.f22528a;
            if (i10 == 0) {
                c3.n(this.f22533f);
                this.f22533f = 0;
                if ((this.f22530c & 4) == 0) {
                    i9 = this.f22531d;
                    int t7 = k8.c.t(c3);
                    this.f22532e = t7;
                    this.f22529b = t7;
                    int g9 = c3.g() & 255;
                    this.f22530c = c3.g() & 255;
                    Logger logger = r.f22534d;
                    if (logger.isLoggable(Level.FINE)) {
                        C2190j c2190j = f.f22473a;
                        logger.fine(f.a(true, this.f22531d, this.f22529b, g9, this.f22530c));
                    }
                    x5 = c3.x() & Integer.MAX_VALUE;
                    this.f22531d = x5;
                    if (g9 != 9) {
                        throw new IOException(g9 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long b02 = c3.b0(sink, Math.min(j, i10));
                if (b02 != -1) {
                    this.f22532e -= (int) b02;
                    return b02;
                }
            }
            return -1L;
        } while (x5 == i9);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // x8.I
    public final K c() {
        return this.f22528a.f24602a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
