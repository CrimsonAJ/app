package S3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new s(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f6911a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6912b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6913c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6914d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6915e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6916f;

    public t(int i9, int i10, String str, String str2, String str3, String str4) {
        this.f6911a = i9;
        this.f6912b = i10;
        this.f6913c = str;
        this.f6914d = str2;
        this.f6915e = str3;
        this.f6916f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f6911a == tVar.f6911a && this.f6912b == tVar.f6912b && TextUtils.equals(this.f6913c, tVar.f6913c) && TextUtils.equals(this.f6914d, tVar.f6914d) && TextUtils.equals(this.f6915e, tVar.f6915e) && TextUtils.equals(this.f6916f, tVar.f6916f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11;
        int i12 = ((this.f6911a * 31) + this.f6912b) * 31;
        int i13 = 0;
        String str = this.f6913c;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = (i12 + i9) * 31;
        String str2 = this.f6914d;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f6915e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f6916f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f6911a);
        parcel.writeInt(this.f6912b);
        parcel.writeString(this.f6913c);
        parcel.writeString(this.f6914d);
        parcel.writeString(this.f6915e);
        parcel.writeString(this.f6916f);
    }

    public t(Parcel parcel) {
        this.f6911a = parcel.readInt();
        this.f6912b = parcel.readInt();
        this.f6913c = parcel.readString();
        this.f6914d = parcel.readString();
        this.f6915e = parcel.readString();
        this.f6916f = parcel.readString();
    }
}
