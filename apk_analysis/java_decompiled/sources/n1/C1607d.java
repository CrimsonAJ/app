package n1;

/* renamed from: n1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1607d {

    /* renamed from: a, reason: collision with root package name */
    public final String f21014a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21015b;

    public C1607d(String str, int i9) {
        this.f21014a = str;
        this.f21015b = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1607d)) {
            return false;
        }
        C1607d c1607d = (C1607d) obj;
        if (this.f21015b != c1607d.f21015b) {
            return false;
        }
        return this.f21014a.equals(c1607d.f21014a);
    }

    public final int hashCode() {
        return (this.f21014a.hashCode() * 31) + this.f21015b;
    }
}
