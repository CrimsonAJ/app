package F0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x0 implements Parcelable {
    public static final Parcelable.Creator<x0> CREATOR = new A1.a(7);

    /* renamed from: a, reason: collision with root package name */
    public int f2285a;

    /* renamed from: b, reason: collision with root package name */
    public int f2286b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2287c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2288d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2285a + ", mGapDir=" + this.f2286b + ", mHasUnwantedGapAfter=" + this.f2288d + ", mGapPerSpan=" + Arrays.toString(this.f2287c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f2285a);
        parcel.writeInt(this.f2286b);
        parcel.writeInt(this.f2288d ? 1 : 0);
        int[] iArr = this.f2287c;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2287c);
        } else {
            parcel.writeInt(0);
        }
    }
}
