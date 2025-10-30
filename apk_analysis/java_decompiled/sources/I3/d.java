package I3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l4.y;

/* loaded from: classes.dex */
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new H3.b(7);

    /* renamed from: b, reason: collision with root package name */
    public final String f3492b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3493c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3494d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f3495e;

    /* renamed from: f, reason: collision with root package name */
    public final j[] f3496f;

    public d(String str, boolean z9, boolean z10, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f3492b = str;
        this.f3493c = z9;
        this.f3494d = z10;
        this.f3495e = strArr;
        this.f3496f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f3493c == dVar.f3493c && this.f3494d == dVar.f3494d && y.a(this.f3492b, dVar.f3492b) && Arrays.equals(this.f3495e, dVar.f3495e) && Arrays.equals(this.f3496f, dVar.f3496f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = (((527 + (this.f3493c ? 1 : 0)) * 31) + (this.f3494d ? 1 : 0)) * 31;
        String str = this.f3492b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return i10 + i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f3492b);
        parcel.writeByte(this.f3493c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3494d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f3495e);
        j[] jVarArr = this.f3496f;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i9 = y.f20553a;
        this.f3492b = readString;
        this.f3493c = parcel.readByte() != 0;
        this.f3494d = parcel.readByte() != 0;
        this.f3495e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f3496f = new j[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f3496f[i10] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
