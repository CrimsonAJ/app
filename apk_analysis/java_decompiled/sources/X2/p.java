package X2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p extends B {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8387a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8388b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f8387a = bArr;
        this.f8388b = bArr2;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof B) {
            B b9 = (B) obj;
            boolean z9 = b9 instanceof p;
            if (z9) {
                bArr = ((p) b9).f8387a;
            } else {
                bArr = ((p) b9).f8387a;
            }
            if (Arrays.equals(this.f8387a, bArr)) {
                if (z9) {
                    bArr2 = ((p) b9).f8388b;
                } else {
                    bArr2 = ((p) b9).f8388b;
                }
                if (Arrays.equals(this.f8388b, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f8387a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8388b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f8387a) + ", encryptedBlob=" + Arrays.toString(this.f8388b) + "}";
    }
}
