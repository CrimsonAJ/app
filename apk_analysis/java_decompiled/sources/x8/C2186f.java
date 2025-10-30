package x8;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: x8.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2186f extends InputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2189i f24642b;

    public /* synthetic */ C2186f(InterfaceC2189i interfaceC2189i, int i9) {
        this.f24641a = i9;
        this.f24642b = interfaceC2189i;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f24641a) {
            case 0:
                return (int) Math.min(((C2187g) this.f24642b).f24644b, Integer.MAX_VALUE);
            default:
                C c3 = (C) this.f24642b;
                if (!c3.f24604c) {
                    return (int) Math.min(c3.f24603b.f24644b, Integer.MAX_VALUE);
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f24641a) {
            case 0:
                return;
            default:
                ((C) this.f24642b).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f24641a) {
            case 0:
                C2187g c2187g = (C2187g) this.f24642b;
                if (c2187g.f24644b > 0) {
                    return c2187g.h0() & 255;
                }
                return -1;
            default:
                C c3 = (C) this.f24642b;
                if (!c3.f24604c) {
                    C2187g c2187g2 = c3.f24603b;
                    if (c2187g2.f24644b == 0 && c3.f24602a.b0(c2187g2, 8192L) == -1) {
                        return -1;
                    }
                    return c2187g2.h0() & 255;
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        switch (this.f24641a) {
            case 0:
                return ((C2187g) this.f24642b) + ".inputStream()";
            default:
                return ((C) this.f24642b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i9, int i10) {
        switch (this.f24641a) {
            case 0:
                kotlin.jvm.internal.h.e(sink, "sink");
                return ((C2187g) this.f24642b).g0(sink, i9, i10);
            default:
                kotlin.jvm.internal.h.e(sink, "data");
                C c3 = (C) this.f24642b;
                if (!c3.f24604c) {
                    s8.n.f(sink.length, i9, i10);
                    C2187g c2187g = c3.f24603b;
                    if (c2187g.f24644b == 0 && c3.f24602a.b0(c2187g, 8192L) == -1) {
                        return -1;
                    }
                    return c2187g.g0(sink, i9, i10);
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
