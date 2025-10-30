package i7;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final String f18769a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18770b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18771c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18772d;

    public M(long j, String sessionId, String firstSessionId, int i9) {
        kotlin.jvm.internal.h.e(sessionId, "sessionId");
        kotlin.jvm.internal.h.e(firstSessionId, "firstSessionId");
        this.f18769a = sessionId;
        this.f18770b = firstSessionId;
        this.f18771c = i9;
        this.f18772d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m9 = (M) obj;
        if (kotlin.jvm.internal.h.a(this.f18769a, m9.f18769a) && kotlin.jvm.internal.h.a(this.f18770b, m9.f18770b) && this.f18771c == m9.f18771c && this.f18772d == m9.f18772d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c3 = (u0.z.c(this.f18770b, this.f18769a.hashCode() * 31, 31) + this.f18771c) * 31;
        long j = this.f18772d;
        return c3 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f18769a + ", firstSessionId=" + this.f18770b + ", sessionIndex=" + this.f18771c + ", sessionStartTimestampUs=" + this.f18772d + ')';
    }
}
