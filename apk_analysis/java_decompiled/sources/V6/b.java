package V6;

import A3.E;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f7799a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7800b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7801c;

    public b(long j, String str, int i9) {
        this.f7799a = str;
        this.f7800b = j;
        this.f7801c = i9;
    }

    public static E a() {
        E e8 = new E(9, (byte) 0);
        e8.f48d = 0L;
        return e8;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = this.f7799a;
                if (str == null) {
                    if (bVar.f7799a != null) {
                        return false;
                    }
                } else if (!str.equals(bVar.f7799a)) {
                    return false;
                }
                if (this.f7800b == bVar.f7800b) {
                    int i9 = bVar.f7801c;
                    int i10 = this.f7801c;
                    if (i10 == 0) {
                        if (i9 == 0) {
                            return true;
                        }
                        return false;
                    }
                    if (AbstractC2128h.a(i10, i9)) {
                        return true;
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
        int hashCode;
        int i9 = 0;
        String str = this.f7799a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f7800b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i11 = this.f7801c;
        if (i11 != 0) {
            i9 = AbstractC2128h.b(i11);
        }
        return i9 ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f7799a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f7800b);
        sb.append(", responseCode=");
        int i9 = this.f7801c;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    str = "null";
                } else {
                    str = "AUTH_ERROR";
                }
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
