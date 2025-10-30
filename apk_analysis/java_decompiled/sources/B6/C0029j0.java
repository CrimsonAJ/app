package B6;

/* renamed from: B6.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029j0 extends L0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f990a;

    /* renamed from: b, reason: collision with root package name */
    public final String f991b;

    /* renamed from: c, reason: collision with root package name */
    public final String f992c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f993d;

    public C0029j0(String str, String str2, int i9, boolean z9) {
        this.f990a = i9;
        this.f991b = str;
        this.f992c = str2;
        this.f993d = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof L0) {
            L0 l02 = (L0) obj;
            if (this.f990a == ((C0029j0) l02).f990a) {
                C0029j0 c0029j0 = (C0029j0) l02;
                if (this.f991b.equals(c0029j0.f991b) && this.f992c.equals(c0029j0.f992c) && this.f993d == c0029j0.f993d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((((this.f990a ^ 1000003) * 1000003) ^ this.f991b.hashCode()) * 1000003) ^ this.f992c.hashCode()) * 1000003;
        if (this.f993d) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f990a + ", version=" + this.f991b + ", buildVersion=" + this.f992c + ", jailbroken=" + this.f993d + "}";
    }
}
