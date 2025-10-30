package u4;

import android.os.Parcel;
import android.os.Parcelable;
import t4.C2010B;

/* renamed from: u4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2075A extends G4.a {
    public static final Parcelable.Creator<C2075A> CREATOR = new C2010B(2);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23635a;

    public C2075A(boolean z9) {
        this.f23635a = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f23635a ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
