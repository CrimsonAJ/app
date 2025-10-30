package t4;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h extends G4.a {
    public static final Parcelable.Creator<h> CREATOR = new C1381b(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f23184a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23185b;

    public h(String str, String str2) {
        this.f23184a = str;
        this.f23185b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (F4.y.k(this.f23184a, hVar.f23184a) && F4.y.k(this.f23185b, hVar.f23185b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23184a, this.f23185b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 1, this.f23184a);
        s8.n.M(parcel, 2, this.f23185b);
        s8.n.U(parcel, R2);
    }
}
