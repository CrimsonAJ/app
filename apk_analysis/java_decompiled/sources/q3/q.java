package q3;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final s f22342a;

    /* renamed from: b, reason: collision with root package name */
    public final s f22343b;

    public q(s sVar, s sVar2) {
        this.f22342a = sVar;
        this.f22343b = sVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f22342a.equals(qVar.f22342a) && this.f22343b.equals(qVar.f22343b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22343b.hashCode() + (this.f22342a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        s sVar = this.f22342a;
        sb.append(sVar);
        s sVar2 = this.f22343b;
        if (sVar.equals(sVar2)) {
            str = "";
        } else {
            str = ", " + sVar2;
        }
        return AbstractC0953k1.q(sb, str, "]");
    }
}
