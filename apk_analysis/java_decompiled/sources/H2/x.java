package H2;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final I2.b f3085a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3086b;

    public x(I2.b bVar, boolean z9) {
        this.f3085a = bVar;
        this.f3086b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                if (!this.f3085a.equals(xVar.f3085a) || this.f3086b != xVar.f3086b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f3085a.hashCode() * 31) + (this.f3086b ? 1231 : 1237);
    }

    public final String toString() {
        return "SelectableItem(data=" + this.f3085a + ", selected=" + this.f3086b + ")";
    }
}
