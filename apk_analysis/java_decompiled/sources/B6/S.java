package B6;

import java.util.List;

/* loaded from: classes.dex */
public final class S extends C0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f855a;

    /* renamed from: b, reason: collision with root package name */
    public final U f856b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f857c;

    /* renamed from: d, reason: collision with root package name */
    public final V f858d;

    /* renamed from: e, reason: collision with root package name */
    public final List f859e;

    public S(List list, U u9, q0 q0Var, V v8, List list2) {
        this.f855a = list;
        this.f856b = u9;
        this.f857c = q0Var;
        this.f858d = v8;
        this.f859e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0) {
                C0 c02 = (C0) obj;
                List list = this.f855a;
                if (list == null) {
                    if (((S) c02).f855a != null) {
                        return false;
                    }
                } else if (!list.equals(((S) c02).f855a)) {
                    return false;
                }
                U u9 = this.f856b;
                if (u9 == null) {
                    if (((S) c02).f856b != null) {
                        return false;
                    }
                } else if (!u9.equals(((S) c02).f856b)) {
                    return false;
                }
                q0 q0Var = this.f857c;
                if (q0Var == null) {
                    if (((S) c02).f857c != null) {
                        return false;
                    }
                } else if (!q0Var.equals(((S) c02).f857c)) {
                    return false;
                }
                S s9 = (S) c02;
                if (this.f858d.equals(s9.f858d) && this.f859e.equals(s9.f859e)) {
                    return true;
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
        int i9 = 0;
        List list = this.f855a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        U u9 = this.f856b;
        if (u9 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = u9.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        q0 q0Var = this.f857c;
        if (q0Var != null) {
            i9 = q0Var.hashCode();
        }
        return ((((i9 ^ i11) * 1000003) ^ this.f858d.hashCode()) * 1000003) ^ this.f859e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f855a + ", exception=" + this.f856b + ", appExitInfo=" + this.f857c + ", signal=" + this.f858d + ", binaries=" + this.f859e + "}";
    }
}
