package d5;

import C4.o;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import s8.n;

/* loaded from: classes.dex */
public final class d extends G4.a implements o {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(21);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16876a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16877b;

    public d(String str, ArrayList arrayList) {
        this.f16876a = arrayList;
        this.f16877b = str;
    }

    @Override // C4.o
    public final Status d() {
        if (this.f16877b != null) {
            return Status.f14655e;
        }
        return Status.f14659i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.N(parcel, 1, this.f16876a);
        n.M(parcel, 2, this.f16877b);
        n.U(parcel, R2);
    }
}
