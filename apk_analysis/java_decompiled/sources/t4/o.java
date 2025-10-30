package t4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f23223a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                if (this.f23223a == ((o) obj).f23223a && F4.y.k(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23223a), 0, Boolean.FALSE, null});
    }
}
