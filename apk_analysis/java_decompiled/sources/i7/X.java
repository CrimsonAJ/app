package i7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final String f18811a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18812b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18813c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18814d;

    /* renamed from: e, reason: collision with root package name */
    public final C1396k f18815e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18816f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18817g;

    public X(String sessionId, String firstSessionId, int i9, long j, C1396k c1396k, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.h.e(sessionId, "sessionId");
        kotlin.jvm.internal.h.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.h.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f18811a = sessionId;
        this.f18812b = firstSessionId;
        this.f18813c = i9;
        this.f18814d = j;
        this.f18815e = c1396k;
        this.f18816f = str;
        this.f18817g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x5 = (X) obj;
        if (kotlin.jvm.internal.h.a(this.f18811a, x5.f18811a) && kotlin.jvm.internal.h.a(this.f18812b, x5.f18812b) && this.f18813c == x5.f18813c && this.f18814d == x5.f18814d && kotlin.jvm.internal.h.a(this.f18815e, x5.f18815e) && kotlin.jvm.internal.h.a(this.f18816f, x5.f18816f) && kotlin.jvm.internal.h.a(this.f18817g, x5.f18817g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c3 = (u0.z.c(this.f18812b, this.f18811a.hashCode() * 31, 31) + this.f18813c) * 31;
        long j = this.f18814d;
        return this.f18817g.hashCode() + u0.z.c(this.f18816f, (this.f18815e.hashCode() + ((c3 + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f18811a);
        sb.append(", firstSessionId=");
        sb.append(this.f18812b);
        sb.append(", sessionIndex=");
        sb.append(this.f18813c);
        sb.append(", eventTimestampUs=");
        sb.append(this.f18814d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f18815e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f18816f);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC0953k1.p(sb, this.f18817g, ')');
    }
}
