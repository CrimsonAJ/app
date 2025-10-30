package p8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import x8.C2187g;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f22225d;

    @Override // p8.a, x8.I
    public final long b0(C2187g sink, long j) {
        h.e(sink, "sink");
        if (j >= 0) {
            if (!this.f22211b) {
                if (this.f22225d) {
                    return -1L;
                }
                long b02 = super.b0(sink, j);
                if (b02 == -1) {
                    this.f22225d = true;
                    a();
                    return -1L;
                }
                return b02;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(AbstractC0953k1.k(j, "byteCount < 0: ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22211b) {
            return;
        }
        if (!this.f22225d) {
            a();
        }
        this.f22211b = true;
    }
}
