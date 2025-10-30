package x8;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: x8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2182b implements G, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24628a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24629b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24630c;

    public /* synthetic */ C2182b(Object obj, int i9, Object obj2) {
        this.f24628a = i9;
        this.f24629b = obj;
        this.f24630c = obj2;
    }

    @Override // x8.G
    public final void G(C2187g source, long j) {
        switch (this.f24628a) {
            case 0:
                kotlin.jvm.internal.h.e(source, "source");
                s8.n.f(source.f24644b, 0L, j);
                long j4 = j;
                while (true) {
                    long j9 = 0;
                    if (j4 > 0) {
                        D d9 = source.f24643a;
                        kotlin.jvm.internal.h.b(d9);
                        while (true) {
                            if (j9 < 65536) {
                                j9 += d9.f24607c - d9.f24606b;
                                if (j9 >= j4) {
                                    j9 = j4;
                                } else {
                                    d9 = d9.f24610f;
                                    kotlin.jvm.internal.h.b(d9);
                                }
                            }
                        }
                        C2182b c2182b = (C2182b) this.f24630c;
                        H h7 = (H) this.f24629b;
                        h7.h();
                        try {
                            try {
                                c2182b.G(source, j9);
                                if (!h7.i()) {
                                    j4 -= j9;
                                } else {
                                    throw h7.k(null);
                                }
                            } catch (IOException e8) {
                                if (!h7.i()) {
                                    throw e8;
                                }
                                throw h7.k(e8);
                            }
                        } catch (Throwable th) {
                            h7.i();
                            throw th;
                        }
                    } else {
                        return;
                    }
                }
            default:
                kotlin.jvm.internal.h.e(source, "source");
                s8.n.f(source.f24644b, 0L, j);
                while (j > 0) {
                    ((K) this.f24630c).f();
                    D d10 = source.f24643a;
                    kotlin.jvm.internal.h.b(d10);
                    int min = (int) Math.min(j, d10.f24607c - d10.f24606b);
                    ((OutputStream) this.f24629b).write(d10.f24605a, d10.f24606b, min);
                    int i9 = d10.f24606b + min;
                    d10.f24606b = i9;
                    long j10 = min;
                    j -= j10;
                    source.f24644b -= j10;
                    if (i9 == d10.f24607c) {
                        source.f24643a = d10.a();
                        E.a(d10);
                    }
                }
                return;
        }
    }

    @Override // x8.G
    public final K c() {
        switch (this.f24628a) {
            case 0:
                return (H) this.f24629b;
            default:
                return (K) this.f24630c;
        }
    }

    @Override // x8.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f24628a) {
            case 0:
                C2182b c2182b = (C2182b) this.f24630c;
                H h7 = (H) this.f24629b;
                h7.h();
                try {
                    c2182b.close();
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
                ((OutputStream) this.f24629b).close();
                return;
        }
    }

    @Override // x8.G, java.io.Flushable
    public final void flush() {
        switch (this.f24628a) {
            case 0:
                C2182b c2182b = (C2182b) this.f24630c;
                H h7 = (H) this.f24629b;
                h7.h();
                try {
                    c2182b.flush();
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
                ((OutputStream) this.f24629b).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f24628a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C2182b) this.f24630c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f24629b) + ')';
        }
    }
}
