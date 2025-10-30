package o4;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;

/* renamed from: o4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1700f implements Parcelable {
    public static final Parcelable.Creator<C1700f> CREATOR = new C1381b(4);

    /* renamed from: a, reason: collision with root package name */
    public int f21635a;

    /* renamed from: b, reason: collision with root package name */
    public int f21636b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SavedState{mAnchorPosition=" + this.f21635a + ", mAnchorOffset=" + this.f21636b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f21635a);
        parcel.writeInt(this.f21636b);
    }
}
