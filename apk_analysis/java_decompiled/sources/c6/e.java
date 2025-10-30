package c6;

import java.util.Objects;
import u0.z;

/* loaded from: classes.dex */
public final class e extends V5.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f11680b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11681c;

    /* renamed from: d, reason: collision with root package name */
    public final d f11682d;

    public e(int i9, int i10, d dVar) {
        this.f11680b = i9;
        this.f11681c = i10;
        this.f11682d = dVar;
    }

    public final int b() {
        d dVar = d.f11669f;
        int i9 = this.f11681c;
        d dVar2 = this.f11682d;
        if (dVar2 == dVar) {
            return i9;
        }
        if (dVar2 == d.f11666c) {
            return i9 + 5;
        }
        if (dVar2 == d.f11667d) {
            return i9 + 5;
        }
        if (dVar2 == d.f11668e) {
            return i9 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.f11680b != this.f11680b || eVar.b() != b() || eVar.f11682d != this.f11682d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11680b), Integer.valueOf(this.f11681c), this.f11682d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f11682d);
        sb.append(", ");
        sb.append(this.f11681c);
        sb.append("-byte tags, and ");
        return z.g(sb, this.f11680b, "-byte key)");
    }
}
