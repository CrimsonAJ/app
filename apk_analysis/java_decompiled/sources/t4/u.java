package t4;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u extends G4.a {
    public static final Parcelable.Creator<u> CREATOR = new C1381b(13);

    /* renamed from: a, reason: collision with root package name */
    public final t f23268a;

    /* renamed from: b, reason: collision with root package name */
    public final t f23269b;

    public u(t tVar, t tVar2) {
        this.f23268a = tVar;
        this.f23269b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (y4.a.e(this.f23268a, uVar.f23268a) && y4.a.e(this.f23269b, uVar.f23269b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23268a, this.f23269b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.L(parcel, 2, this.f23268a, i9);
        s8.n.L(parcel, 3, this.f23269b, i9);
        s8.n.U(parcel, R2);
    }
}
