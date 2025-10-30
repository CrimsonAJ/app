package x8;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class A extends OutputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f24598a;

    public A(B b9) {
        this.f24598a = b9;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24598a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        B b9 = this.f24598a;
        if (!b9.f24601c) {
            b9.flush();
        }
    }

    public final String toString() {
        return this.f24598a + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i9) {
        B b9 = this.f24598a;
        if (!b9.f24601c) {
            b9.f24600b.w0((byte) i9);
            b9.a();
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i9, int i10) {
        kotlin.jvm.internal.h.e(data, "data");
        B b9 = this.f24598a;
        if (!b9.f24601c) {
            b9.f24600b.u0(data, i9, i10);
            b9.a();
            return;
        }
        throw new IOException("closed");
    }
}
