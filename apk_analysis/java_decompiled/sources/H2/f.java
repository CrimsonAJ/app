package H2;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f3011a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3012b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3013c;

    public f(String str, String str2, String str3) {
        this.f3011a = str;
        this.f3012b = str2;
        this.f3013c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (kotlin.jvm.internal.h.a(this.f3011a, fVar.f3011a) && kotlin.jvm.internal.h.a(this.f3012b, fVar.f3012b) && kotlin.jvm.internal.h.a(this.f3013c, fVar.f3013c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3013c.hashCode() + u0.z.c(this.f3012b, this.f3011a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactUs(website=");
        sb.append(this.f3011a);
        sb.append(", twitter=");
        sb.append(this.f3012b);
        sb.append(", telegram=");
        return AbstractC0953k1.q(sb, this.f3013c, ")");
    }
}
