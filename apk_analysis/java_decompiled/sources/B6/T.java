package B6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class T extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f860a;

    /* renamed from: b, reason: collision with root package name */
    public final long f861b;

    /* renamed from: c, reason: collision with root package name */
    public final String f862c;

    /* renamed from: d, reason: collision with root package name */
    public final String f863d;

    public T(long j, long j4, String str, String str2) {
        this.f860a = j;
        this.f861b = j4;
        this.f862c = str;
        this.f863d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (this.f860a == ((T) x0Var).f860a) {
                T t7 = (T) x0Var;
                if (this.f861b == t7.f861b && this.f862c.equals(t7.f862c)) {
                    String str = t7.f863d;
                    String str2 = this.f863d;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f860a;
        long j4 = this.f861b;
        int hashCode2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f862c.hashCode()) * 1000003;
        String str = this.f863d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f860a);
        sb.append(", size=");
        sb.append(this.f861b);
        sb.append(", name=");
        sb.append(this.f862c);
        sb.append(", uuid=");
        return AbstractC0953k1.q(sb, this.f863d, "}");
    }
}
