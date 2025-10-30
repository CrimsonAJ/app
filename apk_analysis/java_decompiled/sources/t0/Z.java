package t0;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final List f22943a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22944b;

    public Z(C1987v c1987v) {
        this.f22943a = c1987v.f23044b;
        this.f22944b = c1987v.f23045c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Z) {
                Z z9 = (Z) obj;
                if (this.f22943a.equals(z9.f22943a) && this.f22944b == z9.f22944b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f22943a, Boolean.valueOf(this.f22944b), null);
    }
}
