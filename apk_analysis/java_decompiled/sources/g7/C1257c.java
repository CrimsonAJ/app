package g7;

/* renamed from: g7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257c extends AbstractC1259e {

    /* renamed from: b, reason: collision with root package name */
    public final String f17774b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17775c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17776d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17777e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17778f;

    public C1257c(String str, String str2, String str3, String str4, long j) {
        this.f17774b = str;
        this.f17775c = str2;
        this.f17776d = str3;
        this.f17777e = str4;
        this.f17778f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1259e) {
            AbstractC1259e abstractC1259e = (AbstractC1259e) obj;
            if (this.f17774b.equals(((C1257c) abstractC1259e).f17774b)) {
                C1257c c1257c = (C1257c) abstractC1259e;
                if (this.f17775c.equals(c1257c.f17775c) && this.f17776d.equals(c1257c.f17776d) && this.f17777e.equals(c1257c.f17777e) && this.f17778f == c1257c.f17778f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f17774b.hashCode() ^ 1000003) * 1000003) ^ this.f17775c.hashCode()) * 1000003) ^ this.f17776d.hashCode()) * 1000003) ^ this.f17777e.hashCode()) * 1000003;
        long j = this.f17778f;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f17774b);
        sb.append(", variantId=");
        sb.append(this.f17775c);
        sb.append(", parameterKey=");
        sb.append(this.f17776d);
        sb.append(", parameterValue=");
        sb.append(this.f17777e);
        sb.append(", templateVersion=");
        return A0.a.o(sb, this.f17778f, "}");
    }
}
