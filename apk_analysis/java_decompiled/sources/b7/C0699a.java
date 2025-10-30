package b7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: b7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699a {

    /* renamed from: a, reason: collision with root package name */
    public final String f11398a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11399b;

    public C0699a(String str, String str2) {
        this.f11398a = str;
        if (str2 != null) {
            this.f11399b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0699a) {
            C0699a c0699a = (C0699a) obj;
            if (this.f11398a.equals(c0699a.f11398a) && this.f11399b.equals(c0699a.f11399b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f11398a.hashCode() ^ 1000003) * 1000003) ^ this.f11399b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f11398a);
        sb.append(", version=");
        return AbstractC0953k1.q(sb, this.f11399b, "}");
    }
}
