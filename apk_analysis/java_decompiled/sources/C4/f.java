package C4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f extends G4.a {
    public static final Parcelable.Creator<f> CREATOR = s.f1590b;

    /* renamed from: b, reason: collision with root package name */
    public static final f f1569b = new f(null);

    /* renamed from: a, reason: collision with root package name */
    public final g f1570a;

    public f(g gVar) {
        this.f1570a = gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return Objects.equals(this.f1570a, ((f) obj).f1570a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f1570a);
    }

    public final String toString() {
        return A0.a.n("ApiMetadata(complianceOptions=", String.valueOf(this.f1570a), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(-204102970);
        int R2 = s8.n.R(parcel, 20293);
        s8.n.L(parcel, 1, this.f1570a, i9);
        s8.n.U(parcel, R2);
    }
}
