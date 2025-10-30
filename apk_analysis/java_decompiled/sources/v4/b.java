package v4;

import android.os.Parcel;
import android.os.Parcelable;
import t4.C2010B;

/* loaded from: classes.dex */
public final class b extends G4.a {
    public static final Parcelable.Creator<b> CREATOR = new C2010B(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f23787a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23788b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23789c;

    public b(int i9, int i10, int i11) {
        this.f23787a = i9;
        this.f23788b = i10;
        this.f23789c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f23787a);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f23788b);
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f23789c);
        s8.n.U(parcel, R2);
    }
}
