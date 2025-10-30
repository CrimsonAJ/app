package t0;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final String f22941a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22942b;

    public Y(D6.a aVar) {
        this.f22941a = aVar.f1916a;
        this.f22942b = aVar.f1917b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Y) {
                Y y9 = (Y) obj;
                if (this.f22941a.equals(y9.f22941a) && this.f22942b == y9.f22942b && TextUtils.equals(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f22941a, Integer.valueOf(this.f22942b), 0, 0, null);
    }
}
