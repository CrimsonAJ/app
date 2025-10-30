package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f9256a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9257b;

    public RatingCompat(int i9, float f9) {
        this.f9256a = i9;
        this.f9257b = f9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f9256a;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f9256a);
        sb.append(" rating=");
        float f9 = this.f9257b;
        if (f9 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f9);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f9256a);
        parcel.writeFloat(this.f9257b);
    }
}
