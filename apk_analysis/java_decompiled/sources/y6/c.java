package y6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25033a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25034b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25035c;

    public c(String str, String str2, String str3) {
        if (str != null) {
            this.f25033a = str;
            this.f25034b = str2;
            this.f25035c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f25033a.equals(cVar.f25033a)) {
                String str = cVar.f25034b;
                String str2 = this.f25034b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = cVar.f25035c;
                    String str4 = this.f25035c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f25033a.hashCode() ^ 1000003) * 1000003;
        int i9 = 0;
        String str = this.f25034b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f25035c;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i10 ^ i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f25033a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f25034b);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC0953k1.q(sb, this.f25035c, "}");
    }
}
