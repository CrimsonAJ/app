package androidx.versionedparcelable;

import H3.b;
import Z0.c;
import Z0.d;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(29);

    /* renamed from: a, reason: collision with root package name */
    public final d f10391a;

    public ParcelImpl(d dVar) {
        this.f10391a = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        new c(parcel).l(this.f10391a);
    }

    public ParcelImpl(Parcel parcel) {
        this.f10391a = new c(parcel).h();
    }
}
