package y6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f25114a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25115b;

    public t(String str, String str2) {
        this.f25114a = str;
        this.f25115b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (kotlin.jvm.internal.h.a(this.f25114a, tVar.f25114a) && kotlin.jvm.internal.h.a(this.f25115b, tVar.f25115b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        String str = this.f25114a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f25115b;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f25114a);
        sb.append(", authToken=");
        return AbstractC0953k1.p(sb, this.f25115b, ')');
    }
}
