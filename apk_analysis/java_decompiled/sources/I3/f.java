package I3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l4.y;

/* loaded from: classes.dex */
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new H3.b(9);

    /* renamed from: b, reason: collision with root package name */
    public final String f3500b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3501c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3502d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f3503e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f3500b = str;
        this.f3501c = str2;
        this.f3502d = str3;
        this.f3503e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (y.a(this.f3500b, fVar.f3500b) && y.a(this.f3501c, fVar.f3501c) && y.a(this.f3502d, fVar.f3502d) && Arrays.equals(this.f3503e, fVar.f3503e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11 = 0;
        String str = this.f3500b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (527 + i9) * 31;
        String str2 = this.f3501c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f3502d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return Arrays.hashCode(this.f3503e) + ((i13 + i11) * 31);
    }

    @Override // I3.j
    public final String toString() {
        return this.f3509a + ": mimeType=" + this.f3500b + ", filename=" + this.f3501c + ", description=" + this.f3502d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f3500b);
        parcel.writeString(this.f3501c);
        parcel.writeString(this.f3502d);
        parcel.writeByteArray(this.f3503e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i9 = y.f20553a;
        this.f3500b = readString;
        this.f3501c = parcel.readString();
        this.f3502d = parcel.readString();
        this.f3503e = parcel.createByteArray();
    }
}
