package i7;

/* renamed from: i7.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1396k {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1395j f18891a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1395j f18892b;

    /* renamed from: c, reason: collision with root package name */
    public final double f18893c;

    public C1396k(EnumC1395j enumC1395j, EnumC1395j enumC1395j2, double d9) {
        this.f18891a = enumC1395j;
        this.f18892b = enumC1395j2;
        this.f18893c = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1396k)) {
            return false;
        }
        C1396k c1396k = (C1396k) obj;
        if (this.f18891a == c1396k.f18891a && this.f18892b == c1396k.f18892b && Double.compare(this.f18893c, c1396k.f18893c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f18892b.hashCode() + (this.f18891a.hashCode() * 31)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.f18893c);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f18891a + ", crashlytics=" + this.f18892b + ", sessionSamplingRate=" + this.f18893c + ')';
    }
}
