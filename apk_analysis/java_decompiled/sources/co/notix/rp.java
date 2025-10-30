package co.notix;

/* loaded from: classes.dex */
public final class rp {

    /* renamed from: a, reason: collision with root package name */
    public final ql f13137a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f13138b;

    /* renamed from: c, reason: collision with root package name */
    public final qp f13139c;

    public rp(ql qlVar, Long l9, qp qpVar) {
        this.f13137a = qlVar;
        this.f13138b = l9;
        this.f13139c = qpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp)) {
            return false;
        }
        rp rpVar = (rp) obj;
        return this.f13137a == rpVar.f13137a && kotlin.jvm.internal.h.a(this.f13138b, rpVar.f13138b) && kotlin.jvm.internal.h.a(this.f13139c, rpVar.f13139c);
    }

    public final int hashCode() {
        ql qlVar = this.f13137a;
        int hashCode = (qlVar == null ? 0 : qlVar.hashCode()) * 31;
        Long l9 = this.f13138b;
        int hashCode2 = (hashCode + (l9 == null ? 0 : l9.hashCode())) * 31;
        qp qpVar = this.f13139c;
        return hashCode2 + (qpVar != null ? qpVar.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteLogs(level=" + this.f13137a + ", storageMaxSize=" + this.f13138b + ", rateLimits=" + this.f13139c + ')';
    }
}
