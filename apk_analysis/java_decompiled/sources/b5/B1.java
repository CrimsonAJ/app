package b5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class B1 extends G4.a {
    public static final Parcelable.Creator<B1> CREATOR = new android.support.v4.media.a(11);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10563a;

    public B1(ArrayList arrayList) {
        this.f10563a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.J(parcel, 1, this.f10563a);
        s8.n.U(parcel, R2);
    }
}
