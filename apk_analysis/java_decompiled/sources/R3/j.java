package R3;

import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f6624a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6625b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6626c;

    /* renamed from: d, reason: collision with root package name */
    public int f6627d;

    public j(long j, String str, long j4) {
        this.f6626c = str == null ? "" : str;
        this.f6624a = j;
        this.f6625b = j4;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String L8 = AbstractC1566a.L(str, this.f6626c);
        if (jVar == null || !L8.equals(AbstractC1566a.L(str, jVar.f6626c))) {
            return null;
        }
        long j = this.f6625b;
        long j4 = -1;
        long j9 = jVar.f6625b;
        if (j != -1) {
            long j10 = this.f6624a;
            jVar2 = null;
            if (j10 + j == jVar.f6624a) {
                if (j9 != -1) {
                    j4 = j + j9;
                }
                return new j(j10, L8, j4);
            }
        } else {
            jVar2 = null;
        }
        if (j9 != -1) {
            long j11 = jVar.f6624a;
            if (j11 + j9 == this.f6624a) {
                if (j != -1) {
                    j4 = j9 + j;
                }
                return new j(j11, L8, j4);
            }
            return jVar2;
        }
        return jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f6624a == jVar.f6624a && this.f6625b == jVar.f6625b && this.f6626c.equals(jVar.f6626c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6627d == 0) {
            this.f6627d = this.f6626c.hashCode() + ((((527 + ((int) this.f6624a)) * 31) + ((int) this.f6625b)) * 31);
        }
        return this.f6627d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f6626c);
        sb.append(", start=");
        sb.append(this.f6624a);
        sb.append(", length=");
        return A0.a.o(sb, this.f6625b, ")");
    }
}
