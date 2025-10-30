package b2;

import u0.z;

/* loaded from: classes.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final long f10504a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10505b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10506c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10507d;

    public q(long j, long j4, String str, String str2) {
        this.f10504a = j;
        this.f10505b = str;
        this.f10506c = str2;
        this.f10507d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f10504a == qVar.f10504a && kotlin.jvm.internal.h.a(this.f10505b, qVar.f10505b) && kotlin.jvm.internal.h.a(this.f10506c, qVar.f10506c) && this.f10507d == qVar.f10507d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10504a;
        int c3 = z.c(this.f10506c, z.c(this.f10505b, ((int) (j ^ (j >>> 32))) * 31, 31), 31);
        long j4 = this.f10507d;
        return c3 + ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Play(animeId=");
        sb.append(this.f10504a);
        sb.append(", animeName=");
        sb.append(this.f10505b);
        sb.append(", animePoster=");
        sb.append(this.f10506c);
        sb.append(", episodeId=");
        return A0.a.o(sb, this.f10507d, ")");
    }
}
