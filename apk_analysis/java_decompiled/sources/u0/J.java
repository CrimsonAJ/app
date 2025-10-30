package u0;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23422a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23423b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23424c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23425d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23426e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23427f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23428g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23429h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23430i;

    public J(boolean z9, boolean z10, int i9, boolean z11, boolean z12, int i10, int i11, int i12, int i13) {
        this.f23422a = z9;
        this.f23423b = z10;
        this.f23424c = i9;
        this.f23425d = z11;
        this.f23426e = z12;
        this.f23427f = i10;
        this.f23428g = i11;
        this.f23429h = i12;
        this.f23430i = i13;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof J)) {
                J j = (J) obj;
                if (this.f23422a == j.f23422a && this.f23423b == j.f23423b && this.f23424c == j.f23424c && this.f23425d == j.f23425d && this.f23426e == j.f23426e && this.f23427f == j.f23427f && this.f23428g == j.f23428g && this.f23429h == j.f23429h && this.f23430i == j.f23430i) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f23422a ? 1 : 0) * 31) + (this.f23423b ? 1 : 0)) * 31) + this.f23424c) * 923521) + (this.f23425d ? 1 : 0)) * 31) + (this.f23426e ? 1 : 0)) * 31) + this.f23427f) * 31) + this.f23428g) * 31) + this.f23429h) * 31) + this.f23430i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(J.class.getSimpleName());
        sb.append("(");
        if (this.f23422a) {
            sb.append("launchSingleTop ");
        }
        if (this.f23423b) {
            sb.append("restoreState ");
        }
        int i9 = this.f23430i;
        int i10 = this.f23429h;
        int i11 = this.f23428g;
        int i12 = this.f23427f;
        if (i12 != -1 || i11 != -1 || i10 != -1 || i9 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i12));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i11));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i10));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i9));
            sb.append(")");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "sb.toString()");
        return sb2;
    }
}
