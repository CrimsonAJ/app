package B4;

import android.os.Parcel;
import android.os.Parcelable;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class r extends G4.a {
    public static final Parcelable.Creator<r> CREATOR = new A1.a(3);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f725a;

    /* renamed from: b, reason: collision with root package name */
    public final String f726b;

    /* renamed from: c, reason: collision with root package name */
    public final int f727c;

    /* renamed from: d, reason: collision with root package name */
    public final int f728d;

    public r(int i9, int i10, String str, boolean z9) {
        this.f725a = z9;
        this.f726b = str;
        this.f727c = s8.e.g0(i9) - 1;
        this.f728d = AbstractC1570b.z(i10) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 4);
        parcel.writeInt(this.f725a ? 1 : 0);
        s8.n.M(parcel, 2, this.f726b);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f727c);
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f728d);
        s8.n.U(parcel, R2);
    }
}
