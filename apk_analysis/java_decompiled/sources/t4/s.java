package t4;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s extends G4.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23262a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23263b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23264c;

    /* renamed from: d, reason: collision with root package name */
    public static final y4.b f23261d = new y4.b("VideoInfo", null);
    public static final Parcelable.Creator<s> CREATOR = new C1381b(29);

    public s(int i9, int i10, int i11) {
        this.f23262a = i9;
        this.f23263b = i10;
        this.f23264c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f23263b == sVar.f23263b && this.f23262a == sVar.f23262a && this.f23264c == sVar.f23264c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23263b), Integer.valueOf(this.f23262a), Integer.valueOf(this.f23264c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f23262a);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f23263b);
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f23264c);
        s8.n.U(parcel, R2);
    }
}
