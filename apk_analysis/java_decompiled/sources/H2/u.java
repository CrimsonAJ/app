package H2;

import java.util.List;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final long f3065a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3066b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3067c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3068d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3069e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3070f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3071g;

    /* renamed from: h, reason: collision with root package name */
    public final List f3072h;

    public u(long j, long j4, long j9, String animeName, String animePoster, int i9, int i10, List allNames) {
        kotlin.jvm.internal.h.e(animeName, "animeName");
        kotlin.jvm.internal.h.e(animePoster, "animePoster");
        kotlin.jvm.internal.h.e(allNames, "allNames");
        this.f3065a = j;
        this.f3066b = j4;
        this.f3067c = j9;
        this.f3068d = animeName;
        this.f3069e = animePoster;
        this.f3070f = i9;
        this.f3071g = i10;
        this.f3072h = allNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f3065a == uVar.f3065a && this.f3066b == uVar.f3066b && this.f3067c == uVar.f3067c && kotlin.jvm.internal.h.a(this.f3068d, uVar.f3068d) && kotlin.jvm.internal.h.a(this.f3069e, uVar.f3069e) && this.f3070f == uVar.f3070f && this.f3071g == uVar.f3071g && kotlin.jvm.internal.h.a(this.f3072h, uVar.f3072h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3065a;
        long j4 = this.f3066b;
        int i9 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j9 = this.f3067c;
        return this.f3072h.hashCode() + ((((u0.z.c(this.f3069e, u0.z.c(this.f3068d, (i9 + ((int) (j9 ^ (j9 >>> 32)))) * 31, 31), 31) + this.f3070f) * 31) + this.f3071g) * 31);
    }

    public final String toString() {
        return "RecentlyWatched(animeId=" + this.f3065a + ", episodeId=" + this.f3066b + ", positionMs=" + this.f3067c + ", animeName=" + this.f3068d + ", animePoster=" + this.f3069e + ", percent=" + this.f3070f + ", year=" + this.f3071g + ", allNames=" + this.f3072h + ")";
    }
}
