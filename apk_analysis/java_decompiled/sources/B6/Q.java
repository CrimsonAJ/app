package B6;

import java.util.List;

/* loaded from: classes.dex */
public final class Q extends E0 {

    /* renamed from: a, reason: collision with root package name */
    public final S f848a;

    /* renamed from: b, reason: collision with root package name */
    public final List f849b;

    /* renamed from: c, reason: collision with root package name */
    public final List f850c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f851d;

    /* renamed from: e, reason: collision with root package name */
    public final D0 f852e;

    /* renamed from: f, reason: collision with root package name */
    public final List f853f;

    /* renamed from: g, reason: collision with root package name */
    public final int f854g;

    public Q(S s9, List list, List list2, Boolean bool, D0 d02, List list3, int i9) {
        this.f848a = s9;
        this.f849b = list;
        this.f850c = list2;
        this.f851d = bool;
        this.f852e = d02;
        this.f853f = list3;
        this.f854g = i9;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof E0) {
                Q q9 = (Q) ((E0) obj);
                if (this.f848a.equals(q9.f848a)) {
                    List list = this.f849b;
                    if (list == null) {
                        if (q9.f849b != null) {
                            return false;
                        }
                    } else if (!list.equals(q9.f849b)) {
                        return false;
                    }
                    List list2 = this.f850c;
                    if (list2 == null) {
                        if (q9.f850c != null) {
                            return false;
                        }
                    } else if (!list2.equals(q9.f850c)) {
                        return false;
                    }
                    Boolean bool = this.f851d;
                    if (bool == null) {
                        if (q9.f851d != null) {
                            return false;
                        }
                    } else if (!bool.equals(q9.f851d)) {
                        return false;
                    }
                    D0 d02 = this.f852e;
                    if (d02 == null) {
                        if (q9.f852e != null) {
                            return false;
                        }
                    } else if (!d02.equals(q9.f852e)) {
                        return false;
                    }
                    List list3 = this.f853f;
                    if (list3 == null) {
                        if (q9.f853f != null) {
                            return false;
                        }
                    } else if (!list3.equals(q9.f853f)) {
                        return false;
                    }
                    if (this.f854g == q9.f854g) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.f848a.hashCode() ^ 1000003) * 1000003;
        int i9 = 0;
        List list = this.f849b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f850c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        Boolean bool = this.f851d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        D0 d02 = this.f852e;
        if (d02 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d02.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        List list3 = this.f853f;
        if (list3 != null) {
            i9 = list3.hashCode();
        }
        return ((i13 ^ i9) * 1000003) ^ this.f854g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f848a);
        sb.append(", customAttributes=");
        sb.append(this.f849b);
        sb.append(", internalKeys=");
        sb.append(this.f850c);
        sb.append(", background=");
        sb.append(this.f851d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f852e);
        sb.append(", appProcessDetails=");
        sb.append(this.f853f);
        sb.append(", uiOrientation=");
        return u0.z.g(sb, this.f854g, "}");
    }
}
