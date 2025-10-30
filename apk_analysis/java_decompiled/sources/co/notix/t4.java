package co.notix;

/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13208a;

    /* renamed from: b, reason: collision with root package name */
    public final o4 f13209b;

    /* renamed from: c, reason: collision with root package name */
    public final l f13210c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13211d;

    public t4(String id, o4 adRequest, l adContentDto, long j) {
        kotlin.jvm.internal.h.e(id, "id");
        kotlin.jvm.internal.h.e(adRequest, "adRequest");
        kotlin.jvm.internal.h.e(adContentDto, "adContentDto");
        this.f13208a = id;
        this.f13209b = adRequest;
        this.f13210c = adContentDto;
        this.f13211d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return kotlin.jvm.internal.h.a(this.f13208a, t4Var.f13208a) && kotlin.jvm.internal.h.a(this.f13209b, t4Var.f13209b) && kotlin.jvm.internal.h.a(this.f13210c, t4Var.f13210c) && this.f13211d == t4Var.f13211d;
    }

    public final int hashCode() {
        int hashCode = (this.f13210c.hashCode() + ((this.f13209b.hashCode() + (this.f13208a.hashCode() * 31)) * 31)) * 31;
        long j = this.f13211d;
        return ((int) (j ^ (j >>> 32))) + hashCode;
    }

    public final String toString() {
        return "Entry(id=" + this.f13208a + ", adRequest=" + this.f13209b + ", adContentDto=" + this.f13210c + ", validUntil=" + this.f13211d + ')';
    }
}
