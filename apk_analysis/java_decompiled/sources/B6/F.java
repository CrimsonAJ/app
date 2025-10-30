package B6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class F extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f781a;

    /* renamed from: b, reason: collision with root package name */
    public final String f782b;

    public F(String str, String str2) {
        this.f781a = str;
        this.f782b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (this.f781a.equals(((F) r0Var).f781a) && this.f782b.equals(((F) r0Var).f782b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f781a.hashCode() ^ 1000003) * 1000003) ^ this.f782b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f781a);
        sb.append(", value=");
        return AbstractC0953k1.q(sb, this.f782b, "}");
    }
}
