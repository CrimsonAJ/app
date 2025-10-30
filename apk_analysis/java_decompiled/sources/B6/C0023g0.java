package B6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: B6.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023g0 extends H0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f960a;

    /* renamed from: b, reason: collision with root package name */
    public final String f961b;

    public C0023g0(String str, String str2) {
        this.f960a = str;
        this.f961b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H0) {
            H0 h02 = (H0) obj;
            if (this.f960a.equals(((C0023g0) h02).f960a) && this.f961b.equals(((C0023g0) h02).f961b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f960a.hashCode() ^ 1000003) * 1000003) ^ this.f961b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f960a);
        sb.append(", variantId=");
        return AbstractC0953k1.q(sb, this.f961b, "}");
    }
}
