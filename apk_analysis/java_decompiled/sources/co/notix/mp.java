package co.notix;

/* loaded from: classes.dex */
public final class mp {

    /* renamed from: a, reason: collision with root package name */
    public final Long f12796a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f12797b;

    public mp(Long l9, Long l10) {
        this.f12796a = l9;
        this.f12797b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp)) {
            return false;
        }
        mp mpVar = (mp) obj;
        return kotlin.jvm.internal.h.a(this.f12796a, mpVar.f12796a) && kotlin.jvm.internal.h.a(this.f12797b, mpVar.f12797b);
    }

    public final int hashCode() {
        Long l9 = this.f12796a;
        int hashCode = (l9 == null ? 0 : l9.hashCode()) * 31;
        Long l10 = this.f12797b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "Lsi(intervalSeconds=" + this.f12796a + ", closingDelaySeconds=" + this.f12797b + ')';
    }
}
