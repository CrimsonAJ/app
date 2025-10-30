package z5;

import android.os.Parcel;
import android.os.Parcelable;
import t4.C2010B;

/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new C2010B(12);

    /* renamed from: a, reason: collision with root package name */
    public int f25489a;

    /* renamed from: b, reason: collision with root package name */
    public w5.i f25490b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f25489a);
        parcel.writeParcelable(this.f25490b, 0);
    }
}
