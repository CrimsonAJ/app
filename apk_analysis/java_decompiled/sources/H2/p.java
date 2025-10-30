package H2;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3042a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3043b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3044c;

    public p(Integer num, String str, long j) {
        this.f3042a = num;
        this.f3043b = str;
        this.f3044c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (kotlin.jvm.internal.h.a(this.f3042a, pVar.f3042a) && kotlin.jvm.internal.h.a(this.f3043b, pVar.f3043b) && this.f3044c == pVar.f3044c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Integer num = this.f3042a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f3043b;
        if (str != null) {
            i9 = str.hashCode();
        }
        long j = this.f3044c;
        return ((i10 + i9) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MalData(numEpisodesWatched=");
        sb.append(this.f3042a);
        sb.append(", status=");
        sb.append(this.f3043b);
        sb.append(", animeMalId=");
        return A0.a.o(sb, this.f3044c, ")");
    }
}
