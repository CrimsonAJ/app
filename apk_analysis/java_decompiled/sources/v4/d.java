package v4;

import android.os.Parcel;
import android.os.Parcelable;
import t4.C2010B;

/* loaded from: classes.dex */
public final class d extends G4.a {
    public static final Parcelable.Creator<d> CREATOR = new C2010B(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f23802a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23803b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23804c;

    public d(String str, int i9, String str2) {
        this.f23802a = str;
        this.f23803b = i9;
        this.f23804c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 2, this.f23802a);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f23803b);
        s8.n.M(parcel, 4, this.f23804c);
        s8.n.U(parcel, R2);
    }
}
