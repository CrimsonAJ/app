package co.notix;

/* loaded from: classes.dex */
public final class qp {

    /* renamed from: a, reason: collision with root package name */
    public final Long f13069a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f13070b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f13071c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f13072d;

    public qp(Long l9, Long l10, Long l11, Long l12) {
        this.f13069a = l9;
        this.f13070b = l10;
        this.f13071c = l11;
        this.f13072d = l12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp)) {
            return false;
        }
        qp qpVar = (qp) obj;
        return kotlin.jvm.internal.h.a(this.f13069a, qpVar.f13069a) && kotlin.jvm.internal.h.a(this.f13070b, qpVar.f13070b) && kotlin.jvm.internal.h.a(this.f13071c, qpVar.f13071c) && kotlin.jvm.internal.h.a(this.f13072d, qpVar.f13072d);
    }

    public final int hashCode() {
        Long l9 = this.f13069a;
        int hashCode = (l9 == null ? 0 : l9.hashCode()) * 31;
        Long l10 = this.f13070b;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f13071c;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f13072d;
        return hashCode3 + (l12 != null ? l12.hashCode() : 0);
    }

    public final String toString() {
        return "RateLimits(vh=" + this.f13069a + ", ih=" + this.f13070b + ", eh=" + this.f13071c + ", delay=" + this.f13072d + ')';
    }
}
