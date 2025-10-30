package p8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import n8.i;
import x8.C2187g;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: d, reason: collision with root package name */
    public long f22220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U6.a f22221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(U6.a aVar, long j) {
        super(aVar);
        this.f22221e = aVar;
        this.f22220d = j;
        if (j == 0) {
            a();
        }
    }

    @Override // p8.a, x8.I
    public final long b0(C2187g sink, long j) {
        h.e(sink, "sink");
        if (j >= 0) {
            if (!this.f22211b) {
                long j4 = this.f22220d;
                if (j4 == 0) {
                    return -1L;
                }
                long b02 = super.b0(sink, Math.min(j4, j));
                if (b02 != -1) {
                    long j9 = this.f22220d - b02;
                    this.f22220d = j9;
                    if (j9 == 0) {
                        a();
                    }
                    return b02;
                }
                ((i) this.f22221e.f7523c).l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
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
        if (this.f22220d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!k8.c.h(this)) {
                ((i) this.f22221e.f7523c).l();
                a();
            }
        }
        this.f22211b = true;
    }
}
