package B6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.List;

/* loaded from: classes.dex */
public final class G extends t0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f783a;

    /* renamed from: b, reason: collision with root package name */
    public final String f784b;

    public G(String str, List list) {
        this.f783a = list;
        this.f784b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (this.f783a.equals(((G) t0Var).f783a) && ((str = this.f784b) != null ? str.equals(((G) t0Var).f784b) : ((G) t0Var).f784b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f783a.hashCode() ^ 1000003) * 1000003;
        String str = this.f784b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f783a);
        sb.append(", orgId=");
        return AbstractC0953k1.q(sb, this.f784b, "}");
    }
}
