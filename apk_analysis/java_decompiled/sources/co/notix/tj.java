package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class tj {

    /* renamed from: a, reason: collision with root package name */
    public final long f13235a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13236b;

    public tj(long j, String message) {
        kotlin.jvm.internal.h.e(message, "message");
        this.f13235a = j;
        this.f13236b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj;
        return this.f13235a == tjVar.f13235a && kotlin.jvm.internal.h.a(this.f13236b, tjVar.f13236b);
    }

    public final int hashCode() {
        long j = this.f13235a;
        return this.f13236b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrevLog(timestamp=");
        sb.append(this.f13235a);
        sb.append(", message=");
        return AbstractC0953k1.p(sb, this.f13236b, ')');
    }
}
