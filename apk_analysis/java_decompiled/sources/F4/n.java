package F4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n implements C4.b {

    /* renamed from: b, reason: collision with root package name */
    public static final n f2432b = new n(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f2433a;

    public /* synthetic */ n(String str) {
        this.f2433a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        return y.k(this.f2433a, ((n) obj).f2433a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2433a});
    }
}
