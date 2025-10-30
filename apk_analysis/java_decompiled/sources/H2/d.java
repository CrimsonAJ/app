package H2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f3002a;

    /* renamed from: b, reason: collision with root package name */
    public final y f3003b;

    public d(c cVar, y yVar) {
        this.f3002a = cVar;
        this.f3003b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.h.a(this.f3002a, dVar.f3002a) && kotlin.jvm.internal.h.a(this.f3003b, dVar.f3003b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        c cVar = this.f3002a;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i10 = hashCode * 31;
        y yVar = this.f3003b;
        if (yVar != null) {
            i9 = yVar.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        return "CommentInfo(comment=" + this.f3002a + ", user=" + this.f3003b + ")";
    }
}
