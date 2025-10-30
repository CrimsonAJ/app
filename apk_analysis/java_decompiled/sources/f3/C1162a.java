package f3;

import u0.z;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1162a {

    /* renamed from: f, reason: collision with root package name */
    public static final C1162a f17331f = new C1162a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f17332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17334c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17335d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17336e;

    public C1162a(long j, int i9, int i10, long j4, int i11) {
        this.f17332a = j;
        this.f17333b = i9;
        this.f17334c = i10;
        this.f17335d = j4;
        this.f17336e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1162a) {
            C1162a c1162a = (C1162a) obj;
            if (this.f17332a == c1162a.f17332a && this.f17333b == c1162a.f17333b && this.f17334c == c1162a.f17334c && this.f17335d == c1162a.f17335d && this.f17336e == c1162a.f17336e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17332a;
        int i9 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17333b) * 1000003) ^ this.f17334c) * 1000003;
        long j4 = this.f17335d;
        return ((i9 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f17336e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f17332a);
        sb.append(", loadBatchSize=");
        sb.append(this.f17333b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f17334c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f17335d);
        sb.append(", maxBlobByteSizePerRow=");
        return z.g(sb, this.f17336e, "}");
    }
}
