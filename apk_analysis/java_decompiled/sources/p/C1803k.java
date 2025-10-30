package p;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;

/* renamed from: p.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1803k implements Parcelable {
    public static final Parcelable.Creator<C1803k> CREATOR = new C1381b(5);

    /* renamed from: a, reason: collision with root package name */
    public int f22002a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f22002a);
    }
}
