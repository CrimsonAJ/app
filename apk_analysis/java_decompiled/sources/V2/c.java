package V2;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f7659a;

    public c(String str) {
        if (str != null) {
            this.f7659a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f7659a.equals(((c) obj).f7659a);
    }

    public final int hashCode() {
        return this.f7659a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("Encoding{name=\""), this.f7659a, "\"}");
    }
}
