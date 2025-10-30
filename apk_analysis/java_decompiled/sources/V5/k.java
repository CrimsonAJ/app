package V5;

import java.util.Objects;
import u0.z;

/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f7761b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7762c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7763d;

    /* renamed from: e, reason: collision with root package name */
    public final j f7764e;

    public k(int i9, int i10, int i11, j jVar) {
        this.f7761b = i9;
        this.f7762c = i10;
        this.f7763d = i11;
        this.f7764e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f7761b != this.f7761b || kVar.f7762c != this.f7762c || kVar.f7763d != this.f7763d || kVar.f7764e != this.f7764e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7761b), Integer.valueOf(this.f7762c), Integer.valueOf(this.f7763d), this.f7764e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f7764e);
        sb.append(", ");
        sb.append(this.f7762c);
        sb.append("-byte IV, ");
        sb.append(this.f7763d);
        sb.append("-byte tag, and ");
        return z.g(sb, this.f7761b, "-byte key)");
    }
}
