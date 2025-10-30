package F0;

/* renamed from: F0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094a {

    /* renamed from: a, reason: collision with root package name */
    public int f2066a;

    /* renamed from: b, reason: collision with root package name */
    public int f2067b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2068c;

    /* renamed from: d, reason: collision with root package name */
    public int f2069d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0094a) {
                C0094a c0094a = (C0094a) obj;
                int i9 = this.f2066a;
                if (i9 == c0094a.f2066a) {
                    if (i9 != 8 || Math.abs(this.f2069d - this.f2067b) != 1 || this.f2069d != c0094a.f2067b || this.f2067b != c0094a.f2069d) {
                        if (this.f2069d == c0094a.f2069d && this.f2067b == c0094a.f2067b) {
                            Object obj2 = this.f2068c;
                            if (obj2 != null) {
                                if (!obj2.equals(c0094a.f2068c)) {
                                    return false;
                                }
                            } else if (c0094a.f2068c != null) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f2066a * 31) + this.f2067b) * 31) + this.f2069d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i9 = this.f2066a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f2067b);
        sb.append("c:");
        sb.append(this.f2069d);
        sb.append(",p:");
        sb.append(this.f2068c);
        sb.append("]");
        return sb.toString();
    }
}
