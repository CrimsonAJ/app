package B6;

import java.util.List;

/* loaded from: classes.dex */
public final class J extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f799a;

    /* renamed from: b, reason: collision with root package name */
    public final String f800b;

    /* renamed from: c, reason: collision with root package name */
    public final String f801c;

    /* renamed from: d, reason: collision with root package name */
    public final long f802d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f803e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f804f;

    /* renamed from: g, reason: collision with root package name */
    public final K f805g;

    /* renamed from: h, reason: collision with root package name */
    public final C0031k0 f806h;

    /* renamed from: i, reason: collision with root package name */
    public final C0029j0 f807i;
    public final N j;

    /* renamed from: k, reason: collision with root package name */
    public final List f808k;

    /* renamed from: l, reason: collision with root package name */
    public final int f809l;

    public J(String str, String str2, String str3, long j, Long l9, boolean z9, K k5, C0031k0 c0031k0, C0029j0 c0029j0, N n7, List list, int i9) {
        this.f799a = str;
        this.f800b = str2;
        this.f801c = str3;
        this.f802d = j;
        this.f803e = l9;
        this.f804f = z9;
        this.f805g = k5;
        this.f806h = c0031k0;
        this.f807i = c0029j0;
        this.j = n7;
        this.f808k = list;
        this.f809l = i9;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B6.I, java.lang.Object] */
    public final I a() {
        ?? obj = new Object();
        obj.f787a = this.f799a;
        obj.f788b = this.f800b;
        obj.f789c = this.f801c;
        obj.f790d = this.f802d;
        obj.f791e = this.f803e;
        obj.f792f = this.f804f;
        obj.f793g = this.f805g;
        obj.f794h = this.f806h;
        obj.f795i = this.f807i;
        obj.j = this.j;
        obj.f796k = this.f808k;
        obj.f797l = this.f809l;
        obj.f798m = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof N0) {
                J j = (J) ((N0) obj);
                if (this.f799a.equals(j.f799a)) {
                    if (this.f800b.equals(j.f800b)) {
                        String str = j.f801c;
                        String str2 = this.f801c;
                        if (str2 == null) {
                            if (str != null) {
                                return false;
                            }
                        } else if (!str2.equals(str)) {
                            return false;
                        }
                        if (this.f802d == j.f802d) {
                            Long l9 = j.f803e;
                            Long l10 = this.f803e;
                            if (l10 == null) {
                                if (l9 != null) {
                                    return false;
                                }
                            } else if (!l10.equals(l9)) {
                                return false;
                            }
                            if (this.f804f == j.f804f && this.f805g.equals(j.f805g)) {
                                C0031k0 c0031k0 = j.f806h;
                                C0031k0 c0031k02 = this.f806h;
                                if (c0031k02 == null) {
                                    if (c0031k0 != null) {
                                        return false;
                                    }
                                } else if (!c0031k02.equals(c0031k0)) {
                                    return false;
                                }
                                C0029j0 c0029j0 = j.f807i;
                                C0029j0 c0029j02 = this.f807i;
                                if (c0029j02 == null) {
                                    if (c0029j0 != null) {
                                        return false;
                                    }
                                } else if (!c0029j02.equals(c0029j0)) {
                                    return false;
                                }
                                N n7 = j.j;
                                N n9 = this.j;
                                if (n9 == null) {
                                    if (n7 != null) {
                                        return false;
                                    }
                                } else if (!n9.equals(n7)) {
                                    return false;
                                }
                                List list = j.f808k;
                                List list2 = this.f808k;
                                if (list2 == null) {
                                    if (list != null) {
                                        return false;
                                    }
                                } else if (!list2.equals(list)) {
                                    return false;
                                }
                                if (this.f809l == j.f809l) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
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
        int i9;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f799a.hashCode() ^ 1000003) * 1000003) ^ this.f800b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f801c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode6 ^ hashCode) * 1000003;
        long j = this.f802d;
        int i12 = (i11 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l9 = this.f803e;
        if (l9 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l9.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f804f) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int hashCode7 = (((i13 ^ i9) * 1000003) ^ this.f805g.hashCode()) * 1000003;
        C0031k0 c0031k0 = this.f806h;
        if (c0031k0 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c0031k0.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        C0029j0 c0029j0 = this.f807i;
        if (c0029j0 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c0029j0.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        N n7 = this.j;
        if (n7 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = n7.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f808k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i16 ^ i10) * 1000003) ^ this.f809l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f799a);
        sb.append(", identifier=");
        sb.append(this.f800b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f801c);
        sb.append(", startedAt=");
        sb.append(this.f802d);
        sb.append(", endedAt=");
        sb.append(this.f803e);
        sb.append(", crashed=");
        sb.append(this.f804f);
        sb.append(", app=");
        sb.append(this.f805g);
        sb.append(", user=");
        sb.append(this.f806h);
        sb.append(", os=");
        sb.append(this.f807i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.f808k);
        sb.append(", generatorType=");
        return u0.z.g(sb, this.f809l, "}");
    }
}
