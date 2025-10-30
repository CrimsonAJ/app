package H2;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3023a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3024b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3025c;

    public h(String str, String str2, boolean z9) {
        this.f3023a = z9;
        this.f3024b = str;
        this.f3025c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f3023a == hVar.f3023a && kotlin.jvm.internal.h.a(this.f3024b, hVar.f3024b) && kotlin.jvm.internal.h.a(this.f3025c, hVar.f3025c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        if (this.f3023a) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return this.f3025c.hashCode() + u0.z.c(this.f3024b, i9 * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Downloader(allow=");
        sb.append(this.f3023a);
        sb.append(", deeplink=");
        sb.append(this.f3024b);
        sb.append(", urlDownload=");
        return AbstractC0953k1.q(sb, this.f3025c, ")");
    }
}
