package J3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C1444a0;
import j3.M;
import java.util.Arrays;
import l4.y;
import u0.z;

/* loaded from: classes.dex */
public final class a implements D3.b {
    public static final Parcelable.Creator<a> CREATOR = new H3.b(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f4173a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4174b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4175c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4176d;

    public a(int i9, int i10, String str, byte[] bArr) {
        this.f4173a = str;
        this.f4174b = bArr;
        this.f4175c = i9;
        this.f4176d = i10;
    }

    @Override // D3.b
    public final /* synthetic */ void b(C1444a0 c1444a0) {
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f4173a.equals(aVar.f4173a) && Arrays.equals(this.f4174b, aVar.f4174b) && this.f4175c == aVar.f4175c && this.f4176d == aVar.f4176d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4174b) + z.c(this.f4173a, 527, 31)) * 31) + this.f4175c) * 31) + this.f4176d;
    }

    public final String toString() {
        return "mdta: key=" + this.f4173a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f4173a);
        parcel.writeByteArray(this.f4174b);
        parcel.writeInt(this.f4175c);
        parcel.writeInt(this.f4176d);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i9 = y.f20553a;
        this.f4173a = readString;
        this.f4174b = parcel.createByteArray();
        this.f4175c = parcel.readInt();
        this.f4176d = parcel.readInt();
    }
}
