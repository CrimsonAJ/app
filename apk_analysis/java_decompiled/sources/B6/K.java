package B6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class K extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f810a;

    /* renamed from: b, reason: collision with root package name */
    public final String f811b;

    /* renamed from: c, reason: collision with root package name */
    public final String f812c;

    /* renamed from: d, reason: collision with root package name */
    public final String f813d;

    /* renamed from: e, reason: collision with root package name */
    public final String f814e;

    /* renamed from: f, reason: collision with root package name */
    public final String f815f;

    public K(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f810a = str;
        this.f811b = str2;
        this.f812c = str3;
        this.f813d = str4;
        this.f814e = str5;
        this.f815f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (this.f810a.equals(((K) v0Var).f810a)) {
                K k5 = (K) v0Var;
                if (this.f811b.equals(k5.f811b)) {
                    String str = k5.f812c;
                    String str2 = this.f812c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = k5.f813d;
                        String str4 = this.f813d;
                        if (str4 != null ? str4.equals(str3) : str3 == null) {
                            String str5 = k5.f814e;
                            String str6 = this.f814e;
                            if (str6 != null ? str6.equals(str5) : str5 == null) {
                                String str7 = k5.f815f;
                                String str8 = this.f815f;
                                if (str8 != null ? str8.equals(str7) : str7 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f810a.hashCode() ^ 1000003) * 1000003) ^ this.f811b.hashCode()) * 1000003;
        int i9 = 0;
        String str = this.f812c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.f813d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f814e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        String str4 = this.f815f;
        if (str4 != null) {
            i9 = str4.hashCode();
        }
        return i12 ^ i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f810a);
        sb.append(", version=");
        sb.append(this.f811b);
        sb.append(", displayVersion=");
        sb.append(this.f812c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f813d);
        sb.append(", developmentPlatform=");
        sb.append(this.f814e);
        sb.append(", developmentPlatformVersion=");
        return AbstractC0953k1.q(sb, this.f815f, "}");
    }
}
