package y8;

import java.io.IOException;
import x8.C2187g;
import x8.I;
import x8.p;

/* loaded from: classes.dex */
public final class e extends p {

    /* renamed from: b, reason: collision with root package name */
    public final long f25141b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25142c;

    /* renamed from: d, reason: collision with root package name */
    public long f25143d;

    public e(I i9, long j, boolean z9) {
        super(i9);
        this.f25141b = j;
        this.f25142c = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, x8.g] */
    @Override // x8.p, x8.I
    public final long b0(C2187g sink, long j) {
        kotlin.jvm.internal.h.e(sink, "sink");
        long j4 = this.f25143d;
        long j9 = this.f25141b;
        if (j4 > j9) {
            j = 0;
        } else if (this.f25142c) {
            long j10 = j9 - j4;
            if (j10 == 0) {
                return -1L;
            }
            j = Math.min(j, j10);
        }
        long b02 = super.b0(sink, j);
        if (b02 != -1) {
            this.f25143d += b02;
        }
        long j11 = this.f25143d;
        if ((j11 < j9 && b02 == -1) || j11 > j9) {
            if (b02 > 0 && j11 > j9) {
                long j12 = sink.f24644b - (j11 - j9);
                ?? obj = new Object();
                obj.v0(sink);
                sink.G(obj, j12);
                obj.x();
            }
            throw new IOException("expected " + j9 + " bytes but got " + this.f25143d);
        }
        return b02;
    }
}
