package F4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: F4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134m extends G4.a {
    public static final Parcelable.Creator<C0134m> CREATOR = new A1.a(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f2430a;

    /* renamed from: b, reason: collision with root package name */
    public List f2431b;

    public C0134m(List list, int i9) {
        this.f2430a = i9;
        this.f2431b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 4);
        parcel.writeInt(this.f2430a);
        s8.n.P(parcel, 2, this.f2431b);
        s8.n.U(parcel, R2);
    }
}
