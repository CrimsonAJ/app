package A6;

/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: b, reason: collision with root package name */
    public final String f492b;

    /* renamed from: c, reason: collision with root package name */
    public final String f493c;

    /* renamed from: d, reason: collision with root package name */
    public final String f494d;

    /* renamed from: e, reason: collision with root package name */
    public final String f495e;

    /* renamed from: f, reason: collision with root package name */
    public final long f496f;

    public b(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.f492b = str;
            if (str2 != null) {
                this.f493c = str2;
                if (str3 != null) {
                    this.f494d = str3;
                    if (str4 != null) {
                        this.f495e = str4;
                        this.f496f = j;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f492b.equals(((b) oVar).f492b)) {
                b bVar = (b) oVar;
                if (this.f493c.equals(bVar.f493c) && this.f494d.equals(bVar.f494d) && this.f495e.equals(bVar.f495e) && this.f496f == bVar.f496f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f492b.hashCode() ^ 1000003) * 1000003) ^ this.f493c.hashCode()) * 1000003) ^ this.f494d.hashCode()) * 1000003) ^ this.f495e.hashCode()) * 1000003;
        long j = this.f496f;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f492b);
        sb.append(", parameterKey=");
        sb.append(this.f493c);
        sb.append(", parameterValue=");
        sb.append(this.f494d);
        sb.append(", variantId=");
        sb.append(this.f495e);
        sb.append(", templateVersion=");
        return A0.a.o(sb, this.f496f, "}");
    }
}
