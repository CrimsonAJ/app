package D4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final C0083b f1893a;

    /* renamed from: b, reason: collision with root package name */
    public final B4.d f1894b;

    public /* synthetic */ u(C0083b c0083b, B4.d dVar) {
        this.f1893a = c0083b;
        this.f1894b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof u)) {
            u uVar = (u) obj;
            if (F4.y.k(this.f1893a, uVar.f1893a) && F4.y.k(this.f1894b, uVar.f1894b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1893a, this.f1894b});
    }

    public final String toString() {
        A1.g gVar = new A1.g(this);
        gVar.j(this.f1893a, "key");
        gVar.j(this.f1894b, "feature");
        return gVar.toString();
    }
}
