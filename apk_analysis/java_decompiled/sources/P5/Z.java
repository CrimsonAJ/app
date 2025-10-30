package P5;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class Z extends Q implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Q f5951a;

    public Z(Q q9) {
        this.f5951a = q9;
    }

    @Override // P5.Q
    public final Q a() {
        return this.f5951a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f5951a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Z) {
            return this.f5951a.equals(((Z) obj).f5951a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f5951a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5951a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
