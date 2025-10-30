package co.notix;

/* loaded from: classes.dex */
public final class qo {

    /* renamed from: a, reason: collision with root package name */
    public final long f13067a;

    /* renamed from: b, reason: collision with root package name */
    public final ql f13068b;

    public qo(long j, ql level) {
        kotlin.jvm.internal.h.e(level, "level");
        this.f13067a = j;
        this.f13068b = level;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo)) {
            return false;
        }
        qo qoVar = (qo) obj;
        return this.f13067a == qoVar.f13067a && this.f13068b == qoVar.f13068b;
    }

    public final int hashCode() {
        long j = this.f13067a;
        return this.f13068b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "RlTimestamp(timestamp=" + this.f13067a + ", level=" + this.f13068b + ')';
    }
}
