package co.notix;

/* loaded from: classes.dex */
public final class ob implements u8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12876a;

    /* renamed from: b, reason: collision with root package name */
    public final d3 f12877b;

    public ob(String impressionData, d3 adFormat) {
        kotlin.jvm.internal.h.e(impressionData, "impressionData");
        kotlin.jvm.internal.h.e(adFormat, "adFormat");
        this.f12876a = impressionData;
        this.f12877b = adFormat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return kotlin.jvm.internal.h.a(this.f12876a, obVar.f12876a) && kotlin.jvm.internal.h.a(this.f12877b, obVar.f12877b);
    }

    public final int hashCode() {
        return this.f12877b.hashCode() + (this.f12876a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(impressionData=" + this.f12876a + ", adFormat=" + this.f12877b + ')';
    }
}
