package X2;

/* loaded from: classes.dex */
public final class q extends C {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f8389a;

    public q(Integer num) {
        this.f8389a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        Integer num = this.f8389a;
        q qVar = (q) ((C) obj);
        if (num == null) {
            if (qVar.f8389a == null) {
                return true;
            }
            return false;
        }
        return num.equals(qVar.f8389a);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f8389a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f8389a + "}";
    }
}
