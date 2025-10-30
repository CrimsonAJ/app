package B6;

import java.util.List;

/* loaded from: classes.dex */
public final class U extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f864a;

    /* renamed from: b, reason: collision with root package name */
    public final String f865b;

    /* renamed from: c, reason: collision with root package name */
    public final List f866c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f867d;

    /* renamed from: e, reason: collision with root package name */
    public final int f868e;

    public U(String str, String str2, List list, y0 y0Var, int i9) {
        this.f864a = str;
        this.f865b = str2;
        this.f866c = list;
        this.f867d = y0Var;
        this.f868e = i9;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            if (this.f864a.equals(((U) y0Var).f864a) && ((str = this.f865b) != null ? str.equals(((U) y0Var).f865b) : ((U) y0Var).f865b == null)) {
                U u9 = (U) y0Var;
                if (this.f866c.equals(u9.f866c)) {
                    y0 y0Var2 = u9.f867d;
                    y0 y0Var3 = this.f867d;
                    if (y0Var3 != null ? y0Var3.equals(y0Var2) : y0Var2 == null) {
                        if (this.f868e == u9.f868e) {
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
        int hashCode2 = (this.f864a.hashCode() ^ 1000003) * 1000003;
        int i9 = 0;
        String str = this.f865b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f866c.hashCode()) * 1000003;
        y0 y0Var = this.f867d;
        if (y0Var != null) {
            i9 = y0Var.hashCode();
        }
        return ((hashCode3 ^ i9) * 1000003) ^ this.f868e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f864a);
        sb.append(", reason=");
        sb.append(this.f865b);
        sb.append(", frames=");
        sb.append(this.f866c);
        sb.append(", causedBy=");
        sb.append(this.f867d);
        sb.append(", overflowCount=");
        return u0.z.g(sb, this.f868e, "}");
    }
}
