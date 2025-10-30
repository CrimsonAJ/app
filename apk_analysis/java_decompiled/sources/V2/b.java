package V2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f7658a;

    public b(Integer num) {
        this.f7658a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Integer num = this.f7658a;
        if (num == null) {
            if (bVar.f7658a == null) {
                return true;
            }
            return false;
        }
        return num.equals(bVar.f7658a);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f7658a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f7658a + "}";
    }
}
