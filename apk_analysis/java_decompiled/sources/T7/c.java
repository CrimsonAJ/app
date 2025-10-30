package T7;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f7244d = new a(1, 0, 1);

    @Override // T7.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f7237a == cVar.f7237a) {
                    if (this.f7238b == cVar.f7238b) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // T7.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f7237a * 31) + this.f7238b;
    }

    @Override // T7.a
    public final boolean isEmpty() {
        if (this.f7237a > this.f7238b) {
            return true;
        }
        return false;
    }

    @Override // T7.a
    public final String toString() {
        return this.f7237a + ".." + this.f7238b;
    }
}
