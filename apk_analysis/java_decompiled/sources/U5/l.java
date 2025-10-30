package U5;

import com.google.android.gms.internal.measurement.Y1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7515a;

    public l(byte[] bArr) {
        this.f7515a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        byte[] bArr = this.f7515a;
        int length = bArr.length;
        byte[] bArr2 = lVar.f7515a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i9 = 0; i9 < bArr.length; i9++) {
            byte b9 = bArr[i9];
            byte b10 = lVar.f7515a[i9];
            if (b9 != b10) {
                return b9 - b10;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return Arrays.equals(this.f7515a, ((l) obj).f7515a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7515a);
    }

    public final String toString() {
        return Y1.k(this.f7515a);
    }
}
