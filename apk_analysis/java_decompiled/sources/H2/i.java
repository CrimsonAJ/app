package H2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f3026a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3027b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3028c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3029d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3030e;

    public i(long j, long j4, int i9, String str, boolean z9) {
        this.f3026a = j;
        this.f3027b = j4;
        this.f3028c = i9;
        this.f3029d = str;
        this.f3030e = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f3026a == iVar.f3026a && this.f3027b == iVar.f3027b && this.f3028c == iVar.f3028c && kotlin.jvm.internal.h.a(this.f3029d, iVar.f3029d) && this.f3030e == iVar.f3030e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9;
        long j = this.f3026a;
        long j4 = this.f3027b;
        int i10 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.f3028c) * 31;
        String str = this.f3029d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (i10 + hashCode) * 31;
        if (this.f3030e) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return i11 + i9;
    }

    public final String toString() {
        return "Episode(id=" + this.f3026a + ", movieId=" + this.f3027b + ", number=" + this.f3028c + ", slugEnglish=" + this.f3029d + ", isFiller=" + this.f3030e + ")";
    }
}
