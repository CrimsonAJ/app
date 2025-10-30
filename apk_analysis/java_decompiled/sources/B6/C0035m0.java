package B6;

import k4.C1499E;

/* renamed from: B6.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1017a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1018b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1019c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1020d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1021e;

    /* renamed from: f, reason: collision with root package name */
    public final C1499E f1022f;

    public C0035m0(String str, String str2, String str3, String str4, int i9, C1499E c1499e) {
        if (str != null) {
            this.f1017a = str;
            if (str2 != null) {
                this.f1018b = str2;
                if (str3 != null) {
                    this.f1019c = str3;
                    if (str4 != null) {
                        this.f1020d = str4;
                        this.f1021e = i9;
                        this.f1022f = c1499e;
                        return;
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0035m0) {
                C0035m0 c0035m0 = (C0035m0) obj;
                if (this.f1017a.equals(c0035m0.f1017a) && this.f1018b.equals(c0035m0.f1018b) && this.f1019c.equals(c0035m0.f1019c) && this.f1020d.equals(c0035m0.f1020d) && this.f1021e == c0035m0.f1021e && this.f1022f.equals(c0035m0.f1022f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f1017a.hashCode() ^ 1000003) * 1000003) ^ this.f1018b.hashCode()) * 1000003) ^ this.f1019c.hashCode()) * 1000003) ^ this.f1020d.hashCode()) * 1000003) ^ this.f1021e) * 1000003) ^ this.f1022f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f1017a + ", versionCode=" + this.f1018b + ", versionName=" + this.f1019c + ", installUuid=" + this.f1020d + ", deliveryMechanism=" + this.f1021e + ", developmentPlatformProvider=" + this.f1022f + "}";
    }
}
