package w5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2142b extends U.b {
    public static final Parcelable.Creator<C2142b> CREATOR = new B.h(10);

    /* renamed from: c, reason: collision with root package name */
    public boolean f24215c;

    public C2142b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f24215c = parcel.readInt() == 1;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f24215c ? 1 : 0);
    }
}
