package n5;

import B.h;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: n5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1654b extends U.b {
    public static final Parcelable.Creator<C1654b> CREATOR = new h(8);

    /* renamed from: c, reason: collision with root package name */
    public boolean f21217c;

    public C1654b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C1654b.class.getClassLoader();
        }
        this.f21217c = parcel.readInt() == 1;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f21217c ? 1 : 0);
    }
}
