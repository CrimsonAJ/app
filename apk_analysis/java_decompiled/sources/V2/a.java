package V2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f7654a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7655b;

    /* renamed from: c, reason: collision with root package name */
    public final d f7656c;

    /* renamed from: d, reason: collision with root package name */
    public final b f7657d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f7654a = num;
        this.f7655b = obj;
        this.f7656c = dVar;
        this.f7657d = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f7654a;
            if (num != null ? num.equals(aVar.f7654a) : aVar.f7654a == null) {
                if (this.f7655b.equals(aVar.f7655b) && this.f7656c.equals(aVar.f7656c)) {
                    b bVar = aVar.f7657d;
                    b bVar2 = this.f7657d;
                    if (bVar2 != null ? bVar2.equals(bVar) : bVar == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Integer num = this.f7654a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f7655b.hashCode()) * 1000003) ^ this.f7656c.hashCode()) * 1000003;
        b bVar = this.f7657d;
        if (bVar != null) {
            i9 = bVar.hashCode();
        }
        return (i9 ^ hashCode2) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.f7654a + ", payload=" + this.f7655b + ", priority=" + this.f7656c + ", productData=" + this.f7657d + ", eventContext=null}";
    }
}
