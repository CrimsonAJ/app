package B6;

/* loaded from: classes.dex */
public final class B extends O0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f749b;

    /* renamed from: c, reason: collision with root package name */
    public final String f750c;

    /* renamed from: d, reason: collision with root package name */
    public final int f751d;

    /* renamed from: e, reason: collision with root package name */
    public final String f752e;

    /* renamed from: f, reason: collision with root package name */
    public final String f753f;

    /* renamed from: g, reason: collision with root package name */
    public final String f754g;

    /* renamed from: h, reason: collision with root package name */
    public final String f755h;

    /* renamed from: i, reason: collision with root package name */
    public final String f756i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final J f757k;

    /* renamed from: l, reason: collision with root package name */
    public final G f758l;

    /* renamed from: m, reason: collision with root package name */
    public final D f759m;

    public B(String str, String str2, int i9, String str3, String str4, String str5, String str6, String str7, String str8, J j, G g9, D d9) {
        this.f749b = str;
        this.f750c = str2;
        this.f751d = i9;
        this.f752e = str3;
        this.f753f = str4;
        this.f754g = str5;
        this.f755h = str6;
        this.f756i = str7;
        this.j = str8;
        this.f757k = j;
        this.f758l = g9;
        this.f759m = d9;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B6.A, java.lang.Object] */
    public final A a() {
        ?? obj = new Object();
        obj.f737a = this.f749b;
        obj.f738b = this.f750c;
        obj.f739c = this.f751d;
        obj.f740d = this.f752e;
        obj.f741e = this.f753f;
        obj.f742f = this.f754g;
        obj.f743g = this.f755h;
        obj.f744h = this.f756i;
        obj.f745i = this.j;
        obj.j = this.f757k;
        obj.f746k = this.f758l;
        obj.f747l = this.f759m;
        obj.f748m = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof O0) {
                B b9 = (B) ((O0) obj);
                if (this.f749b.equals(b9.f749b)) {
                    if (this.f750c.equals(b9.f750c) && this.f751d == b9.f751d && this.f752e.equals(b9.f752e)) {
                        String str = b9.f753f;
                        String str2 = this.f753f;
                        if (str2 == null) {
                            if (str != null) {
                                return false;
                            }
                        } else if (!str2.equals(str)) {
                            return false;
                        }
                        String str3 = b9.f754g;
                        String str4 = this.f754g;
                        if (str4 == null) {
                            if (str3 != null) {
                                return false;
                            }
                        } else if (!str4.equals(str3)) {
                            return false;
                        }
                        String str5 = b9.f755h;
                        String str6 = this.f755h;
                        if (str6 == null) {
                            if (str5 != null) {
                                return false;
                            }
                        } else if (!str6.equals(str5)) {
                            return false;
                        }
                        if (this.f756i.equals(b9.f756i) && this.j.equals(b9.j)) {
                            J j = b9.f757k;
                            J j4 = this.f757k;
                            if (j4 == null) {
                                if (j != null) {
                                    return false;
                                }
                            } else if (!j4.equals(j)) {
                                return false;
                            }
                            G g9 = b9.f758l;
                            G g10 = this.f758l;
                            if (g10 == null) {
                                if (g9 != null) {
                                    return false;
                                }
                            } else if (!g10.equals(g9)) {
                                return false;
                            }
                            D d9 = b9.f759m;
                            D d10 = this.f759m;
                            if (d10 == null) {
                                if (d9 == null) {
                                    return true;
                                }
                                return false;
                            }
                            if (d10.equals(d9)) {
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
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.f749b.hashCode() ^ 1000003) * 1000003) ^ this.f750c.hashCode()) * 1000003) ^ this.f751d) * 1000003) ^ this.f752e.hashCode()) * 1000003;
        int i9 = 0;
        String str = this.f753f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f754g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f755h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f756i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        J j = this.f757k;
        if (j == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        G g9 = this.f758l;
        if (g9 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = g9.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        D d9 = this.f759m;
        if (d9 != null) {
            i9 = d9.hashCode();
        }
        return i13 ^ i9;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f749b + ", gmpAppId=" + this.f750c + ", platform=" + this.f751d + ", installationUuid=" + this.f752e + ", firebaseInstallationId=" + this.f753f + ", firebaseAuthenticationToken=" + this.f754g + ", appQualitySessionId=" + this.f755h + ", buildVersion=" + this.f756i + ", displayVersion=" + this.j + ", session=" + this.f757k + ", ndkPayload=" + this.f758l + ", appExitInfo=" + this.f759m + "}";
    }
}
