package k4;

import java.io.InputStream;
import l4.AbstractC1566a;

/* renamed from: k4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515o extends InputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1513m f20072a;

    /* renamed from: b, reason: collision with root package name */
    public final C1516p f20073b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20075d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20076e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f20074c = new byte[1];

    public C1515o(InterfaceC1513m interfaceC1513m, C1516p c1516p) {
        this.f20072a = interfaceC1513m;
        this.f20073b = c1516p;
    }

    public final void a() {
        if (!this.f20075d) {
            this.f20072a.g(this.f20073b);
            this.f20075d = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f20076e) {
            this.f20072a.close();
            this.f20076e = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f20074c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        AbstractC1566a.m(!this.f20076e);
        a();
        int D8 = this.f20072a.D(bArr, i9, i10);
        if (D8 == -1) {
            return -1;
        }
        return D8;
    }
}
