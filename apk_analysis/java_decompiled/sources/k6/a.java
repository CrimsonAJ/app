package k6;

import com.google.android.gms.internal.measurement.Y1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f20137a;

    public a(int i9, byte[] bArr) {
        byte[] bArr2 = new byte[i9];
        this.f20137a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i9);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr.length, bArr);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Arrays.equals(((a) obj).f20137a, this.f20137a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f20137a);
    }

    public final String toString() {
        return "Bytes(" + Y1.k(this.f20137a) + ")";
    }
}
