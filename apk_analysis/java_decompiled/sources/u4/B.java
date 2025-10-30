package u4;

import android.os.Parcel;
import android.os.Parcelable;
import t4.C2010B;

/* loaded from: classes.dex */
public final class B extends G4.a {
    public static final Parcelable.Creator<B> CREATOR = new C2010B(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f23636a;

    public B(int i9) {
        this.f23636a = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f23636a);
        s8.n.U(parcel, R2);
    }
}
