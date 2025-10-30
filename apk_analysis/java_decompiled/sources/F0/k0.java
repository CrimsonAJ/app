package F0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k0 extends U.b {
    public static final Parcelable.Creator<k0> CREATOR = new B.h(1);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f2140c;

    public k0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2140c = parcel.readParcelable(classLoader == null ? androidx.recyclerview.widget.a.class.getClassLoader() : classLoader);
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeParcelable(this.f2140c, 0);
    }
}
