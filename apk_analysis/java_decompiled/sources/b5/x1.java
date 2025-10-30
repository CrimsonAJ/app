package b5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x1 extends G4.a {
    public static final Parcelable.Creator<x1> CREATOR = new android.support.v4.media.a(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f11345a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11346b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11347c;

    public x1(long j, String str, int i9) {
        this.f11345a = str;
        this.f11346b = j;
        this.f11347c = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 1, this.f11345a);
        s8.n.V(parcel, 2, 8);
        parcel.writeLong(this.f11346b);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f11347c);
        s8.n.U(parcel, R2);
    }
}
