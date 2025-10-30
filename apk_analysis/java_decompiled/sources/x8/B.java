package x8;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class B implements InterfaceC2188h, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final G f24599a;

    /* renamed from: b, reason: collision with root package name */
    public final C2187g f24600b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24601c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, x8.g] */
    public B(G sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        this.f24599a = sink;
        this.f24600b = new Object();
    }

    @Override // x8.InterfaceC2188h
    public final InterfaceC2188h A(C2190j byteString) {
        kotlin.jvm.internal.h.e(byteString, "byteString");
        if (!this.f24601c) {
            this.f24600b.t0(byteString);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.InterfaceC2188h
    public final InterfaceC2188h D(byte[] source) {
        kotlin.jvm.internal.h.e(source, "source");
        if (!this.f24601c) {
            this.f24600b.u0(source, 0, source.length);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.G
    public final void G(C2187g source, long j) {
        kotlin.jvm.internal.h.e(source, "source");
        if (!this.f24601c) {
            this.f24600b.G(source, j);
            a();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.InterfaceC2188h
    public final InterfaceC2188h V(int i9, byte[] source) {
        kotlin.jvm.internal.h.e(source, "source");
        if (!this.f24601c) {
            this.f24600b.u0(source, 0, i9);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.InterfaceC2188h
    public final InterfaceC2188h X(String string) {
        kotlin.jvm.internal.h.e(string, "string");
        if (!this.f24601c) {
            this.f24600b.B0(string);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.InterfaceC2188h
    public final InterfaceC2188h Y(long j) {
        if (!this.f24601c) {
            this.f24600b.x0(j);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final InterfaceC2188h a() {
        if (!this.f24601c) {
            C2187g c2187g = this.f24600b;
            long F2 = c2187g.F();
            if (F2 > 0) {
                this.f24599a.G(c2187g, F2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.InterfaceC2188h
    public final C2187g b() {
        return this.f24600b;
    }

    @Override // x8.G
    public final K c() {
        return this.f24599a.c();
    }

    @Override // x8.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        G g9 = this.f24599a;
        if (!this.f24601c) {
            try {
                C2187g c2187g = this.f24600b;
                long j = c2187g.f24644b;
                if (j > 0) {
                    g9.G(c2187g, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                g9.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f24601c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final InterfaceC2188h d(int i9) {
        if (!this.f24601c) {
            this.f24600b.z0(i9);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.G, java.io.Flushable
    public final void flush() {
        if (!this.f24601c) {
            C2187g c2187g = this.f24600b;
            long j = c2187g.f24644b;
            G g9 = this.f24599a;
            if (j > 0) {
                g9.G(c2187g, j);
            }
            g9.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f24601c;
    }

    public final String toString() {
        return "buffer(" + this.f24599a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.h.e(source, "source");
        if (!this.f24601c) {
            int write = this.f24600b.write(source);
            a();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.InterfaceC2188h
    public final InterfaceC2188h y(int i9) {
        if (!this.f24601c) {
            this.f24600b.w0(i9);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
