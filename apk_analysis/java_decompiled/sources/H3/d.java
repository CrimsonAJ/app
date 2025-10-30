package H3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C1444a0;
import j3.M;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements D3.b {
    public static final Parcelable.Creator<d> CREATOR = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3105a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3106b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3107c;

    public d(String str, String str2, byte[] bArr) {
        this.f3105a = bArr;
        this.f3106b = str;
        this.f3107c = str2;
    }

    @Override // D3.b
    public final void b(C1444a0 c1444a0) {
        String str = this.f3106b;
        if (str != null) {
            c1444a0.f19506a = str;
        }
    }

    @Override // D3.b
    public final /* synthetic */ M c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // D3.b
    public final /* synthetic */ byte[] e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return Arrays.equals(this.f3105a, ((d) obj).f3105a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3105a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f3106b + "\", url=\"" + this.f3107c + "\", rawMetadata.length=\"" + this.f3105a.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeByteArray(this.f3105a);
        parcel.writeString(this.f3106b);
        parcel.writeString(this.f3107c);
    }

    public d(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f3105a = createByteArray;
        this.f3106b = parcel.readString();
        this.f3107c = parcel.readString();
    }
}
