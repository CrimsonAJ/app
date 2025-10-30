package B6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class E extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f778a;

    /* renamed from: b, reason: collision with root package name */
    public final String f779b;

    /* renamed from: c, reason: collision with root package name */
    public final String f780c;

    public E(String str, String str2, String str3) {
        this.f778a = str;
        this.f779b = str2;
        this.f780c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            if (this.f778a.equals(((E) p0Var).f778a)) {
                E e8 = (E) p0Var;
                if (this.f779b.equals(e8.f779b) && this.f780c.equals(e8.f780c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f778a.hashCode() ^ 1000003) * 1000003) ^ this.f779b.hashCode()) * 1000003) ^ this.f780c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f778a);
        sb.append(", libraryName=");
        sb.append(this.f779b);
        sb.append(", buildId=");
        return AbstractC0953k1.q(sb, this.f780c, "}");
    }
}
