package g0;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1189a extends MediaDataSource implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public long f17489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1194f f17490b;

    public C1189a(C1194f c1194f) {
        this.f17490b = c1194f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j4 = this.f17489a;
            C1194f c1194f = this.f17490b;
            if (j4 != j) {
                if (j4 >= 0 && j >= j4 + c1194f.f17491a.available()) {
                    return -1;
                }
                c1194f.d(j);
                this.f17489a = j;
            }
            if (i10 > c1194f.f17491a.available()) {
                i10 = c1194f.f17491a.available();
            }
            int read = c1194f.read(bArr, i9, i10);
            if (read >= 0) {
                this.f17489a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f17489a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
