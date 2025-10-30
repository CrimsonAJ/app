package co.notix;

/* loaded from: classes.dex */
public final class np {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f12839a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f12840b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f12841c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f12842d;

    public np(Boolean bool, Integer num, Long l9, Long l10) {
        this.f12839a = bool;
        this.f12840b = num;
        this.f12841c = l9;
        this.f12842d = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np)) {
            return false;
        }
        np npVar = (np) obj;
        return kotlin.jvm.internal.h.a(this.f12839a, npVar.f12839a) && kotlin.jvm.internal.h.a(this.f12840b, npVar.f12840b) && kotlin.jvm.internal.h.a(this.f12841c, npVar.f12841c) && kotlin.jvm.internal.h.a(this.f12842d, npVar.f12842d);
    }

    public final int hashCode() {
        Boolean bool = this.f12839a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f12840b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l9 = this.f12841c;
        int hashCode3 = (hashCode2 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.f12842d;
        return hashCode3 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "Pull(forceAd=" + this.f12839a + ", adFreq=" + this.f12840b + ", adInitialDelay=" + this.f12841c + ", adMinimalDelay=" + this.f12842d + ')';
    }
}
