package B6;

import android.os.Build;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: B6.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1030b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1031c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1032d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1033e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1034f;

    public C0037n0(int i9, int i10, long j, long j4, boolean z9, int i11) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f1029a = i9;
        if (str != null) {
            this.f1030b = i10;
            this.f1031c = j;
            this.f1032d = j4;
            this.f1033e = z9;
            this.f1034f = i11;
            if (str2 != null) {
                if (str3 != null) {
                    return;
                } else {
                    throw new NullPointerException("Null modelClass");
                }
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0037n0) {
                C0037n0 c0037n0 = (C0037n0) obj;
                if (this.f1029a == c0037n0.f1029a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f1030b == c0037n0.f1030b && this.f1031c == c0037n0.f1031c && this.f1032d == c0037n0.f1032d && this.f1033e == c0037n0.f1033e && this.f1034f == c0037n0.f1034f) {
                        String str2 = Build.MANUFACTURER;
                        if (str2.equals(str2)) {
                            String str3 = Build.PRODUCT;
                            if (str3.equals(str3)) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((((this.f1029a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f1030b) * 1000003;
        long j = this.f1031c;
        int i10 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j4 = this.f1032d;
        int i11 = (i10 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        if (this.f1033e) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return Build.PRODUCT.hashCode() ^ ((((((i11 ^ i9) * 1000003) ^ this.f1034f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f1029a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.f1030b);
        sb.append(", totalRam=");
        sb.append(this.f1031c);
        sb.append(", diskSpace=");
        sb.append(this.f1032d);
        sb.append(", isEmulator=");
        sb.append(this.f1033e);
        sb.append(", state=");
        sb.append(this.f1034f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return AbstractC0953k1.q(sb, Build.PRODUCT, "}");
    }
}
