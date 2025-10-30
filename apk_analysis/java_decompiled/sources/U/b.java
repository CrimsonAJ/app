package U;

import B.h;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f7246a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f7245b = new b();
    public static final Parcelable.Creator<b> CREATOR = new h(4);

    public b() {
        this.f7246a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeParcelable(this.f7246a, i9);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f7246a = parcelable == f7245b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f7246a = readParcelable == null ? f7245b : readParcelable;
    }
}
