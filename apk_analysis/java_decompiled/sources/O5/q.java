package O5;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q implements n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5511a;

    public q(Object obj) {
        this.f5511a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return M4.a.l(this.f5511a, ((q) obj).f5511a);
        }
        return false;
    }

    @Override // O5.n
    public final Object get() {
        return this.f5511a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5511a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5511a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
