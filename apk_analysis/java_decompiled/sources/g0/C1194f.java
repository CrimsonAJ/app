package g0;

import java.io.InputStream;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1194f extends C1190b {
    public C1194f(byte[] bArr) {
        super(bArr);
        this.f17491a.mark(Integer.MAX_VALUE);
    }

    public final void d(long j) {
        int i9 = this.f17492b;
        if (i9 > j) {
            this.f17492b = 0;
            this.f17491a.reset();
        } else {
            j -= i9;
        }
        a((int) j);
    }

    public C1194f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f17491a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
