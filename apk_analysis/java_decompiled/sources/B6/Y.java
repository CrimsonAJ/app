package B6;

/* loaded from: classes.dex */
public final class Y extends A0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f881a;

    /* renamed from: b, reason: collision with root package name */
    public final String f882b;

    /* renamed from: c, reason: collision with root package name */
    public final String f883c;

    /* renamed from: d, reason: collision with root package name */
    public final long f884d;

    /* renamed from: e, reason: collision with root package name */
    public final int f885e;

    public Y(long j, String str, String str2, long j4, int i9) {
        this.f881a = j;
        this.f882b = str;
        this.f883c = str2;
        this.f884d = j4;
        this.f885e = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A0) {
            A0 a02 = (A0) obj;
            if (this.f881a == ((Y) a02).f881a) {
                Y y9 = (Y) a02;
                if (this.f882b.equals(y9.f882b)) {
                    String str = y9.f883c;
                    String str2 = this.f883c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f884d == y9.f884d && this.f885e == y9.f885e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f881a;
        int hashCode2 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f882b.hashCode()) * 1000003;
        String str = this.f883c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 ^ hashCode) * 1000003;
        long j4 = this.f884d;
        return ((i9 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f885e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f881a);
        sb.append(", symbol=");
        sb.append(this.f882b);
        sb.append(", file=");
        sb.append(this.f883c);
        sb.append(", offset=");
        sb.append(this.f884d);
        sb.append(", importance=");
        return u0.z.g(sb, this.f885e, "}");
    }
}
