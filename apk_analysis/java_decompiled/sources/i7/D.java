package i7;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f18743a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18744b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18745c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18746d;

    public D(int i9, int i10, String str, boolean z9) {
        this.f18743a = str;
        this.f18744b = i9;
        this.f18745c = i10;
        this.f18746d = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d9 = (D) obj;
        if (kotlin.jvm.internal.h.a(this.f18743a, d9.f18743a) && this.f18744b == d9.f18744b && this.f18745c == d9.f18745c && this.f18746d == d9.f18746d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((this.f18743a.hashCode() * 31) + this.f18744b) * 31) + this.f18745c) * 31;
        boolean z9 = this.f18746d;
        int i9 = z9;
        if (z9 != 0) {
            i9 = 1;
        }
        return hashCode + i9;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f18743a + ", pid=" + this.f18744b + ", importance=" + this.f18745c + ", isDefaultProcess=" + this.f18746d + ')';
    }
}
