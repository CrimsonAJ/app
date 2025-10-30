package D1;

import s8.n;

/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: m, reason: collision with root package name */
    public final int f1767m;

    public a(int i9) {
        this.f1767m = i9;
        if (i9 > 0) {
        } else {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (this.f1767m == ((a) obj).f1767m) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1767m;
    }

    public final String toString() {
        return String.valueOf(this.f1767m);
    }
}
