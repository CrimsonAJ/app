package co.notix;

/* loaded from: classes.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public final o4 f13018a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13019b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13020c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13021d;

    /* renamed from: e, reason: collision with root package name */
    public final o f13022e;

    public q4(o4 adRequest, String uuid, long j, String str, o cnt) {
        kotlin.jvm.internal.h.e(adRequest, "adRequest");
        kotlin.jvm.internal.h.e(uuid, "uuid");
        kotlin.jvm.internal.h.e(cnt, "cnt");
        this.f13018a = adRequest;
        this.f13019b = uuid;
        this.f13020c = j;
        this.f13021d = str;
        this.f13022e = cnt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return kotlin.jvm.internal.h.a(this.f13018a, q4Var.f13018a) && kotlin.jvm.internal.h.a(this.f13019b, q4Var.f13019b) && this.f13020c == q4Var.f13020c && kotlin.jvm.internal.h.a(this.f13021d, q4Var.f13021d) && kotlin.jvm.internal.h.a(this.f13022e, q4Var.f13022e);
    }

    public final int hashCode() {
        int hashCode;
        int a5 = h.a(this.f13019b, this.f13018a.hashCode() * 31, 31);
        long j = this.f13020c;
        int i9 = (((int) (j ^ (j >>> 32))) + a5) * 31;
        String str = this.f13021d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f13022e.hashCode() + ((i9 + hashCode) * 31);
    }

    public final String toString() {
        return "AdRequestFull(adRequest=" + this.f13018a + ", uuid=" + this.f13019b + ", createdDateTimestamp=" + this.f13020c + ", notixSdkVersion=" + this.f13021d + ", cnt=" + this.f13022e + ')';
    }
}
