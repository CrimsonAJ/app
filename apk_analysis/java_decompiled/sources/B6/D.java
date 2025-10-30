package B6;

import java.util.List;

/* loaded from: classes.dex */
public final class D extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f769a;

    /* renamed from: b, reason: collision with root package name */
    public final String f770b;

    /* renamed from: c, reason: collision with root package name */
    public final int f771c;

    /* renamed from: d, reason: collision with root package name */
    public final int f772d;

    /* renamed from: e, reason: collision with root package name */
    public final long f773e;

    /* renamed from: f, reason: collision with root package name */
    public final long f774f;

    /* renamed from: g, reason: collision with root package name */
    public final long f775g;

    /* renamed from: h, reason: collision with root package name */
    public final String f776h;

    /* renamed from: i, reason: collision with root package name */
    public final List f777i;

    public D(int i9, String str, int i10, int i11, long j, long j4, long j9, String str2, List list) {
        this.f769a = i9;
        this.f770b = str;
        this.f771c = i10;
        this.f772d = i11;
        this.f773e = j;
        this.f774f = j4;
        this.f775g = j9;
        this.f776h = str2;
        this.f777i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            if (this.f769a == ((D) q0Var).f769a) {
                D d9 = (D) q0Var;
                if (this.f770b.equals(d9.f770b) && this.f771c == d9.f771c && this.f772d == d9.f772d && this.f773e == d9.f773e && this.f774f == d9.f774f && this.f775g == d9.f775g) {
                    String str = d9.f776h;
                    String str2 = this.f776h;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        List list = d9.f777i;
                        List list2 = this.f777i;
                        if (list2 != null ? list2.equals(list) : list == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f769a ^ 1000003) * 1000003) ^ this.f770b.hashCode()) * 1000003) ^ this.f771c) * 1000003) ^ this.f772d) * 1000003;
        long j = this.f773e;
        int i9 = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j4 = this.f774f;
        int i10 = (i9 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j9 = this.f775g;
        int i11 = (i10 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        int i12 = 0;
        String str = this.f776h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i13 = (i11 ^ hashCode) * 1000003;
        List list = this.f777i;
        if (list != null) {
            i12 = list.hashCode();
        }
        return i13 ^ i12;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f769a + ", processName=" + this.f770b + ", reasonCode=" + this.f771c + ", importance=" + this.f772d + ", pss=" + this.f773e + ", rss=" + this.f774f + ", timestamp=" + this.f775g + ", traceFile=" + this.f776h + ", buildIdMappingForArch=" + this.f777i + "}";
    }
}
