package B6;

import java.util.List;

/* loaded from: classes.dex */
public final class W extends B0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f872a;

    /* renamed from: b, reason: collision with root package name */
    public final int f873b;

    /* renamed from: c, reason: collision with root package name */
    public final List f874c;

    public W(int i9, String str, List list) {
        this.f872a = str;
        this.f873b = i9;
        this.f874c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B0) {
            B0 b02 = (B0) obj;
            if (this.f872a.equals(((W) b02).f872a)) {
                W w7 = (W) b02;
                if (this.f873b == w7.f873b && this.f874c.equals(w7.f874c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f872a.hashCode() ^ 1000003) * 1000003) ^ this.f873b) * 1000003) ^ this.f874c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f872a + ", importance=" + this.f873b + ", frames=" + this.f874c + "}";
    }
}
