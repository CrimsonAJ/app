package b5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class C1 extends G4.a {
    public static final Parcelable.Creator<C1> CREATOR = new android.support.v4.media.a(12);

    /* renamed from: a, reason: collision with root package name */
    public final List f10567a;

    public C1(List list) {
        this.f10567a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.P(parcel, 1, this.f10567a);
        s8.n.U(parcel, R2);
    }
}
