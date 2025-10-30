package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class l9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12692a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12693b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12694c;

    public l9(String str, String ads, String fallback) {
        kotlin.jvm.internal.h.e(str, "default");
        kotlin.jvm.internal.h.e(ads, "ads");
        kotlin.jvm.internal.h.e(fallback, "fallback");
        this.f12692a = str;
        this.f12693b = ads;
        this.f12694c = fallback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj;
        return kotlin.jvm.internal.h.a(this.f12692a, l9Var.f12692a) && kotlin.jvm.internal.h.a(this.f12693b, l9Var.f12693b) && kotlin.jvm.internal.h.a(this.f12694c, l9Var.f12694c);
    }

    public final int hashCode() {
        return this.f12694c.hashCode() + h.a(this.f12693b, this.f12692a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Domains(default=");
        sb.append(this.f12692a);
        sb.append(", ads=");
        sb.append(this.f12693b);
        sb.append(", fallback=");
        return AbstractC0953k1.p(sb, this.f12694c, ')');
    }
}
