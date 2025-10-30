package I3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l4.y;

/* loaded from: classes.dex */
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new H3.b(12);

    /* renamed from: b, reason: collision with root package name */
    public final String f3518b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3519c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f3518b = str;
        this.f3519c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (y.a(this.f3518b, mVar.f3518b) && Arrays.equals(this.f3519c, mVar.f3519c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        String str = this.f3518b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return Arrays.hashCode(this.f3519c) + ((527 + i9) * 31);
    }

    @Override // I3.j
    public final String toString() {
        return this.f3509a + ": owner=" + this.f3518b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f3518b);
        parcel.writeByteArray(this.f3519c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i9 = y.f20553a;
        this.f3518b = readString;
        this.f3519c = parcel.createByteArray();
    }
}
