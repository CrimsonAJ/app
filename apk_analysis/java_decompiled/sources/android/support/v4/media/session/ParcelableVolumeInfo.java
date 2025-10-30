package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new x(3);

    /* renamed from: a, reason: collision with root package name */
    public int f9275a;

    /* renamed from: b, reason: collision with root package name */
    public int f9276b;

    /* renamed from: c, reason: collision with root package name */
    public int f9277c;

    /* renamed from: d, reason: collision with root package name */
    public int f9278d;

    /* renamed from: e, reason: collision with root package name */
    public int f9279e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f9275a);
        parcel.writeInt(this.f9277c);
        parcel.writeInt(this.f9278d);
        parcel.writeInt(this.f9279e);
        parcel.writeInt(this.f9276b);
    }
}
