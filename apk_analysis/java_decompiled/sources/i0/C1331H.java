package i0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: i0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1331H implements Parcelable {
    public static final Parcelable.Creator<C1331H> CREATOR = new android.support.v4.media.a(27);

    /* renamed from: a, reason: collision with root package name */
    public String f18174a;

    /* renamed from: b, reason: collision with root package name */
    public int f18175b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18174a);
        parcel.writeInt(this.f18175b);
    }
}
