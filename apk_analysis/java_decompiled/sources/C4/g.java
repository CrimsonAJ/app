package C4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends G4.a {
    public static final Parcelable.Creator<g> CREATOR = new s(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f1571a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1572b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1573c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1574d;

    public g(int i9, int i10, int i11, boolean z9) {
        this.f1571a = i9;
        this.f1572b = i10;
        this.f1573c = i11;
        this.f1574d = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f1571a != gVar.f1571a || this.f1572b != gVar.f1572b || this.f1573c != gVar.f1573c || this.f1574d != gVar.f1574d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1571a), Integer.valueOf(this.f1572b), Integer.valueOf(this.f1573c), Boolean.valueOf(this.f1574d)});
    }

    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.f1571a + ", dataOwnerProductId=" + this.f1572b + ", processingReason=" + this.f1573c + ", isUserData=" + this.f1574d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 4);
        parcel.writeInt(this.f1571a);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f1572b);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f1573c);
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f1574d ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
