package e3;

import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f17146a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17147b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f17148c;

    public c(long j, long j4, Set set) {
        this.f17146a = j;
        this.f17147b = j4;
        this.f17148c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f17146a == cVar.f17146a && this.f17147b == cVar.f17147b && this.f17148c.equals(cVar.f17148c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17146a;
        int i9 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j4 = this.f17147b;
        return ((i9 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f17148c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f17146a + ", maxAllowedDelay=" + this.f17147b + ", flags=" + this.f17148c + "}";
    }
}
