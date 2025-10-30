package y4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t4.C2010B;

/* loaded from: classes.dex */
public final class c extends G4.a {
    public static final Parcelable.Creator<c> CREATOR = new C2010B(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f24920a;

    public c(String str) {
        this.f24920a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.e(this.f24920a, ((c) obj).f24920a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24920a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 2, this.f24920a);
        s8.n.U(parcel, R2);
    }
}
