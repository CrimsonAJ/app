package c6;

import java.util.Objects;
import u0.z;

/* loaded from: classes.dex */
public final class k extends V5.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f11690b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11691c;

    /* renamed from: d, reason: collision with root package name */
    public final d f11692d;

    /* renamed from: e, reason: collision with root package name */
    public final d f11693e;

    public k(int i9, int i10, d dVar, d dVar2) {
        this.f11690b = i9;
        this.f11691c = i10;
        this.f11692d = dVar;
        this.f11693e = dVar2;
    }

    public final int b() {
        d dVar = d.f11677o;
        int i9 = this.f11691c;
        d dVar2 = this.f11692d;
        if (dVar2 == dVar) {
            return i9;
        }
        if (dVar2 == d.f11674l) {
            return i9 + 5;
        }
        if (dVar2 == d.f11675m) {
            return i9 + 5;
        }
        if (dVar2 == d.f11676n) {
            return i9 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f11690b != this.f11690b || kVar.b() != b() || kVar.f11692d != this.f11692d || kVar.f11693e != this.f11693e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11690b), Integer.valueOf(this.f11691c), this.f11692d, this.f11693e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f11692d);
        sb.append(", hashType: ");
        sb.append(this.f11693e);
        sb.append(", ");
        sb.append(this.f11691c);
        sb.append("-byte tags, and ");
        return z.g(sb, this.f11690b, "-byte key)");
    }
}
