package O6;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f5514a;

    @Override // java.io.OutputStream
    public final void write(int i9) {
        this.f5514a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f5514a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i9, int i10) {
        int i11;
        if (i9 >= 0 && i9 <= bArr.length && i10 >= 0 && (i11 = i9 + i10) <= bArr.length && i11 >= 0) {
            this.f5514a += i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
