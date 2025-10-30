package B6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class H extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f785a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f786b;

    public H(String str, byte[] bArr) {
        this.f785a = str;
        this.f786b = bArr;
    }

    public final boolean equals(Object obj) {
        H h7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f785a.equals(((H) s0Var).f785a)) {
                if (s0Var instanceof H) {
                    h7 = (H) s0Var;
                } else {
                    h7 = (H) s0Var;
                }
                if (Arrays.equals(this.f786b, h7.f786b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f785a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f786b);
    }

    public final String toString() {
        return "File{filename=" + this.f785a + ", contents=" + Arrays.toString(this.f786b) + "}";
    }
}
