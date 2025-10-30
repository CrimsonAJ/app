package V6;

import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7794a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7795b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7796c;

    /* renamed from: d, reason: collision with root package name */
    public final b f7797d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7798e;

    public a(String str, String str2, String str3, b bVar, int i9) {
        this.f7794a = str;
        this.f7795b = str2;
        this.f7796c = str3;
        this.f7797d = bVar;
        this.f7798e = i9;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                String str = this.f7794a;
                if (str == null) {
                    if (aVar.f7794a != null) {
                        return false;
                    }
                } else if (!str.equals(aVar.f7794a)) {
                    return false;
                }
                String str2 = this.f7795b;
                if (str2 == null) {
                    if (aVar.f7795b != null) {
                        return false;
                    }
                } else if (!str2.equals(aVar.f7795b)) {
                    return false;
                }
                String str3 = this.f7796c;
                if (str3 == null) {
                    if (aVar.f7796c != null) {
                        return false;
                    }
                } else if (!str3.equals(aVar.f7796c)) {
                    return false;
                }
                b bVar = this.f7797d;
                if (bVar == null) {
                    if (aVar.f7797d != null) {
                        return false;
                    }
                } else if (!bVar.equals(aVar.f7797d)) {
                    return false;
                }
                int i9 = this.f7798e;
                if (i9 == 0) {
                    if (aVar.f7798e == 0) {
                        return true;
                    }
                    return false;
                }
                if (AbstractC2128h.a(i9, aVar.f7798e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i9 = 0;
        String str = this.f7794a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f7795b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f7796c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        b bVar = this.f7797d;
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        int i14 = this.f7798e;
        if (i14 != 0) {
            i9 = AbstractC2128h.b(i14);
        }
        return i9 ^ i13;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f7794a);
        sb.append(", fid=");
        sb.append(this.f7795b);
        sb.append(", refreshToken=");
        sb.append(this.f7796c);
        sb.append(", authToken=");
        sb.append(this.f7797d);
        sb.append(", responseCode=");
        int i9 = this.f7798e;
        if (i9 != 1) {
            if (i9 != 2) {
                str = "null";
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
