package n1;

/* renamed from: n1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1606c {

    /* renamed from: a, reason: collision with root package name */
    public final String f21012a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f21013b;

    public C1606c(long j, String str) {
        this.f21012a = str;
        this.f21013b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1606c)) {
            return false;
        }
        C1606c c1606c = (C1606c) obj;
        if (!this.f21012a.equals(c1606c.f21012a)) {
            return false;
        }
        Long l9 = c1606c.f21013b;
        Long l10 = this.f21013b;
        if (l10 != null) {
            return l10.equals(l9);
        }
        if (l9 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f21012a.hashCode() * 31;
        Long l9 = this.f21013b;
        if (l9 != null) {
            i9 = l9.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }
}
