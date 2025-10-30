package I3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l4.y;

/* loaded from: classes.dex */
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new H3.b(11);

    /* renamed from: b, reason: collision with root package name */
    public final int f3513b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3514c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3515d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f3516e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f3517f;

    public l(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f3513b = i9;
        this.f3514c = i10;
        this.f3515d = i11;
        this.f3516e = iArr;
        this.f3517f = iArr2;
    }

    @Override // I3.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f3513b == lVar.f3513b && this.f3514c == lVar.f3514c && this.f3515d == lVar.f3515d && Arrays.equals(this.f3516e, lVar.f3516e) && Arrays.equals(this.f3517f, lVar.f3517f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3517f) + ((Arrays.hashCode(this.f3516e) + ((((((527 + this.f3513b) * 31) + this.f3514c) * 31) + this.f3515d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f3513b);
        parcel.writeInt(this.f3514c);
        parcel.writeInt(this.f3515d);
        parcel.writeIntArray(this.f3516e);
        parcel.writeIntArray(this.f3517f);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f3513b = parcel.readInt();
        this.f3514c = parcel.readInt();
        this.f3515d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i9 = y.f20553a;
        this.f3516e = createIntArray;
        this.f3517f = parcel.createIntArray();
    }
}
