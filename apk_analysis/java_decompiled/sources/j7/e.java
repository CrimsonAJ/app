package j7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f19797a;

    public e(String str) {
        this.f19797a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && h.a(this.f19797a, ((e) obj).f19797a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19797a.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.p(new StringBuilder("SessionDetails(sessionId="), this.f19797a, ')');
    }
}
