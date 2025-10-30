package B6;

/* renamed from: B6.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011a0 extends D0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f895a;

    /* renamed from: b, reason: collision with root package name */
    public final int f896b;

    /* renamed from: c, reason: collision with root package name */
    public final int f897c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f898d;

    public C0011a0(int i9, int i10, String str, boolean z9) {
        this.f895a = str;
        this.f896b = i9;
        this.f897c = i10;
        this.f898d = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D0) {
            D0 d02 = (D0) obj;
            if (this.f895a.equals(((C0011a0) d02).f895a)) {
                C0011a0 c0011a0 = (C0011a0) d02;
                if (this.f896b == c0011a0.f896b && this.f897c == c0011a0.f897c && this.f898d == c0011a0.f898d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((((this.f895a.hashCode() ^ 1000003) * 1000003) ^ this.f896b) * 1000003) ^ this.f897c) * 1000003;
        if (this.f898d) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f895a + ", pid=" + this.f896b + ", importance=" + this.f897c + ", defaultProcess=" + this.f898d + "}";
    }
}
