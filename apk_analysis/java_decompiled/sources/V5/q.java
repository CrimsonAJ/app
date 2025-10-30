package V5;

import java.util.Objects;
import u0.z;

/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f7777b;

    /* renamed from: c, reason: collision with root package name */
    public final j f7778c;

    public q(int i9, j jVar) {
        this.f7777b = i9;
        this.f7778c = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (qVar.f7777b != this.f7777b || qVar.f7778c != this.f7778c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7777b), this.f7778c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f7778c);
        sb.append(", ");
        return z.g(sb, this.f7777b, "-byte key)");
    }
}
