package H2;

/* renamed from: H2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158a {

    /* renamed from: a, reason: collision with root package name */
    public final long f2978a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2979b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2980c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2981d;

    public C0158a(long j, String str, String str2, int i9) {
        this.f2978a = j;
        this.f2979b = str;
        this.f2980c = str2;
        this.f2981d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0158a)) {
            return false;
        }
        C0158a c0158a = (C0158a) obj;
        if (this.f2978a == c0158a.f2978a && kotlin.jvm.internal.h.a(this.f2979b, c0158a.f2979b) && kotlin.jvm.internal.h.a(this.f2980c, c0158a.f2980c) && this.f2981d == c0158a.f2981d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2978a;
        return u0.z.c(this.f2980c, u0.z.c(this.f2979b, ((int) (j ^ (j >>> 32))) * 31, 31), 31) + this.f2981d;
    }

    public final String toString() {
        return "Avatar(id=" + this.f2978a + ", url=" + this.f2979b + ", path=" + this.f2980c + ", group=" + this.f2981d + ")";
    }
}
