package I2;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3465a = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                dVar.getClass();
                if (!this.f3465a.equals(dVar.f3465a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3465a.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("AnimeThumb(numOfThumb=0, baseUrl="), this.f3465a, ")");
    }
}
