package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class oq {

    /* renamed from: a, reason: collision with root package name */
    public final String f12909a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12910b;

    public oq(String user, String str) {
        kotlin.jvm.internal.h.e(user, "user");
        this.f12909a = user;
        this.f12910b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq)) {
            return false;
        }
        oq oqVar = (oq) obj;
        return kotlin.jvm.internal.h.a(this.f12909a, oqVar.f12909a) && kotlin.jvm.internal.h.a(this.f12910b, oqVar.f12910b);
    }

    public final int hashCode() {
        int hashCode = this.f12909a.hashCode() * 31;
        String str = this.f12910b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsRequest(user=");
        sb.append(this.f12909a);
        sb.append(", appId=");
        return AbstractC0953k1.p(sb, this.f12910b, ')');
    }
}
