package I3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u0.z;

/* loaded from: classes.dex */
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new H3.b(5);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3485b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f3485b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f3509a.equals(bVar.f3509a) && Arrays.equals(this.f3485b, bVar.f3485b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3485b) + z.c(this.f3509a, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f3509a);
        parcel.writeByteArray(this.f3485b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = l4.y.f20553a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f3485b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.b.<init>(android.os.Parcel):void");
    }
}
