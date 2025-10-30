package A6;

import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f497a;

    /* renamed from: b, reason: collision with root package name */
    public final long f498b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f499c;

    public c(String str, long j, Map additionalCustomKeys) {
        kotlin.jvm.internal.h.e(additionalCustomKeys, "additionalCustomKeys");
        this.f497a = str;
        this.f498b = j;
        this.f499c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.h.a(this.f497a, cVar.f497a) && this.f498b == cVar.f498b && kotlin.jvm.internal.h.a(this.f499c, cVar.f499c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f497a.hashCode() * 31;
        long j = this.f498b;
        return this.f499c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f497a + ", timestamp=" + this.f498b + ", additionalCustomKeys=" + this.f499c + ')';
    }
}
