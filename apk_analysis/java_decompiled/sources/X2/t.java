package X2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends F {

    /* renamed from: a, reason: collision with root package name */
    public final long f8400a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8401b;

    /* renamed from: c, reason: collision with root package name */
    public final n f8402c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f8403d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8404e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8405f;

    public t(long j, long j4, n nVar, Integer num, String str, ArrayList arrayList) {
        J j9 = J.f8324a;
        this.f8400a = j;
        this.f8401b = j4;
        this.f8402c = nVar;
        this.f8403d = num;
        this.f8404e = str;
        this.f8405f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof F) {
                t tVar = (t) ((F) obj);
                if (this.f8400a == tVar.f8400a) {
                    if (this.f8401b == tVar.f8401b) {
                        if (this.f8402c.equals(tVar.f8402c)) {
                            Integer num = tVar.f8403d;
                            Integer num2 = this.f8403d;
                            if (num2 == null) {
                                if (num != null) {
                                    return false;
                                }
                            } else if (!num2.equals(num)) {
                                return false;
                            }
                            String str = tVar.f8404e;
                            String str2 = this.f8404e;
                            if (str2 == null) {
                                if (str != null) {
                                    return false;
                                }
                            } else if (!str2.equals(str)) {
                                return false;
                            }
                            if (this.f8405f.equals(tVar.f8405f)) {
                                Object obj2 = J.f8324a;
                                if (obj2.equals(obj2)) {
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f8400a;
        long j4 = this.f8401b;
        int hashCode2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f8402c.hashCode()) * 1000003;
        int i9 = 0;
        Integer num = this.f8403d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f8404e;
        if (str != null) {
            i9 = str.hashCode();
        }
        return ((((i10 ^ i9) * 1000003) ^ this.f8405f.hashCode()) * 1000003) ^ J.f8324a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f8400a + ", requestUptimeMs=" + this.f8401b + ", clientInfo=" + this.f8402c + ", logSource=" + this.f8403d + ", logSourceName=" + this.f8404e + ", logEvents=" + this.f8405f + ", qosTier=" + J.f8324a + "}";
    }
}
