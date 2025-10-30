package B6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class N extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f825a;

    /* renamed from: b, reason: collision with root package name */
    public final String f826b;

    /* renamed from: c, reason: collision with root package name */
    public final int f827c;

    /* renamed from: d, reason: collision with root package name */
    public final long f828d;

    /* renamed from: e, reason: collision with root package name */
    public final long f829e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f830f;

    /* renamed from: g, reason: collision with root package name */
    public final int f831g;

    /* renamed from: h, reason: collision with root package name */
    public final String f832h;

    /* renamed from: i, reason: collision with root package name */
    public final String f833i;

    public N(int i9, String str, int i10, long j, long j4, boolean z9, int i11, String str2, String str3) {
        this.f825a = i9;
        this.f826b = str;
        this.f827c = i10;
        this.f828d = j;
        this.f829e = j4;
        this.f830f = z9;
        this.f831g = i11;
        this.f832h = str2;
        this.f833i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f825a == ((N) w0Var).f825a) {
                N n7 = (N) w0Var;
                if (this.f826b.equals(n7.f826b) && this.f827c == n7.f827c && this.f828d == n7.f828d && this.f829e == n7.f829e && this.f830f == n7.f830f && this.f831g == n7.f831g && this.f832h.equals(n7.f832h) && this.f833i.equals(n7.f833i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((((this.f825a ^ 1000003) * 1000003) ^ this.f826b.hashCode()) * 1000003) ^ this.f827c) * 1000003;
        long j = this.f828d;
        int i10 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j4 = this.f829e;
        int i11 = (i10 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        if (this.f830f) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return ((((((i11 ^ i9) * 1000003) ^ this.f831g) * 1000003) ^ this.f832h.hashCode()) * 1000003) ^ this.f833i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f825a);
        sb.append(", model=");
        sb.append(this.f826b);
        sb.append(", cores=");
        sb.append(this.f827c);
        sb.append(", ram=");
        sb.append(this.f828d);
        sb.append(", diskSpace=");
        sb.append(this.f829e);
        sb.append(", simulator=");
        sb.append(this.f830f);
        sb.append(", state=");
        sb.append(this.f831g);
        sb.append(", manufacturer=");
        sb.append(this.f832h);
        sb.append(", modelClass=");
        return AbstractC0953k1.q(sb, this.f833i, "}");
    }
}
