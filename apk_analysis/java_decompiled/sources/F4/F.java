package F4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F extends G4.a {
    public static final Parcelable.Creator<F> CREATOR = new A1.a(16);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f2337a;

    /* renamed from: b, reason: collision with root package name */
    public B4.d[] f2338b;

    /* renamed from: c, reason: collision with root package name */
    public int f2339c;

    /* renamed from: d, reason: collision with root package name */
    public C0127f f2340d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.F(parcel, 1, this.f2337a);
        s8.n.O(parcel, 2, this.f2338b, i9);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f2339c);
        s8.n.L(parcel, 4, this.f2340d, i9);
        s8.n.U(parcel, R2);
    }
}
