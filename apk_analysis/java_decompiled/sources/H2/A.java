package H2;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final String f2974a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2975b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2976c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2977d;

    public A(String str, String str2, long j, int i9) {
        this.f2974a = str;
        this.f2975b = str2;
        this.f2976c = j;
        this.f2977d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a5 = (A) obj;
        if (kotlin.jvm.internal.h.a(this.f2974a, a5.f2974a) && kotlin.jvm.internal.h.a(this.f2975b, a5.f2975b) && this.f2976c == a5.f2976c && this.f2977d == a5.f2977d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c3 = u0.z.c(this.f2975b, this.f2974a.hashCode() * 31, 31);
        long j = this.f2976c;
        return ((c3 + ((int) (j ^ (j >>> 32)))) * 31) + this.f2977d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoteComment(id=");
        sb.append(this.f2974a);
        sb.append(", comment=");
        sb.append(this.f2975b);
        sb.append(", userId=");
        sb.append(this.f2976c);
        sb.append(", type=");
        return u0.z.g(sb, this.f2977d, ")");
    }
}
