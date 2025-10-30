package H2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2986a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2987b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2988c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2989d;

    /* renamed from: e, reason: collision with root package name */
    public int f2990e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2991f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2992g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2993h;

    /* renamed from: i, reason: collision with root package name */
    public y f2994i;
    public Boolean j;

    /* renamed from: k, reason: collision with root package name */
    public String f2995k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f2996l;

    /* renamed from: m, reason: collision with root package name */
    public final String f2997m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2998n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2999o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3000p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3001q;

    public c(String str, long j, long j4, String str2, int i9, int i10, long j9, long j10, y yVar, Boolean bool, String str3, Boolean bool2, String str4, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f2986a = str;
        this.f2987b = j;
        this.f2988c = j4;
        this.f2989d = str2;
        this.f2990e = i9;
        this.f2991f = i10;
        this.f2992g = j9;
        this.f2993h = j10;
        this.f2994i = yVar;
        this.j = bool;
        this.f2995k = str3;
        this.f2996l = bool2;
        this.f2997m = str4;
        this.f2998n = z9;
        this.f2999o = z10;
        this.f3000p = z11;
        this.f3001q = z12;
    }

    public static c a(c cVar, int i9, int i10) {
        int i11;
        boolean z9;
        boolean z10;
        String str = cVar.f2986a;
        long j = cVar.f2987b;
        long j4 = cVar.f2988c;
        String content = cVar.f2989d;
        int i12 = cVar.f2990e;
        if ((i10 & 32) != 0) {
            i11 = cVar.f2991f;
        } else {
            i11 = i9;
        }
        long j9 = cVar.f2992g;
        long j10 = cVar.f2993h;
        y yVar = cVar.f2994i;
        Boolean bool = cVar.j;
        String str2 = cVar.f2995k;
        Boolean bool2 = cVar.f2996l;
        String str3 = cVar.f2997m;
        boolean z11 = cVar.f2998n;
        boolean z12 = cVar.f2999o;
        boolean z13 = cVar.f3000p;
        if ((i10 & 65536) != 0) {
            z9 = z13;
            z10 = cVar.f3001q;
        } else {
            z9 = z13;
            z10 = false;
        }
        cVar.getClass();
        kotlin.jvm.internal.h.e(content, "content");
        return new c(str, j, j4, content, i12, i11, j9, j10, yVar, bool, str2, bool2, str3, z11, z12, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!this.f2986a.equals(cVar.f2986a) || this.f2987b != cVar.f2987b || this.f2988c != cVar.f2988c || !kotlin.jvm.internal.h.a(this.f2989d, cVar.f2989d) || this.f2990e != cVar.f2990e || this.f2991f != cVar.f2991f || this.f2992g != cVar.f2992g || this.f2993h != cVar.f2993h || !kotlin.jvm.internal.h.a(this.f2994i, cVar.f2994i) || !kotlin.jvm.internal.h.a(this.j, cVar.j) || !kotlin.jvm.internal.h.a(this.f2995k, cVar.f2995k) || !kotlin.jvm.internal.h.a(this.f2996l, cVar.f2996l) || !kotlin.jvm.internal.h.a(this.f2997m, cVar.f2997m) || this.f2998n != cVar.f2998n || this.f2999o != cVar.f2999o || this.f3000p != cVar.f3000p || this.f3001q != cVar.f3001q) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i9;
        int i10;
        int i11;
        int hashCode5 = this.f2986a.hashCode() * 31;
        long j = this.f2987b;
        int i12 = (hashCode5 + ((int) (j ^ (j >>> 32)))) * 31;
        long j4 = this.f2988c;
        int c3 = (((u0.z.c(this.f2989d, (i12 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31) + this.f2990e) * 31) + this.f2991f) * 31;
        long j9 = this.f2992g;
        int i13 = (c3 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f2993h;
        int i14 = (i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        y yVar = this.f2994i;
        int i15 = 0;
        if (yVar == null) {
            hashCode = 0;
        } else {
            hashCode = yVar.hashCode();
        }
        int i16 = (i14 + hashCode) * 31;
        Boolean bool = this.j;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i17 = (i16 + hashCode2) * 31;
        String str = this.f2995k;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i18 = (i17 + hashCode3) * 31;
        Boolean bool2 = this.f2996l;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int i19 = (i18 + hashCode4) * 31;
        String str2 = this.f2997m;
        if (str2 != null) {
            i15 = str2.hashCode();
        }
        int i20 = (i19 + i15) * 31;
        int i21 = 1237;
        if (this.f2998n) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i22 = (i20 + i9) * 31;
        if (this.f2999o) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i23 = (i22 + i10) * 31;
        if (this.f3000p) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i24 = (i23 + i11) * 31;
        if (this.f3001q) {
            i21 = 1231;
        }
        return i24 + i21;
    }

    public final String toString() {
        return "Comment(id=" + this.f2986a + ", userId=" + this.f2987b + ", movieId=" + this.f2988c + ", content=" + this.f2989d + ", totalLike=" + this.f2990e + ", totalChildren=" + this.f2991f + ", createdAt=" + this.f2992g + ", updatedAt=" + this.f2993h + ", user=" + this.f2994i + ", isLike=" + this.j + ", avatarUrl=" + this.f2995k + ", isOwnerComment=" + this.f2996l + ", parentId=" + this.f2997m + ", isSubComment=" + this.f2998n + ", isLast=" + this.f2999o + ", isExpanded=" + this.f3000p + ", isLoading=" + this.f3001q + ")";
    }
}
