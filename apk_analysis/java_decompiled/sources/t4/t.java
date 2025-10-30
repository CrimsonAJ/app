package t4;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t extends G4.a {
    public static final Parcelable.Creator<t> CREATOR = new C1381b(12);

    /* renamed from: a, reason: collision with root package name */
    public final float f23265a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23266b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23267c;

    public t(float f9, float f10, float f11) {
        this.f23265a = f9;
        this.f23266b = f10;
        this.f23267c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f23265a == tVar.f23265a && this.f23266b == tVar.f23266b && this.f23267c == tVar.f23267c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f23265a), Float.valueOf(this.f23266b), Float.valueOf(this.f23267c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 4);
        parcel.writeFloat(this.f23265a);
        s8.n.V(parcel, 3, 4);
        parcel.writeFloat(this.f23266b);
        s8.n.V(parcel, 4, 4);
        parcel.writeFloat(this.f23267c);
        s8.n.U(parcel, R2);
    }
}
