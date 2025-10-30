package u1;

import java.io.InputStream;

/* renamed from: u1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2060h extends InputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f23587a;

    /* renamed from: b, reason: collision with root package name */
    public int f23588b = 1073741824;

    public C2060h(InputStream inputStream) {
        this.f23587a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f23588b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23587a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f23587a.read();
        if (read == -1) {
            this.f23588b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f23587a.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.f23587a.read(bArr);
        if (read == -1) {
            this.f23588b = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        int read = this.f23587a.read(bArr, i9, i10);
        if (read == -1) {
            this.f23588b = 0;
        }
        return read;
    }
}
