package L1;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class D implements E {

    /* renamed from: a, reason: collision with root package name */
    public final String f4457a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4458b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4459c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4460d;

    public D(String str, String str2, String str3, String str4) {
        this.f4457a = str;
        this.f4458b = str2;
        this.f4459c = str3;
        this.f4460d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d9 = (D) obj;
        if (kotlin.jvm.internal.h.a(this.f4457a, d9.f4457a) && kotlin.jvm.internal.h.a(this.f4458b, d9.f4458b) && kotlin.jvm.internal.h.a(this.f4459c, d9.f4459c) && kotlin.jvm.internal.h.a(this.f4460d, d9.f4460d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4460d.hashCode() + u0.z.c(this.f4459c, u0.z.c(this.f4458b, this.f4457a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedSubtitleForPlayer(title=");
        sb.append(this.f4457a);
        sb.append(", hlsUrl=");
        sb.append(this.f4458b);
        sb.append(", subtitleName=");
        sb.append(this.f4459c);
        sb.append(", subtitleUrl=");
        return AbstractC0953k1.q(sb, this.f4460d, ")");
    }
}
