package F0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final Parcelable.Creator<F> CREATOR = new A1.a(6);

    /* renamed from: a, reason: collision with root package name */
    public int f2020a;

    /* renamed from: b, reason: collision with root package name */
    public int f2021b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2022c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f2020a);
        parcel.writeInt(this.f2021b);
        parcel.writeInt(this.f2022c ? 1 : 0);
    }
}
