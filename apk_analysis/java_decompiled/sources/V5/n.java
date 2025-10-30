package V5;

import java.util.Objects;
import u0.z;

/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f7769b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7770c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7771d;

    /* renamed from: e, reason: collision with root package name */
    public final j f7772e;

    public n(int i9, int i10, int i11, j jVar) {
        this.f7769b = i9;
        this.f7770c = i10;
        this.f7771d = i11;
        this.f7772e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nVar.f7769b != this.f7769b || nVar.f7770c != this.f7770c || nVar.f7771d != this.f7771d || nVar.f7772e != this.f7772e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7769b), Integer.valueOf(this.f7770c), Integer.valueOf(this.f7771d), this.f7772e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f7772e);
        sb.append(", ");
        sb.append(this.f7770c);
        sb.append("-byte IV, ");
        sb.append(this.f7771d);
        sb.append("-byte tag, and ");
        return z.g(sb, this.f7769b, "-byte key)");
    }
}
