package i7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: i7.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1406v {

    /* renamed from: a, reason: collision with root package name */
    public final String f18915a;

    public C1406v(String str) {
        this.f18915a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1406v) && kotlin.jvm.internal.h.a(this.f18915a, ((C1406v) obj).f18915a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18915a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.p(new StringBuilder("FirebaseSessionsData(sessionId="), this.f18915a, ')');
    }
}
