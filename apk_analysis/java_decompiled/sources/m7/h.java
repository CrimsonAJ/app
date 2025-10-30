package m7;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f20890a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f20891b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f20892c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f20893d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f20894e;

    public h(Boolean bool, Double d9, Integer num, Integer num2, Long l9) {
        this.f20890a = bool;
        this.f20891b = d9;
        this.f20892c = num;
        this.f20893d = num2;
        this.f20894e = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (kotlin.jvm.internal.h.a(this.f20890a, hVar.f20890a) && kotlin.jvm.internal.h.a(this.f20891b, hVar.f20891b) && kotlin.jvm.internal.h.a(this.f20892c, hVar.f20892c) && kotlin.jvm.internal.h.a(this.f20893d, hVar.f20893d) && kotlin.jvm.internal.h.a(this.f20894e, hVar.f20894e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i9 = 0;
        Boolean bool = this.f20890a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i10 = hashCode * 31;
        Double d9 = this.f20891b;
        if (d9 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d9.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.f20892c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Integer num2 = this.f20893d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Long l9 = this.f20894e;
        if (l9 != null) {
            i9 = l9.hashCode();
        }
        return i13 + i9;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f20890a + ", sessionSamplingRate=" + this.f20891b + ", sessionRestartTimeout=" + this.f20892c + ", cacheDuration=" + this.f20893d + ", cacheUpdatedTime=" + this.f20894e + ')';
    }
}
