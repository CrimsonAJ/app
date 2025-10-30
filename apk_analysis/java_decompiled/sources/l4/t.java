package l4;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final t f20542c = new t(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f20543a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20544b;

    public t(int i9, int i10) {
        boolean z9;
        if ((i9 != -1 && i9 < 0) || (i10 != -1 && i10 < 0)) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC1566a.h(z9);
        this.f20543a = i9;
        this.f20544b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f20543a == tVar.f20543a && this.f20544b == tVar.f20544b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f20543a;
        return ((i9 >>> 16) | (i9 << 16)) ^ this.f20544b;
    }

    public final String toString() {
        return this.f20543a + "x" + this.f20544b;
    }
}
