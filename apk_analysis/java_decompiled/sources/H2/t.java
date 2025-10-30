package H2;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f3057a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3058b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3059c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3060d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3061e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3062f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3063g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3064h;

    public t(long j, String str, String str2, boolean z9, boolean z10, int i9, String str3, String str4) {
        this.f3057a = j;
        this.f3058b = str;
        this.f3059c = str2;
        this.f3060d = z9;
        this.f3061e = z10;
        this.f3062f = i9;
        this.f3063g = str3;
        this.f3064h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f3057a == tVar.f3057a && kotlin.jvm.internal.h.a(this.f3058b, tVar.f3058b) && kotlin.jvm.internal.h.a(this.f3059c, tVar.f3059c) && this.f3060d == tVar.f3060d && this.f3061e == tVar.f3061e && this.f3062f == tVar.f3062f && kotlin.jvm.internal.h.a(this.f3063g, tVar.f3063g) && kotlin.jvm.internal.h.a(this.f3064h, tVar.f3064h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        long j = this.f3057a;
        int c3 = u0.z.c(this.f3059c, u0.z.c(this.f3058b, ((int) (j ^ (j >>> 32))) * 31, 31), 31);
        int i10 = 1237;
        if (this.f3060d) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i11 = (c3 + i9) * 31;
        if (this.f3061e) {
            i10 = 1231;
        }
        return this.f3064h.hashCode() + u0.z.c(this.f3063g, (((i11 + i10) * 31) + this.f3062f) * 31, 31);
    }

    public final String toString() {
        return "Player(id=" + this.f3057a + ", name=" + this.f3058b + ", logoPath=" + this.f3059c + ", isFree=" + this.f3060d + ", isRecommended=" + this.f3061e + ", star=" + this.f3062f + ", deepLink=" + this.f3063g + ", linkDownLoad=" + this.f3064h + ")";
    }
}
