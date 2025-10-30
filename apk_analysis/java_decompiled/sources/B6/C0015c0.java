package B6;

/* renamed from: B6.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015c0 extends F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f918a;

    /* renamed from: b, reason: collision with root package name */
    public final int f919b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f920c;

    /* renamed from: d, reason: collision with root package name */
    public final int f921d;

    /* renamed from: e, reason: collision with root package name */
    public final long f922e;

    /* renamed from: f, reason: collision with root package name */
    public final long f923f;

    public C0015c0(Double d9, int i9, boolean z9, int i10, long j, long j4) {
        this.f918a = d9;
        this.f919b = i9;
        this.f920c = z9;
        this.f921d = i10;
        this.f922e = j;
        this.f923f = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F0) {
            F0 f02 = (F0) obj;
            Double d9 = this.f918a;
            if (d9 != null ? d9.equals(((C0015c0) f02).f918a) : ((C0015c0) f02).f918a == null) {
                if (this.f919b == ((C0015c0) f02).f919b) {
                    C0015c0 c0015c0 = (C0015c0) f02;
                    if (this.f920c == c0015c0.f920c && this.f921d == c0015c0.f921d && this.f922e == c0015c0.f922e && this.f923f == c0015c0.f923f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9;
        Double d9 = this.f918a;
        if (d9 == null) {
            hashCode = 0;
        } else {
            hashCode = d9.hashCode();
        }
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ this.f919b) * 1000003;
        if (this.f920c) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i11 = (((i10 ^ i9) * 1000003) ^ this.f921d) * 1000003;
        long j = this.f922e;
        long j4 = this.f923f;
        return ((i11 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f918a);
        sb.append(", batteryVelocity=");
        sb.append(this.f919b);
        sb.append(", proximityOn=");
        sb.append(this.f920c);
        sb.append(", orientation=");
        sb.append(this.f921d);
        sb.append(", ramUsed=");
        sb.append(this.f922e);
        sb.append(", diskUsed=");
        return A0.a.o(sb, this.f923f, "}");
    }
}
