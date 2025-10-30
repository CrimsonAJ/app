package C1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f1170a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1171b;

    public d(b bVar, b bVar2) {
        this.f1170a = bVar;
        this.f1171b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            dVar.getClass();
            if (this.f1170a == dVar.f1170a && this.f1171b == dVar.f1171b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = 0;
        b bVar = this.f1170a;
        if (bVar != null) {
            i9 = bVar.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = i9 * 31;
        b bVar2 = this.f1171b;
        if (bVar2 != null) {
            i10 = bVar2.hashCode();
        }
        return (i11 + i10) * 31;
    }
}
